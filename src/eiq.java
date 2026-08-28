import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eiq(List<eiq.a> c, ejh d) {
   public static final Codec<eiq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eiq.a.a.listOf().fieldOf("structures").forGetter(eiq::a), ejh.b.fieldOf("placement").forGetter(eiq::b)).apply($$0, eiq::new)
   );
   public static final Codec<ji<eiq>> b = alb.a(lq.aL, a);

   public eiq(ji<eik> $$0, ejh $$1) {
      this(List.of(new eiq.a($$0, 1)), $$1);
   }

   public static eiq.a a(ji<eik> $$0, int $$1) {
      return new eiq.a($$0, $$1);
   }

   public static eiq.a a(ji<eik> $$0) {
      return new eiq.a($$0, 1);
   }

   public List<eiq.a> a() {
      return this.c;
   }

   public ejh b() {
      return this.d;
   }

   public static record a(ji<eik> b, int c) {
      public static final Codec<eiq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eik.b.fieldOf("structure").forGetter(eiq.a::a), ayh.l.fieldOf("weight").forGetter(eiq.a::b)).apply($$0, eiq.a::new)
      );

      public ji<eik> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
