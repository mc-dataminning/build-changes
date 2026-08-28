import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class chq {
   public static final Codec<chq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alh.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               alh.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               alh.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               ke.a(ly.aG).fieldOf("biomes").forGetter(chq::d)
            )
            .apply($$0, chq::new)
   );
   public static final zf<ws, chq> b = zf.a(alh.b, chq::a, alh.b, chq::b, alh.b, chq::c, zd.c(ly.aG), chq::d, chq::new);
   public static final Codec<jp<chq>> c = ald.a(ly.m, a);
   public static final zf<ws, jp<chq>> d = zd.a(ly.m, b);
   private final alh e;
   private final alh f;
   private final alh g;
   private final alh h;
   private final alh i;
   private final alh j;
   private final jt<dfw> k;

   public chq(alh $$0, alh $$1, alh $$2, jt<dfw> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static alh a(alh $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public alh a() {
      return this.h;
   }

   public alh b() {
      return this.i;
   }

   public alh c() {
      return this.j;
   }

   public jt<dfw> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof chq $$1)
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
