import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dba extends czb {
   public static final MapCodec<dba> a = b(dba::new);
   public static final dmh<dmf> b = dlz.ae;

   @Override
   public MapCodec<? extends dba> a() {
      return a;
   }

   public dba(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dmf.b));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      dmf $$6 = $$0.c(b);
      if ($$1.o() != ie.a.b || $$6 == dmf.b != ($$1 == ie.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dmf.b && $$1 == ie.a && !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return cyu.a.o();
      }
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      hz $$1 = $$0.a();
      cvr $$2 = $$0.q();
      return $$1.v() < $$2.ak() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      hz $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dmf.a)), 3);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      if ($$0.c(b) != dmf.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dlj $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dmf.b;
      }
   }

   public static void a(cvs $$0, dlj $$1, hz $$2, int $$3) {
      hz $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dmf.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dmf.a)), $$3);
   }

   public static dlj c(cvu $$0, hz $$1, dlj $$2) {
      return $$2.b(dlz.C) ? $$2.a(dlz.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dlj a(cvr $$0, hz $$1, dlj $$2, chl $$3) {
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
   public void a(cvr $$0, chl $$1, hz $$2, dlj $$3, @Nullable dix $$4, cpd $$5) {
      super.a($$0, $$1, $$2, cyu.a.o(), $$4, $$5);
   }

   protected static void b(cvr $$0, hz $$1, dlj $$2, chl $$3) {
      dmf $$4 = $$2.c(b);
      if ($$4 == dmf.a) {
         hz $$5 = $$1.d();
         dlj $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dmf.b) {
            dlj $$7 = $$6.u().b(egx.c) ? cyu.G.o() : cyu.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, cys.i($$6));
         }
      }
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dlj $$0, hz $$1) {
      return awi.b($$1.u(), $$1.c($$0.c(b) == dmf.b ? 0 : 1).v(), $$1.w());
   }
}
