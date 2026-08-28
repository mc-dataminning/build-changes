import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public record bzj(alr d, double e, bzj.a f) {
   public static final MapCodec<bzj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alr.a.fieldOf("id").forGetter(bzj::a), Codec.DOUBLE.fieldOf("amount").forGetter(bzj::b), bzj.a.f.fieldOf("operation").forGetter(bzj::c))
            .apply($$0, bzj::new)
   );
   public static final Codec<bzj> b = a.codec();
   public static final ze<ByteBuf, bzj> c = ze.a(alr.b, bzj::a, zc.m, bzj::b, bzj.a.e, bzj::c, bzj::new);

   public boolean a(alr $$0) {
      return $$0.equals(this.d);
   }

   public alr a() {
      return this.d;
   }

   public double b() {
      return this.e;
   }

   public bzj.a c() {
      return this.f;
   }

   public static enum a implements bax {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bzj.a> d = ayo.a(bzj.a::a, values(), ayo.a.a);
      public static final ze<ByteBuf, bzj.a> e = zc.a(d, bzj.a::a);
      public static final Codec<bzj.a> f = bax.a(bzj.a::values);
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
