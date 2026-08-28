import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record ddb(jn<cvk> d, int e, kp f, cvp g) {
   public static final Codec<ddb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cvp.a.fieldOf("id").forGetter(ddb::a),
               aym.l.fieldOf("count").orElse(1).forGetter(ddb::b),
               kp.a.optionalFieldOf("components", kp.c).forGetter(ddb::c)
            )
            .apply($$0, ddb::new)
   );
   public static final zb<wo, ddb> b = zb.a(yz.b(lv.K), ddb::a, yz.g, ddb::b, kp.b, ddb::c, ddb::new);
   public static final zb<wo, Optional<ddb>> c = b.a(yz::a);

   public ddb(def $$0) {
      this($$0, 1);
   }

   public ddb(def $$0, int $$1) {
      this($$0.q().n(), $$1, kp.c);
   }

   public ddb(jn<cvk> $$0, int $$1, kp $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public ddb a(UnaryOperator<kp.a> $$0) {
      return new ddb(this.d, this.e, $$0.apply(kp.a()).a());
   }

   private static cvp a(jn<cvk> $$0, int $$1, kp $$2) {
      return new cvp($$0, $$1, $$2.c());
   }

   public boolean a(cvp $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jn<cvk> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kp c() {
      return this.f;
   }

   public cvp d() {
      return this.g;
   }
}
