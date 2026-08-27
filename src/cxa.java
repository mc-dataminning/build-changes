import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxa extends cvc {
   public static final MapCodec<cxa> a = b(cxa::new);
   public static final dhu<dhs> b = dhm.ae;

   @Override
   public MapCodec<? extends cxa> a() {
      return a;
   }

   public cxa(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dhs.b));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      dhs $$6 = $$0.c(b);
      if ($$1.o() != hx.a.b || $$6 == dhs.b != ($$1 == hx.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dhs.b && $$1 == hx.a && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return cuv.a.o();
      }
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      ht $$1 = $$0.a();
      crs $$2 = $$0.q();
      return $$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
      ht $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dhs.a)), 3);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      if ($$0.c(b) != dhs.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dgw $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dhs.b;
      }
   }

   public static void a(crt $$0, dgw $$1, ht $$2, int $$3) {
      ht $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dhs.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dhs.a)), $$3);
   }

   public static dgw c(crv $$0, ht $$1, dgw $$2) {
      return $$2.b(dhm.C) ? $$2.a(dhm.C, Boolean.valueOf($$0.y($$1))) : $$2;
   }

   @Override
   public dgw a(crs $$0, ht $$1, dgw $$2, cdm $$3) {
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
   public void a(crs $$0, cdm $$1, ht $$2, dgw $$3, @Nullable der $$4, clb $$5) {
      super.a($$0, $$1, $$2, cuv.a.o(), $$4, $$5);
   }

   protected static void b(crs $$0, ht $$1, dgw $$2, cdm $$3) {
      dhs $$4 = $$2.c(b);
      if ($$4 == dhs.a) {
         ht $$5 = $$1.d();
         dgw $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dhs.b) {
            dgw $$7 = $$6.u().b(ech.c) ? cuv.G.o() : cuv.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, cut.i($$6));
         }
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Override
   public long a(dgw $$0, ht $$1) {
      return ati.b($$1.u(), $$1.c($$0.c(b) == dhs.b ? 0 : 1).v(), $$1.w());
   }
}
