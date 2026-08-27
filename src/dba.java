import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dba {
   List<dba.a> a();

   static List<dba> b() {
      return jd.i.s().map(dba::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dba a(cpw $$0) {
      if ($$0.k() instanceof cha $$1) {
         csx var6 = $$1.e();
         if (var6 instanceof dba) {
            return (dba)var6;
         }
      }

      cjc $$2 = $$0.k();
      return $$2 instanceof dba ? (dba)$$2 : null;
   }

   public static record a(bid c, int d) {
      public static final Codec<dba.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jd.e.q().fieldOf("id").forGetter(dba.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(dba.a::c)).apply($$0, dba.a::new)
      );
      public static final Codec<List<dba.a>> b = a.listOf();

      public bif a() {
         return new bif(this.c, this.d);
      }

      public bid b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
