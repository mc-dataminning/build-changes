import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nullable;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.slf4j.Logger;

public class faz extends gsq {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int B = 80;
   private static final int C = 95;
   private static final int D = 1;
   private static final String[] E = new String[]{"", ".", ". .", ". . ."};
   private static final ws F = ws.c("mco.upload.verifying");
   private final fas G;
   private final enr H;
   @Nullable
   private final fbw I;
   private final long J;
   private final int K;
   private final eyh L;
   private final RateLimiter M;
   @Nullable
   private volatile ws[] N;
   private volatile ws O = ws.c("mco.upload.preparing");
   @Nullable
   private volatile String P;
   private volatile boolean Q;
   private volatile boolean R;
   private volatile boolean S = true;
   private volatile boolean T;
   @Nullable
   private feu U;
   @Nullable
   private feu V;
   private int W;
   @Nullable
   private Long X;
   @Nullable
   private Long Y;
   private long Z;
   private final fih aa = new fih(this);

   public faz(@Nullable fbw $$0, long $$1, int $$2, fas $$3, enr $$4) {
      super(fcm.a);
      this.I = $$0;
      this.J = $$1;
      this.K = $$2;
      this.G = $$3;
      this.H = $$4;
      this.L = new eyh();
      this.M = RateLimiter.create(0.1F);
   }

   @Override
   public void aM_() {
      this.U = this.aa.b(feu.a(wr.k, $$0x -> this.C()).a());
      this.U.k = false;
      this.V = this.aa.b(feu.a(wr.e, $$0x -> this.D()).a());
      if (!this.T) {
         if (this.G.b == -1) {
            this.T = true;
            this.F();
         } else {
            List<fbu> $$0 = new ArrayList<>();
            if (this.I != null) {
               $$0.add(this.I);
            }

            $$0.add(new fcc(this.J, this.G.b, () -> {
               if (!this.T) {
                  this.T = true;
                  this.m.execute(() -> {
                     this.m.a(this);
                     this.F();
                  });
               }
            }));
            this.m.a(new fak(this.G, $$0.toArray(new fbu[0])));
         }
      }

      this.aa.a($$1 -> {
         fes var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.aa.a();
   }

   private void C() {
      this.m.a(new fad(new exy(new fky()), this.J));
   }

   private void D() {
      this.Q = true;
      this.m.a(this.G);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         if (this.S) {
            this.D();
         } else {
            this.C();
         }

         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!this.R && this.L.a != 0L && this.L.a == this.L.b && this.V != null) {
         this.O = F;
         this.V.j = false;
      }

      $$0.a(this.p, this.O, this.n / 2, 50, -1);
      if (this.S) {
         $$0.a(this.p, E[this.W / 10 % E.length], this.n / 2 + this.p.a(this.O) / 2 + 5, 50, -1, false);
      }

      if (this.L.a != 0L && !this.Q) {
         this.c($$0);
         this.d($$0);
      }

      ws[] $$4 = this.N;
      if ($$4 != null) {
         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$0.a(this.p, $$4[$$5], this.n / 2, 110 + 12 * $$5, -65536);
         }
      }
   }

