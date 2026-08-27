import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvi extends ctl {
   public static final MapCodec<cvi> a = b(cvi::new);
   public static final dgb<dfz> b = dft.ae;

   @Override
   public MapCodec<? extends cvi> a() {
      return a;
   }

   public cvi(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dfz.b));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      dfz $$6 = $$0.c(b);
      if ($$1.o() != ha.a.b || $$6 == dfz.b != ($$1 == ha.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dfz.b && $$1 == ha.a && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return cte.a.o();
      }
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      gw $$1 = $$0.a();
      cqb $$2 = $$0.q();
      return $$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      gw $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dfz.a)), 3);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      if ($$0.c(b) != dfz.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dfd $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dfz.b;
      }
   }

   public static void a(cqc $$0, dfd $$1, gw $$2, int $$3) {
      gw $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dfz.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dfz.a)), $$3);
   }

   public static dfd c(cqe $$0, gw $$1, dfd $$2) {
      return $$2.b(dft.C) ? $$2.a(dft.C, Boolean.valueOf($$0.y($$1))) : $$2;
   }

   @Override
   public dfd a(cqb $$0, gw $$1, dfd $$2, cca $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eS());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cqb $$0, cca $$1, gw $$2, dfd $$3, @Nullable dcz $$4, cjl $$5) {
      super.a($$0, $$1, $$2, cte.a.o(), $$4, $$5);
   }

   protected static void b(cqb $$0, gw $$1, dfd $$2, cca $$3) {
      dfz $$4 = $$2.c(b);
      if ($$4 == dfz.a) {
         gw $$5 = $$1.d();
         dfd $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dfz.b) {
            dfd $$7 = $$6.u().b(eah.c) ? cte.G.o() : cte.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, ctc.i($$6));
         }
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   @Override
   public long a(dfd $$0, gw $$1) {
      return asb.b($$1.u(), $$1.c($$0.c(b) == dfz.b ? 0 : 1).v(), $$1.w());
   }
}
