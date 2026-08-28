import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dmp extends dkb {
   public static final MapCodec<dmp> d = b(dmp::new);
   public static final dys<dyy> e = dyl.ai;
   public static final dym f = dyl.x;
   private static final int g = 20;

   @Override
   public MapCodec<dmp> a() {
      return d;
   }

   public dmp(dxu.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(e, dyy.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dxv $$0) {
      return true;
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if (!$$1.C) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jm.b ? 15 : 0;
      }
   }

   private void a(dhi $$0, jh $$1, dxv $$2) {
      if (this.a($$2, (dhl)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<crw> $$5 = this.a($$0, $$1, crw.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dxv $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dxv $$7 = $$2.b(f, Boolean.valueOf(false));
            $$0.a($$1, $$7, 3);
            this.b($$0, $$1, $$7, false);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$7);
         }

         if ($$4) {
            $$0.a($$1, this, 20);
         }

         $$0.c($$1, this);
      }
   }

   protected void b(dhi $$0, jh $$1, dxv $$2, boolean $$3) {
      dqp $$4 = new dqp($$0, $$1, $$2);

      for (jh $$6 : $$4.a()) {
         dxv $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dxv $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dyx<dyy> c() {
      return e;
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      if ($$0.c(f)) {
         List<csg> $$3 = this.a($$1, $$2, csg.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).v().k();
         }

         List<crw> $$4 = this.a($$1, $$2, crw.class, bvp.d);
         if (!$$4.isEmpty()) {
            return ctc.b((btc)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends crw> List<T> a(dhi $$0, jh $$1, Class<T> $$2, Predicate<bvk> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fbt a(jh $$0) {
      double $$1 = 0.2;
      return new fbt(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      switch ($$1) {
         case c:
            switch ((dyy)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyy.d);
               case d:
                  return $$0.b(e, dyy.c);
               case e:
                  return $$0.b(e, dyy.f);
               case f:
                  return $$0.b(e, dyy.e);
               case g:
                  return $$0.b(e, dyy.i);
               case h:
                  return $$0.b(e, dyy.j);
               case i:
                  return $$0.b(e, dyy.g);
               case j:
                  return $$0.b(e, dyy.h);
            }
         case d:
            switch ((dyy)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyy.e);
               case d:
                  return $$0.b(e, dyy.f);
               case e:
                  return $$0.b(e, dyy.d);
               case f:
                  return $$0.b(e, dyy.c);
               case g:
                  return $$0.b(e, dyy.j);
               case h:
                  return $$0.b(e, dyy.g);
               case i:
                  return $$0.b(e, dyy.h);
               case j:
                  return $$0.b(e, dyy.i);
               case a:
                  return $$0.b(e, dyy.b);
               case b:
                  return $$0.b(e, dyy.a);
            }
         case b:
            switch ((dyy)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyy.f);
               case d:
                  return $$0.b(e, dyy.e);
               case e:
                  return $$0.b(e, dyy.c);
               case f:
                  return $$0.b(e, dyy.d);
               case g:
                  return $$0.b(e, dyy.h);
               case h:
                  return $$0.b(e, dyy.i);
               case i:
                  return $$0.b(e, dyy.j);
               case j:
                  return $$0.b(e, dyy.g);
               case a:
                  return $$0.b(e, dyy.b);
               case b:
                  return $$0.b(e, dyy.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      dyy $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dyy.f);
               case f:
                  return $$0.b(e, dyy.e);
               case g:
                  return $$0.b(e, dyy.j);
               case h:
                  return $$0.b(e, dyy.i);
               case i:
                  return $$0.b(e, dyy.h);
               case j:
                  return $$0.b(e, dyy.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dyy.d);
               case d:
                  return $$0.b(e, dyy.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dyy.h);
               case h:
                  return $$0.b(e, dyy.g);
               case i:
                  return $$0.b(e, dyy.j);
               case j:
                  return $$0.b(e, dyy.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(e, f, c);
   }
}
