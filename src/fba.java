import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fba(float b, deo c, js<deh> g) implements fau {
   public static final MapCodec<fba> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(fba::c),
               deo.b.fieldOf("enchanted_chance").forGetter(fba::d),
               deh.c.fieldOf("enchantment").forGetter(fba::e)
            )
            .apply($$0, fba::new)
   );

   @Override
   public fav b() {
      return faw.e;
   }

   @Override
   public Set<bat<?>> a() {
      return Set.of(faf.d);
   }

   public boolean a(exl $$0) {
      bvs $$1 = $$0.c(faf.d);
      int $$3 = $$1 instanceof bwr $$2 ? dej.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static fau.a a(ju.a $$0, float $$1, float $$2) {
      ju.b<deh> $$3 = $$0.e(me.aS);
      return () -> new fba($$1, new deo.e($$1 + $$2, $$2), $$3.b(dem.s));
   }

   public float c() {
      return this.b;
   }

   public deo d() {
      return this.c;
   }

   public js<deh> e() {
      return this.g;
   }
}
