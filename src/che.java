import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class che {
   public static final Codec<che> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alc.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               alc.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               alc.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               kc.a(lv.aG).fieldOf("biomes").forGetter(che::d)
            )
            .apply($$0, che::new)
   );
   public static final zb<wo, che> b = zb.a(alc.b, che::a, alc.b, che::b, alc.b, che::c, yz.c(lv.aG), che::d, che::new);
   public static final Codec<jn<che>> c = aky.a(lv.m, a);
   public static final zb<wo, jn<che>> d = yz.a(lv.m, b);
   private final alc e;
   private final alc f;
   private final alc g;
   private final alc h;
   private final alc i;
   private final alc j;
   private final jr<dfh> k;

   public che(alc $$0, alc $$1, alc $$2, jr<dfh> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static alc a(alc $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public alc a() {
      return this.h;
   }

   public alc b() {
      return this.i;
   }

   public alc c() {
      return this.j;
   }

   public jr<dfh> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof che $$1)
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
