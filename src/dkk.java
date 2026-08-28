import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dkk extends dhy {
   public static final MapCodec<dkk> d = b(dkk::new);
   public static final dwl<dwr> e = dwe.ah;
   public static final dwf f = dwe.w;
   private static final int g = 20;

   @Override
   public MapCodec<dkk> a() {
      return d;
   }

   public dkk(dvn.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(e, dwr.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dvo $$0) {
      return true;
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if (!$$1.C) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dvo $$0, dek $$1, jh $$2, jm $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jm.b ? 15 : 0;
      }
   }

   private void a(dff $$0, jh $$1, dvo $$2) {
      if (this.a($$2, (dfi)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cqo> $$5 = this.a($$0, $$1, cqo.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dvo $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dvo $$7 = $$2.b(f, Boolean.valueOf(false));
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

   protected void b(dff $$0, jh $$1, dvo $$2, boolean $$3) {
      doj $$4 = new doj($$0, $$1, $$2);

      for (jh $$6 : $$4.a()) {
         dvo $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dvo $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dwq<dwr> c() {
      return e;
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      if ($$0.c(f)) {
         List<cqx> $$3 = this.a($$1, $$2, cqx.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).F().k();
         }

         List<cqo> $$4 = this.a($$1, $$2, cqo.class, bun.d);
         if (!$$4.isEmpty()) {
            return crs.b((bsa)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cqo> List<T> a(dff $$0, jh $$1, Class<T> $$2, Predicate<bui> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ezm a(jh $$0) {
      double $$1 = 0.2;
      return new ezm(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      switch ($$1) {
         case c:
            switch ((dwr)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwr.d);
               case d:
                  return $$0.b(e, dwr.c);
               case e:
                  return $$0.b(e, dwr.f);
               case f:
                  return $$0.b(e, dwr.e);
               case g:
                  return $$0.b(e, dwr.i);
               case h:
                  return $$0.b(e, dwr.j);
               case i:
                  return $$0.b(e, dwr.g);
               case j:
                  return $$0.b(e, dwr.h);
            }
         case d:
            switch ((dwr)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwr.e);
               case d:
                  return $$0.b(e, dwr.f);
               case e:
                  return $$0.b(e, dwr.d);
               case f:
                  return $$0.b(e, dwr.c);
               case g:
                  return $$0.b(e, dwr.j);
               case h:
                  return $$0.b(e, dwr.g);
               case i:
                  return $$0.b(e, dwr.h);
               case j:
                  return $$0.b(e, dwr.i);
               case a:
                  return $$0.b(e, dwr.b);
               case b:
                  return $$0.b(e, dwr.a);
            }
         case b:
            switch ((dwr)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwr.f);
               case d:
                  return $$0.b(e, dwr.e);
               case e:
                  return $$0.b(e, dwr.c);
               case f:
                  return $$0.b(e, dwr.d);
               case g:
                  return $$0.b(e, dwr.h);
               case h:
                  return $$0.b(e, dwr.i);
               case i:
                  return $$0.b(e, dwr.j);
               case j:
                  return $$0.b(e, dwr.g);
               case a:
                  return $$0.b(e, dwr.b);
               case b:
                  return $$0.b(e, dwr.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      dwr $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dwr.f);
               case f:
                  return $$0.b(e, dwr.e);
               case g:
                  return $$0.b(e, dwr.j);
               case h:
                  return $$0.b(e, dwr.i);
               case i:
                  return $$0.b(e, dwr.h);
               case j:
                  return $$0.b(e, dwr.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dwr.d);
               case d:
                  return $$0.b(e, dwr.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dwr.h);
               case h:
                  return $$0.b(e, dwr.g);
               case i:
                  return $$0.b(e, dwr.j);
               case j:
                  return $$0.b(e, dwr.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(e, f, c);
   }
}
