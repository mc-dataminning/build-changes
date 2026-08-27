import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record edi(List<edi.a> c, edz d) {
   public static final Codec<edi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edi.a.a.listOf().fieldOf("structures").forGetter(edi::a), edz.b.fieldOf("placement").forGetter(edi::b)).apply($$0, edi::new)
   );
   public static final Codec<il<edi>> b = ajd.a(kj.aG, a);

   public edi(il<edc> $$0, edz $$1) {
      this(List.of(new edi.a($$0, 1)), $$1);
   }

   public static edi.a a(il<edc> $$0, int $$1) {
      return new edi.a($$0, $$1);
   }

   public static edi.a a(il<edc> $$0) {
      return new edi.a($$0, 1);
   }

   public List<edi.a> a() {
      return this.c;
   }

   public edz b() {
      return this.d;
   }

   public static record a(il<edc> b, int c) {
      public static final Codec<edi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(edc.b.fieldOf("structure").forGetter(edi.a::a), awe.k.fieldOf("weight").forGetter(edi.a::b)).apply($$0, edi.a::new)
      );

      public il<edc> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
