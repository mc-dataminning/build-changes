import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class cyq extends cwe {
   public static final MapCodec<cyq> d = b(cyq::new);
   public static final dke<dkk> e = djw.ah;
   public static final djx f = djw.w;
   private static final int g = 20;

   @Override
   public MapCodec<cyq> a() {
      return d;
   }

   public cyq(djf.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dkk.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(djg $$0) {
      return true;
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(djg $$0, csu $$1, hx $$2, ic $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   public int b(djg $$0, csu $$1, hx $$2, ic $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ic.b ? 15 : 0;
      }
   }

   private void a(cto $$0, hx $$1, djg $$2) {
      if (this.a($$2, (ctr)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cgz> $$5 = this.a($$0, $$1, cgz.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            djg $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            djg $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(cto $$0, hx $$1, djg $$2, boolean $$3) {
      dco $$4 = new dco($$0, $$1, $$2);

      for (hx $$6 : $$4.a()) {
         djg $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         djg $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dkj<dkk> c() {
      return e;
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      if ($$0.c(f)) {
         List<chh> $$3 = this.a($$1, $$2, chh.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).C().k();
         }

         List<cgz> $$4 = this.a($$1, $$2, cgz.class, blx.d);
         if (!$$4.isEmpty()) {
            return cia.b((bjt)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cgz> List<T> a(cto $$0, hx $$1, Class<T> $$2, Predicate<blu> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private eln a(hx $$0) {
      double $$1 = 0.2;
      return new eln(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      switch ($$1) {
         case c:
            switch ((dkk)$$0.c(e)) {
               case c:
                  return $$0.a(e, dkk.d);
               case d:
                  return $$0.a(e, dkk.c);
               case e:
                  return $$0.a(e, dkk.f);
               case f:
                  return $$0.a(e, dkk.e);
               case g:
                  return $$0.a(e, dkk.i);
               case h:
                  return $$0.a(e, dkk.j);
               case i:
                  return $$0.a(e, dkk.g);
               case j:
                  return $$0.a(e, dkk.h);
            }
         case d:
            switch ((dkk)$$0.c(e)) {
               case c:
                  return $$0.a(e, dkk.e);
               case d:
                  return $$0.a(e, dkk.f);
               case e:
                  return $$0.a(e, dkk.d);
               case f:
                  return $$0.a(e, dkk.c);
               case g:
                  return $$0.a(e, dkk.j);
               case h:
                  return $$0.a(e, dkk.g);
               case i:
                  return $$0.a(e, dkk.h);
               case j:
                  return $$0.a(e, dkk.i);
               case a:
                  return $$0.a(e, dkk.b);
               case b:
                  return $$0.a(e, dkk.a);
            }
         case b:
            switch ((dkk)$$0.c(e)) {
               case c:
                  return $$0.a(e, dkk.f);
               case d:
                  return $$0.a(e, dkk.e);
               case e:
                  return $$0.a(e, dkk.c);
               case f:
                  return $$0.a(e, dkk.d);
               case g:
                  return $$0.a(e, dkk.h);
               case h:
                  return $$0.a(e, dkk.i);
               case i:
                  return $$0.a(e, dkk.j);
               case j:
                  return $$0.a(e, dkk.g);
               case a:
                  return $$0.a(e, dkk.b);
               case b:
                  return $$0.a(e, dkk.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      dkk $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dkk.f);
               case f:
                  return $$0.a(e, dkk.e);
               case g:
                  return $$0.a(e, dkk.j);
               case h:
                  return $$0.a(e, dkk.i);
               case i:
                  return $$0.a(e, dkk.h);
               case j:
                  return $$0.a(e, dkk.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dkk.d);
               case d:
                  return $$0.a(e, dkk.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dkk.h);
               case h:
                  return $$0.a(e, dkk.g);
               case i:
                  return $$0.a(e, dkk.j);
               case j:
                  return $$0.a(e, dkk.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(e, f, c);
   }
}
