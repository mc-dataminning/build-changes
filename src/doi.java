import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public class doi extends dnp {
   public static final MapCodec<doi> a = b(doi::new);
   private static final wv b = wv.c("container.grindstone_title");
   private final Function<dym, fdo> d;

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   protected doi(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, jo.c).b(c, dyx.b));
      this.d = this.b();
   }

   private Function<dym, fdo> b() {
      fdo $$0 = fdl.a(dku.a(2.0, 6.0, 7.0, 4.0, 10.0, 16.0), dku.a(2.0, 5.0, 3.0, 4.0, 11.0, 9.0));
      fdo $$1 = fdl.a($$0, h.z);
      fdo $$2 = fdl.a(dku.a(8.0, 2.0, 14.0, 0.0, 12.0), $$0, $$1);
      Map<dyx, Map<jo, fdo>> $$3 = fdl.e($$2);
      return this.a($$1x -> $$3.get($$1x.c(c)).get($$1x.c(e)));
   }

   private fdo o(dym $$0) {
      return this.d.apply($$0);
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.o($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.o($$0);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return true;
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awu.aD);
      }

      return btq.a;
   }

   @Override
   protected bts b(dym $$0, dhp $$1, jj $$2) {
      return new bty(($$2x, $$3, $$4) -> new cun($$2x, $$3, cua.a($$1, $$2)), b);
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
