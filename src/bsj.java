import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record bsj(UUID d, String e, double f, bsj.a g) {
   private static final Logger h = LogUtils.getLogger();
   public static final MapCodec<bsj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jp.a.fieldOf("uuid").forGetter(bsj::b),
               Codec.STRING.fieldOf("name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("amount").forGetter(bsj::d),
               bsj.a.f.fieldOf("operation").forGetter(bsj::e)
            )
            .apply($$0, bsj::new)
   );
   public static final Codec<bsj> b = a.codec();
   public static final yq<ByteBuf, bsj> c = yq.a(jp.g, bsj::b, yo.k, $$0 -> $$0.e, yo.i, bsj::d, bsj.a.e, bsj::e, bsj::new);

   public bsj(String $$0, double $$1, bsj.a $$2) {
      this(axw.a(ayd.c()), $$0, $$1, $$2);
   }

   public ty a() {
      ty $$0 = new ty();
      $$0.a("Name", this.e);
      $$0.a("Amount", this.f);
      $$0.a("Operation", this.g.a());
      $$0.a("UUID", this.d);
      return $$0;
   }

   @Nullable
   public static bsj a(ty $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         bsj.a $$2 = bsj.a.d.apply($$0.h("Operation"));
         return new bsj($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
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

   public bsj.a e() {
      return this.g;
   }

   public static enum a implements ayq {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bsj.a> d = awn.a(bsj.a::a, values(), awn.a.a);
      public static final yq<ByteBuf, bsj.a> e = yo.a(d, bsj.a::a);
      public static final Codec<bsj.a> f = ayq.a(bsj.a::values);
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
