import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public record byy(ali d, double e, byy.a f) {
   public static final MapCodec<byy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.a.fieldOf("id").forGetter(byy::a), Codec.DOUBLE.fieldOf("amount").forGetter(byy::b), byy.a.f.fieldOf("operation").forGetter(byy::c))
            .apply($$0, byy::new)
   );
   public static final Codec<byy> b = a.codec();
   public static final yy<ByteBuf, byy> c = yy.a(ali.b, byy::a, yw.m, byy::b, byy.a.e, byy::c, byy::new);

   public boolean a(ali $$0) {
      return $$0.equals(this.d);
   }

   public ali a() {
      return this.d;
   }

   public double b() {
      return this.e;
   }

   public byy.a c() {
      return this.f;
   }

   public static enum a implements bam {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<byy.a> d = aye.a(byy.a::a, values(), aye.a.a);
      public static final yy<ByteBuf, byy.a> e = yw.a(d, byy.a::a);
      public static final Codec<byy.a> f = bam.a(byy.a::values);
      private final String g;
      private final int h;

      private a(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.h;
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
