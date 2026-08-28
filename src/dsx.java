import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsx extends dku {
   public static final MapCodec<dsx> a = b(dsx::new);
   private static final wv c = wv.c("container.stonecutter");
   public static final dzk<jo> b = dot.e;
   private static final fdo d = dku.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dsx> a() {
      return a;
   }

   public dsx(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.c));
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awu.ay);
      }

      return btq.a;
   }

   @Nullable
   @Override
   protected bts b(dym $$0, dhp $$1, jj $$2) {
      return new bty(($$2x, $$3, $$4) -> new cvq($$2x, $$3, cua.a($$1, $$2)), c);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return d;
   }

   @Override
   protected boolean g_(dym $$0) {
      return true;
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
