import com.mojang.serialization.MapCodec;

public class dpq extends dot {
   public static final MapCodec<dpq> a = b(dpq::new);
   private static final wv b = wv.c("container.loom");

   @Override
   public MapCodec<dpq> a() {
      return a;
   }

   protected dpq(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awu.ax);
      }

      return btq.a;
   }

   @Override
   protected bts b(dym $$0, dhp $$1, jj $$2) {
      return new bty(($$2x, $$3, $$4) -> new cuu($$2x, $$3, cua.a($$1, $$2)), b);
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(e);
   }
}
