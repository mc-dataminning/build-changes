import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class env extends gei {
   private static final aer a = new aer("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final exz y;
   private final elr z;
   @Nullable
   private emn A;
   private final long B;
   private final tf[] C = new tf[]{tf.c("mco.brokenworld.message.line1"), tf.c("mco.brokenworld.message.line2")};
   private int D;
   private int E;
   private final List<Integer> F = Lists.newArrayList();
   private int G;

   public env(exz $$0, elr $$1, long $$2, boolean $$3) {
      super($$3 ? tf.c("mco.brokenworld.minigame.title") : tf.c("mco.brokenworld.title"));
      this.y = $$0;
      this.z = $$1;
      this.B = $$2;
   }

   @Override
   public void aE_() {
      this.D = this.g / 2 - 150;
      this.E = this.g / 2 + 190;
      this.d(esh.a(te.k, $$0 -> this.C()).a(this.E - 80 + 8, h(13) - 5, 70, 20).a());
      if (this.A == null) {
         this.a(this.B);
      } else {
         this.B();
      }
   }

   @Override
   public tf e() {
      return th.a(Stream.concat(Stream.of(this.e), Stream.of(this.C)).collect(Collectors.toList()), te.u);
   }

   private void B() {
      for (Entry<Integer, emu> $$0 : this.A.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.A.n || this.A.m == emn.c.b;
         esh $$3;
         if ($$2) {
            $$3 = esh.a(
                  tf.c("mco.brokenworld.play"),
                  $$1x -> {
                     if (this.A.i.get($$1).l) {
                        eol $$2x = new eol(
                           this,
                           this.A,
                           tf.c("mco.configure.world.switch.slot"),
                           tf.c("mco.configure.world.switch.slot.subtitle"),
                           -6250336,
                           te.e,
                           this::d,
                           () -> {
                              this.f.a(this);
                              this.d();
                           }
                        );
                        $$2x.a($$1);
                        $$2x.a(tf.c("mco.create.world.reset.title"));
                        this.f.a($$2x);
                     } else {
                        this.f.a(new eoe(this.y, new ept(this.A.a, $$1, this::d)));
                     }
                  }
               )
               .a(this.a($$1), h(8), 80, 20)
               .a();
         } else {
            $$3 = esh.a(tf.c("mco.brokenworld.download"), $$1x -> {
               tf $$2x = tf.c("mco.configure.world.restore.download.question.line1");
               tf $$3x = tf.c("mco.configure.world.restore.download.question.line2");
               this.f.a(new eod($$1xx -> {
                  if ($$1xx) {
                     this.b($$1);
                  } else {
                     this.f.a(this);
                  }
               }, eod.a.b, $$2x, $$3x, true));
            }).a(this.a($$1), h(8), 80, 20).a();
         }

         if (this.F.contains($$1)) {
            $$3.i = false;
            $$3.b(tf.c("mco.brokenworld.downloaded"));
         }

         this.d($$3);
         this.d(esh.a(tf.c("mco.brokenworld.reset"), $$1x -> {
            eol $$2x = new eol(this, this.A, this::d, () -> {
               this.f.a(this);
               this.d();
            });
            if ($$1 != this.A.n || this.A.m == emn.c.b) {
               $$2x.a($$1);
            }

            this.f.a($$2x);
         }).a(this.a($$1), h(10), 80, 20).a());
      }
   }

   @Override
   public void c() {
      this.G++;
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.C.length; $$4++) {
         $$0.a(this.i, this.C[$$4], this.g / 2, h(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.A != null) {
         for (Entry<Integer, emu> $$5 : this.A.i.entrySet()) {
            if ($$5.getValue().k != null && $$5.getValue().j != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  h(1) + 5,
                  $$1,
                  $$2,
                  this.A.n == $$5.getKey() && !this.D(),
                  $$5.getValue().a($$5.getKey()),
                  $$5.getKey(),
                  $$5.getValue().j,
                  $$5.getValue().k,
                  $$5.getValue().l
               );
            } else {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  h(1) + 5,
                  $$1,
                  $$2,
                  this.A.n == $$5.getKey() && !this.D(),
                  $$5.getValue().a($$5.getKey()),
                  $$5.getKey(),
                  -1L,
                  null,
                  $$5.getValue().l
               );
            }
         }
      }
   }

   private int a(int $$0) {
      return this.D + ($$0 - 1) * 110;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.C();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void C() {
      this.f.a(this.y);
   }

   private void a(long $$0) {
      new Thread(() -> {
         elw $$1 = elw.a();

         try {
            this.A = $$1.a($$0);
            this.B();
         } catch (enj var5) {
            b.error("Couldn't get own world", var5);
            this.f.a(new eob(var5, this.y));
         }
      }).start();
   }

   public void d() {
      new Thread(() -> {
         elw $$0 = elw.a();
         if (this.A.e == emn.b.a) {
            this.f.execute(() -> this.f.a(new eoe(this, new epn(this.A, this, this.z, true, this.f))));
         } else {
            try {
               emn $$1 = $$0.a(this.B);
               this.f.execute(() -> this.z.f().a($$1, this));
            } catch (enj var3) {
               b.error("Couldn't get own world", var3);
               this.f.execute(() -> this.f.a(this.y));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      elw $$1 = elw.a();

      try {
         end $$2 = $$1.b(this.A.a, $$0);
         eoa $$3 = new eoa(this, $$2, this.A.a($$0), $$1x -> {
            if ($$1x) {
               this.F.add($$0);
               this.n();
               this.B();
            } else {
               this.f.a(this);
            }
         });
         this.f.a($$3);
      } catch (enj var5) {
         b.error("Couldn't download world data", var5);
         this.f.a(new eob(var5, this));
      }
   }

   private boolean D() {
      return this.A != null && this.A.m == emn.c.b;
   }

   private void a(erw $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      aer $$11;
      if ($$10) {
         $$11 = enq.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = epc.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = enq.b;
      } else if ($$7 == 2) {
         $$11 = enq.c;
      } else if ($$7 == 3) {
         $$11 = enq.d;
      } else {
         $$11 = epc.a(String.valueOf(this.A.p), this.A.q);
      }

      if (!$$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      } else if ($$5) {
         float $$17 = 0.9F + 0.1F * arp.b((float)this.G * 0.2F);
         $$0.a($$17, $$17, $$17, 1.0F);
      }

      $$0.a($$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      if ($$5) {
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a(a, $$1, $$2, 80, 80);
      $$0.a(this.i, $$6, $$1 + 40, $$2 + 66, -1);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
