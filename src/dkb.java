import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkb extends dhu {
   public static final MapCodec<dkb> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djy.a.forGetter($$0x -> $$0x.f), t()).apply($$0, dkb::new));
   private final dij f;

   @Override
   public MapCodec<dkb> a() {
      return e;
   }

   protected dkb(dij $$0, dvn.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(d, Boolean.valueOf(false)).b(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$4.g() == $$0.c(c) && !$$0.a($$1, $$3)) {
         return dil.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, erp.c, erp.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
