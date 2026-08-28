import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dol extends djn implements dqt {
   public static final MapCodec<dol> a = b(dol::new);
   public static final dxp b = dxo.J;

   @Override
   public MapCodec<dol> a() {
      return a;
   }

   protected dol(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean b(dwy $$0, dwy $$1, jn $$2) {
      return $$1.a(djp.ag) && $$2.o() == jn.a.b;
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etb.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(b) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }
}
