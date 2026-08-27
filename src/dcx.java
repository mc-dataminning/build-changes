import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcx extends cys implements dfs {
   public static final MapCodec<dcx> a = b(dcx::new);
   public static final dmd b = dcn.aE;
   public static final dma c = dlz.C;
   protected static final float d = 3.0F;
   protected static final eos e = cys.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final eos f = cys.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eos g = cys.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final eos h = cys.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<dcx> a() {
      return a;
   }

   protected dcx(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      switch ((ie)$$0.c(b)) {
         case c:
            return h;
         case d:
            return g;
         case e:
            return f;
         case f:
         default:
            return e;
      }
   }

   private boolean a(cux $$0, hz $$1, ie $$2) {
      dlj $$3 = $$0.a_($$1);
      return $$3.d($$0, $$1, $$2);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      ie $$3 = $$0.c(b);
      return this.a($$1, $$2.a($$3.g()), $$3);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$1.g() == $$0.c(b) && !$$0.a($$3, $$4)) {
         return cyu.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, egx.c, egx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      if (!$$0.c()) {
         dlj $$1 = $$0.q().a_($$0.a().a($$0.k().g()));
         if ($$1.a(this) && $$1.c(b) == $$0.k()) {
            return null;
         }
      }

      dlj $$2 = this.o();
      cvu $$3 = $$0.q();
      hz $$4 = $$0.a();
      egw $$5 = $$0.q().b_($$0.a());

      for (ie $$6 : $$0.f()) {
         if ($$6.o().d()) {
            $$2 = $$2.a(b, $$6.g());
            if ($$2.a($$3, $$4)) {
               return $$2.a(c, Boolean.valueOf($$5.a() == egx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(c) ? egx.c.a(false) : super.c_($$0);
   }
}
