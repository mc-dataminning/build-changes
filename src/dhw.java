import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhw extends daa {
   public static final MapCodec<dhw> a = b(dhw::new);
   private static final vu d = vu.c("container.stonecutter");
   public static final dnt b = ddv.aE;
   protected static final eqk c = daa.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   public dhw(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aui.ay);
         return bnc.b;
      }
   }

   @Nullable
   @Override
   protected bng b(dmz $$0, cwz $$1, ib $$2) {
      return new bnm(($$2x, $$3, $$4) -> new cnn($$2x, $$3, clz.a($$1, $$2)), d);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return c;
   }

   @Override
   protected boolean g_(dmz $$0) {
      return true;
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
