import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyx extends cwy {
   public static final MapCodec<cyx> a = b(cyx::new);
   public static final dke<dkc> b = djw.ae;

   @Override
   public MapCodec<? extends cyx> a() {
      return a;
   }

   public cyx(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dkc.b));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      dkc $$6 = $$0.c(b);
      if ($$1.o() != ic.a.b || $$6 == dkc.b != ($$1 == ic.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dkc.b && $$1 == ic.a && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return cwr.a.o();
      }
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      hx $$1 = $$0.a();
      cto $$2 = $$0.q();
      return $$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
      hx $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dkc.a)), 3);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      if ($$0.c(b) != dkc.a) {
         return super.a($$0, $$1, $$2);
      } else {
         djg $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dkc.b;
      }
   }

   public static void a(ctp $$0, djg $$1, hx $$2, int $$3) {
      hx $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dkc.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dkc.a)), $$3);
   }

   public static djg c(ctr $$0, hx $$1, djg $$2) {
      return $$2.b(djw.C) ? $$2.a(djw.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public djg a(cto $$0, hx $$1, djg $$2, cfh $$3) {
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
   public void a(cto $$0, cfh $$1, hx $$2, djg $$3, @Nullable dgu $$4, cmx $$5) {
      super.a($$0, $$1, $$2, cwr.a.o(), $$4, $$5);
   }

   protected static void b(cto $$0, hx $$1, djg $$2, cfh $$3) {
      dkc $$4 = $$2.c(b);
      if ($$4 == dkc.a) {
         hx $$5 = $$1.d();
         djg $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dkc.b) {
            djg $$7 = $$6.u().b(eer.c) ? cwr.G.o() : cwr.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, cwp.i($$6));
         }
      }
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public long a(djg $$0, hx $$1) {
      return aun.b($$1.u(), $$1.c($$0.c(b) == dkc.b ? 0 : 1).v(), $$1.w());
   }
}
