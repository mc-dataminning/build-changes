import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eku(List<eku.a> c, ell d) {
   public static final Codec<eku> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eku.a.a.listOf().fieldOf("structures").forGetter(eku::a), ell.b.fieldOf("placement").forGetter(eku::b)).apply($$0, eku::new)
   );
   public static final Codec<jn<eku>> b = akx.a(lv.aT, a);

   public eku(jn<eko> $$0, ell $$1) {
      this(List.of(new eku.a($$0, 1)), $$1);
   }

   public static eku.a a(jn<eko> $$0, int $$1) {
      return new eku.a($$0, $$1);
   }

   public static eku.a a(jn<eko> $$0) {
      return new eku.a($$0, 1);
   }

   public List<eku.a> a() {
      return this.c;
   }

   public ell b() {
      return this.d;
   }

   public static record a(jn<eko> b, int c) {
      public static final Codec<eku.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eko.b.fieldOf("structure").forGetter(eku.a::a), ayl.l.fieldOf("weight").forGetter(eku.a::b)).apply($$0, eku.a::new)
      );

      public jn<eko> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
