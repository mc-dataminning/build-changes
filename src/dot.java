import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dot extends dhj {
   public static final MapCodec<dot> a = b(dot::new);
   public static final int b = 8;
   public static final dvo c = dve.aF;
   protected static final ezm[] d = new ezm[]{
      ezj.a(),
      dhj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dot> a() {
      return a;
   }

   protected dot(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      switch ($$1) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected ezm b_(duo $$0, ddl $$1, je $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected ezm c(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(duo $$0) {
      return true;
   }

   @Override
   protected float c(duo $$0, ddl $$1, je $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      duo $$3 = $$1.a_($$2.e());
      if ($$3.a(awt.cp)) {
         return false;
      } else {
         return $$3.a(awt.cq) ? true : dhj.a($$3.g($$1, $$2.e()), jj.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$1.a(dep.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(duo $$0, czk $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.q()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jj.b : true;
      }
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c);
   }
}
