import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpa extends dwd {
   public static final MapCodec<dpa> a = b(dpa::new);
   public static final ebr<ebp> b = ebj.ah;

   @Override
   public MapCodec<? extends dpa> a() {
      return a;
   }

   public dpa(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ebp.b));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      ebp $$8 = $$0.c(b);
      if ($$4.o() != jb.a.b || $$8 == ebp.b != ($$4 == jb.b) || $$6.a(this) && $$6.c(b) != $$8) {
         return $$8 == ebp.b && $$4 == jb.a && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return dmt.a.m();
      }
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      iv $$1 = $$0.a();
      djm $$2 = $$0.q();
      return $$1.v() < $$2.ao() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, bxj $$3, czn $$4) {
      iv $$5 = $$1.d();
      $$0.a($$5, b($$0, $$5, this.m().b(b, ebp.a)), 3);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      if ($$0.c(b) != ebp.a) {
         return super.a($$0, $$1, $$2);
      } else {
         eat $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == ebp.b;
      }
   }

   public static void a(djn $$0, eat $$1, iv $$2, int $$3) {
      iv $$4 = $$2.d();
      $$0.a($$2, b($$0, $$2, $$1.b(b, ebp.b)), $$3);
      $$0.a($$4, b($$0, $$4, $$1.b(b, ebp.a)), $$3);
   }

   public static eat b(djp $$0, iv $$1, eat $$2) {
      return $$2.b(ebj.I) ? $$2.b(ebj.I, Boolean.valueOf($$0.A($$1))) : $$2;
   }

   @Override
   public eat a(djm $$0, iv $$1, eat $$2, crm $$3) {
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
   public void a(djm $$0, crm $$1, iv $$2, eat $$3, @Nullable dxr $$4, czn $$5) {
      super.a($$0, $$1, $$2, dmt.a.m(), $$4, $$5);
   }

   protected static void b(djm $$0, iv $$1, eat $$2, crm $$3) {
      ebp $$4 = $$2.c(b);
      if ($$4 == ebp.a) {
         iv $$5 = $$1.e();
         eat $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == ebp.b) {
            eat $$7 = $$6.y().b(exb.c) ? dmt.J.m() : dmt.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dmr.j($$6));
         }
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(eat $$0, iv $$1) {
      return azm.b($$1.u(), $$1.c($$0.c(b) == ebp.b ? 0 : 1).v(), $$1.w());
   }
}
