import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dex(je<cyz> c, int d, kh e) {
   private static final Codec<dex> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cyz.e.fieldOf("id").forGetter(dex::b),
               ayu.a(1, 99).optionalFieldOf("count", 1).forGetter(dex::c),
               kh.b.optionalFieldOf("components", kh.a).forGetter(dex::d)
            )
            .apply($$0, dex::new)
   );
   public static final Codec<dex> a = Codec.withAlternative(f, cyz.e, $$0 -> new dex((cyz)$$0.a())).validate(dex::a);
   public static final yw<wj, dex> b = yw.a(cyz.f, dex::b, yu.h, dex::c, kh.c, dex::d, dex::new);

   public dex(cyz $$0) {
      this($$0.e(), 1, kh.a);
   }

   private static DataResult<dex> a(dex $$0) {
      return czd.a(new czd($$0.c, $$0.d, $$0.e)).map($$1 -> $$0);
   }

   public czd a(czd $$0) {
      czd $$1 = $$0.a(this.c.a(), this.d);
      $$1.b(this.e);
      return $$1;
   }

   public boolean b(czd $$0) {
      czd $$1 = this.a($$0);
      return czd.a($$0, $$1);
   }

   public dfg a() {
      return new dfg.f(new czd(this.c, this.d, this.e));
   }

   public je<cyz> b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public kh d() {
      return this.e;
   }
}
