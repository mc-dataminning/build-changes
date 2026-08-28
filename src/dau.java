import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dau(ji<cuk> d, int e, kk f, cup g) {
   public static final Codec<dau> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cup.a.fieldOf("id").forGetter(dau::a),
               ayh.l.fieldOf("count").orElse(1).forGetter(dau::b),
               kk.a.optionalFieldOf("components", kk.c).forGetter(dau::c)
            )
            .apply($$0, dau::new)
   );
   public static final zn<xa, dau> b = zn.a(zl.b(lq.G), dau::a, zl.g, dau::b, kk.b, dau::c, dau::new);
   public static final zn<xa, Optional<dau>> c = b.a(zl::a);

   public dau(dbx $$0) {
      this($$0, 1);
   }

   public dau(dbx $$0, int $$1) {
      this($$0.r().o(), $$1, kk.c);
   }

   public dau(ji<cuk> $$0, int $$1, kk $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dau a(UnaryOperator<kk.a> $$0) {
      return new dau(this.d, this.e, $$0.apply(kk.a()).a());
   }

   private static cup a(ji<cuk> $$0, int $$1, kk $$2) {
      return new cup($$0, $$1, $$2.c());
   }

   public boolean a(cup $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public ji<cuk> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kk c() {
      return this.f;
   }

   public cup d() {
      return this.g;
   }
}
