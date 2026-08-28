import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dof extends dgv {
   public static final MapCodec<dof> a = b(dof::new);
   public static final int b = 8;
   public static final dva c = duq.aF;
   protected static final eyx[] d = new eyx[]{
      eyu.a(),
      dgv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   protected dof(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
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
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected eyx b_(dua $$0, dcx $$1, je $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected eyx c(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dua $$0) {
      return true;
   }

   @Override
   protected float c(dua $$0, dcx $$1, je $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      dua $$3 = $$1.a_($$2.e());
      if ($$3.a(aws.cp)) {
         return false;
      } else {
         return $$3.a(aws.cq) ? true : dgv.a($$3.g($$1, $$2.e()), jj.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$1.a(deb.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dua $$0, cyw $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.r()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jj.b : true;
      }
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      dua $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c);
   }
}
