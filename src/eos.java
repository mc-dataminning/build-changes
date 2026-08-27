import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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

public class eos extends gei {
   private static final Logger a = LogUtils.getLogger();
   private static final ReentrantLock b = new ReentrantLock();
   private static final int c = 200;
   private static final int y = 80;
   private static final int z = 95;
   private static final int A = 1;
   private static final String[] B = new String[]{"", ".", ". .", ". . ."};
   private static final tf C = tf.c("mco.upload.verifying");
   private final eol D;
   private final eby E;
   private final long F;
   private final int G;
   private final ema H;
   private final RateLimiter I;
   @Nullable
   private volatile tf[] J;
   private volatile tf K = tf.c("mco.upload.preparing");
   private volatile String L;
   private volatile boolean M;
   private volatile boolean N;
   private volatile boolean O = true;
   private volatile boolean P;
   private esh Q;
   private esh R;
   private int S;
   @Nullable
   private Long T;
   @Nullable
   private Long U;
   private long V;
   private final Runnable W;

   public eos(long $$0, int $$1, eol $$2, eby $$3, Runnable $$4) {
      super(eqe.a);
      this.F = $$0;
      this.G = $$1;
      this.D = $$2;
      this.E = $$3;
      this.H = new ema();
      this.I = RateLimiter.create(0.1F);
      this.W = $$4;
   }

   @Override
   public void aE_() {
      this.Q = this.d(esh.a(te.k, $$0 -> this.B()).a((this.g - 200) / 2, this.h - 42, 200, 20).a());
      this.Q.j = false;
      this.R = this.d(esh.a(te.e, $$0 -> this.C()).a((this.g - 200) / 2, this.h - 42, 200, 20).a());
      if (!this.P) {
         if (this.D.a == -1) {
            this.E();
         } else {
            this.D.a(() -> {
               if (!this.P) {
                  this.P = true;
                  this.f.a(this);
                  this.E();
               }
            });
         }
      }
   }

   private void B() {
      this.W.run();
   }

   private void C() {
      this.M = true;
      this.f.a(this.D);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         if (this.O) {
            this.C();
         } else {
            this.B();
         }

         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (!this.N && this.H.a != 0L && this.H.a == this.H.b) {
         this.K = C;
         this.R.i = false;
      }

      $$0.a(this.i, this.K, this.g / 2, 50, 16777215);
      if (this.O) {
         this.c($$0);
      }

      if (this.H.a != 0L && !this.M) {
         this.d($$0);
         this.e($$0);
      }

      if (this.J != null) {
         for (int $$4 = 0; $$4 < this.J.length; $$4++) {
            $$0.a(this.i, this.J[$$4], this.g / 2, 110 + 12 * $$4, 16711680);
         }
      }
   }

   private void c(erw $$0) {
      int $$1 = this.i.a(this.K);
      $$0.a(this.i, B[this.S / 10 % B.length], this.g / 2 + $$1 / 2 + 5, 50, 16777215, false);
   }

   private void d(erw $$0) {
      double $$1 = Math.min((double)this.H.a / (double)this.H.b, 1.0);
      this.L = String.format(Locale.ROOT, "%.1f", $$1 * 100.0);
      int $$2 = (this.g - 200) / 2;
      int $$3 = $$2 + (int)Math.round(200.0 * $$1);
      $$0.a($$2 - 1, 79, $$3 + 1, 96, -2501934);
      $$0.a($$2, 80, $$3, 95, -8355712);
      $$0.a(this.i, this.L + " %", this.g / 2, 84, 16777215);
   }

   private void e(erw $$0) {
      if (this.S % 20 == 0) {
         if (this.T != null) {
            long $$1 = ac.b() - this.U;
            if ($$1 == 0L) {
               $$1 = 1L;
            }

            this.V = 1000L * (this.H.a - this.T) / $$1;
            this.a($$0, this.V);
         }

         this.T = this.H.a;
         this.U = ac.b();
      } else {
         this.a($$0, this.V);
      }
   }

   private void a(erw $$0, long $$1) {
      if ($$1 > 0L) {
         int $$2 = this.i.b(this.L);
         String $$3 = "(" + els.b($$1) + "/s)";
         $$0.a(this.i, $$3, this.g / 2 + $$2 / 2 + 15, 84, 16777215, false);
      }
   }

