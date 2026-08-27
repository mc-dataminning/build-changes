import java.util.List;
import java.util.Optional;

public class cqk extends cry {
   private static final int a = axw.f(0.4F, 0.4F, 1.0F);

   public cqk(cry.a $$0) {
      super($$0);
   }

   public static float d(csd $$0) {
      cuo $$1 = $$0.a(jz.w, cuo.b);
      return (float)$$1.c() / 64.0F;
   }

   @Override
   public boolean a(csd $$0, cpd $$1, cnp $$2, ckl $$3) {
      if ($$2 != cnp.b) {
         return false;
      } else {
         cuo $$4 = $$0.a(jz.w);
         if ($$4 == null) {
            return false;
         } else {
            csd $$5 = $$1.g();
            cuo.a $$6 = new cuo.a($$4);
            if ($$5.d()) {
               this.a($$3);
               csd $$7 = $$6.a();
               if ($$7 != null) {
                  csd $$8 = $$1.d($$7);
                  $$6.a($$8);
               }
            } else if ($$5.f().am_()) {
               int $$9 = $$6.a($$1, $$3);
               if ($$9 > 0) {
                  this.b($$3);
               }
            }

            $$0.b(jz.w, $$6.c());
            return true;
         }
      }
   }

   @Override
   public boolean a(csd $$0, csd $$1, cpd $$2, cnp $$3, ckl $$4, brv $$5) {
      if ($$3 == cnp.b && $$2.b($$4)) {
         cuo $$6 = $$0.a(jz.w);
         if ($$6 == null) {
            return false;
         } else {
            cuo.a $$7 = new cuo.a($$6);
            if ($$1.d()) {
               csd $$8 = $$7.a();
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

            $$0.b(jz.w, $$7.c());
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      csd $$3 = $$1.b($$2);
      if (a($$3, $$1)) {
         this.c($$1);
         $$1.b(avj.c.b(this));
         return bor.a($$3, $$0.x_());
      } else {
         return bor.d($$3);
      }
   }

   @Override
   public boolean e(csd $$0) {
      cuo $$1 = $$0.a(jz.w, cuo.b);
      return $$1.c() > 0;
   }

   @Override
   public int f(csd $$0) {
      cuo $$1 = $$0.a(jz.w, cuo.b);
      return Math.min(1 + 12 * $$1.c() / 64, 13);
   }

   @Override
   public int g(csd $$0) {
      return a;
   }

   private static boolean a(csd $$0, ckl $$1) {
      cuo $$2 = $$0.a(jz.w);
      if ($$2 != null && !$$2.d()) {
         $$0.b(jz.w, cuo.b);
         if ($$1 instanceof aqf) {
            $$2.a().forEach($$1x -> $$1.a($$1x, true));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public Optional<cpn> h(csd $$0) {
      return Optional.ofNullable($$0.a(jz.w)).map(cpm::new);
   }

   @Override
   public void a(csd $$0, czu $$1, List<ws> $$2, ctu $$3) {
      cuo $$4 = $$0.a(jz.w);
      if ($$4 != null) {
         $$2.add(ws.a("item.minecraft.bundle.fullness", $$4.c(), 64).a(n.h));
      }
   }

   @Override
   public void a(cgv $$0) {
      cuo $$1 = $$0.p().a(jz.w);
      if ($$1 != null) {
         $$0.p().b(jz.w, cuo.b);
         csf.a($$0, $$1.a());
      }
   }

   private void a(bql $$0) {
      $$0.a(auz.dq, 0.8F, 0.8F + $$0.dN().E_().i() * 0.4F);
   }

   private void b(bql $$0) {
      $$0.a(auz.dp, 0.8F, 0.8F + $$0.dN().E_().i() * 0.4F);
   }

   private void c(bql $$0) {
      $$0.a(auz.do, 0.8F, 0.8F + $$0.dN().E_().i() * 0.4F);
   }
}
