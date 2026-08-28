import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record daz(jj<ctv> d, int e, kl f, cua g) {
   public static final Codec<daz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cua.a.fieldOf("id").forGetter(daz::a),
               axm.l.fieldOf("count").orElse(1).forGetter(daz::b),
               kl.a.optionalFieldOf("components", kl.c).forGetter(daz::c)
            )
            .apply($$0, daz::new)
   );
   public static final ys<wf, daz> b = ys.a(yq.b(lr.K), daz::a, yq.g, daz::b, kl.b, daz::c, daz::new);
   public static final ys<wf, Optional<daz>> c = b.a(yq::a);

   public daz(dcc $$0) {
      this($$0, 1);
   }

   public daz(dcc $$0, int $$1) {
      this($$0.r().o(), $$1, kl.c);
   }

   public daz(jj<ctv> $$0, int $$1, kl $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public daz a(UnaryOperator<kl.a> $$0) {
      return new daz(this.d, this.e, $$0.apply(kl.a()).a());
   }

   private static cua a(jj<ctv> $$0, int $$1, kl $$2) {
      return new cua($$0, $$1, $$2.c());
   }

   public boolean a(cua $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jj<ctv> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kl c() {
      return this.f;
   }

   public cua d() {
      return this.g;
   }
}
