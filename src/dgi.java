import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgi extends dej {
   public static final MapCodec<dgi> a = b(dgi::new);
   public static final dsb<drz> b = drt.ae;

   @Override
   public MapCodec<? extends dgi> a() {
      return a;
   }

   public dgi(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drz.b));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      drz $$6 = $$0.c(b);
      if ($$1.o() != it.a.b || $$6 == drz.b != ($$1 == it.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == drz.b && $$1 == it.a && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dec.a.n();
      }
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      io $$1 = $$0.a();
      daz $$2 = $$0.q();
      return $$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, bsq $$3, ctq $$4) {
      io $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.n().a(b, drz.a)), 3);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      if ($$0.c(b) != drz.a) {
         return super.a($$0, $$1, $$2);
      } else {
         drd $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == drz.b;
      }
   }

   public static void a(dba $$0, drd $$1, io $$2, int $$3) {
      io $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, drz.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, drz.a)), $$3);
   }

   public static drd c(dbc $$0, io $$1, drd $$2) {
      return $$2.b(drt.C) ? $$2.a(drt.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public drd a(daz $$0, io $$1, drd $$2, cly $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eX());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(daz $$0, cly $$1, io $$2, drd $$3, @Nullable doi $$4, ctq $$5) {
      super.a($$0, $$1, $$2, dec.a.n(), $$4, $$5);
   }

   protected static void b(daz $$0, io $$1, drd $$2, cly $$3) {
      drz $$4 = $$2.c(b);
      if ($$4 == drz.a) {
         io $$5 = $$1.d();
         drd $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == drz.b) {
            drd $$7 = $$6.u().b(emx.c) ? dec.G.n() : dec.a.n();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dea.i($$6));
         }
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(drd $$0, io $$1) {
      return ayf.b($$1.u(), $$1.c($$0.c(b) == drz.b ? 0 : 1).v(), $$1.w());
   }
}
