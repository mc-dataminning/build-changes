import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cge {
   public static final Codec<cge> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alb.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.c),
               alb.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.d),
               alb.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.e),
               jx.a(lq.az).fieldOf("biomes").forGetter(cge::d)
            )
            .apply($$0, cge::new)
   );
   public static final Codec<ji<cge>> b = akx.a(lq.m, a);
   private final alb c;
   private final alb d;
   private final alb e;
   private final alb f;
   private final alb g;
   private final alb h;
   private final jm<dcs> i;

   public cge(alb $$0, alb $$1, alb $$2, jm<dcs> $$3) {
      this.c = $$0;
      this.f = a($$0);
      this.d = $$1;
      this.g = a($$1);
      this.e = $$2;
      this.h = a($$2);
      this.i = $$3;
   }

   private static alb a(alb $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public alb a() {
      return this.f;
   }

   public alb b() {
      return this.g;
   }

   public alb c() {
      return this.h;
   }

   public jm<dcs> d() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cge $$1)
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
