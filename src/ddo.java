import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddo(js<cxu> c, int d, ku e) {
   private static final Codec<ddo> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxu.e.fieldOf("id").forGetter(ddo::b),
               ays.a(1, 99).optionalFieldOf("count", 1).forGetter(ddo::c),
               ku.b.optionalFieldOf("components", ku.a).forGetter(ddo::d)
            )
            .apply($$0, ddo::new)
   );
   public static final Codec<ddo> a = Codec.withAlternative(f, cxu.e, $$0 -> new ddo((cxu)$$0.a())).validate(ddo::a);
   public static final yt<wg, ddo> b = yt.a(cxu.f, ddo::b, yr.h, ddo::c, ku.c, ddo::d, ddo::new);

   public ddo(cxu $$0) {
      this($$0.f(), 1, ku.a);
   }

   private static DataResult<ddo> a(ddo $$0) {
      return cxy.a(new cxy($$0.c, $$0.d, $$0.e)).map($$1 -> $$0);
   }

   public cxy a(cxy $$0) {
      cxy $$1 = $$0.a(this.c.a(), this.d);
      $$1.b(this.e);
      return $$1;
   }

   public ddx a() {
      return new ddx.f(new cxy(this.c, this.d, this.e));
   }

   public js<cxu> b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public ku d() {
      return this.e;
   }
}
