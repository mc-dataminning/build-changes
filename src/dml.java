import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dml extends dhv {
   public static final MapCodec<dml> a = b(dml::new);
   public static final dwf b = dwe.n;

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   protected dml(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, @Nullable bve $$3, cwf $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cyo $$5 = $$4.a(ku.Y, cyo.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dtu $$5) {
         $$5.t();
         return bsh.a;
      } else {
         return bsh.e;
      }
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      if ($$1.c(b)) {
         return bsh.f;
      } else {
         cwf $$7 = $$4.b($$5);
         bsh $$8 = cwk.a($$2, $$3, $$7, $$4);
         return (bsh)(!$$8.a() ? bsh.f : $$8);
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dtu $$5) {
            $$5.t();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dtu($$0, $$1);
   }

   @Override
   public boolean f_(dvo $$0) {
      return true;
   }

   @Override
   public int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      if ($$1.c_($$2) instanceof dtu $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return $$1.c_($$2) instanceof dtu $$3 ? $$3.u() : 0;
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return $$1.c(b) ? a($$2, dst.e, dtu::a) : null;
   }
}
