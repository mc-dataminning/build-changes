import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcy extends cys implements dfs {
   public static final MapCodec<dcy> a = b(dcy::new);
   public static final dma b = dlz.j;
   public static final dma c = dlz.C;
   protected static final eos d = eop.a(cys.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), cys.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final eos e = eop.a(cys.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), cys.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dcy> a() {
      return a;
   }

   public dcy(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      egw $$1 = $$0.q().b_($$0.a());

      for (ie $$2 : $$0.f()) {
         if ($$2.o() == ie.a.b) {
            dlj $$3 = this.o().a(b, Boolean.valueOf($$2 == ie.b));
            if ($$3.a((cvu)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == egx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      ie $$3 = m($$0).g();
      return cys.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ie m(dlj $$0) {
      return $$0.c(b) ? ie.a : ie.b;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(c) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
