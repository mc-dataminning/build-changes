import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record did(jf<czg> d, int e, ke f, czk g) {
   public static final Codec<did> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czg.e.fieldOf("id").forGetter(did::a),
               ayu.m.fieldOf("count").orElse(1).forGetter(did::b),
               ke.a.optionalFieldOf("components", ke.c).forGetter(did::c)
            )
            .apply($$0, did::new)
   );
   public static final yw<wj, did> b = yw.a(czg.f, did::a, yu.h, did::b, ke.b, did::c, did::new);
   public static final yw<wj, Optional<did>> c = b.a(yu::a);

   public did(djg $$0) {
      this($$0, 1);
   }

   public did(djg $$0, int $$1) {
      this($$0.h().e(), $$1, ke.c);
   }

   public did(jf<czg> $$0, int $$1, ke $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public did a(UnaryOperator<ke.a> $$0) {
      return new did(this.d, this.e, $$0.apply(ke.a()).a());
   }

   private static czk a(jf<czg> $$0, int $$1, ke $$2) {
      return new czk($$0, $$1, $$2.c());
   }

   public boolean a(czk $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jf<czg> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public ke c() {
      return this.f;
   }

   public czk d() {
      return this.g;
   }
}
