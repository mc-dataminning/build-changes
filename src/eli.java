import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eli(List<eli.a> c, elz d) {
   public static final Codec<eli> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eli.a.a.listOf().fieldOf("structures").forGetter(eli::a), elz.b.fieldOf("placement").forGetter(eli::b)).apply($$0, eli::new)
   );
   public static final Codec<jn<eli>> b = aky.a(lv.aU, a);

   public eli(jn<elc> $$0, elz $$1) {
      this(List.of(new eli.a($$0, 1)), $$1);
   }

   public static eli.a a(jn<elc> $$0, int $$1) {
      return new eli.a($$0, $$1);
   }

   public static eli.a a(jn<elc> $$0) {
      return new eli.a($$0, 1);
   }

   public List<eli.a> a() {
      return this.c;
   }

   public elz b() {
      return this.d;
   }

   public static record a(jn<elc> b, int c) {
      public static final Codec<eli.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(elc.b.fieldOf("structure").forGetter(eli.a::a), aym.l.fieldOf("weight").forGetter(eli.a::b)).apply($$0, eli.a::new)
      );

      public jn<elc> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
