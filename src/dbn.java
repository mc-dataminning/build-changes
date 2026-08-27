import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbn extends czo {
   public static final MapCodec<dbn> a = b(dbn::new);
   public static final dnc<dna> b = dmu.ae;

   @Override
   public MapCodec<? extends dbn> a() {
      return a;
   }

   public dbn(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dna.b));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      dna $$6 = $$0.c(b);
      if ($$1.o() != ih.a.b || $$6 == dna.b != ($$1 == ih.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dna.b && $$1 == ih.a && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return czh.a.o();
      }
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ib $$1 = $$0.a();
      cwe $$2 = $$0.q();
      return $$1.v() < $$2.ak() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      ib $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dna.a)), 3);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      if ($$0.c(b) != dna.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dme $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dna.b;
      }
   }

   public static void a(cwf $$0, dme $$1, ib $$2, int $$3) {
      ib $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dna.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dna.a)), $$3);
   }

   public static dme c(cwh $$0, ib $$1, dme $$2) {
      return $$2.b(dmu.C) ? $$2.a(dmu.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dme a(cwe $$0, ib $$1, dme $$2, cia $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eR());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cwe $$0, cia $$1, ib $$2, dme $$3, @Nullable djl $$4, cpq $$5) {
      super.a($$0, $$1, $$2, czh.a.o(), $$4, $$5);
   }

   protected static void b(cwe $$0, ib $$1, dme $$2, cia $$3) {
      dna $$4 = $$2.c(b);
      if ($$4 == dna.a) {
         ib $$5 = $$1.d();
         dme $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dna.b) {
            dme $$7 = $$6.u().b(ehs.c) ? czh.G.o() : czh.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, czf.i($$6));
         }
      }
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dme $$0, ib $$1) {
      return awm.b($$1.u(), $$1.c($$0.c(b) == dna.b ? 0 : 1).v(), $$1.w());
   }
}
