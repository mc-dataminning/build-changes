import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cgi {
   public static final Codec<cgi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akr.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               akr.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               akr.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               kb.a(lu.aF).fieldOf("biomes").forGetter(cgi::d)
            )
            .apply($$0, cgi::new)
   );
   public static final yx<wk, cgi> b = yx.a(akr.b, cgi::a, akr.b, cgi::b, akr.b, cgi::c, yv.c(lu.aF), cgi::d, cgi::new);
   public static final Codec<jm<cgi>> c = akn.a(lu.m, a);
   public static final yx<wk, jm<cgi>> d = yv.a(lu.m, b);
   private final akr e;
   private final akr f;
   private final akr g;
   private final akr h;
   private final akr i;
   private final akr j;
   private final jq<ddw> k;

   public cgi(akr $$0, akr $$1, akr $$2, jq<ddw> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static akr a(akr $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public akr a() {
      return this.h;
   }

   public akr b() {
      return this.i;
   }

   public akr c() {
      return this.j;
   }

   public jq<ddw> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cgi $$1)
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
