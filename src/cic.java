import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cic {
   public static final Codec<cic> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               alj.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               alj.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               alj.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               kf.a(ma.aG).fieldOf("biomes").forGetter(cic::d)
            )
            .apply($$0, cic::new)
   );
   public static final zh<wu, cic> b = zh.a(alj.b, cic::a, alj.b, cic::b, alj.b, cic::c, zf.c(ma.aG), cic::d, cic::new);
   public static final Codec<jq<cic>> c = alf.a(ma.m, a);
   public static final zh<wu, jq<cic>> d = zf.a(ma.m, b);
   private final alj e;
   private final alj f;
   private final alj g;
   private final alj h;
   private final alj i;
   private final alj j;
   private final ju<dgo> k;

   public cic(alj $$0, alj $$1, alj $$2, ju<dgo> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static alj a(alj $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public alj a() {
      return this.h;
   }

   public alj b() {
      return this.i;
   }

   public alj c() {
      return this.j;
   }

   public ju<dgo> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cic $$1)
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
