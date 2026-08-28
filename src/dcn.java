import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dcn(jn<cvg> d, int e, kp f, cvl g) {
   public static final Codec<dcn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cvl.a.fieldOf("id").forGetter(dcn::a),
               ayl.l.fieldOf("count").orElse(1).forGetter(dcn::b),
               kp.a.optionalFieldOf("components", kp.c).forGetter(dcn::c)
            )
            .apply($$0, dcn::new)
   );
   public static final zb<wo, dcn> b = zb.a(yz.b(lv.K), dcn::a, yz.g, dcn::b, kp.b, dcn::c, dcn::new);
   public static final zb<wo, Optional<dcn>> c = b.a(yz::a);

   public dcn(ddr $$0) {
      this($$0, 1);
   }

   public dcn(ddr $$0, int $$1) {
      this($$0.r().o(), $$1, kp.c);
   }

   public dcn(jn<cvg> $$0, int $$1, kp $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dcn a(UnaryOperator<kp.a> $$0) {
      return new dcn(this.d, this.e, $$0.apply(kp.a()).a());
   }

   private static cvl a(jn<cvg> $$0, int $$1, kp $$2) {
      return new cvl($$0, $$1, $$2.c());
   }

   public boolean a(cvl $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jn<cvg> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kp c() {
      return this.f;
   }

   public cvl d() {
      return this.g;
   }
}
