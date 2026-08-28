import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dov extends dvy {
   public static final MapCodec<dov> a = b(dov::new);
   public static final ebm<ebk> b = ebe.ah;

   @Override
   public MapCodec<? extends dov> a() {
      return a;
   }

   public dov(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ebk.b));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      ebk $$8 = $$0.c(b);
      if ($$4.o() != jb.a.b || $$8 == ebk.b != ($$4 == jb.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == ebk.b && $$4 == jb.a && !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dmo.a.m();
      }
   }

   @Nullable
   @Override
   public eao a(ddd $$0) {
      iv $$1 = $$0.a();
      djh $$2 = $$0.q();
      return $$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, bxj $$3, czk $$4) {
      iv $$5 = $$1.d();
      $$0.a($$5, b($$0, $$5, this.m().b(b, ebk.a)), 3);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      if ($$0.c(b) != ebk.a) {
         return super.a($$0, $$1, $$2);
      } else {
         eao $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == ebk.b;
      }
   }

   public static void a(dji $$0, eao $$1, iv $$2, int $$3) {
      iv $$4 = $$2.d();
      $$0.a($$2, b($$0, $$2, $$1.b(b, ebk.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.b(b, ebk.a)), $$3);
   }

   public static eao b(djk $$0, iv $$1, eao $$2) {
      return $$2.b(ebe.I) ? $$2.b(ebe.I, Boolean.valueOf($$0.A($$1))) : $$2;
   }

   @Override
   public eao a(djh $$0, iv $$1, eao $$2, crj $$3) {
      if (!$$0.C) {
         if ($$3.gk()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.fa());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djh $$0, crj $$1, iv $$2, eao $$3, @Nullable dxm $$4, czk $$5) {
      super.a($$0, $$1, $$2, dmo.a.m(), $$4, $$5);
   }

   protected static void b(djh $$0, iv $$1, eao $$2, crj $$3) {
      ebk $$4 = $$2.c(b);
      if ($$4 == ebk.a) {
         iv $$5 = $$1.e();
         eao $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == ebk.b) {
            eao $$7 = $$6.y().b(eww.c) ? dmo.J.m() : dmo.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dmm.j($$6));
         }
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(eao $$0, iv $$1) {
      return azm.b($$1.u(), $$1.c($$0.c(b) == ebk.b ? 0 : 1).v(), $$1.w());
   }
}
