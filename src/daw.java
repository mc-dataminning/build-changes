import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class daw extends cyx {
   public static final MapCodec<daw> a = b(daw::new);
   public static final dmd<dmb> b = dlv.ae;

   @Override
   public MapCodec<? extends daw> a() {
      return a;
   }

   public daw(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dmb.b));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      dmb $$6 = $$0.c(b);
      if ($$1.o() != ie.a.b || $$6 == dmb.b != ($$1 == ie.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dmb.b && $$1 == ie.a && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return cyq.a.o();
      }
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      hz $$1 = $$0.a();
      cvn $$2 = $$0.q();
      return $$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bog $$3, coz $$4) {
      hz $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dmb.a)), 3);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      if ($$0.c(b) != dmb.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dlf $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dmb.b;
      }
   }

   public static void a(cvo $$0, dlf $$1, hz $$2, int $$3) {
      hz $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dmb.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dmb.a)), $$3);
   }

   public static dlf c(cvq $$0, hz $$1, dlf $$2) {
      return $$2.b(dlv.C) ? $$2.a(dlv.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dlf a(cvn $$0, hz $$1, dlf $$2, chh $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eT());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cvn $$0, chh $$1, hz $$2, dlf $$3, @Nullable dit $$4, coz $$5) {
      super.a($$0, $$1, $$2, cyq.a.o(), $$4, $$5);
   }

   protected static void b(cvn $$0, hz $$1, dlf $$2, chh $$3) {
      dmb $$4 = $$2.c(b);
      if ($$4 == dmb.a) {
         hz $$5 = $$1.d();
         dlf $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dmb.b) {
            dlf $$7 = $$6.u().b(egq.c) ? cyq.G.o() : cyq.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, cyo.i($$6));
         }
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dlf $$0, hz $$1) {
      return awh.b($$1.u(), $$1.c($$0.c(b) == dmb.b ? 0 : 1).v(), $$1.w());
   }
}
