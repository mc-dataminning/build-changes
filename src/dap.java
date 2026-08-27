import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dap {
   List<dap.a> a();

   static List<dap> b() {
      return jb.i.s().map(dap::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dap a(cpl $$0) {
      if ($$0.k() instanceof cgr $$1) {
         csm var6 = $$1.e();
         if (var6 instanceof dap) {
            return (dap)var6;
         }
      }

      cit $$2 = $$0.k();
      return $$2 instanceof dap ? (dap)$$2 : null;
   }

   public static record a(bht c, int d) {
      public static final Codec<dap.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jb.e.q().fieldOf("id").forGetter(dap.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(dap.a::c)).apply($$0, dap.a::new)
      );
      public static final Codec<List<dap.a>> b = a.listOf();

      public bhv a() {
         return new bhv(this.c, this.d);
      }

      public bht b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
