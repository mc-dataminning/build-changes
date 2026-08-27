import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcj extends cys implements dfs {
   public static final MapCodec<dcj> a = b(dcj::new);
   private static final dma c = dlz.C;
   protected static final eos b = cys.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dcj> a() {
      return a;
   }

   protected dcj(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(c) ? egx.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      dlj $$1 = super.a($$0);
      if ($$1 != null) {
         egw $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == egx.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      hz $$3 = $$2.c();
      dlj $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ie.a);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$1 == ie.b && !this.a($$0, $$3, $$4)) {
         return cyu.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, egx.c, egx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
