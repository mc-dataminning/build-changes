import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dbc(jj<cty> d, int e, kl f, cud g) {
   public static final Codec<dbc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cud.a.fieldOf("id").forGetter(dbc::a),
               axo.l.fieldOf("count").orElse(1).forGetter(dbc::b),
               kl.a.optionalFieldOf("components", kl.c).forGetter(dbc::c)
            )
            .apply($$0, dbc::new)
   );
   public static final ys<wf, dbc> b = ys.a(yq.b(lr.K), dbc::a, yq.g, dbc::b, kl.b, dbc::c, dbc::new);
   public static final ys<wf, Optional<dbc>> c = b.a(yq::a);

   public dbc(dcf $$0) {
      this($$0, 1);
   }

   public dbc(dcf $$0, int $$1) {
      this($$0.r().o(), $$1, kl.c);
   }

   public dbc(jj<cty> $$0, int $$1, kl $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dbc a(UnaryOperator<kl.a> $$0) {
      return new dbc(this.d, this.e, $$0.apply(kl.a()).a());
   }

   private static cud a(jj<cty> $$0, int $$1, kl $$2) {
      return new cud($$0, $$1, $$2.c());
   }

   public boolean a(cud $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jj<cty> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kl c() {
      return this.f;
   }

   public cud d() {
      return this.g;
   }
}
