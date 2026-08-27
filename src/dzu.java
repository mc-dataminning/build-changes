import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dzu(List<dzu.a> c, eal d) {
   public static final Codec<dzu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzu.a.a.listOf().fieldOf("structures").forGetter(dzu::a), eal.b.fieldOf("placement").forGetter(dzu::b)).apply($$0, dzu::new)
   );
   public static final Codec<ih<dzu>> b = ahd.a(ke.aF, a);

   public dzu(ih<dzo> $$0, eal $$1) {
      this(List.of(new dzu.a($$0, 1)), $$1);
   }

   public static dzu.a a(ih<dzo> $$0, int $$1) {
      return new dzu.a($$0, $$1);
   }

   public static dzu.a a(ih<dzo> $$0) {
      return new dzu.a($$0, 1);
   }

   public List<dzu.a> a() {
      return this.c;
   }

   public eal b() {
      return this.d;
   }

   public static record a(ih<dzo> b, int c) {
      public static final Codec<dzu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dzo.b.fieldOf("structure").forGetter(dzu.a::a), atx.j.fieldOf("weight").forGetter(dzu.a::b)).apply($$0, dzu.a::new)
      );

      public ih<dzo> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
