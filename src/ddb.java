import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface ddb {
   List<ddb.a> b();

   static List<ddb> c() {
      return jy.i.s().map(ddb::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static ddb a(crz $$0) {
      if ($$0.k() instanceof cjc $$1) {
         cva var6 = $$1.e();
         if (var6 instanceof ddb) {
            return (ddb)var6;
         }
      }

      cle $$2 = $$0.k();
      return $$2 instanceof ddb ? (ddb)$$2 : null;
   }

   public static record a(bkb c, int d) {
      public static final Codec<ddb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jy.e.q().fieldOf("id").forGetter(ddb.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(ddb.a::c)).apply($$0, ddb.a::new)
      );
      public static final Codec<List<ddb.a>> b = a.listOf();

      public bkd a() {
         return new bkd(this.c, this.d);
      }

      public bkb b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
