import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dju extends dhv {
   public static final MapCodec<dju> a = b(dju::new);
   public static final dvq<dvo> b = dvi.ae;

   @Override
   public MapCodec<? extends dju> a() {
      return a;
   }

   public dju(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dvo.b));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      dvo $$6 = $$0.c(b);
      if ($$1.o() != jk.a.b || $$6 == dvo.b != ($$1 == jk.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dvo.b && $$1 == jk.a && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dho.a.n();
      }
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      jf $$1 = $$0.a();
      dej $$2 = $$0.q();
      return $$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, bun $$3, cvs $$4) {
      jf $$5 = $$1.d();
      $$0.a($$5, c($$0, $$5, this.n().b(b, dvo.a)), 3);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      if ($$0.c(b) != dvo.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dus $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dvo.b;
      }
   }

   public static void a(dek $$0, dus $$1, jf $$2, int $$3) {
      jf $$4 = $$2.d();
      $$0.a($$2, c($$0, $$2, $$1.b(b, dvo.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.b(b, dvo.a)), $$3);
   }

   public static dus c(dem $$0, jf $$1, dus $$2) {
      return $$2.b(dvi.C) ? $$2.b(dvi.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dus a(dej $$0, jf $$1, dus $$2, cnx $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eW());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dej $$0, cnx $$1, jf $$2, dus $$3, @Nullable drv $$4, cvs $$5) {
      super.a($$0, $$1, $$2, dho.a.n(), $$4, $$5);
   }

   protected static void b(dej $$0, jf $$1, dus $$2, cnx $$3) {
      dvo $$4 = $$2.c(b);
      if ($$4 == dvo.a) {
         jf $$5 = $$1.e();
         dus $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dvo.b) {
            dus $$7 = $$6.y().b(equ.c) ? dho.G.n() : dho.a.n();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dhm.j($$6));
         }
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dus $$0, jf $$1) {
      return azf.b($$1.u(), $$1.c($$0.c(b) == dvo.b ? 0 : 1).v(), $$1.w());
   }
}
