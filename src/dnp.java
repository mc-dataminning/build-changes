import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnp extends diw {
   public static final MapCodec<dnp> a = b(dnp::new);
   public static final dxm b = dxl.r;

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   protected dnp(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, @Nullable bvf $$3, cwn $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cyw $$5 = $$4.a(kv.Y, cyw.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dvb $$5) {
         $$5.s();
         return bsi.a;
      } else {
         return bsi.e;
      }
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      if ($$1.c(b)) {
         return bsi.f;
      } else {
         cwn $$7 = $$4.b($$5);
         bsi $$8 = cws.a($$2, $$3, $$7, $$4);
         return (bsi)(!$$8.a() ? bsi.f : $$8);
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dvb $$5) {
            $$5.s();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvb($$0, $$1);
   }

   @Override
   public boolean f_(dwv $$0) {
      return true;
   }

   @Override
   public int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      if ($$1.c_($$2) instanceof dvb $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return $$1.c_($$2) instanceof dvb $$3 ? $$3.u() : 0;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return $$1.c(b) ? a($$2, dtz.e, dvb::a) : null;
   }
}
