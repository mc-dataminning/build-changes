import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cfw {
   public static final Codec<cfw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akk.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               akk.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               akk.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               jy.a(lr.aE).fieldOf("biomes").forGetter(cfw::d)
            )
            .apply($$0, cfw::new)
   );
   public static final ys<wf, cfw> b = ys.a(akk.b, cfw::a, akk.b, cfw::b, akk.b, cfw::c, yq.c(lr.aE), cfw::d, cfw::new);
   public static final Codec<jj<cfw>> c = akg.a(lr.m, a);
   public static final ys<wf, jj<cfw>> d = yq.a(lr.m, b);
   private final akk e;
   private final akk f;
   private final akk g;
   private final akk h;
   private final akk i;
   private final akk j;
   private final jn<ddg> k;

   public cfw(akk $$0, akk $$1, akk $$2, jn<ddg> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static akk a(akk $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public akk a() {
      return this.h;
   }

   public akk b() {
      return this.i;
   }

   public akk c() {
      return this.j;
   }

   public jn<ddg> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cfw $$1)
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
