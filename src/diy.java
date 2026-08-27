import com.mojang.serialization.MapCodec;

public class diy extends dmc {
   public static final MapCodec<diy> a = b(diy::new);

   @Override
   public MapCodec<diy> a() {
      return a;
   }

   public diy(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, iw.a.b));
   }

   @Override
   public void a(dca $$0, dtc $$1, ir $$2, brv $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.aj().l());
   }
}
