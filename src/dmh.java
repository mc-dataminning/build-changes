import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dmh extends djt {
   public static final MapCodec<dmh> d = b(dmh::new);
   public static final dyk<dyq> e = dyd.ai;
   public static final dye f = dyd.x;
   private static final int g = 20;

   @Override
   public MapCodec<dmh> a() {
      return d;
   }

   public dmh(dxm.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(e, dyq.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dxn $$0) {
      return true;
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if (!$$1.C) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dxn $$0, dgf $$1, jh $$2, jm $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jm.b ? 15 : 0;
      }
   }

   private void a(dha $$0, jh $$1, dxn $$2) {
      if (this.a($$2, (dhd)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<crr> $$5 = this.a($$0, $$1, crr.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dxn $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dxn $$7 = $$2.b(f, Boolean.valueOf(false));
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

   protected void b(dha $$0, jh $$1, dxn $$2, boolean $$3) {
      dqh $$4 = new dqh($$0, $$1, $$2);

      for (jh $$6 : $$4.a()) {
         dxn $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dxn $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dyp<dyq> c() {
      return e;
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      if ($$0.c(f)) {
         List<csb> $$3 = this.a($$1, $$2, csb.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).v().k();
         }

         List<crr> $$4 = this.a($$1, $$2, crr.class, bvk.d);
         if (!$$4.isEmpty()) {
            return csx.b((bsx)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends crr> List<T> a(dha $$0, jh $$1, Class<T> $$2, Predicate<bvf> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fbn a(jh $$0) {
      double $$1 = 0.2;
      return new fbn(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      switch ($$1) {
         case c:
            switch ((dyq)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyq.d);
               case d:
                  return $$0.b(e, dyq.c);
               case e:
                  return $$0.b(e, dyq.f);
               case f:
                  return $$0.b(e, dyq.e);
               case g:
                  return $$0.b(e, dyq.i);
               case h:
                  return $$0.b(e, dyq.j);
               case i:
                  return $$0.b(e, dyq.g);
               case j:
                  return $$0.b(e, dyq.h);
            }
         case d:
            switch ((dyq)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyq.e);
               case d:
                  return $$0.b(e, dyq.f);
               case e:
                  return $$0.b(e, dyq.d);
               case f:
                  return $$0.b(e, dyq.c);
               case g:
                  return $$0.b(e, dyq.j);
               case h:
                  return $$0.b(e, dyq.g);
               case i:
                  return $$0.b(e, dyq.h);
               case j:
                  return $$0.b(e, dyq.i);
               case a:
                  return $$0.b(e, dyq.b);
               case b:
                  return $$0.b(e, dyq.a);
            }
         case b:
            switch ((dyq)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyq.f);
               case d:
                  return $$0.b(e, dyq.e);
               case e:
                  return $$0.b(e, dyq.c);
               case f:
                  return $$0.b(e, dyq.d);
               case g:
                  return $$0.b(e, dyq.h);
               case h:
                  return $$0.b(e, dyq.i);
               case i:
                  return $$0.b(e, dyq.j);
               case j:
                  return $$0.b(e, dyq.g);
               case a:
                  return $$0.b(e, dyq.b);
               case b:
                  return $$0.b(e, dyq.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      dyq $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dyq.f);
               case f:
                  return $$0.b(e, dyq.e);
               case g:
                  return $$0.b(e, dyq.j);
               case h:
                  return $$0.b(e, dyq.i);
               case i:
                  return $$0.b(e, dyq.h);
               case j:
                  return $$0.b(e, dyq.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dyq.d);
               case d:
                  return $$0.b(e, dyq.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dyq.h);
               case h:
                  return $$0.b(e, dyq.g);
               case i:
                  return $$0.b(e, dyq.j);
               case j:
                  return $$0.b(e, dyq.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(e, f, c);
   }
}
