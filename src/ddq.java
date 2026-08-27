import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddq extends dbj {
   public static final MapCodec<ddq> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddn.a.forGetter($$0x -> $$0x.f), u()).apply($$0, ddq::new));
   private final dby f;

   @Override
   public MapCodec<ddq> a() {
      return e;
   }

   protected ddq(dby $$0, doy.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      this.a($$0, (cyy)$$1, $$2);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.n().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dca.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, ekt.c, ekt.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
