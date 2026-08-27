import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dyu(List<dyu.a> c, dzl d) {
   public static final Codec<dyu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyu.a.a.listOf().fieldOf("structures").forGetter(dyu::a), dzl.b.fieldOf("placement").forGetter(dyu::b)).apply($$0, dyu::new)
   );
   public static final Codec<ie<dyu>> b = agp.a(kc.aE, a);

   public dyu(ie<dyo> $$0, dzl $$1) {
      this(List.of(new dyu.a($$0, 1)), $$1);
   }

   public static dyu.a a(ie<dyo> $$0, int $$1) {
      return new dyu.a($$0, $$1);
   }

   public static dyu.a a(ie<dyo> $$0) {
      return new dyu.a($$0, 1);
   }

   public List<dyu.a> a() {
      return this.c;
   }

   public dzl b() {
      return this.d;
   }

   public static record a(ie<dyo> b, int c) {
      public static final Codec<dyu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dyo.b.fieldOf("structure").forGetter(dyu.a::a), atg.j.fieldOf("weight").forGetter(dyu.a::b)).apply($$0, dyu.a::new)
      );

      public ie<dyo> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
