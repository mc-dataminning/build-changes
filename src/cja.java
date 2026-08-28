import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cja {
   public static final Codec<cja> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alz.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               alz.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               alz.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               kf.a(mb.aI).fieldOf("biomes").forGetter(cja::d)
            )
            .apply($$0, cja::new)
   );
   public static final zt<xg, cja> b = zt.a(alz.b, cja::a, alz.b, cja::b, alz.b, cja::c, zr.c(mb.aI), cja::d, cja::new);
   public static final Codec<jq<cja>> c = alv.a(mb.m, a);
   public static final zt<xg, jq<cja>> d = zr.a(mb.m, b);
   private final alz e;
   private final alz f;
   private final alz g;
   private final alz h;
   private final alz i;
   private final alz j;
   private final ju<dij> k;

   public cja(alz $$0, alz $$1, alz $$2, ju<dij> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static alz a(alz $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public alz a() {
      return this.h;
   }

   public alz b() {
      return this.i;
   }

   public alz c() {
      return this.j;
   }

   public ju<dij> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cja $$1)
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
