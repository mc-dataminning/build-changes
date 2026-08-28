import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

public class dvh extends dus {
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
   private static final Optional<cnw> s = Optional.empty();
   @Nullable
   private Either<cnw, UUID> t;
   private long u;
   private int v;
   private int w;
   @Nullable
   private fbx x;
   private int y;

   public dvh(ji $$0, dxq $$1) {
      super(duu.k, $$0, $$1);
   }

   public static void a(dgz $$0, ji $$1, dxq $$2, dvh $$3) {
      $$3.u++;
      if ($$0 instanceof ard $$4) {
         int $$6 = $$3.f();
         if ($$3.y != $$6) {
            $$3.y = $$6;
            $$0.b($$1, dkg.cB);
         }

         if ($$3.w > 0) {
            if ($$3.w > 50) {
               $$3.a($$4, 1, true);
               $$3.a($$4, 1, false);
            }

            if ($$3.w % 10 == 0 && $$3.x != null) {
               $$3.s().ifPresent($$1x -> $$3.x = $$1x.cQ().f());
               fbx $$7 = fbx.b($$1);
               float $$8 = 0.2F + 0.8F * (float)(100 - $$3.w) / 100.0F;
               fbx $$9 = $$7.d($$3.x).c((double)$$8).e($$3.x);
               ji $$10 = ji.a((kb)$$9);
               float $$11 = (float)$$3.w / 2.0F / 100.0F + 0.5F;
               $$4.a(null, $$10, awa.gy, awb.e, $$11, 1.0F);
            }

            $$3.w--;
         }

         if ($$3.v-- < 0) {
            $$3.v = $$3.n == null ? 20 : $$3.n.A.a(5) + 20;
            dxq $$12 = a($$0, $$2, $$1, $$3);
            if ($$12 != $$2) {
               $$0.a($$1, $$12, 3);
               if ($$12.c(dlz.c) == dyk.a) {
                  return;
               }
            }

            if ($$3.t == null) {
               if ($$12.c(dlz.c) == dyk.c) {
                  if ($$0.an() != bsv.a) {
                     if ($$4.O().b(dgv.e)) {
                        cpr $$15 = $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 32.0, false);
                        if ($$15 != null) {
                           cnw $$16 = a($$4, $$3);
                           if ($$16 != null) {
                              $$3.a($$16);
                              $$16.b(awa.gs);
                              $$0.a(null, $$3.aA_(), awa.gC, awb.e, 1.0F, 1.0F);
                           }
                        }
                     }
                  }
               }
            } else {
               Optional<cnw> $$13 = $$3.s();
               if ($$13.isPresent()) {
                  cnw $$14 = $$13.get();
                  if (!dlz.a($$0) && !$$14.gb() || $$3.j() > 34.0 || $$14.t()) {
                     $$3.a(null);
                  }
               }
            }
         }
      }
   }

   private static dxq a(dgz $$0, dxq $$1, ji $$2, dvh $$3) {
      if (!dlz.b($$1, $$0, $$2) && $$3.t == null) {
         return $$1.b(dlz.c, dyk.a);
      } else {
         boolean $$4 = dlz.a($$0);
         return $$1.b(dlz.c, $$4 ? dyk.c : dyk.b);
      }
   }

   private double j() {
      return this.s().map($$0 -> Math.sqrt($$0.g(fbx.c(this.aA_())))).orElse(0.0);
   }

   private void k() {
      this.t = null;
      this.e();
   }

   public void a(cnw $$0) {
      this.t = Either.left($$0);
      this.e();
   }

   public void a(UUID $$0) {
      this.t = Either.right($$0);
      this.u = 0L;
      this.e();
   }

   private Optional<cnw> s() {
      if (this.t == null) {
         return s;
      } else {
         if (this.t.left().isPresent()) {
            cnw $$0 = (cnw)this.t.left().get();
            if (!$$0.dP()) {
               return Optional.of($$0);
            }

            this.a($$0.cF());
         }

         if (this.n instanceof ard $$1 && this.t.right().isPresent()) {
            UUID $$2 = (UUID)this.t.right().get();
            if ($$1.b($$2) instanceof cnw $$4) {
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
   private static cnw a(ard $$0, dvh $$1) {
      ji $$2 = $$1.aA_();
      Optional<cnw> $$3 = azs.a(bvi.D, bvh.c, $$0, $$2, 5, 16, 8, azs.a.c, true);
      if ($$3.isEmpty()) {
         return null;
      } else {
         cnw $$4 = $$3.get();
         $$0.a($$4, ecp.t, $$4.ds());
         $$0.a($$4, (byte)60);
         $$4.i($$2);
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
      if (this.s().orElse(null) instanceof cnw $$0) {
         if (this.n instanceof ard $$2) {
            if (this.w <= 0) {
               this.a($$2, 20, false);
               if (this.m().c(dlz.c) == dyk.c) {
                  int $$4 = this.n.C_().a(2, 3);

                  for (int $$5 = 0; $$5 < $$4; $$5++) {
                     this.t().ifPresent($$0x -> {
                        this.n.a(null, $$0x, awa.yI, awb.e, 1.0F, 1.0F);
                        this.n.a(ecp.i, $$0x, ecp.a.a(this.m()));
                     });
                  }
               }

               this.w = 100;
               this.x = $$0.cQ().f();
            }
         }
      }
   }

   private Optional<ji> t() {
      Mutable<ji> $$0 = new MutableObject(null);
      ji.a(this.o, 2, 64, ($$0x, $$1) -> {
         for (jn $$2 : af.b(jn.values(), this.n.A)) {
            ji $$3 = $$0x.a($$2);
            if (this.n.a_($$3).a(awp.w)) {
               $$1.accept($$3);
            }
         }
      }, $$1 -> {
         if (!this.n.a_($$1).a(awp.w)) {
            return ji.b.a;
         } else {
            for (jn $$2 : af.b(jn.values(), this.n.A)) {
               ji $$3 = $$1.a($$2);
               dxq $$4 = this.n.a_($$3);
               jn $$5 = $$2.g();
               if ($$4.l()) {
                  $$4 = dkg.fv.m();
               } else if ($$4.a(dkg.J) && $$4.y().b()) {
                  $$4 = dkg.fv.m().b(dpi.c, Boolean.valueOf(true));
               }

               if ($$4.a(dkg.fv) && !dpi.a($$4, $$5)) {
                  this.n.a($$3, $$4.b(dpi.b($$5), Boolean.valueOf(true)), 3);
                  $$0.setValue($$3);
                  return ji.b.c;
               }
            }

            return ji.b.a;
         }
      });
      return Optional.ofNullable((ji)$$0.getValue());
   }

   private void a(ard $$0, int $$1, boolean $$2) {
      if (this.s().orElse(null) instanceof cnw $$3) {
         int $$5 = $$2 ? 16545810 : 6250335;
         azh $$6 = $$0.A;

         for (double $$7 = 0.0; $$7 < (double)$$1; $$7++) {
            fbs $$8 = $$3.cQ();
            fbx $$9 = $$8.h().b($$6.j() * $$8.b(), $$6.j() * $$8.c(), $$6.j() * $$8.d());
            fbx $$10 = fbx.a(this.aA_()).b($$6.j(), $$6.j(), $$6.j());
            if ($$2) {
               fbx $$11 = $$9;
               $$9 = $$10;
               $$10 = $$11;
            }

            ly $$12 = new ly($$10, $$5, $$6.a(40) + 10);
            $$0.a($$12, true, true, $$9.d, $$9.e, $$9.f, 1, 0.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(ji $$0, dxq $$1, boolean $$2) {
      this.a(null);
   }

   public void a(@Nullable btp $$0) {
      if (this.s().orElse(null) instanceof cnw $$1) {
         if ($$0 == null) {
            $$1.q();
         } else {
            $$1.k($$0);
            $$1.gs();
            $$1.d(0.0F);
         }

         this.k();
      }
   }

   public boolean b(cnw $$0) {
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
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("creaking")) {
         this.a($$0.a("creaking"));
      } else {
         this.k();
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (this.t != null) {
         $$0.a("creaking", (UUID)this.t.map(bva::cF, $$0x -> $$0x));
      }
   }
}
