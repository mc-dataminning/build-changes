import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daf extends cye implements dfs {
   public static final MapCodec<daf> a = b(daf::new);
   public static final dma b = dlz.C;
   private static final int d = 3;
   protected static final eos c = cys.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<daf> a() {
      return a;
   }

   public daf(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return a($$2, diz.z, $$0.B ? djj::a : djj::b);
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.b;
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(b) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return c;
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, @Nullable boi $$3, cpd $$4) {
      if ($$4.B()) {
         dix $$5 = $$0.c_($$1);
         if ($$5 instanceof dis) {
            ((dis)$$5).a($$4.z());
         }
      }
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      egw $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(auf.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
