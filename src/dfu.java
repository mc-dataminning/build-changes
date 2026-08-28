import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfu(jg<czw> c, int d, kj e) {
   private static final Codec<dfu> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czw.e.fieldOf("id").forGetter(dfu::b),
               ayy.a(1, 99).optionalFieldOf("count", 1).forGetter(dfu::c),
               kj.b.optionalFieldOf("components", kj.a).forGetter(dfu::d)
            )
            .apply($$0, dfu::new)
   );
   public static final Codec<dfu> a = Codec.withAlternative(f, czw.e, $$0 -> new dfu((czw)$$0.a())).validate(dfu::a);
   public static final za<wn, dfu> b = za.a(czw.f, dfu::b, yy.h, dfu::c, kj.c, dfu::d, dfu::new);

   public dfu(czw $$0) {
      this($$0.e(), 1, kj.a);
   }

   private static DataResult<dfu> a(dfu $$0) {
      return daa.a(new daa($$0.c, $$0.d, $$0.e)).map($$1 -> $$0);
   }

   public daa a(daa $$0) {
      daa $$1 = $$0.a(this.c.a(), this.d);
      $$1.b(this.e);
      return $$1;
   }

   public boolean b(daa $$0) {
      daa $$1 = this.a($$0);
      return $$1.M() == 1 && daa.c($$0, $$1);
   }

   public dgd a() {
      return new dgd.f(new daa(this.c, this.d, this.e));
   }

   public jg<czw> b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public kj d() {
      return this.e;
   }
}
