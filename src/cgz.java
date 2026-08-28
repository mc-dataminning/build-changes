import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cgz {
   public static final Codec<cgz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alb.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               alb.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               alb.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               kc.a(lv.aF).fieldOf("biomes").forGetter(cgz::d)
            )
            .apply($$0, cgz::new)
   );
   public static final zb<wo, cgz> b = zb.a(alb.b, cgz::a, alb.b, cgz::b, alb.b, cgz::c, yz.c(lv.aF), cgz::d, cgz::new);
   public static final Codec<jn<cgz>> c = akx.a(lv.m, a);
   public static final zb<wo, jn<cgz>> d = yz.a(lv.m, b);
   private final alb e;
   private final alb f;
   private final alb g;
   private final alb h;
   private final alb i;
   private final alb j;
   private final jr<det> k;

   public cgz(alb $$0, alb $$1, alb $$2, jr<det> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static alb a(alb $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public alb a() {
      return this.h;
   }

   public alb b() {
      return this.i;
   }

   public alb c() {
      return this.j;
   }

   public jr<det> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cgz $$1)
            ? false
            : Objects.equals(this.e, $$1.e) && Objects.equals(this.f, $$1.f) && Objects.equals(this.g, $$1.g) && Objects.equals(this.k, $$1.k);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = 1;
      $$0 = 31 * $$0 + this.e.hashCode();
      $$0 = 31 * $$0 + this.f.hashCode();
      $$0 = 31 * $$0 + this.g.hashCode();
      return 31 * $$0 + this.k.hashCode();
   }
}
