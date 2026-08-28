import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cib {
   public static final Codec<cib> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akv.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               akv.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               akv.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               kg.a(mc.aI).fieldOf("biomes").forGetter(cib::d)
            )
            .apply($$0, cib::new)
   );
   public static final yn<wa, cib> b = yn.a(akv.b, cib::a, akv.b, cib::b, akv.b, cib::c, yl.c(mc.aI), cib::d, cib::new);
   public static final Codec<jr<cib>> c = akr.a(mc.m, a);
   public static final yn<wa, jr<cib>> d = yl.a(mc.m, b);
   private final akv e;
   private final akv f;
   private final akv g;
   private final akv h;
   private final akv i;
   private final akv j;
   private final jv<dhj> k;

   public cib(akv $$0, akv $$1, akv $$2, jv<dhj> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static akv a(akv $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public akv a() {
      return this.h;
   }

   public akv b() {
      return this.i;
   }

   public akv c() {
      return this.j;
   }

   public jv<dhj> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cib $$1)
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
