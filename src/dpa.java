import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpa extends dkg {
   public static final MapCodec<dpa> a = b(dpa::new);
   public static final dzd b = dzc.q;

   @Override
   public MapCodec<dpa> a() {
      return a;
   }

   protected dpa(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, @Nullable bwr $$3, cxy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dae $$5 = $$4.a(kx.aa, dae.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.b(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof dwq $$5) {
         $$5.s();
         return btq.a;
      } else {
         return btq.e;
      }
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      if ($$1.c(b)) {
         return btq.f;
      } else {
         cxy $$7 = $$4.b($$5);
         btq $$8 = cyd.a($$2, $$3, $$7, $$4);
         return (btq)(!$$8.a() ? btq.f : $$8);
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      btm.a($$0, $$1, $$2);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwq($$0, $$1);
   }

   @Override
   public boolean f_(dym $$0) {
      return true;
   }

   @Override
   public int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      if ($$1.c_($$2) instanceof dwq $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return $$1.c_($$2) instanceof dwq $$3 ? $$3.u() : 0;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return $$1.c(b) ? a($$2, dvn.e, dwq::a) : null;
   }
}
