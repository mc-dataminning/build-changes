import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record des(je<cyu> c, int d, kh e) {
   private static final Codec<des> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyu.e.fieldOf("id").forGetter(des::b),
               ayu.a(1, 99).optionalFieldOf("count", 1).forGetter(des::c),
               kh.b.optionalFieldOf("components", kh.a).forGetter(des::d)
            )
            .apply($$0, des::new)
   );
   public static final Codec<des> a = Codec.withAlternative(f, cyu.e, $$0 -> new des((cyu)$$0.a())).validate(des::a);
   public static final yw<wj, des> b = yw.a(cyu.f, des::b, yu.h, des::c, kh.c, des::d, des::new);

   public des(cyu $$0) {
      this($$0.e(), 1, kh.a);
   }

   private static DataResult<des> a(des $$0) {
      return cyy.a(new cyy($$0.c, $$0.d, $$0.e)).map($$1 -> $$0);
   }

   public cyy a(cyy $$0) {
      cyy $$1 = $$0.a(this.c.a(), this.d);
      $$1.b(this.e);
      return $$1;
   }

   public boolean b(cyy $$0) {
      cyy $$1 = this.a($$0);
      return cyy.a($$0, $$1);
   }

   public dfb a() {
      return new dfb.f(new cyy(this.c, this.d, this.e));
   }

   public je<cyu> b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public kh d() {
      return this.e;
   }
}
