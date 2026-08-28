import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class ciw {
   public static final Codec<ciw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aku.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               aku.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               aku.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               kg.a(mc.aJ).fieldOf("biomes").forGetter(ciw::d)
            )
            .apply($$0, ciw::new)
   );
   public static final yn<wa, ciw> b = yn.a(aku.b, ciw::a, aku.b, ciw::b, aku.b, ciw::c, yl.c(mc.aJ), ciw::d, ciw::new);
   public static final Codec<jr<ciw>> c = akq.a(mc.m, a);
   public static final yn<wa, jr<ciw>> d = yl.a(mc.m, b);
   private final aku e;
   private final aku f;
   private final aku g;
   private final aku h;
   private final aku i;
   private final aku j;
   private final jv<dic> k;

   public ciw(aku $$0, aku $$1, aku $$2, jv<dic> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static aku a(aku $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public aku a() {
      return this.h;
   }

   public aku b() {
      return this.i;
   }

   public aku c() {
      return this.j;
   }

   public jv<dic> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof ciw $$1)
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
