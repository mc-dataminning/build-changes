import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhh(jj<dfx> c, btl d) implements dhf {
   public static final MapCodec<dhh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ju.a(mh.aR).fieldOf("enchantments").forGetter(dhh::b), btl.c.fieldOf("cost").forGetter(dhh::c)).apply($$0, dhh::new)
   );

   @Override
   public void a(czk $$0, dgd.a $$1, azv $$2, bue $$3) {
      for (dga $$5 : dfz.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.b(), $$5.c());
      }
   }

   @Override
   public MapCodec<dhh> a() {
      return b;
   }

   public jj<dfx> b() {
      return this.c;
   }

   public btl c() {
      return this.d;
   }
}
