import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eop(List<eop.a> c, epg d) {
   public static final Codec<eop> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eop.a.a.listOf().fieldOf("structures").forGetter(eop::a), epg.b.fieldOf("placement").forGetter(eop::b)).apply($$0, eop::new)
   );
   public static final Codec<jr<eop>> b = akq.a(mc.aY, a);

   public eop(jr<eoj> $$0, epg $$1) {
      this(List.of(new eop.a($$0, 1)), $$1);
   }

   public static eop.a a(jr<eoj> $$0, int $$1) {
      return new eop.a($$0, $$1);
   }

   public static eop.a a(jr<eoj> $$0) {
      return new eop.a($$0, 1);
   }

   public List<eop.a> a() {
      return this.c;
   }

   public epg b() {
      return this.d;
   }

   public static record a(jr<eoj> b, int c) {
      public static final Codec<eop.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eoj.b.fieldOf("structure").forGetter(eop.a::a), ayi.m.fieldOf("weight").forGetter(eop.a::b)).apply($$0, eop.a::new)
      );

      public jr<eoj> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
