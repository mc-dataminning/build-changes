import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cis {
   public static final Codec<cis> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alp.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               alp.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               alp.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               kf.a(mb.aI).fieldOf("biomes").forGetter(cis::d)
            )
            .apply($$0, cis::new)
   );
   public static final zi<wv, cis> b = zi.a(alp.b, cis::a, alp.b, cis::b, alp.b, cis::c, zg.c(mb.aI), cis::d, cis::new);
   public static final Codec<jq<cis>> c = all.a(mb.m, a);
   public static final zi<wv, jq<cis>> d = zg.a(mb.m, b);
   private final alp e;
   private final alp f;
   private final alp g;
   private final alp h;
   private final alp i;
   private final alp j;
   private final ju<dib> k;

   public cis(alp $$0, alp $$1, alp $$2, ju<dib> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static alp a(alp $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public alp a() {
      return this.h;
   }

   public alp b() {
      return this.i;
   }

   public alp c() {
      return this.j;
   }

   public ju<dib> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cis $$1)
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
