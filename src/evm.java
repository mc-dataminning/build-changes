import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
import org.apache.commons.compress.utils.IOUtils;
import org.slf4j.Logger;

public class evm extends gmw {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int v = 80;
   private static final int w = 95;
   private static final int x = 1;
   private static final String[] y = new String[]{"", ".", ". .", ". . ."};
   private static final vq z = vq.c("mco.upload.verifying");
   private final evf A;
   private final eim B;
   @Nullable
   private final ewj C;
   private final long D;
   private final int E;
   private final esu F;
   private final RateLimiter G;
   @Nullable
   private volatile vq[] H;
   private volatile vq I = vq.c("mco.upload.preparing");
   @Nullable
   private volatile String J;
   private volatile boolean K;
   private volatile boolean L;
   private volatile boolean M = true;
   private volatile boolean N;
   @Nullable
   private ezh O;
   @Nullable
   private ezh P;
   private int Q;
   @Nullable
   private Long R;
   @Nullable
   private Long S;
   private long T;
   private final fct U = new fct(this);

   public evm(@Nullable ewj $$0, long $$1, int $$2, evf $$3, eim $$4) {
      super(ewz.a);
      this.C = $$0;
      this.D = $$1;
      this.E = $$2;
      this.A = $$3;
      this.B = $$4;
      this.F = new esu();
      this.G = RateLimiter.create(0.1F);
   }

   @Override
   public void aQ_() {
      this.O = this.U.b(ezh.a(vp.k, $$0x -> this.E()).a());
      this.O.k = false;
      this.P = this.U.b(ezh.a(vp.e, $$0x -> this.H()).a());
      if (!this.N) {
         if (this.A.b == -1) {
            this.N = true;
            this.J();
         } else {
            List<ewh> $$0 = new ArrayList<>();
            if (this.C != null) {
               $$0.add(this.C);
            }

            $$0.add(new ewp(this.D, this.A.b, () -> {
               if (!this.N) {
                  this.N = true;
                  this.f.execute(() -> {
                     this.f.a(this);
                     this.J();
                  });
               }
            }));
            this.f.a(new eux(this.A, $$0.toArray(new ewh[0])));
         }
      }

      this.U.a($$1 -> {
         ezf var10000 = this.d($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.U.a();
   }

   private void E() {
      this.f.a(new euq(new esl(new ffj()), this.D));
   }

   private void H() {
      this.K = true;
      this.f.a(this.A);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         if (this.M) {
            this.H();
         } else {
            this.E();
         }

         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!this.L && this.F.a != 0L && this.F.a == this.F.b && this.P != null) {
         this.I = z;
         this.P.j = false;
      }

      $$0.a(this.i, this.I, this.g / 2, 50, -1);
      if (this.M) {
         $$0.a(this.i, y[this.Q / 10 % y.length], this.g / 2 + this.i.a(this.I) / 2 + 5, 50, -1, false);
      }

      if (this.F.a != 0L && !this.K) {
         this.c($$0);
         this.d($$0);
      }

      vq[] $$4 = this.H;
      if ($$4 != null) {
         for (int $$5 = 0; $$5 < $$4.length; $$5++) {
            $$0.a(this.i, $$4[$$5], this.g / 2, 110 + 12 * $$5, -65536);
         }
      }
   }

   private void c(eyu $$0) {
      double $$1 = Math.min((double)this.F.a / (double)this.F.b, 1.0);
      this.J = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.g - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -1);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.i, vq.a("mco.upload.percent", this.J), this.g / 2, 84, -1);
   }

   private void d(eyu $$0) {
      if (this.Q % 20 == 0) {
         if (this.R != null && this.S != null) {
            long $$1 = ac.b() - this.S;
            if ($$1 == 0L) {
               $$1 = 1L;
            }

            this.T = 1000L * (this.F.a - this.R) / $$1;
            this.a($$0, this.T);
         }

         this.R = this.F.a;
         this.S = ac.b();
      } else {
         this.a($$0, this.T);
      }
   }

   private void a(eyu $$0, long $$1) {
      String $$2 = this.J;
      if ($$1 > 0L && $$2 != null) {
         int $$3 = this.i.b($$2);
         String $$4 = "(" + esm.b($$1) + "/s)";
         $$0.a(this.i, $$4, this.g / 2 + $$3 / 2 + 15, 84, -1, false);
      }
   }

   @Override
   public void e() {
      super.e();
      this.Q++;
      if (this.G.tryAcquire(1)) {
         vq $$0 = this.I();
         this.f.aW().c($$0);
      }
   }

