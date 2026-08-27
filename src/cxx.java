import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxx extends cvl {
   public static final MapCodec<cxx> a = b(cxx::new);
   public static final djp b = djf.aT;
   public static final djg c = djf.p;
   protected static final elu d = cvz.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<cxx> a() {
      return a;
   }

   public cxx(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return d;
   }

   @Override
   public boolean g_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(b);
   }

   private static void d(dip $$0, csy $$1, hv $$2) {
      int $$3 = $$1.a(cth.a, $$2) - $$1.C_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * aty.b($$4));
      }

      $$3 = aty.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$3.ge()) {
         if ($$1.B) {
            return bjl.a;
         } else {
            dip $$6 = $$0.a(c);
            $$1.a($$2, $$6, 2);
            $$1.a(dmz.c, $$2, dmz.a.a($$3, $$6));
            d($$6, $$1, $$2);
            return bjl.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return !$$0.B && $$0.E_().g() ? a($$2, dgf.q, cxx::a) : null;
   }

   private static void a(csy $$0, hv $$1, dip $$2, dgs $$3) {
      if ($$0.W() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c);
   }
}
