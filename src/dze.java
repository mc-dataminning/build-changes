import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

public class dze extends dyo {
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
   private static final Optional<cqo> s = Optional.empty();
   @Nullable
   private Either<cqo, UUID> t;
   private long u;
   private int v;
   private int w;
   @Nullable
   private fgc x;
   private int y;

   public dze(iw $$0, ebq $$1) {
      super(dyq.k, $$0, $$1);
   }

   public static void a(dkj $$0, iw $$1, ebq $$2, dze $$3) {
      $$3.u++;
      if ($$0 instanceof asb $$4) {
         int $$6 = $$3.f();
         if ($$3.y != $$6) {
            $$3.y = $$6;
            $$0.b($$1, dnq.cE);
         }

         if ($$3.w > 0) {
            if ($$3.w > 50) {
               $$3.a($$4, 1, true);
               $$3.a($$4, 1, false);
            }

            if ($$3.w % 10 == 0 && $$3.x != null) {
               $$3.s().ifPresent($$1x -> $$3.x = $$1x.cR().f());
               fgc $$7 = fgc.b($$1);
               float $$8 = 0.2F + 0.8F * (float)(100 - $$3.w) / 100.0F;
               fgc $$9 = $$7.d($$3.x).c((double)$$8).e($$3.x);
               iw $$10 = iw.a((jq)$$9);
               float $$11 = (float)$$3.w / 2.0F / 100.0F + 0.5F;
               $$4.a(null, $$10, awy.gA, awz.e, $$11, 1.0F);
            }

            $$3.w--;
         }

         if ($$3.v-- < 0) {
            $$3.v = $$3.n == null ? 20 : $$3.n.A.a(5) + 20;
            ebq $$12 = a($$0, $$2, $$1, $$3);
            if ($$12 != $$2) {
               $$0.a($$1, $$12, 3);
               if ($$12.c(dpk.c) == eck.a) {
                  return;
               }
            }

            if ($$3.t == null) {
               if ($$12.c(dpk.c) == eck.c) {
                  if ($$0.an() != buz.a) {
                     if ($$4.O().c(dkf.f)) {
                        csi $$15 = $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), 32.0, false);
                        if ($$15 != null) {
                           cqo $$16 = a($$4, $$3);
                           if ($$16 != null) {
                              $$3.a($$16);
                              $$16.b(awy.gu);
                              $$0.a(null, $$3.aC_(), awy.gE, awz.e, 1.0F, 1.0F);
                           }
                        }
                     }
                  }
               }
            } else {
               Optional<cqo> $$13 = $$3.s();
               if ($$13.isPresent()) {
                  cqo $$14 = $$13.get();
                  if (!dpk.a($$0) && !$$14.gd() || $$3.j() > 34.0 || $$14.t()) {
                     $$3.a(null);
                  }
               }
            }
         }
      }
   }

   private static ebq a(dkj $$0, ebq $$1, iw $$2, dze $$3) {
      if (!dpk.b($$1, $$0, $$2) && $$3.t == null) {
         return $$1.b(dpk.c, eck.a);
      } else {
         boolean $$4 = dpk.a($$0);
         return $$1.b(dpk.c, $$4 ? eck.c : eck.b);
      }
   }

   private double j() {
      return this.s().map($$0 -> Math.sqrt($$0.g(fgc.c(this.aC_())))).orElse(0.0);
   }

   private void k() {
      this.t = null;
      this.e();
   }

   public void a(cqo $$0) {
      this.t = Either.left($$0);
      this.e();
   }

   public void a(UUID $$0) {
      this.t = Either.right($$0);
      this.u = 0L;
      this.e();
   }

   private Optional<cqo> s() {
      if (this.t == null) {
         return s;
      } else {
         if (this.t.left().isPresent()) {
            cqo $$0 = (cqo)this.t.left().get();
            if (!$$0.dQ()) {
               return Optional.of($$0);
            }

            this.a($$0.cG());
         }

         if (this.n instanceof asb $$1 && this.t.right().isPresent()) {
            UUID $$2 = (UUID)this.t.right().get();
            if ($$1.b($$2) instanceof cqo $$4) {
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
   private static cqo a(asb $$0, dze $$1) {
      iw $$2 = $$1.aC_();
      Optional<cqo> $$3 = bau.a(bxn.E, bxm.c, $$0, $$2, 5, 16, 8, bau.a.c, true);
      if ($$3.isEmpty()) {
         return null;
      } else {
         cqo $$4 = $$3.get();
         $$0.a($$4, egq.t, $$4.dt());
         $$0.a($$4, (byte)60);
         $$4.h($$2);
         return $$4;
      }
   }

   public acl a() {
      return acl.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return this.e($$0);
   }

   public void c() {
      if (this.s().orElse(null) instanceof cqo $$0) {
         if (this.n instanceof asb $$2) {
            if (this.w <= 0) {
               this.a($$2, 20, false);
               if (this.m().c(dpk.c) == eck.c) {
                  int $$4 = this.n.G_().a(2, 3);

                  for (int $$5 = 0; $$5 < $$4; $$5++) {
                     this.t().ifPresent($$0x -> {
                        this.n.a(null, $$0x, awy.yO, awz.e, 1.0F, 1.0F);
                        this.n.a(egq.i, $$0x, egq.a.a(this.m()));
                     });
                  }
               }

               this.w = 100;
               this.x = $$0.cR().f();
            }
         }
      }
   }

   private Optional<iw> t() {
      Mutable<iw> $$0 = new MutableObject(null);
      iw.a(this.o, 2, 64, ($$0x, $$1) -> {
         for (jc $$2 : ag.b(jc.values(), this.n.A)) {
            iw $$3 = $$0x.a($$2);
            if (this.n.a_($$3).a(axn.w)) {
               $$1.accept($$3);
            }
         }
      }, $$1 -> {
         if (!this.n.a_($$1).a(axn.w)) {
            return iw.b.a;
         } else {
            for (jc $$2 : ag.b(jc.values(), this.n.A)) {
               iw $$3 = $$1.a($$2);
               ebq $$4 = this.n.a_($$3);
               jc $$5 = $$2.g();
               if ($$4.l()) {
                  $$4 = dnq.fz.m();
               } else if ($$4.a(dnq.J) && $$4.y().b()) {
                  $$4 = dnq.fz.m().b(dsu.c, Boolean.valueOf(true));
               }

               if ($$4.a(dnq.fz) && !dsu.a($$4, $$5)) {
                  this.n.a($$3, $$4.b(dsu.b($$5), Boolean.valueOf(true)), 3);
                  $$0.setValue($$3);
                  return iw.b.c;
               }
            }

            return iw.b.a;
         }
      });
      return Optional.ofNullable((iw)$$0.getValue());
   }

   private void a(asb $$0, int $$1, boolean $$2) {
      if (this.s().orElse(null) instanceof cqo $$3) {
         int $$5 = $$2 ? 16545810 : 6250335;
         bai $$6 = $$0.A;

         for (double $$7 = 0.0; $$7 < (double)$$1; $$7++) {
            ffx $$8 = $$3.cR();
            fgc $$9 = $$8.h().b($$6.j() * $$8.b(), $$6.j() * $$8.c(), $$6.j() * $$8.d());
            fgc $$10 = fgc.a(this.aC_()).b($$6.j(), $$6.j(), $$6.j());
            if ($$2) {
               fgc $$11 = $$9;
               $$9 = $$10;
               $$10 = $$11;
            }

            me $$12 = new me($$10, $$5, $$6.a(40) + 10);
            $$0.a($$12, true, true, $$9.d, $$9.e, $$9.f, 1, 0.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(iw $$0, ebq $$1) {
      this.a(null);
   }

   public void a(@Nullable bvt $$0) {
      if (this.s().orElse(null) instanceof cqo $$1) {
         if ($$0 == null) {
            $$1.q();
         } else {
            $$1.j($$0);
            $$1.gu();
            $$1.d(0.0F);
         }

         this.k();
      }
   }

   public boolean b(cqo $$0) {
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
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      $$0.<UUID>a("creaking", ka.a).ifPresentOrElse(this::a, this::k);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      if (this.t != null) {
         $$0.a("creaking", ka.a, (UUID)this.t.map(bxe::cG, $$0x -> $$0x));
      }
   }
}
