import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cgg {
   public static final Codec<cgg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akq.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               akq.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               akq.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               kb.a(lu.aF).fieldOf("biomes").forGetter(cgg::d)
            )
            .apply($$0, cgg::new)
   );
   public static final yw<wj, cgg> b = yw.a(akq.b, cgg::a, akq.b, cgg::b, akq.b, cgg::c, yu.c(lu.aF), cgg::d, cgg::new);
   public static final Codec<jm<cgg>> c = akm.a(lu.m, a);
   public static final yw<wj, jm<cgg>> d = yu.a(lu.m, b);
   private final akq e;
   private final akq f;
   private final akq g;
   private final akq h;
   private final akq i;
   private final akq j;
   private final jq<ddu> k;

   public cgg(akq $$0, akq $$1, akq $$2, jq<ddu> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static akq a(akq $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public akq a() {
      return this.h;
   }

   public akq b() {
      return this.i;
   }

   public akq c() {
      return this.j;
   }

   public jq<ddu> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cgg $$1)
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
