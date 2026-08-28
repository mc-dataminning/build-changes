import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class chz {
   public static final Codec<chz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               all.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               all.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               all.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               kf.a(ma.aG).fieldOf("biomes").forGetter(chz::d)
            )
            .apply($$0, chz::new)
   );
   public static final zj<ww, chz> b = zj.a(all.b, chz::a, all.b, chz::b, all.b, chz::c, zh.c(ma.aG), chz::d, chz::new);
   public static final Codec<jq<chz>> c = alh.a(ma.m, a);
   public static final zj<ww, jq<chz>> d = zh.a(ma.m, b);
   private final all e;
   private final all f;
   private final all g;
   private final all h;
   private final all i;
   private final all j;
   private final ju<dgh> k;

   public chz(all $$0, all $$1, all $$2, ju<dgh> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static all a(all $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public all a() {
      return this.h;
   }

   public all b() {
      return this.i;
   }

   public all c() {
      return this.j;
   }

   public ju<dgh> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof chz $$1)
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
