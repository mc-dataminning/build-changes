import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dvd(List<dvd.a> c, dvu d) {
   public static final Codec<dvd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvd.a.a.listOf().fieldOf("structures").forGetter(dvd::a), dvu.b.fieldOf("placement").forGetter(dvd::b)).apply($$0, dvd::new)
   );
   public static final Codec<hf<dvd>> b = ael.a(jd.aB, a);

   public dvd(hf<dux> $$0, dvu $$1) {
      this(List.of(new dvd.a($$0, 1)), $$1);
   }

   public static dvd.a a(hf<dux> $$0, int $$1) {
      return new dvd.a($$0, $$1);
   }

   public static dvd.a a(hf<dux> $$0) {
      return new dvd.a($$0, 1);
   }

   public List<dvd.a> a() {
      return this.c;
   }

   public dvu b() {
      return this.d;
   }

   public static record a(hf<dux> b, int c) {
      public static final Codec<dvd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dux.b.fieldOf("structure").forGetter(dvd.a::a), aqw.j.fieldOf("weight").forGetter(dvd.a::b)).apply($$0, dvd.a::new)
      );

      public hf<dux> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
