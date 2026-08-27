import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dcb extends czp {
   public static final MapCodec<dcb> d = b(dcb::new);
   public static final dnx<dod> e = dnp.ah;
   public static final dnq f = dnp.w;
   private static final int g = 20;

   @Override
   public MapCodec<dcb> a() {
      return d;
   }

   public dcb(dmy.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dod.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dmz $$0) {
      return true;
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ih.b ? 15 : 0;
      }
   }

   private void a(cwz $$0, ib $$1, dmz $$2) {
      if (this.a($$2, (cxc)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<ckn> $$5 = this.a($$0, $$1, ckn.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dmz $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dmz $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(cwz $$0, ib $$1, dmz $$2, boolean $$3) {
      dfz $$4 = new dfz($$0, $$1, $$2);

      for (ib $$6 : $$4.a()) {
         dmz $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dmz $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public doc<dod> c() {
      return e;
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      if ($$0.c(f)) {
         List<ckv> $$3 = this.a($$1, $$2, ckv.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<ckn> $$4 = this.a($$1, $$2, ckn.class, bpb.d);
         if (!$$4.isEmpty()) {
            return clo.b((bmv)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends ckn> List<T> a(cwz $$0, ib $$1, Class<T> $$2, Predicate<bow> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private epm a(ib $$0) {
      double $$1 = 0.2;
      return new epm(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      switch ($$1) {
         case c:
            switch ((dod)$$0.c(e)) {
               case c:
                  return $$0.a(e, dod.d);
               case d:
                  return $$0.a(e, dod.c);
               case e:
                  return $$0.a(e, dod.f);
               case f:
                  return $$0.a(e, dod.e);
               case g:
                  return $$0.a(e, dod.i);
               case h:
                  return $$0.a(e, dod.j);
               case i:
                  return $$0.a(e, dod.g);
               case j:
                  return $$0.a(e, dod.h);
            }
         case d:
            switch ((dod)$$0.c(e)) {
               case c:
                  return $$0.a(e, dod.e);
               case d:
                  return $$0.a(e, dod.f);
               case e:
                  return $$0.a(e, dod.d);
               case f:
                  return $$0.a(e, dod.c);
               case g:
                  return $$0.a(e, dod.j);
               case h:
                  return $$0.a(e, dod.g);
               case i:
                  return $$0.a(e, dod.h);
               case j:
                  return $$0.a(e, dod.i);
               case a:
                  return $$0.a(e, dod.b);
               case b:
                  return $$0.a(e, dod.a);
            }
         case b:
            switch ((dod)$$0.c(e)) {
               case c:
                  return $$0.a(e, dod.f);
               case d:
                  return $$0.a(e, dod.e);
               case e:
                  return $$0.a(e, dod.c);
               case f:
                  return $$0.a(e, dod.d);
               case g:
                  return $$0.a(e, dod.h);
               case h:
                  return $$0.a(e, dod.i);
               case i:
                  return $$0.a(e, dod.j);
               case j:
                  return $$0.a(e, dod.g);
               case a:
                  return $$0.a(e, dod.b);
               case b:
                  return $$0.a(e, dod.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      dod $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dod.f);
               case f:
                  return $$0.a(e, dod.e);
               case g:
                  return $$0.a(e, dod.j);
               case h:
                  return $$0.a(e, dod.i);
               case i:
                  return $$0.a(e, dod.h);
               case j:
                  return $$0.a(e, dod.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dod.d);
               case d:
                  return $$0.a(e, dod.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dod.h);
               case h:
                  return $$0.a(e, dod.g);
               case i:
                  return $$0.a(e, dod.j);
               case j:
                  return $$0.a(e, dod.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(e, f, c);
   }
}
