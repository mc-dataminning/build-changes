import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ejm(List<ejm.a> b, jo c, efs d, boolean e) implements ejv {
   public static final Codec<ejm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejm.a.a.listOf().fieldOf("layers").forGetter(ejm::a),
               jo.g.fieldOf("direction").forGetter(ejm::b),
               efs.b.fieldOf("allowed_placement").forGetter(ejm::c),
               Codec.BOOL.fieldOf("prioritize_tip").forGetter(ejm::d)
            )
            .apply($$0, ejm::new)
   );

   public static ejm.a a(bsv $$0, elw $$1) {
      return new ejm.a($$0, $$1);
   }

   public static ejm b(bsv $$0, elw $$1) {
      return new ejm(List.of(a($$0, $$1)), jo.b, efs.c, false);
   }

   public List<ejm.a> a() {
      return this.b;
   }

   public jo b() {
      return this.c;
   }

   public efs c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public static record a(bsv b, elw c) {
      public static final Codec<ejm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bsv.d.fieldOf("height").forGetter(ejm.a::a), elw.a.fieldOf("provider").forGetter(ejm.a::b)).apply($$0, ejm.a::new)
      );

      public bsv a() {
         return this.b;
      }

      public elw b() {
         return this.c;
      }
   }
}
