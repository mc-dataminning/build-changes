import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dbb(jj<ctx> d, int e, kl f, cuc g) {
   public static final Codec<dbb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cuc.a.fieldOf("id").forGetter(dbb::a),
               axo.l.fieldOf("count").orElse(1).forGetter(dbb::b),
               kl.a.optionalFieldOf("components", kl.c).forGetter(dbb::c)
            )
            .apply($$0, dbb::new)
   );
   public static final ys<wf, dbb> b = ys.a(yq.b(lr.K), dbb::a, yq.g, dbb::b, kl.b, dbb::c, dbb::new);
   public static final ys<wf, Optional<dbb>> c = b.a(yq::a);

   public dbb(dce $$0) {
      this($$0, 1);
   }

   public dbb(dce $$0, int $$1) {
      this($$0.r().o(), $$1, kl.c);
   }

   public dbb(jj<ctx> $$0, int $$1, kl $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dbb a(UnaryOperator<kl.a> $$0) {
      return new dbb(this.d, this.e, $$0.apply(kl.a()).a());
   }

   private static cuc a(jj<ctx> $$0, int $$1, kl $$2) {
      return new cuc($$0, $$1, $$2.c());
   }

   public boolean a(cuc $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jj<ctx> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kl c() {
      return this.f;
   }

   public cuc d() {
      return this.g;
   }
}
