import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlb extends dlr {
   public static final eay a = eax.A;
   private final dtr.a b;

   public dlb(dtr.a $$0, eag.d $$1) {
      super($$1);
      this.b = $$0;
      this.l(this.C.b().b(a, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends dlb> a();

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      if ($$0.C) {
         boolean $$3 = $$1.a(dmh.hp) || $$1.a(dmh.hq) || $$1.a(dmh.hr) || $$1.a(dmh.hs);
         if ($$3) {
            return a($$2, dxh.q, dyv::a);
         }
      }

      return null;
   }

   public dtr.a b() {
      return this.b;
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(a);
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(a, Boolean.valueOf($$0.q().D($$0.a())));
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(a)) {
            $$1.a($$2, $$0.b(a, Boolean.valueOf($$6)), 2);
         }
      }
   }
}
