import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

public class dxv extends dxf {
   private static final int b = 32;
   public static final int a = 32;
   private static final int c = 34;
   private static final int d = 16;
   private static final int e = 8;
   private static final int f = 5;
   private static final int g = 20;
   private static final int h = 5;
   private static final int i = 100;
   private static final int j = 10;
   private static final int k = 10;
   private static final int l = 50;
   private static final int m = 2;
   private static final int q = 64;
   private static final int r = 30;
   private static final Optional<cpi> s = Optional.empty();
   @Nullable
   private Either<cpi, UUID> t;
   private long u;
   private int v;
   private int w;
   @Nullable
   private feq x;
   private int y;

   public dxv(iu $$0, eah $$1) {
      super(dxh.k, $$0, $$1);
   }

   public static void a(dja $$0, iu $$1, eah $$2, dxv $$3) {
      $$3.u++;
      if ($$0 instanceof arq $$4) {
         int $$6 = $$3.f();
         if ($$3.y != $$6) {
            $$3.y = $$6;
            $$0.b($$1, dmh.cE);
         }

         if ($$3.w > 0) {
            if ($$3.w > 50) {
               $$3.a($$4, 1, true);
               $$3.a($$4, 1, false);
            }

            if ($$3.w % 10 == 0 && $$3.x != null) {
               $$3.s().ifPresent($$1x -> $$3.x = $$1x.cR().f());
               feq $$7 = feq.b($$1);
               float $$8 = 0.2F + 0.8F * (float)(100 - $$3.w) / 100.0F;
               feq $$9 = $$7.d($$3.x).c((double)$$8).e($$3.x);
               iu $$10 = iu.a((jo)$$9);
               float $$11 = (float)$$3.w / 2.0F / 100.0F + 0.5F;
               $$4.a(null, $$10, awn.gA, awo.e, $$11, 1.0F);
            }

            $$3.w--;
         }

         if ($$3.v-- < 0) {
            $$3.v = $$3.n == null ? 20 : $$3.n.A.a(5) + 20;
            eah $$12 = a($$0, $$2, $$1, $$3);
            if ($$12 != $$2) {
               $$0.a($$1, $$12, 3);
               if ($$12.c(dob.c) == ebb.a) {
                  return;
               }
            }

            if ($$3.t == null) {
               if ($$12.c(dob.c) == ebb.c) {
                  if ($$0.an() != bua.a) {
                     if ($$4.O().c(diw.f)) {
                        crc $$15 = $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 32.0, false);
                        if ($$15 != null) {
                           cpi $$16 = a($$4, $$3);
                           if ($$16 != null) {
                              $$3.a($$16);
                              $$16.b(awn.gu);
                              $$0.a(null, $$3.ax_(), awn.gE, awo.e, 1.0F, 1.0F);
                           }
                        }
                     }
                  }
               }
            } else {
               Optional<cpi> $$13 = $$3.s();
               if ($$13.isPresent()) {
                  cpi $$14 = $$13.get();
                  if (!dob.a($$0) && !$$14.ga() || $$3.j() > 34.0 || $$14.t()) {
                     $$3.a(null);
                  }
               }
            }
         }
      }
   }

   private static eah a(dja $$0, eah $$1, iu $$2, dxv $$3) {
      if (!dob.b($$1, $$0, $$2) && $$3.t == null) {
         return $$1.b(dob.c, ebb.a);
      } else {
         boolean $$4 = dob.a($$0);
         return $$1.b(dob.c, $$4 ? ebb.c : ebb.b);
      }
   }

   private double j() {
      return this.s().map($$0 -> Math.sqrt($$0.g(feq.c(this.ax_())))).orElse(0.0);
   }

   private void k() {
      this.t = null;
      this.e();
   }

   public void a(cpi $$0) {
      this.t = Either.left($$0);
      this.e();
   }

   public void a(UUID $$0) {
      this.t = Either.right($$0);
      this.u = 0L;
      this.e();
   }

   private Optional<cpi> s() {
      if (this.t == null) {
         return s;
      } else {
         if (this.t.left().isPresent()) {
            cpi $$0 = (cpi)this.t.left().get();
            if (!$$0.dQ()) {
               return Optional.of($$0);
            }

            this.a($$0.cG());
         }

         if (this.n instanceof arq $$1 && this.t.right().isPresent()) {
            UUID $$2 = (UUID)this.t.right().get();
            if ($$1.b($$2) instanceof cpi $$4) {
               this.a($$4);
               return Optional.of($$4);
            }

            if (this.u >= 30L) {
               this.k();
            }

            return s;
         }

         return s;
      }
   }

   @Nullable
   private static cpi a(arq $$0, dxv $$1) {
      iu $$2 = $$1.ax_();
      Optional<cpi> $$3 = bah.a(bwo.D, bwn.c, $$0, $$2, 5, 16, 8, bah.a.c, true);
      if ($$3.isEmpty()) {
         return null;
      } else {
         cpi $$4 = $$3.get();
         $$0.a($$4, efh.t, $$4.dt());
         $$0.a($$4, (byte)60);
         $$4.h($$2);
         return $$4;
      }
   }

   public aca a() {
      return aca.a(this);
   }

   @Override
   public tz a(jg.a $$0) {
      return this.e($$0);
   }

   public void c() {
      if (this.s().orElse(null) instanceof cpi $$0) {
         if (this.n instanceof arq $$2) {
            if (this.w <= 0) {
               this.a($$2, 20, false);
               if (this.m().c(dob.c) == ebb.c) {
                  int $$4 = this.n.C_().a(2, 3);

                  for (int $$5 = 0; $$5 < $$4; $$5++) {
                     this.t().ifPresent($$0x -> {
                        this.n.a(null, $$0x, awn.yO, awo.e, 1.0F, 1.0F);
                        this.n.a(efh.i, $$0x, efh.a.a(this.m()));
                     });
                  }
               }

               this.w = 100;
               this.x = $$0.cR().f();
            }
         }
      }
   }

   private Optional<iu> t() {
      Mutable<iu> $$0 = new MutableObject(null);
      iu.a(this.o, 2, 64, ($$0x, $$1) -> {
         for (ja $$2 : af.b(ja.values(), this.n.A)) {
            iu $$3 = $$0x.a($$2);
            if (this.n.a_($$3).a(axc.w)) {
               $$1.accept($$3);
            }
         }
      }, $$1 -> {
         if (!this.n.a_($$1).a(axc.w)) {
            return iu.b.a;
         } else {
            for (ja $$2 : af.b(ja.values(), this.n.A)) {
               iu $$3 = $$1.a($$2);
               eah $$4 = this.n.a_($$3);
               ja $$5 = $$2.g();
               if ($$4.l()) {
                  $$4 = dmh.fz.m();
               } else if ($$4.a(dmh.J) && $$4.y().b()) {
                  $$4 = dmh.fz.m().b(drl.c, Boolean.valueOf(true));
               }

               if ($$4.a(dmh.fz) && !drl.a($$4, $$5)) {
                  this.n.a($$3, $$4.b(drl.b($$5), Boolean.valueOf(true)), 3);
                  $$0.setValue($$3);
                  return iu.b.c;
               }
            }

            return iu.b.a;
         }
      });
      return Optional.ofNullable((iu)$$0.getValue());
   }

   private void a(arq $$0, int $$1, boolean $$2) {
      if (this.s().orElse(null) instanceof cpi $$3) {
         int $$5 = $$2 ? 16545810 : 6250335;
         azv $$6 = $$0.A;

         for (double $$7 = 0.0; $$7 < (double)$$1; $$7++) {
            fel $$8 = $$3.cR();
            feq $$9 = $$8.h().b($$6.j() * $$8.b(), $$6.j() * $$8.c(), $$6.j() * $$8.d());
            feq $$10 = feq.a(this.ax_()).b($$6.j(), $$6.j(), $$6.j());
            if ($$2) {
               feq $$11 = $$9;
               $$9 = $$10;
               $$10 = $$11;
            }

            mc $$12 = new mc($$10, $$5, $$6.a(40) + 10);
            $$0.a($$12, true, true, $$9.d, $$9.e, $$9.f, 1, 0.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(iu $$0, eah $$1) {
      this.a(null);
   }

   public void a(@Nullable buu $$0) {
      if (this.s().orElse(null) instanceof cpi $$1) {
         if ($$0 == null) {
            $$1.q();
         } else {
            $$1.j($$0);
            $$1.gr();
            $$1.d(0.0F);
         }

         this.k();
      }
   }

   public boolean b(cpi $$0) {
      return this.s().map($$1 -> $$1 == $$0).orElse(false);
   }

   public int d() {
      return this.y;
   }

   public int f() {
      if (this.t != null && !this.s().isEmpty()) {
         double $$0 = this.j();
         double $$1 = Math.clamp($$0, 0.0, 32.0) / 32.0;
         return 15 - (int)Math.floor($$1 * 15.0);
      } else {
         return 0;
      }
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("creaking")) {
         this.a($$0.a("creaking"));
      } else {
         this.k();
      }
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      if (this.t != null) {
         $$0.a("creaking", (UUID)this.t.map(bwf::cG, $$0x -> $$0x));
      }
   }
}