   private void c(feh $$0) {
      double $$1 = Math.min((double)this.L.a / (double)this.L.b, 1.0);
      this.P = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.n - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.p, ws.a("mco.upload.percent", this.P), this.n / 2, 84, -1);
   }

   private void d(feh $$0) {
      if (this.W % 20 == 0) {
         if (this.X != null && this.Y != null) {
            long $$1 = ac.b() - this.Y;
            if ($$1 == 0L) {
               $$1 = 1L;
            }

            this.Z = 1000L * (this.L.a - this.X) / $$1;
            this.a($$0, this.Z);
         }

         this.X = this.L.a;
         this.Y = ac.b();
      } else {
         this.a($$0, this.Z);
      }
   }

   private void a(feh $$0, long $$1) {
      String $$2 = this.P;
      if ($$1 > 0L && $$2 != null) {
         int $$3 = this.p.b($$2);
         String $$4 = "(" + exz.b($$1) + "/s)";
         $$0.a(this.p, $$4, this.n / 2 + $$3 / 2 + 15, 84, -1, false);
      }
   }

   @Override
   public void e() {
      super.e();
      this.W++;
      if (this.M.tryAcquire(1)) {
         ws $$0 = this.E();
         this.m.aY().c($$0);
      }
   }

   private ws E() {
      List<ws> $$0 = Lists.newArrayList();
      $$0.add(this.O);
      if (this.P != null) {
         $$0.add(ws.a("mco.upload.percent", this.P));
      }

      ws[] $$1 = this.N;
      if ($$1 != null) {
         $$0.addAll(Arrays.asList($$1));
      }

      return wr.a($$0);
   }

   private void F() {
      new Thread(
            () -> {
               File $$0 = null;
               eyd $$1 = eyd.a();

               try {
                  if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                     this.O = ws.c("mco.upload.close.failure");
                  } else {
                     ezi $$2 = null;

                     for (int $$3 = 0; $$3 < 20; $$3++) {
                        try {
                           if (this.Q) {
                              this.I();
                              return;
                           }

                           $$2 = $$1.e(this.J, fbm.a(this.J));
                           if ($$2 != null) {
                              break;
                           }
                        } catch (ezr var18) {
                           Thread.sleep((long)(var18.c * 1000));
                        }
                     }

                     if ($$2 == null) {
                        this.O = ws.c("mco.upload.close.failure");
                     } else {
                        fbm.a(this.J, $$2.a());
                        if (!$$2.c()) {
                           this.O = ws.c("mco.upload.close.failure");
                        } else if (this.Q) {
                           this.I();
                        } else {
                           File $$5 = new File(this.m.p.getAbsolutePath(), "saves");
                           $$0 = this.b(new File($$5, this.H.a()));
                           if (this.Q) {
                              this.I();
                           } else if (this.a($$0)) {
                              this.O = ws.a("mco.upload.uploading", this.H.b());
                              eyb $$10 = new eyb($$0, this.J, this.K, $$2, this.m.X(), aa.b().c(), this.H.l().c(), this.L);
                              $$10.a($$0x -> {
                                 if ($$0x.a >= 200 && $$0x.a < 300) {
                                    this.R = true;
                                    this.O = ws.c("mco.upload.done");
                                    if (this.U != null) {
                                       this.U.b(wr.d);
                                    }

                                    fbm.b(this.J);
                                 } else if ($$0x.a == 400 && $$0x.b != null) {
                                    this.a(ws.a("mco.upload.failed", $$0x.b));
                                 } else {
                                    this.a(ws.a("mco.upload.failed", $$0x.a));
                                 }
                              });

                              while (!$$10.b()) {
                                 if (this.Q) {
                                    $$10.a();
                                    this.I();
                                    return;
                                 }

                                 try {
                                    Thread.sleep(500L);
                                 } catch (InterruptedException var17) {
                                    a.error("Failed to check Realms file upload status");
                                 }
                              }
                           } else {
                              long $$6 = $$0.length();
                              exz $$7 = exz.a($$6);
                              exz $$8 = exz.a(5368709120L);
                              if (exz.b($$6, $$7).equals(exz.b(5368709120L, $$8)) && $$7 != exz.a) {
                                 exz $$9 = exz.values()[$$7.ordinal() - 1];
                                 this.a(
                                    ws.a("mco.upload.size.failure.line1", this.H.b()),
                                    ws.a("mco.upload.size.failure.line2", exz.b($$6, $$9), exz.b(5368709120L, $$9))
                                 );
                              } else {
                                 this.a(
                                    ws.a("mco.upload.size.failure.line1", this.H.b()),
                                    ws.a("mco.upload.size.failure.line2", exz.b($$6, $$7), exz.b(5368709120L, $$8))
                                 );
                              }
                           }
                        }
                     }
                  }
               } catch (IOException var19) {
                  this.a(ws.a("mco.upload.failed", var19.getMessage()));
               } catch (ezq var20) {
                  this.a(ws.a("mco.upload.failed", var20.a.b()));
               } catch (InterruptedException var21) {
                  a.error("Could not acquire upload lock");
               } finally {
                  this.R = true;
                  if (b.isHeldByCurrentThread()) {
                     b.unlock();
                     this.S = false;
                     if (this.U != null) {
                        this.U.k = true;
                     }

                     if (this.V != null) {
                        this.V.k = false;
                     }

                     if ($$0 != null) {
                        a.debug("Deleting file {}", $$0.getAbsolutePath());
                        $$0.delete();
                     }
                  } else {
                     return;
                  }
               }
            }
         )
         .start();
   }

   private void a(ws... $$0) {
      this.N = $$0;
   }

   private void I() {
      this.O = ws.c("mco.upload.cancelled");
      a.debug("Upload was cancelled");
   }

   private boolean a(File $$0) {
      return $$0.length() < 5368709120L;
   }

   private File b(File $$0) throws IOException {
      TarArchiveOutputStream $$1 = null;

      File var4;
      try {
         File $$2 = File.createTempFile("realms-upload-file", ".tar.gz");
         $$1 = new TarArchiveOutputStream(new GZIPOutputStream(new FileOutputStream($$2)));
         $$1.setLongFileMode(3);
         this.a($$1, $$0.getAbsolutePath(), "world", true);
         $$1.finish();
         var4 = $$2;
      } finally {
         if ($$1 != null) {
            $$1.close();
         }
      }

      return var4;
   }

   private void a(TarArchiveOutputStream $$0, String $$1, String $$2, boolean $$3) throws IOException {
      if (!this.Q) {
         File $$4 = new File($$1);
         String $$5 = $$3 ? $$2 : $$2 + $$4.getName();
         TarArchiveEntry $$6 = new TarArchiveEntry($$4, $$5);
         $$0.putArchiveEntry($$6);
         if ($$4.isFile()) {
            try (InputStream $$7 = new FileInputStream($$4)) {
               $$7.transferTo($$0);
            }

            $$0.closeArchiveEntry();
         } else {
            $$0.closeArchiveEntry();
            File[] $$8 = $$4.listFiles();
            if ($$8 != null) {
               for (File $$9 : $$8) {
                  this.a($$0, $$9.getAbsolutePath(), $$5 + "/", false);
               }
            }
         }
      }
   }
}
