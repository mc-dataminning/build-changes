import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkb extends dfk {
   public static final MapCodec<dkb> a = b(dkb::new);
   public static final dtt b = dts.n;

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   protected dkb(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, @Nullable btn $$3, cuq $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      cxh $$5 = $$4.a(kq.O, cxh.a);
      if ($$5.a("RecordItem")) {
         $$0.a($$1, $$2.a(b, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if ($$0.c(b) && $$1.c_($$2) instanceof drj $$5) {
         $$5.l();
         return bqr.a($$1.B);
      } else {
         return bqr.e;
      }
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, eww $$6) {
      if ($$1.c(b)) {
         return bqt.d;
      } else {
         cuq $$7 = $$4.b($$5);
         bqt $$8 = cuu.a($$2, $$3, $$7, $$4);
         return !$$8.a() ? bqt.d : $$8;
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof drj $$5) {
            $$5.l();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drj($$0, $$1);
   }

   @Override
   public boolean e_(dtc $$0) {
      return true;
   }

   @Override
   public int a(dtc $$0, dcc $$1, jd $$2, ji $$3) {
      if ($$1.c_($$2) instanceof drj $$4 && $$4.j().a()) {
         return 15;
      }

      return 0;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return $$1.c_($$2) instanceof drj $$3 ? $$3.u() : 0;
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return $$1.c(b) ? a($$2, dqj.e, drj::a) : null;
   }
}
