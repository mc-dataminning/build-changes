import com.mojang.serialization.MapCodec;

public class dip extends dlj {
   public static final MapCodec<dip> a = b(dip::new);

   @Override
   public MapCodec<dip> a() {
      return a;
   }

   public dip(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, je.a.b));
   }

   @Override
   public void a(dbw $$0, dsa $$1, iz $$2, bss $$3, float $$4) {
      $$3.a($$4, 0.2F, $$0.aj().k());
   }
}
