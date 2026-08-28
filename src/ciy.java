import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Objects;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class ciy {
   public static final Codec<ciy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ciy.a.c.optionalFieldOf("model", ciy.a.a).forGetter($$0x -> $$0x.e),
               ald.a.fieldOf("texture").forGetter($$0x -> $$0x.f),
               kh.a(me.aM).optionalFieldOf("biomes").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ciy::new)
   );
   public static final yt<wg, ciy> b = yt.a(ciy.a.d, $$0 -> $$0.e, ald.b, $$0 -> $$0.f, yr.c(me.aM).a(yr::a), $$0 -> $$0.h, ciy::new);
   public static final Codec<js<ciy>> c = akz.a(me.aX, a);
   public static final yt<wg, js<ciy>> d = yr.a(me.aX, b);
   private final ciy.a e;
   private final ald f;
   private final ald g;
   private final Optional<jw<dis>> h;

   public ciy(ciy.a $$0, ald $$1, Optional<jw<dis>> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
      this.h = $$2;
   }

   public ciy.a a() {
      return this.e;
   }

   public ald b() {
      return this.g;
   }

   public Optional<jw<dis>> c() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof ciy $$1) ? false : this.e.equals($$1.e) && this.f.equals($$1.f) && this.h.equals($$1.h);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.e, this.f, this.h);
   }

   @Override
   public String toString() {
      return "PigVariant[model=" + this.e + ", texture=" + this.f + ", biomes=" + this.h + "]";
   }

   public static enum a implements bag {
      a(0, "normal"),
      b(1, "cold");

      public static final Codec<ciy.a> c = bag.a(ciy.a::values);
      private static final IntFunction<ciy.a> e = aya.a($$0 -> $$0.f, values(), aya.a.c);
      public static final yt<ByteBuf, ciy.a> d = yr.a(e, $$0 -> $$0.f);
      private final int f;
      private final String g;

      private a(final int $$0, final String $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
