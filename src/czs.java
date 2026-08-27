import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czs extends dfd implements dfs {
   public static final MapCodec<czs> a = b(czs::new);
   public static final dma b = dlz.C;
   protected static final float c = 6.5F;
   protected static final float d = 9.5F;
   protected static final eos e = cys.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final eos f = cys.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final eos g = cys.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   @Override
   public MapCodec<czs> a() {
      return a;
   }

   public czs(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(i, ie.a.b));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      switch ((ie.a)$$0.c(i)) {
         case a:
         default:
            return g;
         case c:
            return f;
         case b:
            return e;
      }
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
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b).a(i);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(b) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
