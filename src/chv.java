import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class chv {
   public static final Codec<chv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ali.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               ali.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               ali.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               kf.a(lz.aG).fieldOf("biomes").forGetter(chv::d)
            )
            .apply($$0, chv::new)
   );
   public static final zg<wt, chv> b = zg.a(ali.b, chv::a, ali.b, chv::b, ali.b, chv::c, ze.c(lz.aG), chv::d, chv::new);
   public static final Codec<jq<chv>> c = ale.a(lz.m, a);
   public static final zg<wt, jq<chv>> d = ze.a(lz.m, b);
   private final ali e;
   private final ali f;
   private final ali g;
   private final ali h;
   private final ali i;
   private final ali j;
   private final ju<dgc> k;

   public chv(ali $$0, ali $$1, ali $$2, ju<dgc> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static ali a(ali $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public ali a() {
      return this.h;
   }

   public ali b() {
      return this.i;
   }

   public ali c() {
      return this.j;
   }

   public ju<dgc> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof chv $$1)
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
