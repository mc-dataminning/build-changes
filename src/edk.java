import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record edk(List<edk.a> c, eeb d) {
   public static final Codec<edk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edk.a.a.listOf().fieldOf("structures").forGetter(edk::a), eeb.b.fieldOf("placement").forGetter(edk::b)).apply($$0, edk::new)
   );
   public static final Codec<il<edk>> b = ajd.a(kj.aG, a);

   public edk(il<ede> $$0, eeb $$1) {
      this(List.of(new edk.a($$0, 1)), $$1);
   }

   public static edk.a a(il<ede> $$0, int $$1) {
      return new edk.a($$0, $$1);
   }

   public static edk.a a(il<ede> $$0) {
      return new edk.a($$0, 1);
   }

   public List<edk.a> a() {
      return this.c;
   }

   public eeb b() {
      return this.d;
   }

   public static record a(il<ede> b, int c) {
      public static final Codec<edk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ede.b.fieldOf("structure").forGetter(edk.a::a), awe.k.fieldOf("weight").forGetter(edk.a::b)).apply($$0, edk.a::new)
      );

      public il<ede> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
