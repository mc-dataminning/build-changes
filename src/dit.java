import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dit(jg<czw> d, int e, kf f, daa g) {
   public static final Codec<dit> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czw.e.fieldOf("id").forGetter(dit::a),
               ayy.m.fieldOf("count").orElse(1).forGetter(dit::b),
               kf.a.optionalFieldOf("components", kf.c).forGetter(dit::c)
            )
            .apply($$0, dit::new)
   );
   public static final za<wn, dit> b = za.a(czw.f, dit::a, yy.h, dit::b, kf.b, dit::c, dit::new);
   public static final za<wn, Optional<dit>> c = b.a(yy::a);

   public dit(djy $$0) {
      this($$0, 1);
   }

   public dit(djy $$0, int $$1) {
      this($$0.h().e(), $$1, kf.c);
   }

   public dit(jg<czw> $$0, int $$1, kf $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dit a(UnaryOperator<kf.a> $$0) {
      return new dit(this.d, this.e, $$0.apply(kf.a()).a());
   }

   private static daa a(jg<czw> $$0, int $$1, kf $$2) {
      return new daa($$0, $$1, $$2.d());
   }

   public boolean a(daa $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jg<czw> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kf c() {
      return this.f;
   }

   public daa d() {
      return this.g;
   }
}
