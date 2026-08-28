import com.mojang.serialization.MapCodec;

public class dpa extends djd implements dgy {
   public static final MapCodec<dpa> c = b(dpa::new);

   @Override
   public MapCodec<dpa> a() {
      return c;
   }

   public dpa(dtz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return true;
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      a($$0, $$2, new cvl(this));
   }
}
