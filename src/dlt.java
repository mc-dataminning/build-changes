import com.mojang.serialization.MapCodec;

public class dlt extends dgv implements dgy {
   public static final MapCodec<dlt> a = b(dlt::new);

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(dtz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      $$0.F_().c(lv.aI).flatMap($$0x -> $$0x.b(rs.n)).ifPresent($$3x -> ((eco)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.d()));
   }

   @Override
   public dgy.a at_() {
      return dgy.a.a;
   }
}
