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

public class fdy extends gvs {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int A = 80;
   private static final int B = 95;
   private static final int C = 1;
   private static final String[] D = new String[]{"", ".", ". .", ". . ."};
   private static final wu E = wu.c("mco.upload.verifying");
   private final fdr F;
   private final eqj G;
   @Nullable
   private final fev H;
   private final long I;
   private final int J;
   private final fbg K;
   private final RateLimiter L;
   @Nullable
   private volatile wu[] M;
   private volatile wu N = wu.c("mco.upload.preparing");
   @Nullable
   private volatile String O;
   private volatile boolean P;
   private volatile boolean Q;
   private volatile boolean R = true;
   private volatile boolean S;
   @Nullable
   private fhs T;
   @Nullable
   private fhs U;
   private int V;
   @Nullable
   private Long W;
   @Nullable
   private Long X;
   private long Y;
   private final flf Z = new flf(this);

   public fdy(@Nullable fev $$0, long $$1, int $$2, fdr $$3, eqj $$4) {
      super(ffl.a);
      this.H = $$0;
      this.I = $$1;
      this.J = $$2;
      this.F = $$3;
      this.G = $$4;
      this.K = new fbg();
      this.L = RateLimiter.create(0.1F);
   }

   @Override
   public void aP_() {
      this.T = this.Z.b(fhs.a(wt.k, $$0x -> this.E()).a());
      this.T.k = false;
      this.U = this.Z.b(fhs.a(wt.e, $$0x -> this.F()).a());
      if (!this.S) {
         if (this.F.b == -1) {
            this.S = true;
            this.J();
         } else {
            List<fet> $$0 = new ArrayList<>();
            if (this.H != null) {
               $$0.add(this.H);
            }

            $$0.add(new ffb(this.I, this.F.b, () -> {
               if (!this.S) {
                  this.S = true;
                  this.l.execute(() -> {
                     this.l.a(this);
                     this.J();
                  });
               }
            }));
            this.l.a(new fdj(this.F, $$0.toArray(new fet[0])));
         }
      }

      this.Z.a($$1 -> {
         fhq var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.Z.a();
   }

   private void E() {
      this.l.a(new fdd(new fax(new fnl()), this.I));
   }

   private void F() {
      this.P = true;
      this.l.a(this.F);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         if (this.R) {
            this.F();
         } else {
            this.E();
         }

         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!this.Q && this.K.a != 0L && this.K.a == this.K.b && this.U != null) {
         this.N = E;
         this.U.j = false;
      }

      $$0.a(this.o, this.N, this.m / 2, 50, -1);
      if (this.R) {
         $$0.a(this.o, D[this.V / 10 % D.length], this.m / 2 + this.o.a(this.N) / 2 + 5, 50, -1, false);
      }

      if (this.K.a != 0L && !this.P) {
         this.c($$0);
         this.d($$0);
      }

      wu[] $$4 = this.M;
      if ($$4 != null) {
         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$0.a(this.o, $$4[$$5], this.m / 2, 110 + 12 * $$5, -65536);
         }
      }
   }

