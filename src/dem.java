import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dem(je<cyo> c, int d, kh e) {
   private static final Codec<dem> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyo.e.fieldOf("id").forGetter(dem::b),
               ays.a(1, 99).optionalFieldOf("count", 1).forGetter(dem::c),
               kh.b.optionalFieldOf("components", kh.a).forGetter(dem::d)
            )
            .apply($$0, dem::new)
   );
   public static final Codec<dem> a = Codec.withAlternative(f, cyo.e, $$0 -> new dem((cyo)$$0.a())).validate(dem::a);
   public static final yu<wh, dem> b = yu.a(cyo.f, dem::b, ys.h, dem::c, kh.c, dem::d, dem::new);

   public dem(cyo $$0) {
      this($$0.e(), 1, kh.a);
   }

   private static DataResult<dem> a(dem $$0) {
      return cys.a(new cys($$0.c, $$0.d, $$0.e)).map($$1 -> $$0);
   }

   public cys a(cys $$0) {
      cys $$1 = $$0.a(this.c.a(), this.d);
      $$1.b(this.e);
      return $$1;
   }

   public dev a() {
      return new dev.f(new cys(this.c, this.d, this.e));
   }

   public je<cyo> b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public kh d() {
      return this.e;
   }
}
