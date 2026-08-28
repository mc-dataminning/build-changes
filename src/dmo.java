import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dmo extends dka {
   public static final MapCodec<dmo> d = b(dmo::new);
   public static final dyr<dyx> e = dyk.ai;
   public static final dyl f = dyk.x;
   private static final int g = 20;

   @Override
   public MapCodec<dmo> a() {
      return d;
   }

   public dmo(dxt.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(e, dyx.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dxu $$0) {
      return true;
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if (!$$1.C) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jm.b ? 15 : 0;
      }
   }

   private void a(dhh $$0, jh $$1, dxu $$2) {
      if (this.a($$2, (dhk)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<crv> $$5 = this.a($$0, $$1, crv.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dxu $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dxu $$7 = $$2.b(f, Boolean.valueOf(false));
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

   protected void b(dhh $$0, jh $$1, dxu $$2, boolean $$3) {
      dqo $$4 = new dqo($$0, $$1, $$2);

      for (jh $$6 : $$4.a()) {
         dxu $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dxu $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dyw<dyx> c() {
      return e;
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      if ($$0.c(f)) {
         List<csf> $$3 = this.a($$1, $$2, csf.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).v().k();
         }

         List<crv> $$4 = this.a($$1, $$2, crv.class, bvo.d);
         if (!$$4.isEmpty()) {
            return ctb.b((btb)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends crv> List<T> a(dhh $$0, jh $$1, Class<T> $$2, Predicate<bvj> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fbs a(jh $$0) {
      double $$1 = 0.2;
      return new fbs(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      switch ($$1) {
         case c:
            switch ((dyx)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyx.d);
               case d:
                  return $$0.b(e, dyx.c);
               case e:
                  return $$0.b(e, dyx.f);
               case f:
                  return $$0.b(e, dyx.e);
               case g:
                  return $$0.b(e, dyx.i);
               case h:
                  return $$0.b(e, dyx.j);
               case i:
                  return $$0.b(e, dyx.g);
               case j:
                  return $$0.b(e, dyx.h);
            }
         case d:
            switch ((dyx)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyx.e);
               case d:
                  return $$0.b(e, dyx.f);
               case e:
                  return $$0.b(e, dyx.d);
               case f:
                  return $$0.b(e, dyx.c);
               case g:
                  return $$0.b(e, dyx.j);
               case h:
                  return $$0.b(e, dyx.g);
               case i:
                  return $$0.b(e, dyx.h);
               case j:
                  return $$0.b(e, dyx.i);
               case a:
                  return $$0.b(e, dyx.b);
               case b:
                  return $$0.b(e, dyx.a);
            }
         case b:
            switch ((dyx)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyx.f);
               case d:
                  return $$0.b(e, dyx.e);
               case e:
                  return $$0.b(e, dyx.c);
               case f:
                  return $$0.b(e, dyx.d);
               case g:
                  return $$0.b(e, dyx.h);
               case h:
                  return $$0.b(e, dyx.i);
               case i:
                  return $$0.b(e, dyx.j);
               case j:
                  return $$0.b(e, dyx.g);
               case a:
                  return $$0.b(e, dyx.b);
               case b:
                  return $$0.b(e, dyx.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      dyx $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dyx.f);
               case f:
                  return $$0.b(e, dyx.e);
               case g:
                  return $$0.b(e, dyx.j);
               case h:
                  return $$0.b(e, dyx.i);
               case i:
                  return $$0.b(e, dyx.h);
               case j:
                  return $$0.b(e, dyx.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dyx.d);
               case d:
                  return $$0.b(e, dyx.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dyx.h);
               case h:
                  return $$0.b(e, dyx.g);
               case i:
                  return $$0.b(e, dyx.j);
               case j:
                  return $$0.b(e, dyx.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(e, f, c);
   }
}
