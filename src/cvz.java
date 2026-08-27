import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class cvz extends ctp {
   public static final MapCodec<cvz> d = b(cvz::new);
   public static final dgz<dhf> e = dgr.ah;
   public static final dgs f = dgr.w;
   private static final int g = 20;

   @Override
   public MapCodec<cvz> a() {
      return d;
   }

   public cvz(dga.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dhf.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(dgb $$0) {
      return true;
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   public int b(dgb $$0, cqf $$1, ht $$2, hx $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == hx.b ? 15 : 0;
      }
   }

   private void a(cqz $$0, ht $$1, dgb $$2) {
      if (this.a($$2, (crc)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<ceo> $$5 = this.a($$0, $$1, ceo.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dgb $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dgb $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(cqz $$0, ht $$1, dgb $$2, boolean $$3) {
      czy $$4 = new czy($$0, $$1, $$2);

      for (ht $$6 : $$4.a()) {
         dgb $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dgb $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dhe<dhf> c() {
      return e;
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      if ($$0.c(f)) {
         List<cew> $$3 = this.a($$1, $$2, cew.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<ceo> $$4 = this.a($$1, $$2, ceo.class, bjw.d);
         if (!$$4.isEmpty()) {
            return cfp.b((bhu)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends ceo> List<T> a(cqz $$0, ht $$1, Class<T> $$2, Predicate<bjt> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private eia a(ht $$0) {
      double $$1 = 0.2;
      return new eia(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      switch ($$1) {
         case c:
            switch ((dhf)$$0.c(e)) {
               case c:
                  return $$0.a(e, dhf.d);
               case d:
                  return $$0.a(e, dhf.c);
               case e:
                  return $$0.a(e, dhf.f);
               case f:
                  return $$0.a(e, dhf.e);
               case g:
                  return $$0.a(e, dhf.i);
               case h:
                  return $$0.a(e, dhf.j);
               case i:
                  return $$0.a(e, dhf.g);
               case j:
                  return $$0.a(e, dhf.h);
            }
         case d:
            switch ((dhf)$$0.c(e)) {
               case c:
                  return $$0.a(e, dhf.e);
               case d:
                  return $$0.a(e, dhf.f);
               case e:
                  return $$0.a(e, dhf.d);
               case f:
                  return $$0.a(e, dhf.c);
               case g:
                  return $$0.a(e, dhf.j);
               case h:
                  return $$0.a(e, dhf.g);
               case i:
                  return $$0.a(e, dhf.h);
               case j:
                  return $$0.a(e, dhf.i);
               case a:
                  return $$0.a(e, dhf.b);
               case b:
                  return $$0.a(e, dhf.a);
            }
         case b:
            switch ((dhf)$$0.c(e)) {
               case c:
                  return $$0.a(e, dhf.f);
               case d:
                  return $$0.a(e, dhf.e);
               case e:
                  return $$0.a(e, dhf.c);
               case f:
                  return $$0.a(e, dhf.d);
               case g:
                  return $$0.a(e, dhf.h);
               case h:
                  return $$0.a(e, dhf.i);
               case i:
                  return $$0.a(e, dhf.j);
               case j:
                  return $$0.a(e, dhf.g);
               case a:
                  return $$0.a(e, dhf.b);
               case b:
                  return $$0.a(e, dhf.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      dhf $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dhf.f);
               case f:
                  return $$0.a(e, dhf.e);
               case g:
                  return $$0.a(e, dhf.j);
               case h:
                  return $$0.a(e, dhf.i);
               case i:
                  return $$0.a(e, dhf.h);
               case j:
                  return $$0.a(e, dhf.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dhf.d);
               case d:
                  return $$0.a(e, dhf.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dhf.h);
               case h:
                  return $$0.a(e, dhf.g);
               case i:
                  return $$0.a(e, dhf.j);
               case j:
                  return $$0.a(e, dhf.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(e, f, c);
   }
}
