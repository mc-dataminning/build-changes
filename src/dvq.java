import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvq extends dlr {
   public static final MapCodec<dvq> a = b(dvq::new);
   public static final ebk<dzt> b = eax.bC;
   public static final ebf<ja> c = dqg.e;
   public static final eay d = eax.bE;

   @Override
   public MapCodec<dvq> a() {
      return a;
   }

   public dvq(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, ja.c).b(b, dzt.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      if (!$$0.f() && $$1.c(b) == dzt.b) {
         if ($$2 instanceof arq $$7) {
            if (!($$7.c_($$3) instanceof dzo $$8)) {
               return bud.f;
            }

            dzo.b.a($$7, $$3, $$1, $$8.f(), $$8.a(), $$8.c(), $$4, $$0);
         }

         return bud.b;
      } else {
         return bud.f;
      }
   }

   @Nullable
   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dzo($$0, $$1);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c, b, d);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return $$0 instanceof arq $$3
         ? a($$2, dxh.S, ($$1x, $$2x, $$3x, $$4) -> dzo.b.a($$3, $$2x, $$3x, $$4.f(), $$4.a(), $$4.c()))
         : a($$2, dxh.S, ($$0x, $$1x, $$2x, $$3x) -> dzo.a.a($$0x, $$1x, $$2x, $$3x.d(), $$3x.c()));
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(c, $$0.g().g());
   }

   @Override
   public eah a(eah $$0, dsz $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   public eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