   private vq I() {
      List<vq> $$0 = Lists.newArrayList();
      $$0.add(this.I);
      if (this.J != null) {
         $$0.add(vq.a("mco.upload.percent", this.J));
      }

      vq[] $$1 = this.H;
      if ($$1 != null) {
         $$0.addAll(Arrays.asList($$1));
      }

      return vp.a($$0);
   }

   private void J() {
      new Thread(
            () -> {
               File $$0 = null;
               esq $$1 = esq.a();

               try {
                  if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                     this.I = vq.c("mco.upload.close.failure");
                  } else {
                     etv $$2 = null;

                     for (int $$3 = 0; $$3 < 20; $$3++) {
                        try {
                           if (this.K) {
                              this.K();
                              return;
                           }

                           $$2 = $$1.e(this.D, evz.a(this.D));
                           if ($$2 != null) {
                              break;
                           }
                        } catch (eue var18) {
                           Thread.sleep((long)(var18.c * 1000));
                        }
                     }

                     if ($$2 == null) {
                        this.I = vq.c("mco.upload.close.failure");
                     } else {
                        evz.a(this.D, $$2.a());
                        if (!$$2.c()) {
                           this.I = vq.c("mco.upload.close.failure");
                        } else if (this.K) {
                           this.K();
                        } else {
                           File $$5 = new File(this.f.p.getAbsolutePath(), "saves");
                           $$0 = this.b(new File($$5, this.B.a()));
                           if (this.K) {
                              this.K();
                           } else if (this.a($$0)) {
                              this.I = vq.a("mco.upload.uploading", this.B.b());
                              eso $$10 = new eso($$0, this.D, this.E, $$2, this.f.V(), aa.b().c(), this.F);
                              $$10.a($$0x -> {
                                 if ($$0x.a >= 200 && $$0x.a < 300) {
                                    this.L = true;
                                    this.I = vq.c("mco.upload.done");
                                    if (this.O != null) {
                                       this.O.b(vp.d);
                                    }

                                    evz.b(this.D);
                                 } else if ($$0x.a == 400 && $$0x.b != null) {
                                    this.a(vq.a("mco.upload.failed", $$0x.b));
                                 } else {
                                    this.a(vq.a("mco.upload.failed", $$0x.a));
                                 }
                              });

                              while (!$$10.b()) {
                                 if (this.K) {
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
                              esm $$7 = esm.a($$6);
                              esm $$8 = esm.a(5368709120L);
                              if (esm.b($$6, $$7).equals(esm.b(5368709120L, $$8)) && $$7 != esm.a) {
                                 esm $$9 = esm.values()[$$7.ordinal() - 1];
                                 this.a(
                                    vq.a("mco.upload.size.failure.line1", this.B.b()),
                                    vq.a("mco.upload.size.failure.line2", esm.b($$6, $$9), esm.b(5368709120L, $$9))
                                 );
                              } else {
                                 this.a(
                                    vq.a("mco.upload.size.failure.line1", this.B.b()),
                                    vq.a("mco.upload.size.failure.line2", esm.b($$6, $$7), esm.b(5368709120L, $$8))
                                 );
                              }
                           }
                        }
                     }
                  }
               } catch (IOException var19) {
                  this.a(vq.a("mco.upload.failed", var19.getMessage()));
               } catch (eud var20) {
                  this.a(vq.a("mco.upload.failed", var20.a.b()));
               } catch (InterruptedException var21) {
                  a.error("Could not acquire upload lock");
               } finally {
                  this.L = true;
                  if (b.isHeldByCurrentThread()) {
                     b.unlock();
                     this.M = false;
                     if (this.O != null) {
                        this.O.k = true;
                     }

                     if (this.P != null) {
                        this.P.k = false;
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

   private void a(vq... $$0) {
      this.H = $$0;
   }

   private void K() {
      this.I = vq.c("mco.upload.cancelled");
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
      if (!this.K) {
         File $$4 = new File($$1);
         String $$5 = $$3 ? $$2 : $$2 + $$4.getName();
         TarArchiveEntry $$6 = new TarArchiveEntry($$4, $$5);
         $$0.putArchiveEntry($$6);
         if ($$4.isFile()) {
            IOUtils.copy(new FileInputStream($$4), $$0);
            $$0.closeArchiveEntry();
         } else {
            $$0.closeArchiveEntry();
            File[] $$7 = $$4.listFiles();
            if ($$7 != null) {
               for (File $$8 : $$7) {
                  this.a($$0, $$8.getAbsolutePath(), $$5 + "/", false);
               }
            }
         }
      }
   }
}
