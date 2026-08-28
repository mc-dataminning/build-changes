import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

public class dum extends dtx {
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
   private static final int n = 64;
   private static final int r = 30;
   private static final Optional<cna> s = Optional.empty();
   @Nullable
   private Either<cna, UUID> t;
   private long u;
   private int v;
   private int w;
   @Nullable
   private fay x;
   private int y;

   public dum(ji $$0, dwv $$1) {
      super(dtz.k, $$0, $$1);
   }

   public static void a(dgg $$0, ji $$1, dwv $$2, dum $$3) {
      $$3.u++;
      if ($$0 instanceof arc $$4) {
         int $$6 = $$3.f();
         if ($$3.y != $$6) {
            $$3.y = $$6;
            $$0.c($$1, djm.cB);
         }

         if ($$3.w > 0) {
            if ($$3.w > 50) {
               $$3.a($$4, 1, true);
               $$3.a($$4, 1, false);
            }

            if ($$3.w % 10 == 0 && $$3.x != null) {
               $$3.k().ifPresent($$1x -> $$3.x = $$1x.cR().f());
               fay $$7 = fay.b($$1);
               float $$8 = 0.2F + 0.8F * (float)(100 - $$3.w) / 100.0F;
               fay $$9 = $$7.d($$3.x).c((double)$$8).e($$3.x);
               ji $$10 = ji.a((kb)$$9);
               float $$11 = (float)$$3.w / 2.0F / 100.0F + 0.5F;
               $$4.a(null, $$10, avz.gy, awa.e, $$11, 1.0F);
            }

            $$3.w--;
         }

         if ($$3.v-- < 0) {
            $$3.v = $$3.o == null ? 20 : $$3.o.A.a(5) + 20;
            if ($$3.t == null) {
               if (!dlf.b($$2, $$0, $$1)) {
                  $$0.a($$1, $$2.b(dlf.c, Boolean.valueOf(false)), 3);
               } else if ($$2.c(dlf.c)) {
                  if (dlf.a($$0)) {
                     if ($$0.am() != bsf.a) {
                        if ($$4.O().b(dgc.e)) {
                           cov $$14 = $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 32.0, false);
                           if ($$14 != null) {
                              cna $$15 = a($$4, $$3);
                              if ($$15 != null) {
                                 $$3.t = Either.left($$15);
                                 $$15.b(avz.gs);
                                 $$0.a(null, $$3.aA_(), avz.gC, awa.e, 1.0F, 1.0F);
                              }
                           }
                        }
                     }
                  }
               }
            } else {
               Optional<cna> $$12 = $$3.k();
               if ($$12.isPresent()) {
                  cna $$13 = $$12.get();
                  if (!dlf.a($$0) || $$3.j() > 34.0 || $$13.gp()) {
                     $$3.a(null);
                     return;
                  }

                  if ($$13.dR()) {
                     $$3.t = null;
                  }

                  if (!dlf.b($$2, $$0, $$1) && $$3.t == null) {
                     $$0.a($$1, $$2.b(dlf.c, Boolean.valueOf(false)), 3);
                  }
               }
            }
         }
      }
   }

   private double j() {
      return this.k().map($$0 -> Math.sqrt($$0.f(fay.c(this.aA_())))).orElse(0.0);
   }

   private Optional<cna> k() {
      if (this.t == null) {
         return s;
      } else if (this.t.left().isPresent()) {
         return Optional.of((cna)this.t.left().get());
      } else {
         if (this.o instanceof arc $$0 && this.t.right().isPresent()) {
            UUID $$1 = (UUID)this.t.right().get();
            if ($$0.a($$1) instanceof cna $$3) {
               this.t = Either.left($$3);
               return Optional.of($$3);
            }

            if (this.u >= 30L) {
               this.t = null;
            }

            return s;
         }

         return s;
      }
   }

   @Nullable
   private static cna a(arc $$0, dum $$1) {
      ji $$2 = $$1.aA_();
      Optional<cna> $$3 = azr.a(buq.D, bup.c, $$0, $$2, 5, 16, 8, azr.a.c, true);
      if ($$3.isEmpty()) {
         return null;
      } else {
         cna $$4 = $$3.get();
         $$0.a($$4, ebr.t, $$4.du());
         $$0.a($$4, (byte)60);
         $$4.h($$2);
         return $$4;
      }
   }

   public abr b() {
      return abr.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return this.e($$0);
   }

   public void c() {
      if (this.k().orElse(null) instanceof cna $$0) {
         if (this.o instanceof arc $$2) {
            if (this.w <= 0) {
               this.a($$2, 20, false);
               int $$4 = this.o.H_().a(2, 3);

               for (int $$5 = 0; $$5 < $$4; $$5++) {
                  this.s().ifPresent($$0x -> {
                     this.o.a(null, $$0x, avz.yy, awa.e, 1.0F, 1.0F);
                     this.o.a(ebr.i, $$0x, ebr.a.a(this.o.a_($$0x)));
                  });
               }

               this.w = 100;
               this.x = $$0.cR().f();
            }
         }
      }
   }

   private Optional<ji> s() {
      Mutable<ji> $$0 = new MutableObject(null);
      ji.a(this.p, 2, 64, ($$0x, $$1) -> {
         for (jn $$2 : af.b(jn.values(), this.o.A)) {
            ji $$3 = $$0x.a($$2);
            if (this.o.a_($$3).a(awo.w)) {
               $$1.accept($$3);
            }
         }
      }, $$1 -> {
         if (!this.o.a_($$1).a(awo.w)) {
            return ji.b.a;
         } else {
            for (jn $$2 : af.b(jn.values(), this.o.A)) {
               ji $$3 = $$1.a($$2);
               dwv $$4 = this.o.a_($$3);
               jn $$5 = $$2.g();
               if ($$4.l()) {
                  $$4 = djm.fv.m();
               } else if ($$4.a(djm.J) && $$4.y().b()) {
                  $$4 = djm.fv.m().b(dom.c, Boolean.valueOf(true));
               }

               if ($$4.a(djm.fv) && !dom.a($$4, $$5)) {
                  this.o.a($$3, $$4.b(dom.b($$5), Boolean.valueOf(true)), 3);
                  $$0.setValue($$3);
                  return ji.b.c;
               }
            }

            return ji.b.a;
         }
      });
      return Optional.ofNullable((ji)$$0.getValue());
   }

   private void a(arc $$0, int $$1, boolean $$2) {
      if (this.k().orElse(null) instanceof cna $$3) {
         int $$5 = $$2 ? 16545810 : 6250335;
         azg $$6 = $$0.A;

         for (double $$7 = 0.0; $$7 < (double)$$1; $$7++) {
            fat $$8 = $$3.cR();
            fay $$9 = $$8.h().b($$6.j() * $$8.b(), $$6.j() * $$8.c(), $$6.j() * $$8.d());
            fay $$10 = fay.a(this.aA_()).b($$6.j(), $$6.j(), $$6.j());
            if ($$2) {
               fay $$11 = $$9;
               $$9 = $$10;
               $$10 = $$11;
            }

            ly $$12 = new ly($$10, $$5, $$6.a(40) + 10);
            $$0.a($$12, true, true, $$9.d, $$9.e, $$9.f, 1, 0.0, 0.0, 0.0, 0.0);
         }
      }
   }

   public void a(@Nullable bsz $$0) {
      if (this.k().orElse(null) instanceof cna $$1) {
         if ($$0 == null) {
            $$1.x();
         } else {
            $$1.k($$0);
            $$1.gq();
            $$1.x(0.0F);
         }

         this.t = null;
      }
   }

   public boolean a(cna $$0) {
      return this.k().map($$1 -> $$1 == $$0).orElse(false);
   }

   public int d() {
      return this.y;
   }

   public int f() {
      if (this.t != null && !this.k().isEmpty()) {
         double $$0 = this.j();
         double $$1 = Math.clamp($$0, 0.0, 32.0) / 32.0;
         return 15 - (int)Math.floor($$1 * 15.0);
      } else {
         return 0;
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("creaking")) {
         this.t = Either.right($$0.a("creaking"));
      } else {
         this.t = null;
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (this.t != null) {
         $$0.a("creaking", (UUID)this.t.map(buj::cG, $$0x -> $$0x));
      }
   }
}
