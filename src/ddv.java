import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddv extends cvz {
   public static final MapCodec<ddv> a = b(ddv::new);
   private static final vb d = vb.c("container.stonecutter");
   public static final djj b = czu.aE;
   protected static final elu c = cvz.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<ddv> a() {
      return a;
   }

   public ddv(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ia.c));
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arm.ay);
         return bjl.b;
      }
   }

   @Nullable
   @Override
   public bjo b(dip $$0, csy $$1, hv $$2) {
      return new bju(($$2x, $$3, $$4) -> new cjj($$2x, $$3, chv.a($$1, $$2)), d);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return c;
   }

   @Override
   public boolean g_(dip $$0) {
      return true;
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
