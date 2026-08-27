import com.mojang.serialization.Codec;

public class eae extends dzx {
   public static final Codec<eae> b = dnb.b.fieldOf("state").xmap(dna.a::b, dac::o).xmap(eae::new, $$0 -> $$0.c).codec();
   private final dac c;

   public eae(dac $$0) {
      this.c = $$0;
   }

   @Override
   protected dzy<?> a() {
      return dzy.f;
   }

   @Override
   public dnb a(axd $$0, ib $$1) {
      ih.a $$2 = ih.a.a($$0);
      return this.c.o().a(dgn.i, $$2);
   }
}
