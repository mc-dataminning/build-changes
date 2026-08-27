import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record btw(UUID d, String e, double f, btw.a g) {
   private static final Logger h = LogUtils.getLogger();
   public static final MapCodec<btw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jr.a.fieldOf("uuid").forGetter(btw::b),
               Codec.STRING.fieldOf("name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("amount").forGetter(btw::d),
               btw.a.f.fieldOf("operation").forGetter(btw::e)
            )
            .apply($$0, btw::new)
   );
   public static final Codec<btw> b = a.codec();
   public static final yv<ByteBuf, btw> c = yv.a(jr.g, btw::b, yt.k, $$0 -> $$0.e, yt.i, btw::d, btw.a.e, btw::e, btw::new);

   public btw(String $$0, double $$1, btw.a $$2) {
      this(ayf.a(aym.c()), $$0, $$1, $$2);
   }

   public ud a() {
      ud $$0 = new ud();
      $$0.a("Name", this.e);
      $$0.a("Amount", this.f);
      $$0.a("Operation", this.g.a());
      $$0.a("UUID", this.d);
      return $$0;
   }

   @Nullable
   public static btw a(ud $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         btw.a $$2 = btw.a.d.apply($$0.h("Operation"));
         return new btw($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
      } catch (Exception var3) {
         h.warn("Unable to create attribute: {}", var3.getMessage());
         return null;
      }
   }

   public UUID b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public btw.a e() {
      return this.g;
   }

   public static enum a implements ayz {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<btw.a> d = aww.a(btw.a::a, values(), aww.a.a);
      public static final yv<ByteBuf, btw.a> e = yt.a(d, btw.a::a);
      public static final Codec<btw.a> f = ayz.a(btw.a::values);
      private final String g;
      private final int h;

      private a(String $$0, int $$1) {
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
