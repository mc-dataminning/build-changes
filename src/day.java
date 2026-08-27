import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public interface day {
   List<day.a> a();

   static List<day> b() {
      return jd.i.s().map(day::a).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static day a(cpu $$0) {
      if ($$0.k() instanceof cgy $$1) {
         csv var6 = $$1.e();
         if (var6 instanceof day) {
            return (day)var6;
         }
      }

      cja $$2 = $$0.k();
      return $$2 instanceof day ? (day)$$2 : null;
   }

   public static record a(bib c, int d) {
      public static final Codec<day.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jd.e.q().fieldOf("id").forGetter(day.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(day.a::c)).apply($$0, day.a::new)
      );
      public static final Codec<List<day.a>> b = a.listOf();

      public bid a() {
         return new bid(this.c, this.d);
      }

      public bib b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
