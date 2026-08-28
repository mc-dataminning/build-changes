import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlw extends dkd {
   public static final MapCodec<dlw> a = b(dlw::new);
   public static final dvf b = dve.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final ezm f = dhj.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final ezm g = dhj.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final ezm h = dhj.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final ezm i = dhj.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final ezm j = dhj.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final ezm k = dhj.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final ezm l = dhj.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final ezm m = dhj.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dlw> a() {
      return a;
   }

   protected dlw(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jj.c).b(b, Boolean.valueOf(false)).b(L, duz.b));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      switch ((duz)$$0.c(L)) {
         case a:
            switch ($$0.c(aF).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((jj)$$0.c(aF)) {
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
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if ($$1.B) {
         duo $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return brp.a;
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, ddy $$3, BiConsumer<cvp, je> $$4) {
      if ($$3.f()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(duo $$0, deg $$1, je $$2, @Nullable cnu $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.d($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? dzl.a : dzl.e, $$2);
   }

   protected static void a(@Nullable cnu $$0, deh $$1, je $$2, duo $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, awe.nV, awf.e, 0.3F, $$4);
   }

   private static void a(duo $$0, deh $$1, je $$2, float $$3) {
      jj $$4 = $$0.c(aF).g();
      jj $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new li(li.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.d($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(duo $$0) {
      return true;
   }

   private void d(duo $$0, deg $$1, je $$2) {
      jj $$3 = n($$0).g();
      erx $$4 = ert.a($$1, $$3, $$3.o().d() ? jj.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(L, aF, b);
   }
}
