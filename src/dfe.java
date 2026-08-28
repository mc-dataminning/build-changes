import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfe(jf<czg> c, int d, ki e) {
   private static final Codec<dfe> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czg.e.fieldOf("id").forGetter(dfe::b),
               ayu.a(1, 99).optionalFieldOf("count", 1).forGetter(dfe::c),
               ki.b.optionalFieldOf("components", ki.a).forGetter(dfe::d)
            )
            .apply($$0, dfe::new)
   );
   public static final Codec<dfe> a = Codec.withAlternative(f, czg.e, $$0 -> new dfe((czg)$$0.a())).validate(dfe::a);
   public static final yw<wj, dfe> b = yw.a(czg.f, dfe::b, yu.h, dfe::c, ki.c, dfe::d, dfe::new);

   public dfe(czg $$0) {
      this($$0.e(), 1, ki.a);
   }

   private static DataResult<dfe> a(dfe $$0) {
      return czk.a(new czk($$0.c, $$0.d, $$0.e)).map($$1 -> $$0);
   }

   public czk a(czk $$0) {
      czk $$1 = $$0.a(this.c.a(), this.d);
      $$1.b(this.e);
      return $$1;
   }

   public boolean b(czk $$0) {
      czk $$1 = this.a($$0);
      return czk.a($$0, $$1);
   }

   public dfn a() {
      return new dfn.f(new czk(this.c, this.d, this.e));
   }

   public jf<czg> b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public ki d() {
      return this.e;
   }
}
