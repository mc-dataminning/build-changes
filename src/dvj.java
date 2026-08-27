import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dvj(List<dvj.a> c, dwa d) {
   public static final Codec<dvj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvj.a.a.listOf().fieldOf("structures").forGetter(dvj::a), dwa.b.fieldOf("placement").forGetter(dvj::b)).apply($$0, dvj::new)
   );
   public static final Codec<hg<dvj>> b = aeq.a(je.aB, a);

   public dvj(hg<dvd> $$0, dwa $$1) {
      this(List.of(new dvj.a($$0, 1)), $$1);
   }

   public static dvj.a a(hg<dvd> $$0, int $$1) {
      return new dvj.a($$0, $$1);
   }

   public static dvj.a a(hg<dvd> $$0) {
      return new dvj.a($$0, 1);
   }

   public List<dvj.a> a() {
      return this.c;
   }

   public dwa b() {
      return this.d;
   }

   public static record a(hg<dvd> b, int c) {
      public static final Codec<dvj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dvd.b.fieldOf("structure").forGetter(dvj.a::a), arb.j.fieldOf("weight").forGetter(dvj.a::b)).apply($$0, dvj.a::new)
      );

      public hg<dvd> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
