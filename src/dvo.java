import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dvo(List<dvo.a> c, dwf d) {
   public static final Codec<dvo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvo.a.a.listOf().fieldOf("structures").forGetter(dvo::a), dwf.b.fieldOf("placement").forGetter(dvo::b)).apply($$0, dvo::new)
   );
   public static final Codec<he<dvo>> b = aes.a(jc.aB, a);

   public dvo(he<dvi> $$0, dwf $$1) {
      this(List.of(new dvo.a($$0, 1)), $$1);
   }

   public static dvo.a a(he<dvi> $$0, int $$1) {
      return new dvo.a($$0, $$1);
   }

   public static dvo.a a(he<dvi> $$0) {
      return new dvo.a($$0, 1);
   }

   public List<dvo.a> a() {
      return this.c;
   }

   public dwf b() {
      return this.d;
   }

   public static record a(he<dvi> b, int c) {
      public static final Codec<dvo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dvi.b.fieldOf("structure").forGetter(dvo.a::a), arf.j.fieldOf("weight").forGetter(dvo.a::b)).apply($$0, dvo.a::new)
      );

      public he<dvi> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
