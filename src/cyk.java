import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class cyk extends cvy {
   public static final MapCodec<cyk> d = b(cyk::new);
   public static final djy<dke> e = djq.ah;
   public static final djr f = djq.w;
   private static final int g = 20;

   @Override
   public MapCodec<cyk> a() {
      return d;
   }

   public cyk(diz.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dke.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(dja $$0) {
      return true;
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   public int b(dja $$0, cso $$1, hx $$2, ic $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ic.b ? 15 : 0;
      }
   }

   private void a(cti $$0, hx $$1, dja $$2) {
      if (this.a($$2, (ctl)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cgt> $$5 = this.a($$0, $$1, cgt.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dja $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dja $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(cti $$0, hx $$1, dja $$2, boolean $$3) {
      dci $$4 = new dci($$0, $$1, $$2);

      for (hx $$6 : $$4.a()) {
         dja $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dja $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dkd<dke> c() {
      return e;
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      if ($$0.c(f)) {
         List<chb> $$3 = this.a($$1, $$2, chb.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).C().k();
         }

         List<cgt> $$4 = this.a($$1, $$2, cgt.class, bls.d);
         if (!$$4.isEmpty()) {
            return chu.b((bjo)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cgt> List<T> a(cti $$0, hx $$1, Class<T> $$2, Predicate<blp> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private elh a(hx $$0) {
      double $$1 = 0.2;
      return new elh(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      switch ($$1) {
         case c:
            switch ((dke)$$0.c(e)) {
               case c:
                  return $$0.a(e, dke.d);
               case d:
                  return $$0.a(e, dke.c);
               case e:
                  return $$0.a(e, dke.f);
               case f:
                  return $$0.a(e, dke.e);
               case g:
                  return $$0.a(e, dke.i);
               case h:
                  return $$0.a(e, dke.j);
               case i:
                  return $$0.a(e, dke.g);
               case j:
                  return $$0.a(e, dke.h);
            }
         case d:
            switch ((dke)$$0.c(e)) {
               case c:
                  return $$0.a(e, dke.e);
               case d:
                  return $$0.a(e, dke.f);
               case e:
                  return $$0.a(e, dke.d);
               case f:
                  return $$0.a(e, dke.c);
               case g:
                  return $$0.a(e, dke.j);
               case h:
                  return $$0.a(e, dke.g);
               case i:
                  return $$0.a(e, dke.h);
               case j:
                  return $$0.a(e, dke.i);
               case a:
                  return $$0.a(e, dke.b);
               case b:
                  return $$0.a(e, dke.a);
            }
         case b:
            switch ((dke)$$0.c(e)) {
               case c:
                  return $$0.a(e, dke.f);
               case d:
                  return $$0.a(e, dke.e);
               case e:
                  return $$0.a(e, dke.c);
               case f:
                  return $$0.a(e, dke.d);
               case g:
                  return $$0.a(e, dke.h);
               case h:
                  return $$0.a(e, dke.i);
               case i:
                  return $$0.a(e, dke.j);
               case j:
                  return $$0.a(e, dke.g);
               case a:
                  return $$0.a(e, dke.b);
               case b:
                  return $$0.a(e, dke.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      dke $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dke.f);
               case f:
                  return $$0.a(e, dke.e);
               case g:
                  return $$0.a(e, dke.j);
               case h:
                  return $$0.a(e, dke.i);
               case i:
                  return $$0.a(e, dke.h);
               case j:
                  return $$0.a(e, dke.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dke.d);
               case d:
                  return $$0.a(e, dke.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dke.h);
               case h:
                  return $$0.a(e, dke.g);
               case i:
                  return $$0.a(e, dke.j);
               case j:
                  return $$0.a(e, dke.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(e, f, c);
   }
}
