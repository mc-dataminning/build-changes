import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eoj(List<eoj.a> c, epa d) {
   public static final Codec<eoj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eoj.a.a.listOf().fieldOf("structures").forGetter(eoj::a), epa.b.fieldOf("placement").forGetter(eoj::b)).apply($$0, eoj::new)
   );
   public static final Codec<jq<eoj>> b = all.a(mb.aW, a);

   public eoj(jq<eod> $$0, epa $$1) {
      this(List.of(new eoj.a($$0, 1)), $$1);
   }

   public static eoj.a a(jq<eod> $$0, int $$1) {
      return new eoj.a($$0, $$1);
   }

   public static eoj.a a(jq<eod> $$0) {
      return new eoj.a($$0, 1);
   }

   public List<eoj.a> a() {
      return this.c;
   }

   public epa b() {
      return this.d;
   }

   public static record a(jq<eod> b, int c) {
      public static final Codec<eoj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eod.b.fieldOf("structure").forGetter(eoj.a::a), azd.m.fieldOf("weight").forGetter(eoj.a::b)).apply($$0, eoj.a::new)
      );

      public jq<eod> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
