import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dhw(je<cyz> d, int e, kd f, czd g) {
   public static final Codec<dhw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyz.e.fieldOf("id").forGetter(dhw::a),
               ayu.m.fieldOf("count").orElse(1).forGetter(dhw::b),
               kd.a.optionalFieldOf("components", kd.c).forGetter(dhw::c)
            )
            .apply($$0, dhw::new)
   );
   public static final yw<wj, dhw> b = yw.a(cyz.f, dhw::a, yu.h, dhw::b, kd.b, dhw::c, dhw::new);
   public static final yw<wj, Optional<dhw>> c = b.a(yu::a);

   public dhw(diz $$0) {
      this($$0, 1);
   }

   public dhw(diz $$0, int $$1) {
      this($$0.h().e(), $$1, kd.c);
   }

   public dhw(je<cyz> $$0, int $$1, kd $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dhw a(UnaryOperator<kd.a> $$0) {
      return new dhw(this.d, this.e, $$0.apply(kd.a()).a());
   }

   private static czd a(je<cyz> $$0, int $$1, kd $$2) {
      return new czd($$0, $$1, $$2.c());
   }

   public boolean a(czd $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public je<cyz> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kd c() {
      return this.f;
   }

   public czd d() {
      return this.g;
   }
}
