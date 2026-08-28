import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cgk {
   public static final Codec<cgk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alf.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.c),
               alf.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.d),
               alf.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.e),
               jx.a(lq.az).fieldOf("biomes").forGetter(cgk::d)
            )
            .apply($$0, cgk::new)
   );
   public static final Codec<ji<cgk>> b = alb.a(lq.m, a);
   private final alf c;
   private final alf d;
   private final alf e;
   private final alf f;
   private final alf g;
   private final alf h;
   private final jm<dcy> i;

   public cgk(alf $$0, alf $$1, alf $$2, jm<dcy> $$3) {
      this.c = $$0;
      this.f = a($$0);
      this.d = $$1;
      this.g = a($$1);
      this.e = $$2;
      this.h = a($$2);
      this.i = $$3;
   }

   private static alf a(alf $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public alf a() {
      return this.f;
   }

   public alf b() {
      return this.g;
   }

   public alf c() {
      return this.h;
   }

   public jm<dcy> d() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cgk $$1)
            ? false
            : Objects.equals(this.c, $$1.c) && Objects.equals(this.d, $$1.d) && Objects.equals(this.e, $$1.e) && Objects.equals(this.i, $$1.i);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = 1;
      $$0 = 31 * $$0 + this.c.hashCode();
      $$0 = 31 * $$0 + this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + this.i.hashCode();
   }
}
