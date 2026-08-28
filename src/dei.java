import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dei(jv<dcy> c, bro d) implements deg {
   public static final MapCodec<dei> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.a(mc.aO).fieldOf("enchantments").forGetter(dei::b), bro.c.fieldOf("cost").forGetter(dei::c)).apply($$0, dei::new)
   );

   @Override
   public void a(cwo $$0, dde.a $$1, azh $$2, bsh $$3) {
      for (ddb $$5 : dda.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<dei> a() {
      return b;
   }

   public jv<dcy> b() {
      return this.c;
   }

   public bro c() {
      return this.d;
   }
}
