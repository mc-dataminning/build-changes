import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dir(jf<czu> d, int e, ke f, czy g) {
   public static final Codec<dir> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czu.e.fieldOf("id").forGetter(dir::a),
               ayw.m.fieldOf("count").orElse(1).forGetter(dir::b),
               ke.a.optionalFieldOf("components", ke.c).forGetter(dir::c)
            )
            .apply($$0, dir::new)
   );
   public static final yy<wl, dir> b = yy.a(czu.f, dir::a, yw.h, dir::b, ke.b, dir::c, dir::new);
   public static final yy<wl, Optional<dir>> c = b.a(yw::a);

   public dir(djw $$0) {
      this($$0, 1);
   }

   public dir(djw $$0, int $$1) {
      this($$0.h().e(), $$1, ke.c);
   }

   public dir(jf<czu> $$0, int $$1, ke $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dir a(UnaryOperator<ke.a> $$0) {
      return new dir(this.d, this.e, $$0.apply(ke.a()).a());
   }

   private static czy a(jf<czu> $$0, int $$1, ke $$2) {
      return new czy($$0, $$1, $$2.c());
   }

   public boolean a(czy $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jf<czu> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public ke c() {
      return this.f;
   }

   public czy d() {
      return this.g;
   }
}
