import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record deh(jq<cwi> d, int e, ks f, cwm g) {
   public static final Codec<deh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cwm.a.fieldOf("id").forGetter(deh::a),
               ayv.m.fieldOf("count").orElse(1).forGetter(deh::b),
               ks.a.optionalFieldOf("components", ks.c).forGetter(deh::c)
            )
            .apply($$0, deh::new)
   );
   public static final zh<wu, deh> b = zh.a(zf.b(ma.K), deh::a, zf.h, deh::b, ks.b, deh::c, deh::new);
   public static final zh<wu, Optional<deh>> c = b.a(zf::a);

   public deh(dfl $$0) {
      this($$0, 1);
   }

   public deh(dfl $$0, int $$1) {
      this($$0.j().f(), $$1, ks.c);
   }

   public deh(jq<cwi> $$0, int $$1, ks $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public deh a(UnaryOperator<ks.a> $$0) {
      return new deh(this.d, this.e, $$0.apply(ks.a()).a());
   }

   private static cwm a(jq<cwi> $$0, int $$1, ks $$2) {
      return new cwm($$0, $$1, $$2.c());
   }

   public boolean a(cwm $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jq<cwi> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public ks c() {
      return this.f;
   }

   public cwm d() {
      return this.g;
   }
}
