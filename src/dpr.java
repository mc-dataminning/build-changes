import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dpr(List<dpr.a> b, hc c, dlz d, boolean e) implements dqa {
   public static final Codec<dpr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpr.a.a.listOf().fieldOf("layers").forGetter(dpr::a),
               hc.g.fieldOf("direction").forGetter(dpr::b),
               dlz.b.fieldOf("allowed_placement").forGetter(dpr::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dpr::d)
            )
            .apply($$0, dpr::new)
   );

   public static dpr.a a(bgd $$0, dsb $$1) {
      return new dpr.a($$0, $$1);
   }

   public static dpr b(bgd $$0, dsb $$1) {
      return new dpr(List.of(a($$0, $$1)), hc.b, dlz.c, false);
   }

   public List<dpr.a> a() {
      return this.b;
   }

   public hc b() {
      return this.c;
   }

   public dlz c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bgd b, dsb c) {
      public static final Codec<dpr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bgd.d.fieldOf("height").forGetter(dpr.a::a), dsb.a.fieldOf("provider").forGetter(dpr.a::b)).apply($$0, dpr.a::new)
      );

      public bgd a() {
         return this.b;
      }

      public dsb b() {
         return this.c;
      }
   }
}
