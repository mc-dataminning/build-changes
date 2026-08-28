import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqu extends dly {
   public static final MapCodec<dqu> a = b(dqu::new);
   public static final ebf b = ebe.q;

   @Override
   public MapCodec<dqu> a() {
      return a;
   }

   protected dqu(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, @Nullable bxj $$3, czk $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dbs $$5 = $$4.a(kk.aa, dbs.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dyr $$5) {
         $$5.s();
         return bug.a;
      } else {
         return bug.e;
      }
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if ($$1.c(b)) {
         return bug.f;
      } else {
         czk $$7 = $$4.b($$5);
         bug $$8 = czp.a($$2, $$3, $$7, $$4);
         return (bug)(!$$8.a() ? bug.f : $$8);
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dyr($$0, $$1);
   }

   @Override
   public boolean f_(eao $$0) {
      return true;
   }

   @Override
   public int a(eao $$0, din $$1, iv $$2, jb $$3) {
      if ($$1.c_($$2) instanceof dyr $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return $$1.c_($$2) instanceof dyr $$3 ? $$3.u() : 0;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dxm> dxn<T> a(djh $$0, eao $$1, dxo<T> $$2) {
      return $$1.c(b) ? a($$2, dxo.e, dyr::a) : null;
   }
}
