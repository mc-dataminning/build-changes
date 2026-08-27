import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dbc {
   List<dbc.a> b();

   static List<dbc> c() {
      return jb.i.s().map(dbc::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dbc a(cqa $$0) {
      if ($$0.k() instanceof che $$1) {
         ctc var6 = $$1.e();
         if (var6 instanceof dbc) {
            return (dbc)var6;
         }
      }

      cjg $$2 = $$0.k();
      return $$2 instanceof dbc ? (dbc)$$2 : null;
   }

   public static record a(bih c, int d) {
      public static final Codec<dbc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jb.e.q().fieldOf("id").forGetter(dbc.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(dbc.a::c)).apply($$0, dbc.a::new)
      );
      public static final Codec<List<dbc.a>> b = a.listOf();

      public bij a() {
         return new bij(this.c, this.d);
      }

      public bih b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
