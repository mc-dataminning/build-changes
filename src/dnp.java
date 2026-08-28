import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dnp extends dlg {
   public static final MapCodec<dnp> a = b(dnp::new);
   public static final eam<ja.a> b = eae.K;
   public static final eam<eai> c = eae.bD;
   public static final eaf d = eae.w;

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   protected dnp(dzn.d $$0) {
      super($$0);
      this.l(this.m().b(b, ja.a.b).b(c, eai.a).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      if ($$0.C) {
         return null;
      } else {
         return $$1.c(c) != eai.a ? a($$2, dwp.k, dxd::a) : null;
      }
   }

   public static boolean a(dip $$0) {
      return $$0.X();
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if (a($$1)) {
         if ($$0.c(c) != eai.a) {
            if ($$3.a(16) == 0 && a($$1, $$2)) {
               $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awl.gB, awm.e, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      $$2.a($$3, this, 1);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      dzo $$4 = d($$0, $$1, $$2);
      if ($$4 != $$0) {
         $$1.a($$2, $$4, 3);
      }
   }

   private static dzo d(dzo $$0, dip $$1, iu $$2) {
      boolean $$3 = b($$0, $$1, $$2);
      boolean $$4 = $$0.c(c) == eai.a;
      return $$3 && $$4 ? $$0.b(c, a($$1) ? eai.c : eai.b) : $$0;
   }

   public static boolean b(dzo $$0, dis $$1, iu $$2) {
      ja.a $$3 = $$0.c(b);

      for (ja $$4 : $$3.g()) {
         dzo $$5 = $$1.a_($$2.a($$4));
         if (!$$5.a(axa.w) || $$5.c(b) != $$3) {
            return false;
         }
      }

      return true;
   }

   private static boolean a(diq $$0, iu $$1) {
      for (ja $$2 : ja.values()) {
         iu $$3 = $$1.a($$2);
         dzo $$4 = $$0.a_($$3);
         if (!$$4.a(axa.w)) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      return d(this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return dsl.b($$0, $$1);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      btu.a($$0, $$1, $$2);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, dii $$3, BiConsumer<cys, iu> $$4) {
      if ($$1.c_($$2) instanceof dxd $$5 && $$3 instanceof djf $$6 && $$3.b().a()) {
         $$5.a($$6.k());
         if ($$3.c() instanceof cqs $$7 && $$3.b().a()) {
            this.a($$7, $$0, $$1, $$2);
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dzo a(dip $$0, iu $$1, dzo $$2, cqs $$3) {
      if ($$0.c_($$1) instanceof dxd $$4) {
         $$4.a($$3.dW().a($$3));
         this.a($$3, $$2, $$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   private void a(cqs $$0, dzo $$1, dip $$2, iu $$3) {
      if (!$$0.gk() && !$$0.U_() && $$1.c(d) && $$2 instanceof aro $$4) {
         this.a($$4, $$3, $$2.A.a(20, 24));
      }
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      if ($$0.c(c) == eai.a) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dxd $$3 ? $$3.d() : 0;
      }
   }
}
