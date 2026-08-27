import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class cya extends cvo {
   public static final MapCodec<cya> d = b(cya::new);
   public static final djn<djt> e = djf.ah;
   public static final djg f = djf.w;
   private static final int g = 20;

   @Override
   public MapCodec<cya> a() {
      return d;
   }

   public cya(dio.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, djt.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2, ia $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ia.b ? 15 : 0;
      }
   }

   private void a(csy $$0, hv $$1, dip $$2) {
      if (this.a($$2, (ctb)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cgj> $$5 = this.a($$0, $$1, cgj.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dip $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dip $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(csy $$0, hv $$1, dip $$2, boolean $$3) {
      dby $$4 = new dby($$0, $$1, $$2);

      for (hv $$6 : $$4.a()) {
         dip $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dip $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public djs<djt> c() {
      return e;
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      if ($$0.c(f)) {
         List<cgr> $$3 = this.a($$1, $$2, cgr.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).C().k();
         }

         List<cgj> $$4 = this.a($$1, $$2, cgj.class, bli.d);
         if (!$$4.isEmpty()) {
            return chk.b((bje)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cgj> List<T> a(csy $$0, hv $$1, Class<T> $$2, Predicate<blf> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ekw a(hv $$0) {
      double $$1 = 0.2;
      return new ekw(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      switch ($$1) {
         case c:
            switch ((djt)$$0.c(e)) {
               case c:
                  return $$0.a(e, djt.d);
               case d:
                  return $$0.a(e, djt.c);
               case e:
                  return $$0.a(e, djt.f);
               case f:
                  return $$0.a(e, djt.e);
               case g:
                  return $$0.a(e, djt.i);
               case h:
                  return $$0.a(e, djt.j);
               case i:
                  return $$0.a(e, djt.g);
               case j:
                  return $$0.a(e, djt.h);
            }
         case d:
            switch ((djt)$$0.c(e)) {
               case c:
                  return $$0.a(e, djt.e);
               case d:
                  return $$0.a(e, djt.f);
               case e:
                  return $$0.a(e, djt.d);
               case f:
                  return $$0.a(e, djt.c);
               case g:
                  return $$0.a(e, djt.j);
               case h:
                  return $$0.a(e, djt.g);
               case i:
                  return $$0.a(e, djt.h);
               case j:
                  return $$0.a(e, djt.i);
               case a:
                  return $$0.a(e, djt.b);
               case b:
                  return $$0.a(e, djt.a);
            }
         case b:
            switch ((djt)$$0.c(e)) {
               case c:
                  return $$0.a(e, djt.f);
               case d:
                  return $$0.a(e, djt.e);
               case e:
                  return $$0.a(e, djt.c);
               case f:
                  return $$0.a(e, djt.d);
               case g:
                  return $$0.a(e, djt.h);
               case h:
                  return $$0.a(e, djt.i);
               case i:
                  return $$0.a(e, djt.j);
               case j:
                  return $$0.a(e, djt.g);
               case a:
                  return $$0.a(e, djt.b);
               case b:
                  return $$0.a(e, djt.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      djt $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, djt.f);
               case f:
                  return $$0.a(e, djt.e);
               case g:
                  return $$0.a(e, djt.j);
               case h:
                  return $$0.a(e, djt.i);
               case i:
                  return $$0.a(e, djt.h);
               case j:
                  return $$0.a(e, djt.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, djt.d);
               case d:
                  return $$0.a(e, djt.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, djt.h);
               case h:
                  return $$0.a(e, djt.g);
               case i:
                  return $$0.a(e, djt.j);
               case j:
                  return $$0.a(e, djt.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(e, f, c);
   }
}
