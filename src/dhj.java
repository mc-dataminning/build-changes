import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dhj extends dex {
   public static final MapCodec<dhj> d = b(dhj::new);
   public static final dtj<dtp> e = dtb.ah;
   public static final dtc f = dtb.w;
   private static final int g = 20;

   @Override
   public MapCodec<dhj> a() {
      return d;
   }

   public dhj(dsk.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dtp.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dsl $$0) {
      return true;
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jf.b ? 15 : 0;
      }
   }

   private void a(dcg $$0, ja $$1, dsl $$2) {
      if (this.a($$2, (dcj)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cog> $$5 = this.a($$0, $$1, cog.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dsl $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dsl $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(dcg $$0, ja $$1, dsl $$2, boolean $$3) {
      dli $$4 = new dli($$0, $$1, $$2);

      for (ja $$6 : $$4.a()) {
         dsl $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dsl $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dto<dtp> c() {
      return e;
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      if ($$0.c(f)) {
         List<cop> $$3 = this.a($$1, $$2, cop.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<cog> $$4 = this.a($$1, $$2, cog.class, bsm.d);
         if (!$$4.isEmpty()) {
            return cpi.b((bqa)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cog> List<T> a(dcg $$0, ja $$1, Class<T> $$2, Predicate<bsh> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ewc a(ja $$0) {
      double $$1 = 0.2;
      return new ewc(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      switch ($$1) {
         case c:
            switch ((dtp)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtp.d);
               case d:
                  return $$0.a(e, dtp.c);
               case e:
                  return $$0.a(e, dtp.f);
               case f:
                  return $$0.a(e, dtp.e);
               case g:
                  return $$0.a(e, dtp.i);
               case h:
                  return $$0.a(e, dtp.j);
               case i:
                  return $$0.a(e, dtp.g);
               case j:
                  return $$0.a(e, dtp.h);
            }
         case d:
            switch ((dtp)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtp.e);
               case d:
                  return $$0.a(e, dtp.f);
               case e:
                  return $$0.a(e, dtp.d);
               case f:
                  return $$0.a(e, dtp.c);
               case g:
                  return $$0.a(e, dtp.j);
               case h:
                  return $$0.a(e, dtp.g);
               case i:
                  return $$0.a(e, dtp.h);
               case j:
                  return $$0.a(e, dtp.i);
               case a:
                  return $$0.a(e, dtp.b);
               case b:
                  return $$0.a(e, dtp.a);
            }
         case b:
            switch ((dtp)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtp.f);
               case d:
                  return $$0.a(e, dtp.e);
               case e:
                  return $$0.a(e, dtp.c);
               case f:
                  return $$0.a(e, dtp.d);
               case g:
                  return $$0.a(e, dtp.h);
               case h:
                  return $$0.a(e, dtp.i);
               case i:
                  return $$0.a(e, dtp.j);
               case j:
                  return $$0.a(e, dtp.g);
               case a:
                  return $$0.a(e, dtp.b);
               case b:
                  return $$0.a(e, dtp.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      dtp $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtp.f);
               case f:
                  return $$0.a(e, dtp.e);
               case g:
                  return $$0.a(e, dtp.j);
               case h:
                  return $$0.a(e, dtp.i);
               case i:
                  return $$0.a(e, dtp.h);
               case j:
                  return $$0.a(e, dtp.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtp.d);
               case d:
                  return $$0.a(e, dtp.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtp.h);
               case h:
                  return $$0.a(e, dtp.g);
               case i:
                  return $$0.a(e, dtp.j);
               case j:
                  return $$0.a(e, dtp.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(e, f, c);
   }
}