   @Override
   public void c() {
      super.c();
      this.S++;
      if (this.K != null && this.I.tryAcquire(1)) {
         tf $$0 = this.D();
         this.f.aV().c($$0);
      }
   }

   private tf D() {
      List<tf> $$0 = Lists.newArrayList();
      $$0.add(this.K);
      if (this.L != null) {
         $$0.add(tf.b(this.L + "%"));
      }

      if (this.J != null) {
         $$0.addAll(Arrays.asList(this.J));
      }

      return te.a($$0);
   }

   private void E() {
      this.P = true;
      new Thread(
            () -> {
               File $$0 = null;
               elw $$1 = elw.a();
               long $$2 = this.F;

               try {
                  if (!b.tryLock(1L, TimeUnit.SECONDS)) {
                     this.K = tf.c("mco.upload.close.failure");
                  } else {
                     enb $$3 = null;

                     for (int $$4 = 0; $$4 < 20; $$4++) {
                        try {
                           if (this.M) {
                              this.F();
                              return;
                           }

                           $$3 = $$1.e($$2, epf.a($$2));
                           if ($$3 != null) {
                              break;
                           }
                        } catch (enk var20) {
                           Thread.sleep((long)(var20.c * 1000));
                        }
                     }

                     if ($$3 == null) {
                        this.K = tf.c("mco.upload.close.failure");
                     } else {
                        epf.a($$2, $$3.a());
                        if (!$$3.c()) {
                           this.K = tf.c("mco.upload.close.failure");
                        } else if (this.M) {
                           this.F();
                        } else {
                           File $$6 = new File(this.f.p.getAbsolutePath(), "saves");
                           $$0 = this.b(new File($$6, this.E.a()));
                           if (this.M) {
                              this.F();
                           } else if (this.a($$0)) {
                              this.K = tf.a("mco.upload.uploading", this.E.b());
                              elu $$11 = new elu($$0, this.F, this.G, $$3, this.f.V(), aa.b().c(), this.H);
                              $$11.a($$1x -> {
                                 if ($$1x.a >= 200 && $$1x.a < 300) {
                                    this.N = true;
                                    this.K = tf.c("mco.upload.done");
                                    this.Q.b(te.d);
                                    epf.b($$2);
                                 } else if ($$1x.a == 400 && $$1x.b != null) {
                                    this.a(tf.a("mco.upload.failed", $$1x.b));
                                 } else {
                                    this.a(tf.a("mco.upload.failed", $$1x.a));
                                 }
                              });

                              while (!$$11.b()) {
                                 if (this.M) {
                                    $$11.a();
                                    this.F();
                                    return;
                                 }

                                 try {
                                    Thread.sleep(500L);
                                 } catch (InterruptedException var19) {
                                    a.error("Failed to check Realms file upload status");
                                 }
                              }
                           } else {
                              long $$7 = $$0.length();
                              els $$8 = els.a($$7);
                              els $$9 = els.a(5368709120L);
                              if (els.b($$7, $$8).equals(els.b(5368709120L, $$9)) && $$8 != els.a) {
                                 els $$10 = els.values()[$$8.ordinal() - 1];
                                 this.a(
                                    tf.a("mco.upload.size.failure.line1", this.E.b()),
                                    tf.a("mco.upload.size.failure.line2", els.b($$7, $$10), els.b(5368709120L, $$10))
                                 );
                              } else {
                                 this.a(
                                    tf.a("mco.upload.size.failure.line1", this.E.b()),
                                    tf.a("mco.upload.size.failure.line2", els.b($$7, $$8), els.b(5368709120L, $$9))
                                 );
                              }
                           }
                        }
                     }
                  }
               } catch (IOException var21) {
                  this.a(tf.a("mco.upload.failed", var21.getMessage()));
               } catch (enj var22) {
                  this.a(tf.a("mco.upload.failed", var22.a.b()));
               } catch (InterruptedException var23) {
                  a.error("Could not acquire upload lock");
               } finally {
                  this.N = true;
                  if (b.isHeldByCurrentThread()) {
                     b.unlock();
                     this.O = false;
                     this.Q.j = true;
                     this.R.j = false;
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

   private void a(tf... $$0) {
      this.J = $$0;
   }

   private void F() {
      this.K = tf.c("mco.upload.cancelled");
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
      if (!this.M) {
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
