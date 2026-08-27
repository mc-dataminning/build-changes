import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyh extends cwi {
   public static final MapCodec<cyh> a = b(cyh::new);
   public static final djn<djl> b = djf.ae;

   @Override
   public MapCodec<? extends cyh> a() {
      return a;
   }

   public cyh(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, djl.b));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      djl $$6 = $$0.c(b);
      if ($$1.o() != ia.a.b || $$6 == djl.b != ($$1 == ia.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == djl.b && $$1 == ia.a && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return cwb.a.o();
      }
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      hv $$1 = $$0.a();
      csy $$2 = $$0.q();
      return $$1.v() < $$2.ak() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, blv $$3, cmh $$4) {
      hv $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, djl.a)), 3);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      if ($$0.c(b) != djl.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dip $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == djl.b;
      }
   }

   public static void a(csz $$0, dip $$1, hv $$2, int $$3) {
      hv $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, djl.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, djl.a)), $$3);
   }

   public static dip c(ctb $$0, hv $$1, dip $$2) {
      return $$2.b(djf.C) ? $$2.a(djf.C, Boolean.valueOf($$0.y($$1))) : $$2;
   }

   @Override
   public dip a(csy $$0, hv $$1, dip $$2, cer $$3) {
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
   public void a(csy $$0, cer $$1, hv $$2, dip $$3, @Nullable dgd $$4, cmh $$5) {
      super.a($$0, $$1, $$2, cwb.a.o(), $$4, $$5);
   }

   protected static void b(csy $$0, hv $$1, dip $$2, cer $$3) {
      djl $$4 = $$2.c(b);
      if ($$4 == djl.a) {
         hv $$5 = $$1.d();
         dip $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == djl.b) {
            dip $$7 = $$6.u().b(eea.c) ? cwb.G.o() : cwb.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, cvz.i($$6));
         }
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public long a(dip $$0, hv $$1) {
      return aty.b($$1.u(), $$1.c($$0.c(b) == djl.b ? 0 : 1).v(), $$1.w());
   }
}
