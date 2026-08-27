import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddn extends cys implements dfs {
   public static final MapCodec<ddn> a = b(ddn::new);
   public static final dma b = dlz.C;

   @Override
   public MapCodec<ddn> a() {
      return a;
   }

   protected ddn(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dlj $$0, dlj $$1, ie $$2) {
      return $$1.a(cyu.ac) && $$2.o() == ie.a.b;
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      egw $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == egx.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(b) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }
}
