import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record emr(List<emr.a> b, jc c, eiw d, boolean e) implements enb {
   public static final Codec<emr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               emr.a.a.listOf().fieldOf("layers").forGetter(emr::a),
               jc.g.fieldOf("direction").forGetter(emr::b),
               eiw.b.fieldOf("allowed_placement").forGetter(emr::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(emr::d)
            )
            .apply($$0, emr::new)
   );

   public static emr.a a(buh $$0, epc $$1) {
      return new emr.a($$0, $$1);
   }

   public static emr b(buh $$0, epc $$1) {
      return new emr(List.of(a($$0, $$1)), jc.b, eiw.c, false);
   }

   public List<emr.a> a() {
      return this.b;
   }

   public jc b() {
      return this.c;
   }

   public eiw c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(buh b, epc c) {
      public static final Codec<emr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(buh.d.fieldOf("height").forGetter(emr.a::a), epc.a.fieldOf("provider").forGetter(emr.a::b)).apply($$0, emr.a::new)
      );

      public buh a() {
         return this.b;
      }

      public epc b() {
         return this.c;
      }
   }
}
