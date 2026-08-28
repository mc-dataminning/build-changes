import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dhl(je<cyo> d, int e, kd f, cys g) {
   public static final Codec<dhl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyo.e.fieldOf("id").forGetter(dhl::a),
               ays.m.fieldOf("count").orElse(1).forGetter(dhl::b),
               kd.a.optionalFieldOf("components", kd.c).forGetter(dhl::c)
            )
            .apply($$0, dhl::new)
   );
   public static final yu<wh, dhl> b = yu.a(cyo.f, dhl::a, ys.h, dhl::b, kd.b, dhl::c, dhl::new);
   public static final yu<wh, Optional<dhl>> c = b.a(ys::a);

   public dhl(dio $$0) {
      this($$0, 1);
   }

   public dhl(dio $$0, int $$1) {
      this($$0.h().e(), $$1, kd.c);
   }

   public dhl(je<cyo> $$0, int $$1, kd $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dhl a(UnaryOperator<kd.a> $$0) {
      return new dhl(this.d, this.e, $$0.apply(kd.a()).a());
   }

   private static cys a(je<cyo> $$0, int $$1, kd $$2) {
      return new cys($$0, $$1, $$2.c());
   }

   public boolean a(cys $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public je<cyo> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kd c() {
      return this.f;
   }

   public cys d() {
      return this.g;
   }
}
