import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cfk {
   public static final Codec<cfk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akn.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.c),
               akn.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.d),
               akn.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.e),
               jm.a(lf.az).fieldOf("biomes").forGetter(cfk::d)
            )
            .apply($$0, cfk::new)
   );
   public static final Codec<ix<cfk>> b = akj.a(lf.m, a);
   private final akn c;
   private final akn d;
   private final akn e;
   private final akn f;
   private final akn g;
   private final akn h;
   private final jb<dby> i;

   public cfk(akn $$0, akn $$1, akn $$2, jb<dby> $$3) {
      this.c = $$0;
      this.f = a($$0);
      this.d = $$1;
      this.g = a($$1);
      this.e = $$2;
      this.h = a($$2);
      this.i = $$3;
   }

   private static akn a(akn $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public akn a() {
      return this.f;
   }

   public akn b() {
      return this.g;
   }

   public akn c() {
      return this.h;
   }

   public jb<dby> d() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cfk $$1)
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
