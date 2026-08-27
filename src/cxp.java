import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxp extends cut {
   public static final MapCodec<cxp> a = b(cxp::new);
   public static final dhw b = dhm.aQ;
   protected static final ekb c = cut.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<cxp> a() {
      return a;
   }

   protected cxp(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$1 == hx.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      dgw $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cxr || $$3.b() instanceof dgo;
   }

   @Override
   public dgw a(cnj $$0) {
      return !this.o().a((crv)$$0.q(), $$0.a()) ? cuv.j.o() : super.a($$0);
   }

   @Override
   public boolean g_(dgw $$0) {
      return true;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return c;
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      int $$4 = $$0.c(b);
      if (!a((crv)$$1, $$2) && !$$1.q($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cqy)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(crs $$0, dgw $$1, ht $$2, bki $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bky && ($$3 instanceof cdm || $$0.X().b(cro.c)) && $$3.df() * $$3.df() * $$3.dg() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bki $$0, dgw $$1, crs $$2, ht $$3) {
      dgw $$4 = a($$1, cuv.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dlg.c, $$3, dlg.a.a($$0, $$4));
   }

   private static boolean a(cqy $$0, ht $$1) {
      return $$0.a_($$1.c()).a(arc.cp);
   }

   private static boolean a(crv $$0, ht $$1) {
      for (ht $$2 : ht.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(arh.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
