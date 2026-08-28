import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djh extends dgv {
   public static final MapCodec<djh> a = b(djh::new);
   public static final dvo b = dve.aT;
   public static final dvf c = dve.p;
   protected static final ezm d = dhj.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   public djh(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return d;
   }

   @Override
   protected boolean g_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(b);
   }

   private static void d(duo $$0, deg $$1, je $$2) {
      int $$3 = $$1.a(dep.a, $$2) - $$1.z_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azd.b($$4));
      }

      $$3 = azd.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$3.go()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.B) {
            duo $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dzl.c, $$2, dzl.a.a($$3, $$5));
            d($$5, $$1, $$2);
         }

         return brp.a;
      }
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected boolean f_(duo $$0) {
      return true;
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dsh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return !$$0.B && $$0.B_().g() ? a($$2, dru.q, djh::a) : null;
   }

   private static void a(deg $$0, je $$1, duo $$2, dsh $$3) {
      if ($$0.aa() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c);
   }
}
