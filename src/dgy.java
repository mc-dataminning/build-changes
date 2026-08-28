import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgy extends dem {
   public static final MapCodec<dgy> a = b(dgy::new);
   public static final dtd b = dst.aT;
   public static final dsu c = dst.p;
   protected static final ewl d = dfa.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dgy> a() {
      return a;
   }

   public dgy(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return d;
   }

   @Override
   protected boolean f_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return $$0.c(b);
   }

   private static void d(dsd $$0, dbz $$1, iz $$2) {
      int $$3 = $$1.a(dci.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * ayz.b($$4));
      }

      $$3 = ayz.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$3.go()) {
         if ($$1.B) {
            return bqv.a;
         } else {
            dsd $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dww.c, $$2, dww.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bqv.c;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected boolean e_(dsd $$0) {
      return true;
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dpk.q, dgy::a) : null;
   }

   private static void a(dbz $$0, iz $$1, dsd $$2, dpx $$3) {
      if ($$0.Z() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c);
   }
}
