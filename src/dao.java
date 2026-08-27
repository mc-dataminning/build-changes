import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface dao {
   List<dao.a> a();

   static List<dao> b() {
      return jb.i.s().map(dao::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static dao a(cpk $$0) {
      if ($$0.k() instanceof cgq $$1) {
         csl var6 = $$1.e();
         if (var6 instanceof dao) {
            return (dao)var6;
         }
      }

      cis $$2 = $$0.k();
      return $$2 instanceof dao ? (dao)$$2 : null;
   }

   public static record a(bht c, int d) {
      public static final Codec<dao.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jb.e.q().fieldOf("id").forGetter(dao.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(dao.a::c)).apply($$0, dao.a::new)
      );
      public static final Codec<List<dao.a>> b = a.listOf();

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
