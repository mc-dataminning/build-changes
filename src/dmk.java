import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmk extends dkr {
   public static final MapCodec<dmk> a = b(dmk::new);
   public static final dvu b = dvt.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final fab f = dhy.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final fab g = dhy.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final fab h = dhy.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final fab i = dhy.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final fab j = dhy.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final fab k = dhy.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final fab l = dhy.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final fab m = dhy.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   protected dmk(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jl.c).b(b, Boolean.valueOf(false)).b(L, dvo.b));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      switch ((dvo)$$0.c(L)) {
         case a:
            switch ($$0.c(aF).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((jl)$$0.c(aF)) {
               case f:
                  return i;
               case e:
                  return h;
               case d:
                  return g;
               case c:
               default:
                  return f;
            }
         case c:
         default:
            switch ($$0.c(aF).o()) {
               case a:
                  return m;
               case c:
               default:
                  return l;
            }
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if ($$1.C) {
         dvd $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return bry.a;
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, den $$3, BiConsumer<cvx, jg> $$4) {
      if ($$3.f()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(dvd $$0, dev $$1, jg $$2, @Nullable coh $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? eaa.a : eaa.e, $$2);
   }

   protected static void a(@Nullable coh $$0, dew $$1, jg $$2, dvd $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, awk.nT, awl.e, 0.3F, $$4);
   }

   private static void a(dvd $$0, dew $$1, jg $$2, float $$3) {
      jl $$4 = $$0.c(aF).g();
      jl $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new ll(ll.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dvd $$0) {
      return true;
   }

   private void e(dvd $$0, dev $$1, jg $$2) {
      jl $$3 = n($$0).g();
      esm $$4 = esi.a($$1, $$3, $$3.o().d() ? jl.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(L, aF, b);
   }
}
