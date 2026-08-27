import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czg extends cxh {
   public static final MapCodec<czg> a = b(czg::new);
   public static final dkn<dkl> b = dkf.ae;

   @Override
   public MapCodec<? extends czg> a() {
      return a;
   }

   public czg(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dkl.b));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      dkl $$6 = $$0.c(b);
      if ($$1.o() != ic.a.b || $$6 == dkl.b != ($$1 == ic.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dkl.b && $$1 == ic.a && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return cxa.a.o();
      }
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      hx $$1 = $$0.a();
      ctx $$2 = $$0.q();
      return $$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      hx $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dkl.a)), 3);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      if ($$0.c(b) != dkl.a) {
         return super.a($$0, $$1, $$2);
      } else {
         djp $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dkl.b;
      }
   }

   public static void a(cty $$0, djp $$1, hx $$2, int $$3) {
      hx $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dkl.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dkl.a)), $$3);
   }

   public static djp c(cua $$0, hx $$1, djp $$2) {
      return $$2.b(dkf.C) ? $$2.a(dkf.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public djp a(ctx $$0, hx $$1, djp $$2, cfq $$3) {
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
   public void a(ctx $$0, cfq $$1, hx $$2, djp $$3, @Nullable dhd $$4, cng $$5) {
      super.a($$0, $$1, $$2, cxa.a.o(), $$4, $$5);
   }

   protected static void b(ctx $$0, hx $$1, djp $$2, cfq $$3) {
      dkl $$4 = $$2.c(b);
      if ($$4 == dkl.a) {
         hx $$5 = $$1.d();
         djp $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dkl.b) {
            djp $$7 = $$6.u().b(efa.c) ? cxa.G.o() : cxa.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, cwy.i($$6));
         }
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public long a(djp $$0, hx $$1) {
      return aup.b($$1.u(), $$1.c($$0.c(b) == dkl.b ? 0 : 1).v(), $$1.w());
   }
}
