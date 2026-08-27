import com.mojang.serialization.MapCodec;

public class cyl extends dbe {
   public static final MapCodec<cyl> a = b(cyl::new);

   @Override
   public MapCodec<cyl> a() {
      return a;
   }

   public cyl(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, hx.a.b));
   }

   @Override
   public void a(crs $$0, dgw $$1, ht $$2, bki $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.ag().k());
   }
}
