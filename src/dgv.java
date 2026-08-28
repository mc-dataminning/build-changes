import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dgv extends dej {
   public static final MapCodec<dgv> d = b(dgv::new);
   public static final dsv<dtb> e = dsn.ah;
   public static final dso f = dsn.w;
   private static final int g = 20;

   @Override
   public MapCodec<dgv> a() {
      return d;
   }

   public dgv(drw.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dtb.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(drx $$0) {
      return true;
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(drx $$0, daz $$1, iz $$2, je $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == je.b ? 15 : 0;
      }
   }

   private void a(dbt $$0, iz $$1, drx $$2) {
      if (this.a($$2, (dbw)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<coo> $$5 = this.a($$0, $$1, coo.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            drx $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            drx $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(dbt $$0, iz $$1, drx $$2, boolean $$3) {
      dku $$4 = new dku($$0, $$1, $$2);

      for (iz $$6 : $$4.a()) {
         drx $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         drx $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dta<dtb> c() {
      return e;
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      if ($$0.c(f)) {
         List<cow> $$3 = this.a($$1, $$2, cow.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<coo> $$4 = this.a($$1, $$2, coo.class, bsu.d);
         if (!$$4.isEmpty()) {
            return cpp.b((bqi)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends coo> List<T> a(dbt $$0, iz $$1, Class<T> $$2, Predicate<bsp> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private evh a(iz $$0) {
      double $$1 = 0.2;
      return new evh(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      switch ($$1) {
         case c:
            switch ((dtb)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtb.d);
               case d:
                  return $$0.a(e, dtb.c);
               case e:
                  return $$0.a(e, dtb.f);
               case f:
                  return $$0.a(e, dtb.e);
               case g:
                  return $$0.a(e, dtb.i);
               case h:
                  return $$0.a(e, dtb.j);
               case i:
                  return $$0.a(e, dtb.g);
               case j:
                  return $$0.a(e, dtb.h);
            }
         case d:
            switch ((dtb)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtb.e);
               case d:
                  return $$0.a(e, dtb.f);
               case e:
                  return $$0.a(e, dtb.d);
               case f:
                  return $$0.a(e, dtb.c);
               case g:
                  return $$0.a(e, dtb.j);
               case h:
                  return $$0.a(e, dtb.g);
               case i:
                  return $$0.a(e, dtb.h);
               case j:
                  return $$0.a(e, dtb.i);
               case a:
                  return $$0.a(e, dtb.b);
               case b:
                  return $$0.a(e, dtb.a);
            }
         case b:
            switch ((dtb)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtb.f);
               case d:
                  return $$0.a(e, dtb.e);
               case e:
                  return $$0.a(e, dtb.c);
               case f:
                  return $$0.a(e, dtb.d);
               case g:
                  return $$0.a(e, dtb.h);
               case h:
                  return $$0.a(e, dtb.i);
               case i:
                  return $$0.a(e, dtb.j);
               case j:
                  return $$0.a(e, dtb.g);
               case a:
                  return $$0.a(e, dtb.b);
               case b:
                  return $$0.a(e, dtb.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      dtb $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtb.f);
               case f:
                  return $$0.a(e, dtb.e);
               case g:
                  return $$0.a(e, dtb.j);
               case h:
                  return $$0.a(e, dtb.i);
               case i:
                  return $$0.a(e, dtb.h);
               case j:
                  return $$0.a(e, dtb.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtb.d);
               case d:
                  return $$0.a(e, dtb.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtb.h);
               case h:
                  return $$0.a(e, dtb.g);
               case i:
                  return $$0.a(e, dtb.j);
               case j:
                  return $$0.a(e, dtb.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(e, f, c);
   }
}
