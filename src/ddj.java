import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddj extends dct implements ddv {
   public static final MapCodec<ddj> c = b(ddj::new);

   @Override
   public MapCodec<ddj> a() {
      return c;
   }

   protected ddj(dmd.d $$0) {
      super($$0, ih.b, epl.b(), true);
   }

   @Override
   protected dcu c() {
      return (dcu)czh.mc;
   }

   @Override
   protected ehr c_(dme $$0) {
      return ehs.c.a(false);
   }

   @Override
   protected boolean m(dme $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cia $$0, cvk $$1, ib $$2, dme $$3, ehq $$4) {
      return false;
   }

   @Override
   public boolean a(cwf $$0, ib $$1, dme $$2, ehr $$3) {
      return false;
   }
}
