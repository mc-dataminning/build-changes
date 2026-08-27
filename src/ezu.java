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

public class ezu extends grl {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int y = 80;
   private static final int z = 95;
   private static final int A = 1;
   private static final String[] B = new String[]{"", ".", ". .", ". . ."};
   private static final wg C = wg.c("mco.upload.verifying");
   private final ezn D;
   private final ems E;
   @Nullable
   private final far F;
   private final long G;
   private final int H;
   private final exc I;
   private final RateLimiter J;
   @Nullable
   private volatile wg[] K;
   private volatile wg L = wg.c("mco.upload.preparing");
   @Nullable
   private volatile String M;
   private volatile boolean N;
   private volatile boolean O;
   private volatile boolean P = true;
   private volatile boolean Q;
   @Nullable
   private fdp R;
   @Nullable
   private fdp S;
   private int T;
   @Nullable
   private Long U;
   @Nullable
   private Long V;
   private long W;
   private final fhc X = new fhc(this);

   public ezu(@Nullable far $$0, long $$1, int $$2, ezn $$3, ems $$4) {
      super(fbh.a);
      this.F = $$0;
      this.G = $$1;
      this.H = $$2;
      this.D = $$3;
      this.E = $$4;
      this.I = new exc();
      this.J = RateLimiter.create(0.1F);
   }

   @Override
   public void aN_() {
      this.R = this.X.b(fdp.a(wf.k, $$0x -> this.C()).a());
      this.R.k = false;
      this.S = this.X.b(fdp.a(wf.e, $$0x -> this.D()).a());
      if (!this.Q) {
         if (this.D.b == -1) {
            this.Q = true;
            this.F();
         } else {
            List<fap> $$0 = new ArrayList<>();
            if (this.F != null) {
               $$0.add(this.F);
            }

            $$0.add(new fax(this.G, this.D.b, () -> {
               if (!this.Q) {
                  this.Q = true;
                  this.j.execute(() -> {
                     this.j.a(this);
                     this.F();
                  });
               }
            }));
            this.j.a(new ezf(this.D, $$0.toArray(new fap[0])));
         }
      }

      this.X.a($$1 -> {
         fdn var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.X.a();
   }

   private void C() {
      this.j.a(new eyy(new ewt(new fjt()), this.G));
   }

   private void D() {
      this.N = true;
      this.j.a(this.D);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         if (this.P) {
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
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!this.O && this.I.a != 0L && this.I.a == this.I.b && this.S != null) {
         this.L = C;
         this.S.j = false;
      }

      $$0.a(this.m, this.L, this.k / 2, 50, -1);
      if (this.P) {
         $$0.a(this.m, B[this.T / 10 % B.length], this.k / 2 + this.m.a(this.L) / 2 + 5, 50, -1, false);
      }

      if (this.I.a != 0L && !this.N) {
         this.c($$0);
         this.d($$0);
      }

      wg[] $$4 = this.K;
      if ($$4 != null) {
         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$0.a(this.m, $$4[$$5], this.k / 2, 110 + 12 * $$5, -65536);
         }
      }
   }

   private void c(fdc $$0) {
      double $$1 = Math.min((double)this.I.a / (double)this.I.b, 1.0);
      this.M = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.k - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.m, wg.a("mco.upload.percent", this.M), this.k / 2, 84, -1);
   }

   private void d(fdc $$0) {
      if (this.T % 20 == 0) {
         if (this.U != null && this.V != null) {
            long $$1 = ac.b() - this.V;
            if ($$1 == 0L) {
               $$1 = 1L;
            }

            this.W = 1000L * (this.I.a - this.U) / $$1;
            this.a($$0, this.W);
         }

         this.U = this.I.a;
         this.V = ac.b();
      } else {
         this.a($$0, this.W);
      }
   }

   private void a(fdc $$0, long $$1) {
      String $$2 = this.M;
      if ($$1 > 0L && $$2 != null) {
         int $$3 = this.m.b($$2);
         String $$4 = "(" + ewu.b($$1) + "/s)";
         $$0.a(this.m, $$4, this.k / 2 + $$3 / 2 + 15, 84, -1, false);
      }
   }

