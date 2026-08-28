import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfh(jf<czj> c, int d, ki e) {
   private static final Codec<dfh> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czj.e.fieldOf("id").forGetter(dfh::b),
               ayu.a(1, 99).optionalFieldOf("count", 1).forGetter(dfh::c),
               ki.b.optionalFieldOf("components", ki.a).forGetter(dfh::d)
            )
            .apply($$0, dfh::new)
   );
   public static final Codec<dfh> a = Codec.withAlternative(f, czj.e, $$0 -> new dfh((czj)$$0.a())).validate(dfh::a);
   public static final yw<wj, dfh> b = yw.a(czj.f, dfh::b, yu.h, dfh::c, ki.c, dfh::d, dfh::new);

   public dfh(czj $$0) {
      this($$0.e(), 1, ki.a);
   }

   private static DataResult<dfh> a(dfh $$0) {
      return czn.a(new czn($$0.c, $$0.d, $$0.e)).map($$1 -> $$0);
   }

   public czn a(czn $$0) {
      czn $$1 = $$0.a(this.c.a(), this.d);
      $$1.b(this.e);
      return $$1;
   }

   public boolean b(czn $$0) {
      czn $$1 = this.a($$0);
      return czn.a($$0, $$1);
   }

   public dfq a() {
      return new dfq.f(new czn(this.c, this.d, this.e));
   }

   public jf<czj> b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public ki d() {
      return this.e;
   }
}
