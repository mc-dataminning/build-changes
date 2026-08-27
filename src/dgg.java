import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgg extends deh {
   public static final MapCodec<dgg> a = b(dgg::new);
   public static final drz<drx> b = drr.ae;

   @Override
   public MapCodec<? extends dgg> a() {
      return a;
   }

   public dgg(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, drx.b));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      drx $$6 = $$0.c(b);
      if ($$1.o() != it.a.b || $$6 == drx.b != ($$1 == it.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == drx.b && $$1 == it.a && !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dea.a.n();
      }
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      io $$1 = $$0.a();
      dax $$2 = $$0.q();
      return $$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, bso $$3, cto $$4) {
      io $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.n().a(b, drx.a)), 3);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      if ($$0.c(b) != drx.a) {
         return super.a($$0, $$1, $$2);
      } else {
         drb $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == drx.b;
      }
   }

   public static void a(day $$0, drb $$1, io $$2, int $$3) {
      io $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, drx.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, drx.a)), $$3);
   }

   public static drb c(dba $$0, io $$1, drb $$2) {
      return $$2.b(drr.C) ? $$2.a(drr.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public drb a(dax $$0, io $$1, drb $$2, clw $$3) {
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
   public void a(dax $$0, clw $$1, io $$2, drb $$3, @Nullable dog $$4, cto $$5) {
      super.a($$0, $$1, $$2, dea.a.n(), $$4, $$5);
   }

   protected static void b(dax $$0, io $$1, drb $$2, clw $$3) {
      drx $$4 = $$2.c(b);
      if ($$4 == drx.a) {
         io $$5 = $$1.d();
         drb $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == drx.b) {
            drb $$7 = $$6.u().b(emv.c) ? dea.G.n() : dea.a.n();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, ddy.i($$6));
         }
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(drb $$0, io $$1) {
      return ayd.b($$1.u(), $$1.c($$0.c(b) == drx.b ? 0 : 1).v(), $$1.w());
   }
}
