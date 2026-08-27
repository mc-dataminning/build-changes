import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cfi {
   public static final Codec<cfi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akt.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.c),
               akt.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.d),
               akt.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.e),
               jp.a(li.az).fieldOf("biomes").forGetter(cfi::d)
            )
            .apply($$0, cfi::new)
   );
   public static final Codec<ja<cfi>> b = akp.a(li.m, a);
   private final akt c;
   private final akt d;
   private final akt e;
   private final akt f;
   private final akt g;
   private final akt h;
   private final je<dcz> i;

   public cfi(akt $$0, akt $$1, akt $$2, je<dcz> $$3) {
      this.c = $$0;
      this.f = a($$0);
      this.d = $$1;
      this.g = a($$1);
      this.e = $$2;
      this.h = a($$2);
      this.i = $$3;
   }

   private static akt a(akt $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public akt a() {
      return this.f;
   }

   public akt b() {
      return this.g;
   }

   public akt c() {
      return this.h;
   }

   public je<dcz> d() {
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
