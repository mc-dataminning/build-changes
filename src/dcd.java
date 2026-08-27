import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dcd extends czr {
   public static final MapCodec<dcd> d = b(dcd::new);
   public static final dnz<dof> e = dnr.ah;
   public static final dns f = dnr.w;
   private static final int g = 20;

   @Override
   public MapCodec<dcd> a() {
      return d;
   }

   public dcd(dna.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dof.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dnb $$0) {
      return true;
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ih.b ? 15 : 0;
      }
   }

   private void a(cxb $$0, ib $$1, dnb $$2) {
      if (this.a($$2, (cxe)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<ckp> $$5 = this.a($$0, $$1, ckp.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dnb $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dnb $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(cxb $$0, ib $$1, dnb $$2, boolean $$3) {
      dgb $$4 = new dgb($$0, $$1, $$2);

      for (ib $$6 : $$4.a()) {
         dnb $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dnb $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public doe<dof> c() {
      return e;
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      if ($$0.c(f)) {
         List<ckx> $$3 = this.a($$1, $$2, ckx.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<ckp> $$4 = this.a($$1, $$2, ckp.class, bpc.d);
         if (!$$4.isEmpty()) {
            return clq.b((bmw)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends ckp> List<T> a(cxb $$0, ib $$1, Class<T> $$2, Predicate<box> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private epo a(ib $$0) {
      double $$1 = 0.2;
      return new epo(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      switch ($$1) {
         case c:
            switch ((dof)$$0.c(e)) {
               case c:
                  return $$0.a(e, dof.d);
               case d:
                  return $$0.a(e, dof.c);
               case e:
                  return $$0.a(e, dof.f);
               case f:
                  return $$0.a(e, dof.e);
               case g:
                  return $$0.a(e, dof.i);
               case h:
                  return $$0.a(e, dof.j);
               case i:
                  return $$0.a(e, dof.g);
               case j:
                  return $$0.a(e, dof.h);
            }
         case d:
            switch ((dof)$$0.c(e)) {
               case c:
                  return $$0.a(e, dof.e);
               case d:
                  return $$0.a(e, dof.f);
               case e:
                  return $$0.a(e, dof.d);
               case f:
                  return $$0.a(e, dof.c);
               case g:
                  return $$0.a(e, dof.j);
               case h:
                  return $$0.a(e, dof.g);
               case i:
                  return $$0.a(e, dof.h);
               case j:
                  return $$0.a(e, dof.i);
               case a:
                  return $$0.a(e, dof.b);
               case b:
                  return $$0.a(e, dof.a);
            }
         case b:
            switch ((dof)$$0.c(e)) {
               case c:
                  return $$0.a(e, dof.f);
               case d:
                  return $$0.a(e, dof.e);
               case e:
                  return $$0.a(e, dof.c);
               case f:
                  return $$0.a(e, dof.d);
               case g:
                  return $$0.a(e, dof.h);
               case h:
                  return $$0.a(e, dof.i);
               case i:
                  return $$0.a(e, dof.j);
               case j:
                  return $$0.a(e, dof.g);
               case a:
                  return $$0.a(e, dof.b);
               case b:
                  return $$0.a(e, dof.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      dof $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dof.f);
               case f:
                  return $$0.a(e, dof.e);
               case g:
                  return $$0.a(e, dof.j);
               case h:
                  return $$0.a(e, dof.i);
               case i:
                  return $$0.a(e, dof.h);
               case j:
                  return $$0.a(e, dof.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dof.d);
               case d:
                  return $$0.a(e, dof.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dof.h);
               case h:
                  return $$0.a(e, dof.g);
               case i:
                  return $$0.a(e, dof.j);
               case j:
                  return $$0.a(e, dof.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(e, f, c);
   }
}
