import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdy(float b, dgu c, jg<dgn> g) implements fds {
   public static final MapCodec<fdy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(fdy::c),
               dgu.b.fieldOf("enchanted_chance").forGetter(fdy::d),
               dgn.c.fieldOf("enchantment").forGetter(fdy::e)
            )
            .apply($$0, fdy::new)
   );

   @Override
   public fdt b() {
      return fdu.e;
   }

   @Override
   public Set<bbb<?>> a() {
      return Set.of(fdd.d);
   }

   public boolean a(faj $$0) {
      bwv $$1 = $$0.c(fdd.d);
      int $$3 = $$1 instanceof bxw $$2 ? dgp.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static fds.a a(ji.a $$0, float $$1, float $$2) {
      ji.b<dgn> $$3 = $$0.e(mi.aR);
      return () -> new fdy($$1, new dgu.e($$1 + $$2, $$2), $$3.b(dgs.s));
   }

   public float c() {
      return this.b;
   }

   public dgu d() {
      return this.c;
   }

   public jg<dgn> e() {
      return this.g;
   }
}
