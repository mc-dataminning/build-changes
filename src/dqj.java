import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dqj(List<dqj.a> b, hx c, dmr d, boolean e) implements dqs {
   public static final Codec<dqj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dqj.a.a.listOf().fieldOf("layers").forGetter(dqj::a),
               hx.g.fieldOf("direction").forGetter(dqj::b),
               dmr.b.fieldOf("allowed_placement").forGetter(dqj::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(dqj::d)
            )
            .apply($$0, dqj::new)
   );

   public static dqj.a a(bhg $$0, dst $$1) {
      return new dqj.a($$0, $$1);
   }

   public static dqj b(bhg $$0, dst $$1) {
      return new dqj(List.of(a($$0, $$1)), hx.b, dmr.c, false);
   }

   public List<dqj.a> a() {
      return this.b;
   }

   public hx b() {
      return this.c;
   }

   public dmr c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bhg b, dst c) {
      public static final Codec<dqj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bhg.d.fieldOf("height").forGetter(dqj.a::a), dst.a.fieldOf("provider").forGetter(dqj.a::b)).apply($$0, dqj.a::new)
      );

      public bhg a() {
         return this.b;
      }

      public dst b() {
         return this.c;
      }
   }
}
