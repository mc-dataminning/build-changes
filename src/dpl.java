import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpl extends dwo {
   public static final MapCodec<dpl> a = b(dpl::new);
   public static final ecc<eca> b = ebu.ah;

   @Override
   public MapCodec<? extends dpl> a() {
      return a;
   }

   public dpl(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, eca.b));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      eca $$8 = $$0.c(b);
      if ($$4.o() != jb.a.b || $$8 == eca.b != ($$4 == jb.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == eca.b && $$4 == jb.a && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dne.a.m();
      }
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      iv $$1 = $$0.a();
      djx $$2 = $$0.q();
      return $$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bxu $$3, czy $$4) {
      iv $$5 = $$1.d();
      $$0.a($$5, b($$0, $$5, this.m().b(b, eca.a)), 3);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      if ($$0.c(b) != eca.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ebe $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == eca.b;
      }
   }

   public static void a(djy $$0, ebe $$1, iv $$2, int $$3) {
      iv $$4 = $$2.d();
      $$0.a($$2, b($$0, $$2, $$1.b(b, eca.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.b(b, eca.a)), $$3);
   }

   public static ebe b(dka $$0, iv $$1, ebe $$2) {
      return $$2.b(ebu.I) ? $$2.b(ebu.I, Boolean.valueOf($$0.A($$1))) : $$2;
   }

   @Override
   public ebe a(djx $$0, iv $$1, ebe $$2, crx $$3) {
      if (!$$0.C) {
         if ($$3.gl()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.fb());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djx $$0, crx $$1, iv $$2, ebe $$3, @Nullable dyc $$4, czy $$5) {
      super.a($$0, $$1, $$2, dne.a.m(), $$4, $$5);
   }

   protected static void b(djx $$0, iv $$1, ebe $$2, crx $$3) {
      eca $$4 = $$2.c(b);
      if ($$4 == eca.a) {
         iv $$5 = $$1.e();
         ebe $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == eca.b) {
            ebe $$7 = $$6.y().b(exp.c) ? dne.J.m() : dne.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dnc.j($$6));
         }
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(ebe $$0, iv $$1) {
      return azo.b($$1.u(), $$1.c($$0.c(b) == eca.b ? 0 : 1).v(), $$1.w());
   }
}
