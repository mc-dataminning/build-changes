import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doq extends djx {
   public static final MapCodec<doq> a = b(doq::new);
   public static final dyl b = dyk.n;

   @Override
   public MapCodec<doq> a() {
      return a;
   }

   protected doq(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, @Nullable bwf $$3, cxo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      czx $$5 = $$4.a(ku.Y, czx.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dwa $$5) {
         $$5.t();
         return bti.a;
      } else {
         return bti.e;
      }
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      if ($$1.c(b)) {
         return bti.f;
      } else {
         cxo $$7 = $$4.b($$5);
         bti $$8 = cxt.a($$2, $$3, $$7, $$4);
         return (bti)(!$$8.a() ? bti.f : $$8);
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dwa $$5) {
            $$5.t();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dwa($$0, $$1);
   }

   @Override
   public boolean f_(dxu $$0) {
      return true;
   }

   @Override
   public int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      if ($$1.c_($$2) instanceof dwa $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return $$1.c_($$2) instanceof dwa $$3 ? $$3.u() : 0;
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return $$1.c(b) ? a($$2, duy.e, dwa::a) : null;
   }
}
