import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyy extends cwz {
   public static final MapCodec<cyy> a = b(cyy::new);
   public static final dkf<dkd> b = djx.ae;

   @Override
   public MapCodec<? extends cyy> a() {
      return a;
   }

   public cyy(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dkd.b));
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      dkd $$6 = $$0.c(b);
      if ($$1.o() != ic.a.b || $$6 == dkd.b != ($$1 == ic.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dkd.b && $$1 == ic.a && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return cws.a.o();
      }
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      hx $$1 = $$0.a();
      ctp $$2 = $$0.q();
      return $$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(ctp $$0, hx $$1, djh $$2, bml $$3, cmy $$4) {
      hx $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dkd.a)), 3);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      if ($$0.c(b) != dkd.a) {
         return super.a($$0, $$1, $$2);
      } else {
         djh $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dkd.b;
      }
   }

   public static void a(ctq $$0, djh $$1, hx $$2, int $$3) {
      hx $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dkd.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dkd.a)), $$3);
   }

   public static djh c(cts $$0, hx $$1, djh $$2) {
      return $$2.b(djx.C) ? $$2.a(djx.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public djh a(ctp $$0, hx $$1, djh $$2, cfi $$3) {
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
   public void a(ctp $$0, cfi $$1, hx $$2, djh $$3, @Nullable dgv $$4, cmy $$5) {
      super.a($$0, $$1, $$2, cws.a.o(), $$4, $$5);
   }

   protected static void b(ctp $$0, hx $$1, djh $$2, cfi $$3) {
      dkd $$4 = $$2.c(b);
      if ($$4 == dkd.a) {
         hx $$5 = $$1.d();
         djh $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dkd.b) {
            djh $$7 = $$6.u().b(ees.c) ? cws.G.o() : cws.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, cwq.i($$6));
         }
      }
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public long a(djh $$0, hx $$1) {
      return auo.b($$1.u(), $$1.c($$0.c(b) == dkd.b ? 0 : 1).v(), $$1.w());
   }
}
