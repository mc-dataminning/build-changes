import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcy(jr<cxd> c, int d, ks e) {
   private static final Codec<dcy> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxd.e.fieldOf("id").forGetter(dcy::b),
               ayi.a(1, 99).optionalFieldOf("count", 1).forGetter(dcy::c),
               ks.b.optionalFieldOf("components", ks.a).forGetter(dcy::d)
            )
            .apply($$0, dcy::new)
   );
   public static final Codec<dcy> a = Codec.withAlternative(f, cxd.e, $$0 -> new dcy((cxd)$$0.a())).validate(dcy::a);
   public static final yn<wa, dcy> b = yn.a(cxd.f, dcy::b, yl.h, dcy::c, ks.c, dcy::d, dcy::new);

   public dcy(cxd $$0) {
      this($$0.f(), 1, ks.a);
   }

   private static DataResult<dcy> a(dcy $$0) {
      return cxh.a(new cxh($$0.c, $$0.d, $$0.e)).map($$1 -> $$0);
   }

   public cxh a(cxh $$0) {
      cxh $$1 = $$0.a(this.c.a(), this.d);
      $$1.b(this.e);
      return $$1;
   }

   public ddh a() {
      return new ddh.f(new cxh(this.c, this.d, this.e));
   }

   public jr<cxd> b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public ks d() {
      return this.e;
   }
}
