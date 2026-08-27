import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cfi {
   public static final Codec<cfi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akm.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.c),
               akm.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.d),
               akm.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.e),
               jm.a(lf.az).fieldOf("biomes").forGetter(cfi::d)
            )
            .apply($$0, cfi::new)
   );
   public static final Codec<ix<cfi>> b = aki.a(lf.m, a);
   private final akm c;
   private final akm d;
   private final akm e;
   private final akm f;
   private final akm g;
   private final akm h;
   private final jb<dbw> i;

   public cfi(akm $$0, akm $$1, akm $$2, jb<dbw> $$3) {
      this.c = $$0;
      this.f = a($$0);
      this.d = $$1;
      this.g = a($$1);
      this.e = $$2;
      this.h = a($$2);
      this.i = $$3;
   }

   private static akm a(akm $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public akm a() {
      return this.f;
   }

   public akm b() {
      return this.g;
   }

   public akm c() {
      return this.h;
   }

   public jb<dbw> d() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cfi $$1)
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
