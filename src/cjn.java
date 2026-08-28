import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.function.UnaryOperator;

public final class cjn {
   public static final Codec<cjn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ald.a.fieldOf("wild_texture").forGetter($$0x -> $$0x.e),
               ald.a.fieldOf("tame_texture").forGetter($$0x -> $$0x.f),
               ald.a.fieldOf("angry_texture").forGetter($$0x -> $$0x.g),
               kh.a(me.aM).fieldOf("biomes").forGetter(cjn::d)
            )
            .apply($$0, cjn::new)
   );
   public static final yt<wg, cjn> b = yt.a(ald.b, cjn::a, ald.b, cjn::b, ald.b, cjn::c, yr.c(me.aM), cjn::d, cjn::new);
   public static final Codec<js<cjn>> c = akz.a(me.m, a);
   public static final yt<wg, js<cjn>> d = yr.a(me.m, b);
   private final ald e;
   private final ald f;
   private final ald g;
   private final ald h;
   private final ald i;
   private final ald j;
   private final jw<dis> k;

   public cjn(ald $$0, ald $$1, ald $$2, jw<dis> $$3) {
      this.e = $$0;
      this.h = a($$0);
      this.f = $$1;
      this.i = a($$1);
      this.g = $$2;
      this.j = a($$2);
      this.k = $$3;
   }

   private static ald a(ald $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
   }

   public ald a() {
      return this.h;
   }

   public ald b() {
      return this.i;
   }

   public ald c() {
      return this.j;
   }

   public jw<dis> d() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         return !($$0 instanceof cjn $$1)
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
