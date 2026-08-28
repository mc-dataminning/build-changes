import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqn extends dlr {
   public static final MapCodec<dqn> a = b(dqn::new);
   public static final eay b = eax.q;

   @Override
   public MapCodec<dqn> a() {
      return a;
   }

   protected dqn(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, @Nullable bxe $$3, czd $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dbl $$5 = $$4.a(kj.aa, dbl.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dyk $$5) {
         $$5.s();
         return bud.a;
      } else {
         return bud.e;
      }
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      if ($$1.c(b)) {
         return bud.f;
      } else {
         czd $$7 = $$4.b($$5);
         bud $$8 = czi.a($$2, $$3, $$7, $$4);
         return (bud)(!$$8.a() ? bud.f : $$8);
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      btz.a($$0, $$1, $$2);
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyk($$0, $$1);
   }

   @Override
   public boolean f_(eah $$0) {
      return true;
   }

   @Override
   public int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      if ($$1.c_($$2) instanceof dyk $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return $$1.c_($$2) instanceof dyk $$3 ? $$3.u() : 0;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return $$1.c(b) ? a($$2, dxh.e, dyk::a) : null;
   }
}
