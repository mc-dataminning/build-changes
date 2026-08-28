import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record enq(List<enq.a> c, eoh d) {
   public static final Codec<enq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(enq.a.a.listOf().fieldOf("structures").forGetter(enq::a), eoh.b.fieldOf("placement").forGetter(enq::b)).apply($$0, enq::new)
   );
   public static final Codec<jr<enq>> b = akq.a(mc.aW, a);

   public enq(jr<enk> $$0, eoh $$1) {
      this(List.of(new enq.a($$0, 1)), $$1);
   }

   public static enq.a a(jr<enk> $$0, int $$1) {
      return new enq.a($$0, $$1);
   }

   public static enq.a a(jr<enk> $$0) {
      return new enq.a($$0, 1);
   }

   public List<enq.a> a() {
      return this.c;
   }

   public eoh b() {
      return this.d;
   }

   public static record a(jr<enk> b, int c) {
      public static final Codec<enq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(enk.b.fieldOf("structure").forGetter(enq.a::a), ayh.m.fieldOf("weight").forGetter(enq.a::b)).apply($$0, enq.a::new)
      );

      public jr<enk> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
