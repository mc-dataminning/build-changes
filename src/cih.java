import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Objects;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class cih {
   public static final Codec<cih> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cih.a.c.optionalFieldOf("model", cih.a.a).forGetter($$0x -> $$0x.e),
               aku.a.fieldOf("texture").forGetter($$0x -> $$0x.f),
               kg.a(mc.aJ).optionalFieldOf("biomes").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, cih::new)
   );
   public static final yn<wa, cih> b = yn.a(cih.a.d, $$0 -> $$0.e, aku.b, $$0 -> $$0.f, yl.c(mc.aJ).a(yl::a), $$0 -> $$0.h, cih::new);
   public static final Codec<jr<cih>> c = akq.a(mc.aU, a);
   public static final yn<wa, jr<cih>> d = yl.a(mc.aU, b);
   private final cih.a e;
   private final aku f;
   private final aku g;
   private final Optional<jv<dic>> h;

   public cih(cih.a $$0, aku $$1, Optional<jv<dic>> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"));
      this.h = $$2;
   }

   public cih.a a() {
      return this.e;
   }

   public aku b() {
      return this.g;
   }

   public Optional<jv<dic>> c() {
      return this.h;
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cih $$1) ? false : this.e.equals($$1.e) && this.f.equals($$1.f) && this.h.equals($$1.h);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.e, this.f, this.h);
   }

   @Override
   public String toString() {
      return "PigVariant[model=" + this.e + ", texture=" + this.f + ", biomes=" + this.h + "]";
   }

   public static enum a implements azv {
      a(0, "normal"),
      b(1, "cold");

      public static final Codec<cih.a> c = azv.a(cih.a::values);
      private static final IntFunction<cih.a> e = axq.a($$0 -> $$0.f, values(), axq.a.c);
      public static final yn<ByteBuf, cih.a> d = yl.a(e, $$0 -> $$0.f);
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
