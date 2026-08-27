import java.util.List;
import java.util.Optional;

public class cpq extends cre {
   private static final int a = axk.f(0.4F, 0.4F, 1.0F);

   public cpq(cre.a $$0) {
      super($$0);
   }

   public static float d(crj $$0) {
      ctr $$1 = $$0.a(jp.w, ctr.b);
      return (float)$$1.c() / 64.0F;
   }

   @Override
   public boolean a(crj $$0, cok $$1, cmx $$2, cjt $$3) {
      if ($$2 != cmx.b) {
         return false;
      } else {
         ctr $$4 = $$0.a(jp.w);
         if ($$4 == null) {
            return false;
         } else {
            crj $$5 = $$1.g();
            ctr.a $$6 = new ctr.a($$4);
            if ($$5.d()) {
               this.a($$3);
               crj $$7 = $$6.a();
               if ($$7 != null) {
                  crj $$8 = $$1.d($$7);
                  $$6.a($$8);
               }
            } else if ($$5.f().an_()) {
               int $$9 = $$6.a($$1, $$3);
               if ($$9 > 0) {
                  this.b($$3);
               }
            }

            $$0.b(jp.w, $$6.c());
            return true;
         }
      }
   }

   @Override
   public boolean a(crj $$0, crj $$1, cok $$2, cmx $$3, cjt $$4, brf $$5) {
      if ($$3 == cmx.b && $$2.b($$4)) {
         ctr $$6 = $$0.a(jp.w);
         if ($$6 == null) {
            return false;
         } else {
            ctr.a $$7 = new ctr.a($$6);
            if ($$1.d()) {
               crj $$8 = $$7.a();
               if ($$8 != null) {
                  this.a($$4);
                  $$5.a($$8);
               }
            } else {
               int $$9 = $$7.a($$1);
               if ($$9 > 0) {
                  this.b($$4);
               }
            }

            $$0.b(jp.w, $$7.c());
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      crj $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(auw.c.b(this));
         return bob.a($$3, $$0.x_());
      } else {
         return bob.d($$3);
      }
   }

   @Override
   public boolean e(crj $$0) {
      ctr $$1 = $$0.a(jp.w, ctr.b);
      return $$1.c() > 0;
   }

   @Override
   public int f(crj $$0) {
      ctr $$1 = $$0.a(jp.w, ctr.b);
      return Math.min(1 + 12 * $$1.c() / 64, 13);
   }

   @Override
   public int g(crj $$0) {
      return a;
   }

   private static boolean a(crj $$0, cjt $$1) {
      ctr $$2 = $$0.b(jp.w, ctr.b);
      if ($$2 != null && !$$2.d()) {
         if ($$1 instanceof apt) {
            $$2.a().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<cot> h(crj $$0) {
      return Optional.ofNullable($$0.a(jp.w)).map(cos::new);
   }

   @Override
   public void a(crj $$0, cyx $$1, List<wg> $$2, csz $$3) {
      ctr $$4 = $$0.a(jp.w);
      if ($$4 != null) {
         $$2.add(wg.a("item.minecraft.bundle.fullness", $$4.c(), 64).a(n.h));
      }
   }

   @Override
   public void a(cgd $$0) {
      ctr $$1 = $$0.p().b(jp.w, ctr.b);
      if ($$1 != null) {
         crl.a($$0, $$1.a());
      }
   }

   private void a(bpv $$0) {
      $$0.a(aum.dq, 0.8F, 0.8F + $$0.dM().E_().i() * 0.4F);
   }

   private void b(bpv $$0) {
      $$0.a(aum.dp, 0.8F, 0.8F + $$0.dM().E_().i() * 0.4F);
   }

   private void c(bpv $$0) {
      $$0.a(aum.do, 0.8F, 0.8F + $$0.dM().E_().i() * 0.4F);
   }
}
