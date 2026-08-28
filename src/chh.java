import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class chh {
   public static final Codec<chh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ale.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               ale.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               ale.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               kd.a(lw.aH).fieldOf("biomes").forGetter(chh::d)
            )
            .apply($$0, chh::new)
   );
   public static final zc<wp, chh> b = zc.a(ale.b, chh::a, ale.b, chh::b, ale.b, chh::c, za.c(lw.aH), chh::d, chh::new);
   public static final Codec<jo<chh>> c = ala.a(lw.m, a);
   public static final zc<wp, jo<chh>> d = za.a(lw.m, b);
   private final ale e;
   private final ale f;
   private final ale g;
   private final ale h;
   private final ale i;
   private final ale j;
   private final js<dfk> k;

   public chh(ale $$0, ale $$1, ale $$2, js<dfk> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static ale a(ale $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public ale a() {
      return this.h;
   }

   public ale b() {
      return this.i;
   }

   public ale c() {
      return this.j;
   }

   public js<dfk> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof chh $$1)
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
