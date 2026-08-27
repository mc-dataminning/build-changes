import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class ddz extends dbn {
   public static final MapCodec<ddz> d = b(ddz::new);
   public static final dpx<dqd> e = dpp.ah;
   public static final dpq f = dpp.w;
   private static final int g = 20;

   @Override
   public MapCodec<ddz> a() {
      return d;
   }

   public ddz(doy.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dqd.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(doz $$0) {
      return true;
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(doz $$0, cyd $$1, ib $$2, ih $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ih.b ? 15 : 0;
      }
   }

   private void a(cyx $$0, ib $$1, doz $$2) {
      if (this.a($$2, (cza)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<clo> $$5 = this.a($$0, $$1, clo.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            doz $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            doz $$7 = $$2.a(f, Boolean.valueOf(false));
            $$0.a($$1, $$7, 3);
            this.b($$0, $$1, $$7, false);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$7);
         }

         if ($$4) {
            $$0.a($$1, this, 20);
         }

         $$0.c($$1, this);
      }
   }

   protected void b(cyx $$0, ib $$1, doz $$2, boolean $$3) {
      dhx $$4 = new dhx($$0, $$1, $$2);

      for (ib $$6 : $$4.a()) {
         doz $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         doz $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dqc<dqd> c() {
      return e;
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      if ($$0.c(f)) {
         List<clw> $$3 = this.a($$1, $$2, clw.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<clo> $$4 = this.a($$1, $$2, clo.class, bqa.d);
         if (!$$4.isEmpty()) {
            return cmp.b((bnt)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends clo> List<T> a(cyx $$0, ib $$1, Class<T> $$2, Predicate<bpv> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private erv a(ib $$0) {
      double $$1 = 0.2;
      return new erv(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      switch ($$1) {
         case c:
            switch ((dqd)$$0.c(e)) {
               case c:
                  return $$0.a(e, dqd.d);
               case d:
                  return $$0.a(e, dqd.c);
               case e:
                  return $$0.a(e, dqd.f);
               case f:
                  return $$0.a(e, dqd.e);
               case g:
                  return $$0.a(e, dqd.i);
               case h:
                  return $$0.a(e, dqd.j);
               case i:
                  return $$0.a(e, dqd.g);
               case j:
                  return $$0.a(e, dqd.h);
            }
         case d:
            switch ((dqd)$$0.c(e)) {
               case c:
                  return $$0.a(e, dqd.e);
               case d:
                  return $$0.a(e, dqd.f);
               case e:
                  return $$0.a(e, dqd.d);
               case f:
                  return $$0.a(e, dqd.c);
               case g:
                  return $$0.a(e, dqd.j);
               case h:
                  return $$0.a(e, dqd.g);
               case i:
                  return $$0.a(e, dqd.h);
               case j:
                  return $$0.a(e, dqd.i);
               case a:
                  return $$0.a(e, dqd.b);
               case b:
                  return $$0.a(e, dqd.a);
            }
         case b:
            switch ((dqd)$$0.c(e)) {
               case c:
                  return $$0.a(e, dqd.f);
               case d:
                  return $$0.a(e, dqd.e);
               case e:
                  return $$0.a(e, dqd.c);
               case f:
                  return $$0.a(e, dqd.d);
               case g:
                  return $$0.a(e, dqd.h);
               case h:
                  return $$0.a(e, dqd.i);
               case i:
                  return $$0.a(e, dqd.j);
               case j:
                  return $$0.a(e, dqd.g);
               case a:
                  return $$0.a(e, dqd.b);
               case b:
                  return $$0.a(e, dqd.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      dqd $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dqd.f);
               case f:
                  return $$0.a(e, dqd.e);
               case g:
                  return $$0.a(e, dqd.j);
               case h:
                  return $$0.a(e, dqd.i);
               case i:
                  return $$0.a(e, dqd.h);
               case j:
                  return $$0.a(e, dqd.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dqd.d);
               case d:
                  return $$0.a(e, dqd.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dqd.h);
               case h:
                  return $$0.a(e, dqd.g);
               case i:
                  return $$0.a(e, dqd.j);
               case j:
                  return $$0.a(e, dqd.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(e, f, c);
   }
}
