import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drw extends dna {
   public static final MapCodec<drw> a = b(drw::new);
   public static final ech b = ecg.q;

   @Override
   public MapCodec<drw> a() {
      return a;
   }

   protected drw(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, @Nullable byf $$3, dak $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dcs $$5 = $$4.a(kl.aa, dcs.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dzt $$5) {
         $$5.s();
         return bvc.a;
      } else {
         return bvc.e;
      }
   }

   @Override
   protected bvc a(dak $$0, ebq $$1, dkj $$2, iw $$3, csi $$4, bvb $$5, ffy $$6) {
      if ($$1.c(b)) {
         return bvc.f;
      } else {
         dak $$7 = $$4.b($$5);
         bvc $$8 = dap.a($$2, $$3, $$7, $$4);
         return (bvc)(!$$8.a() ? bvc.f : $$8);
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      buy.a($$0, $$1, $$2);
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dzt($$0, $$1);
   }

   @Override
   public boolean f_(ebq $$0) {
      return true;
   }

   @Override
   public int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      if ($$1.c_($$2) instanceof dzt $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return $$1.c_($$2) instanceof dzt $$3 ? $$3.u() : 0;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return $$1.c(b) ? a($$2, dyq.e, dzt::a) : null;
   }
}