   @Override
   public void e() {
      super.e();
      this.T++;
      if (this.J.tryAcquire(1)) {
         wg $$0 = this.E();
         this.j.aY().c($$0);
      }
   }

   private wg E() {
      List<wg> $$0 = Lists.newArrayList();
      $$0.add(this.L);
      if (this.M != null) {
         $$0.add(wg.a("mco.upload.percent", this.M));
      }

      wg[] $$1 = this.K;
      if ($$1 != null) {
         $$0.addAll(Arrays.asList($$1));
      }

      return wf.a($$0);
   }

   private void F() {
      new Thread(
            () -> {
               File $$0 = null;
               ewy $$1 = ewy.a();

               try {
                  if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                     this.L = wg.c("mco.upload.close.failure");
                  } else {
                     eyd $$2 = null;

                     for (int $$3 = 0; $$3 < 20; $$3++) {
                        try {
                           if (this.N) {
                              this.I();
                              return;
                           }

                           $$2 = $$1.e(this.G, fah.a(this.G));
                           if ($$2 != null) {
                              break;
                           }
                        } catch (eym var18) {
                           Thread.sleep((long)(var18.c * 1000));
                        }
                     }

                     if ($$2 == null) {
                        this.L = wg.c("mco.upload.close.failure");
                     } else {
                        fah.a(this.G, $$2.a());
                        if (!$$2.c()) {
                           this.L = wg.c("mco.upload.close.failure");
                        } else if (this.N) {
                           this.I();
                        } else {
                           File $$5 = new File(this.j.p.getAbsolutePath(), "saves");
                           $$0 = this.b(new File($$5, this.E.a()));
                           if (this.N) {
                              this.I();
                           } else if (this.a($$0)) {
                              this.L = wg.a("mco.upload.uploading", this.E.b());
                              eww $$10 = new eww($$0, this.G, this.H, $$2, this.j.X(), aa.b().c(), this.E.l().c(), this.I);
                              $$10.a($$0x -> {
                                 if ($$0x.a >= 200 && $$0x.a < 300) {
                                    this.O = true;
                                    this.L = wg.c("mco.upload.done");
                                    if (this.R != null) {
                                       this.R.b(wf.d);
                                    }

                                    fah.b(this.G);
                                 } else if ($$0x.a == 400 && $$0x.b != null) {
                                    this.a(wg.a("mco.upload.failed", $$0x.b));
                                 } else {
                                    this.a(wg.a("mco.upload.failed", $$0x.a));
                                 }
                              });

                              while (!$$10.b()) {
                                 if (this.N) {
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
                              ewu $$7 = ewu.a($$6);
                              ewu $$8 = ewu.a(5368709120L);
                              if (ewu.b($$6, $$7).equals(ewu.b(5368709120L, $$8)) && $$7 != ewu.a) {
                                 ewu $$9 = ewu.values()[$$7.ordinal() - 1];
                                 this.a(
                                    wg.a("mco.upload.size.failure.line1", this.E.b()),
                                    wg.a("mco.upload.size.failure.line2", ewu.b($$6, $$9), ewu.b(5368709120L, $$9))
                                 );
                              } else {
                                 this.a(
                                    wg.a("mco.upload.size.failure.line1", this.E.b()),
                                    wg.a("mco.upload.size.failure.line2", ewu.b($$6, $$7), ewu.b(5368709120L, $$8))
                                 );
                              }
                           }
                        }
                     }
                  }
               } catch (IOException var19) {
                  this.a(wg.a("mco.upload.failed", var19.getMessage()));
               } catch (eyl var20) {
                  this.a(wg.a("mco.upload.failed", var20.a.b()));
               } catch (InterruptedException var21) {
                  a.error("Could not acquire upload lock");
               } finally {
                  this.O = true;
                  if (b.isHeldByCurrentThread()) {
                     b.unlock();
                     this.P = false;
                     if (this.R != null) {
                        this.R.k = true;
                     }

                     if (this.S != null) {
                        this.S.k = false;
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

   private void a(wg... $$0) {
      this.K = $$0;
   }

   private void I() {
      this.L = wg.c("mco.upload.cancelled");
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
      if (!this.N) {
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
