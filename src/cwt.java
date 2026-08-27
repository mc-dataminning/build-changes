import com.mojang.serialization.MapCodec;

public class cwt extends czm {
   public static final MapCodec<cwt> a = b(cwt::new);

   @Override
   public MapCodec<cwt> a() {
      return a;
   }

   public cwt(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ha.a.b));
   }

   @Override
   public void a(cqb $$0, dfd $$1, gw $$2, biw $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.ag().k());
   }
}
