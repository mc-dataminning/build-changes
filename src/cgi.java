import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cgi {
   public static final Codec<cgi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ale.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.c),
               ale.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.d),
               ale.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.e),
               jx.a(lq.az).fieldOf("biomes").forGetter(cgi::d)
            )
            .apply($$0, cgi::new)
   );
   public static final Codec<ji<cgi>> b = ala.a(lq.m, a);
   private final ale c;
   private final ale d;
   private final ale e;
   private final ale f;
   private final ale g;
   private final ale h;
   private final jm<dcw> i;

   public cgi(ale $$0, ale $$1, ale $$2, jm<dcw> $$3) {
      this.c = $$0;
      this.f = a($$0);
      this.d = $$1;
      this.g = a($$1);
      this.e = $$2;
      this.h = a($$2);
      this.i = $$3;
   }

   private static ale a(ale $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public ale a() {
      return this.f;
   }

   public ale b() {
      return this.g;
   }

   public ale c() {
      return this.h;
   }

   public jm<dcw> d() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cgi $$1)
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
