import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgo extends cys {
   public static final MapCodec<dgo> a = b(dgo::new);
   private static final vq d = vq.c("container.stonecutter");
   public static final dmd b = dcn.aE;
   protected static final eos c = cys.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   public dgo(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c));
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atv.ay);
         return blw.b;
      }
   }

   @Nullable
   @Override
   protected bma b(dlj $$0, cvr $$1, hz $$2) {
      return new bmg(($$2x, $$3, $$4) -> new cme($$2x, $$3, ckq.a($$1, $$2)), d);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return c;
   }

   @Override
   protected boolean g_(dlj $$0) {
      return true;
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.c;
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
      $$0.a(b);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
