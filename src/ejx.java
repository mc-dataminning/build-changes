import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ejx(List<ejx.a> c, eko d) {
   public static final Codec<ejx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejx.a.a.listOf().fieldOf("structures").forGetter(ejx::a), eko.b.fieldOf("placement").forGetter(ejx::b)).apply($$0, ejx::new)
   );
   public static final Codec<jm<ejx>> b = akn.a(lu.aT, a);

   public ejx(jm<ejr> $$0, eko $$1) {
      this(List.of(new ejx.a($$0, 1)), $$1);
   }

   public static ejx.a a(jm<ejr> $$0, int $$1) {
      return new ejx.a($$0, $$1);
   }

   public static ejx.a a(jm<ejr> $$0) {
      return new ejx.a($$0, 1);
   }

   public List<ejx.a> a() {
      return this.c;
   }

   public eko b() {
      return this.d;
   }

   public static record a(jm<ejr> b, int c) {
      public static final Codec<ejx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ejr.b.fieldOf("structure").forGetter(ejx.a::a), axw.l.fieldOf("weight").forGetter(ejx.a::b)).apply($$0, ejx.a::new)
      );

      public jm<ejr> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
