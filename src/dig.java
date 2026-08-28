import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dig(jf<czj> d, int e, ke f, czn g) {
   public static final Codec<dig> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czj.e.fieldOf("id").forGetter(dig::a),
               ayu.m.fieldOf("count").orElse(1).forGetter(dig::b),
               ke.a.optionalFieldOf("components", ke.c).forGetter(dig::c)
            )
            .apply($$0, dig::new)
   );
   public static final yw<wj, dig> b = yw.a(czj.f, dig::a, yu.h, dig::b, ke.b, dig::c, dig::new);
   public static final yw<wj, Optional<dig>> c = b.a(yu::a);

   public dig(djl $$0) {
      this($$0, 1);
   }

   public dig(djl $$0, int $$1) {
      this($$0.h().e(), $$1, ke.c);
   }

   public dig(jf<czj> $$0, int $$1, ke $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dig a(UnaryOperator<ke.a> $$0) {
      return new dig(this.d, this.e, $$0.apply(ke.a()).a());
   }

   private static czn a(jf<czj> $$0, int $$1, ke $$2) {
      return new czn($$0, $$1, $$2.c());
   }

   public boolean a(czn $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jf<czj> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public ke c() {
      return this.f;
   }

   public czn d() {
      return this.g;
   }
}
