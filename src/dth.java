import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dth extends dlr implements dtq {
   public static final MapCodec<dth> a = b(dth::new);
   public static final eay b = eax.C;
   public static final eay c = eax.I;
   public static final eay d = eax.e;
   private static final ffk f = dmf.b(16.0, 0.0, 8.0);
   public static final double e = f.c(ja.a.b);

   @Override
   public MapCodec<dth> a() {
      return a;
   }

   public dth(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, bwf $$3) {
      if ($$0 instanceof arq $$4) {
         arr $$5 = dyr.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dxh.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dxh.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      return f;
   }

   @Override
   protected ffk d_(eah $$0) {
      return f;
   }

   @Override
   protected boolean g_(eah $$0) {
      return true;
   }

   @Nullable
   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyr($$0, $$1);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == ewp.c));
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(c) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, czd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, btf.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return !$$0.C ? dlr.a($$2, dxh.M, ($$0x, $$1x, $$2x, $$3) -> efq.c.a($$0x, $$3.x(), $$3.gr())) : null;
   }
}
