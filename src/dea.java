import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dea(jq<cwb> d, int e, ks f, cwf g) {
   public static final Codec<dea> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwf.a.fieldOf("id").forGetter(dea::a),
               ayw.m.fieldOf("count").orElse(1).forGetter(dea::b),
               ks.a.optionalFieldOf("components", ks.c).forGetter(dea::c)
            )
            .apply($$0, dea::new)
   );
   public static final zj<ww, dea> b = zj.a(zh.b(ma.K), dea::a, zh.h, dea::b, ks.b, dea::c, dea::new);
   public static final zj<ww, Optional<dea>> c = b.a(zh::a);

   public dea(dfe $$0) {
      this($$0, 1);
   }

   public dea(dfe $$0, int $$1) {
      this($$0.j().f(), $$1, ks.c);
   }

   public dea(jq<cwb> $$0, int $$1, ks $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dea a(UnaryOperator<ks.a> $$0) {
      return new dea(this.d, this.e, $$0.apply(ks.a()).a());
   }

   private static cwf a(jq<cwb> $$0, int $$1, ks $$2) {
      return new cwf($$0, $$1, $$2.c());
   }

   public boolean a(cwf $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jq<cwb> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public ks c() {
      return this.f;
   }

   public cwf d() {
      return this.g;
   }
}