   private void c(fhf $$0) {
      double $$1 = Math.min((double)this.K.a / (double)this.K.b, 1.0);
      this.O = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.m - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.o, wu.a("mco.upload.percent", this.O), this.m / 2, 84, -1);
   }

   private void d(fhf $$0) {
      if (this.V % 20 == 0) {
         if (this.W != null && this.X != null) {
            long $$1 = ac.c() - this.X;
            if ($$1 == 0L) {
               $$1 = 1L;
            }

            this.Y = 1000L * (this.K.a - this.W) / $$1;
            this.a($$0, this.Y);
         }

         this.W = this.K.a;
         this.X = ac.c();
      } else {
         this.a($$0, this.Y);
      }
   }

   private void a(fhf $$0, long $$1) {
      String $$2 = this.O;
      if ($$1 > 0L && $$2 != null) {
         int $$3 = this.o.b($$2);
         String $$4 = "(" + fay.b($$1) + "/s)";
         $$0.a(this.o, $$4, this.m / 2 + $$3 / 2 + 15, 84, -1, false);
      }
   }

   @Override
   public void e() {
      super.e();
      this.V++;
      if (this.L.tryAcquire(1)) {
         wu $$0 = this.G();
         this.l.aX().c($$0);
      }
   }

   private wu G() {
      List<wu> $$0 = Lists.newArrayList();
      $$0.add(this.N);
      if (this.O != null) {
         $$0.add(wu.a("mco.upload.percent", this.O));
      }

      wu[] $$1 = this.M;
      if ($$1 != null) {
         $$0.addAll(Arrays.asList($$1));
      }

      return wt.a($$0);
   }

   private void J() {
      new Thread(
            () -> {
               File $$0 = null;
               fbc $$1 = fbc.a();

               try {
                  if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                     this.N = wu.c("mco.upload.close.failure");
                  } else {
                     fch $$2 = null;

                     for (int $$3 = 0; $$3 < 20; $$3++) {
                        try {
                           if (this.P) {
                              this.K();
                              return;
                           }

                           $$2 = $$1.e(this.I, fel.a(this.I));
                           if ($$2 != null) {
                              break;
                           }
                        } catch (fcq var18) {
                           Thread.sleep((long)(var18.c * 1000));
                        }
                     }

                     if ($$2 == null) {
                        this.N = wu.c("mco.upload.close.failure");
                     } else {
                        fel.a(this.I, $$2.a());
                        if (!$$2.c()) {
                           this.N = wu.c("mco.upload.close.failure");
                        } else if (this.P) {
                           this.K();
                        } else {
                           File $$5 = new File(this.l.p.getAbsolutePath(), "saves");
                           $$0 = this.b(new File($$5, this.G.a()));
                           if (this.P) {
                              this.K();
                           } else if (this.a($$0)) {
                              this.N = wu.a("mco.upload.uploading", this.G.b());
                              fba $$10 = new fba($$0, this.I, this.J, $$2, this.l.X(), aa.b().c(), this.G.l().c(), this.K);
                              $$10.a($$0x -> {
                                 if ($$0x.a >= 200 && $$0x.a < 300) {
                                    this.Q = true;
                                    this.N = wu.c("mco.upload.done");
                                    if (this.T != null) {
                                       this.T.b(wt.d);
                                    }

                                    fel.b(this.I);
                                 } else if ($$0x.a == 400 && $$0x.b != null) {
                                    this.a(wu.a("mco.upload.failed", $$0x.b));
                                 } else {
                                    this.a(wu.a("mco.upload.failed", $$0x.a));
                                 }
                              });

                              while (!$$10.b()) {
                                 if (this.P) {
                                    $$10.a();
                                    this.K();
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
                              fay $$7 = fay.a($$6);
                              fay $$8 = fay.a(5368709120L);
                              if (fay.b($$6, $$7).equals(fay.b(5368709120L, $$8)) && $$7 != fay.a) {
                                 fay $$9 = fay.values()[$$7.ordinal() - 1];
                                 this.a(
                                    wu.a("mco.upload.size.failure.line1", this.G.b()),
                                    wu.a("mco.upload.size.failure.line2", fay.b($$6, $$9), fay.b(5368709120L, $$9))
                                 );
                              } else {
                                 this.a(
                                    wu.a("mco.upload.size.failure.line1", this.G.b()),
                                    wu.a("mco.upload.size.failure.line2", fay.b($$6, $$7), fay.b(5368709120L, $$8))
                                 );
                              }
                           }
                        }
                     }
                  }
               } catch (IOException var19) {
                  this.a(wu.a("mco.upload.failed", var19.getMessage()));
               } catch (fcp var20) {
                  this.a(wu.a("mco.upload.failed", var20.a.b()));
               } catch (InterruptedException var21) {
                  a.error("Could not acquire upload lock");
               } finally {
                  this.Q = true;
                  if (b.isHeldByCurrentThread()) {
                     b.unlock();
                     this.R = false;
                     if (this.T != null) {
                        this.T.k = true;
                     }

                     if (this.U != null) {
                        this.U.k = false;
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

   private void a(wu... $$0) {
      this.M = $$0;
   }

   private void K() {
      this.N = wu.c("mco.upload.cancelled");
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
      if (!this.P) {
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
