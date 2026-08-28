import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dkr extends dif {
   public static final MapCodec<dkr> d = b(dkr::new);
   public static final dws<dwy> e = dwl.ah;
   public static final dwm f = dwl.w;
   private static final int g = 20;

   @Override
   public MapCodec<dkr> a() {
      return d;
   }

   public dkr(dvu.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(e, dwy.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dvv $$0) {
      return true;
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if (!$$1.C) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dvv $$0, der $$1, jh $$2, jm $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jm.b ? 15 : 0;
      }
   }

   private void a(dfm $$0, jh $$1, dvv $$2) {
      if (this.a($$2, (dfp)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cqt> $$5 = this.a($$0, $$1, cqt.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dvv $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dvv $$7 = $$2.b(f, Boolean.valueOf(false));
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

   protected void b(dfm $$0, jh $$1, dvv $$2, boolean $$3) {
      doq $$4 = new doq($$0, $$1, $$2);

      for (jh $$6 : $$4.a()) {
         dvv $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dvv $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dwx<dwy> c() {
      return e;
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      if ($$0.c(f)) {
         List<crd> $$3 = this.a($$1, $$2, crd.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).u().k();
         }

         List<cqt> $$4 = this.a($$1, $$2, cqt.class, buq.d);
         if (!$$4.isEmpty()) {
            return crz.b((bsd)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cqt> List<T> a(dfm $$0, jh $$1, Class<T> $$2, Predicate<bul> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ezt a(jh $$0) {
      double $$1 = 0.2;
      return new ezt(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      switch ($$1) {
         case c:
            switch ((dwy)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwy.d);
               case d:
                  return $$0.b(e, dwy.c);
               case e:
                  return $$0.b(e, dwy.f);
               case f:
                  return $$0.b(e, dwy.e);
               case g:
                  return $$0.b(e, dwy.i);
               case h:
                  return $$0.b(e, dwy.j);
               case i:
                  return $$0.b(e, dwy.g);
               case j:
                  return $$0.b(e, dwy.h);
            }
         case d:
            switch ((dwy)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwy.e);
               case d:
                  return $$0.b(e, dwy.f);
               case e:
                  return $$0.b(e, dwy.d);
               case f:
                  return $$0.b(e, dwy.c);
               case g:
                  return $$0.b(e, dwy.j);
               case h:
                  return $$0.b(e, dwy.g);
               case i:
                  return $$0.b(e, dwy.h);
               case j:
                  return $$0.b(e, dwy.i);
               case a:
                  return $$0.b(e, dwy.b);
               case b:
                  return $$0.b(e, dwy.a);
            }
         case b:
            switch ((dwy)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwy.f);
               case d:
                  return $$0.b(e, dwy.e);
               case e:
                  return $$0.b(e, dwy.c);
               case f:
                  return $$0.b(e, dwy.d);
               case g:
                  return $$0.b(e, dwy.h);
               case h:
                  return $$0.b(e, dwy.i);
               case i:
                  return $$0.b(e, dwy.j);
               case j:
                  return $$0.b(e, dwy.g);
               case a:
                  return $$0.b(e, dwy.b);
               case b:
                  return $$0.b(e, dwy.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      dwy $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dwy.f);
               case f:
                  return $$0.b(e, dwy.e);
               case g:
                  return $$0.b(e, dwy.j);
               case h:
                  return $$0.b(e, dwy.i);
               case i:
                  return $$0.b(e, dwy.h);
               case j:
                  return $$0.b(e, dwy.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dwy.d);
               case d:
                  return $$0.b(e, dwy.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dwy.h);
               case h:
                  return $$0.b(e, dwy.g);
               case i:
                  return $$0.b(e, dwy.j);
               case j:
                  return $$0.b(e, dwy.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(e, f, c);
   }
}
