import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dck extends dal {
   public static final MapCodec<dck> a = b(dck::new);
   public static final dnz<dnx> b = dnr.ae;

   @Override
   public MapCodec<? extends dck> a() {
      return a;
   }

   public dck(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dnx.b));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      dnx $$6 = $$0.c(b);
      if ($$1.o() != ih.a.b || $$6 == dnx.b != ($$1 == ih.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dnx.b && $$1 == ih.a && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dae.a.o();
      }
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      ib $$1 = $$0.a();
      cxb $$2 = $$0.q();
      return $$1.v() < $$2.ak() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      ib $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dnx.a)), 3);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      if ($$0.c(b) != dnx.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dnb $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dnx.b;
      }
   }

   public static void a(cxc $$0, dnb $$1, ib $$2, int $$3) {
      ib $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dnx.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dnx.a)), $$3);
   }

   public static dnb c(cxe $$0, ib $$1, dnb $$2) {
      return $$2.b(dnr.C) ? $$2.a(dnr.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dnb a(cxb $$0, ib $$1, dnb $$2, ciu $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eU());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cxb $$0, ciu $$1, ib $$2, dnb $$3, @Nullable dki $$4, cqm $$5) {
      super.a($$0, $$1, $$2, dae.a.o(), $$4, $$5);
   }

   protected static void b(cxb $$0, ib $$1, dnb $$2, ciu $$3) {
      dnx $$4 = $$2.c(b);
      if ($$4 == dnx.a) {
         ib $$5 = $$1.d();
         dnb $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dnx.b) {
            dnb $$7 = $$6.u().b(eiq.c) ? dae.G.o() : dae.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dac.i($$6));
         }
      }
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dnb $$0, ib $$1) {
      return aww.b($$1.u(), $$1.c($$0.c(b) == dnx.b ? 0 : 1).v(), $$1.w());
   }
}
