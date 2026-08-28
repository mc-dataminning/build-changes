import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eoi(List<eoi.a> c, eoz d) {
   public static final Codec<eoi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eoi.a.a.listOf().fieldOf("structures").forGetter(eoi::a), eoz.b.fieldOf("placement").forGetter(eoi::b)).apply($$0, eoi::new)
   );
   public static final Codec<jq<eoi>> b = alv.a(mb.aV, a);

   public eoi(jq<eoc> $$0, eoz $$1) {
      this(List.of(new eoi.a($$0, 1)), $$1);
   }

   public static eoi.a a(jq<eoc> $$0, int $$1) {
      return new eoi.a($$0, $$1);
   }

   public static eoi.a a(jq<eoc> $$0) {
      return new eoi.a($$0, 1);
   }

   public List<eoi.a> a() {
      return this.c;
   }

   public eoz b() {
      return this.d;
   }

   public static record a(jq<eoc> b, int c) {
      public static final Codec<eoi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eoc.b.fieldOf("structure").forGetter(eoi.a::a), azn.m.fieldOf("weight").forGetter(eoi.a::b)).apply($$0, eoi.a::new)
      );

      public jq<eoc> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
