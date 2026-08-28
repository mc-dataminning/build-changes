import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cfs {
   public static final Codec<cfs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akk.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.c),
               akk.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.d),
               akk.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.e),
               jy.a(lr.aE).fieldOf("biomes").forGetter(cfs::d)
            )
            .apply($$0, cfs::new)
   );
   public static final Codec<jj<cfs>> b = akg.a(lr.m, a);
   private final akk c;
   private final akk d;
   private final akk e;
   private final akk f;
   private final akk g;
   private final akk h;
   private final jn<ddd> i;

   public cfs(akk $$0, akk $$1, akk $$2, jn<ddd> $$3) {
      this.c = $$0;
      this.f = a($$0);
      this.d = $$1;
      this.g = a($$1);
      this.e = $$2;
      this.h = a($$2);
      this.i = $$3;
   }

   private static akk a(akk $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public akk a() {
      return this.f;
   }

   public akk b() {
      return this.g;
   }

   public akk c() {
      return this.h;
   }

   public jn<ddd> d() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cfs $$1)
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
