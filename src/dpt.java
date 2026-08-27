import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dpt(List<dpt.a> b, hc c, dmb d, boolean e) implements dqc {
   public static final Codec<dpt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpt.a.a.listOf().fieldOf("layers").forGetter(dpt::a),
               hc.g.fieldOf("direction").forGetter(dpt::b),
               dmb.b.fieldOf("allowed_placement").forGetter(dpt::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dpt::d)
            )
            .apply($$0, dpt::new)
   );

   public static dpt.a a(bgf $$0, dsd $$1) {
      return new dpt.a($$0, $$1);
   }

   public static dpt b(bgf $$0, dsd $$1) {
      return new dpt(List.of(a($$0, $$1)), hc.b, dmb.c, false);
   }

   public List<dpt.a> a() {
      return this.b;
   }

   public hc b() {
      return this.c;
   }

   public dmb c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bgf b, dsd c) {
      public static final Codec<dpt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bgf.d.fieldOf("height").forGetter(dpt.a::a), dsd.a.fieldOf("provider").forGetter(dpt.a::b)).apply($$0, dpt.a::new)
      );

      public bgf a() {
         return this.b;
      }

      public dsd b() {
         return this.c;
      }
   }
}
