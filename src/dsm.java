import com.mojang.serialization.Codec;

public class dsm extends dsd {
   public static final Codec<dsm> b = dfl.b.fieldOf("state").xmap(dsm::new, $$0 -> $$0.c).codec();
   private final dfl c;

   protected dsm(dfl $$0) {
      this.c = $$0;
   }

   @Override
   protected dse<?> a() {
      return dse.a;
   }

   @Override
   public dfl a(ase $$0, gw $$1) {
      return this.c;
   }
}
