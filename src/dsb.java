import com.mojang.serialization.Codec;

public class dsb extends drs {
   public static final Codec<dsb> b = dfa.b.fieldOf("state").xmap(dsb::new, $$0 -> $$0.c).codec();
   private final dfa c;

   protected dsb(dfa $$0) {
      this.c = $$0;
   }

   @Override
   protected drt<?> a() {
      return drt.a;
   }

   @Override
   public dfa a(aru $$0, gu $$1) {
      return this.c;
   }
}
