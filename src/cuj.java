import java.util.List;
import java.util.function.Predicate;

public class cuj extends csc {
   public static final dfy<dge> d = dfq.ah;
   public static final dfr e = dfq.w;
   private static final int f = 20;

   public cuj(dez.d $$0) {
      super(true, $$0);
      this.k(this.C.b().a(e, Boolean.valueOf(false)).a(d, dge.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(dfa $$0) {
      return true;
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      if (!$$1.B) {
         if (!$$0.c(e)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$0.c(e)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$0.c(e) ? 15 : 0;
   }

   @Override
   public int b(dfa $$0, cos $$1, gu $$2, ha $$3) {
      if (!$$0.c(e)) {
         return 0;
      } else {
         return $$3 == ha.b ? 15 : 0;
      }
   }

   private void a(cpm $$0, gu $$1, dfa $$2) {
      if (this.a($$2, (cpp)$$0, $$1)) {
         boolean $$3 = $$2.c(e);
         boolean $$4 = false;
         List<cde> $$5 = this.a($$0, $$1, cde.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dfa $$6 = $$2.a(e, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dfa $$7 = $$2.a(e, Boolean.valueOf(false));
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

   protected void b(cpm $$0, gu $$1, dfa $$2, boolean $$3) {
      cyl $$4 = new cyl($$0, $$1, $$2);

      for (gu $$6 : $$4.a()) {
         dfa $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dfa $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dgd<dge> b() {
      return d;
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      if ($$0.c(e)) {
         List<cdm> $$3 = this.a($$1, $$2, cdm.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).A().k();
         }

         List<cde> $$4 = this.a($$1, $$2, cde.class, bil.d);
         if (!$$4.isEmpty()) {
            return cee.b((bgj)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cde> List<T> a(cpm $$0, gu $$1, Class<T> $$2, Predicate<bii> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private egz a(gu $$0) {
      double $$1 = 0.2;
      return new egz(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      switch ($$1) {
         case c:
            switch ((dge)$$0.c(d)) {
               case c:
                  return $$0.a(d, dge.d);
               case d:
                  return $$0.a(d, dge.c);
               case e:
                  return $$0.a(d, dge.f);
               case f:
                  return $$0.a(d, dge.e);
               case g:
                  return $$0.a(d, dge.i);
               case h:
                  return $$0.a(d, dge.j);
               case i:
                  return $$0.a(d, dge.g);
               case j:
                  return $$0.a(d, dge.h);
            }
         case d:
            switch ((dge)$$0.c(d)) {
               case c:
                  return $$0.a(d, dge.e);
               case d:
                  return $$0.a(d, dge.f);
               case e:
                  return $$0.a(d, dge.d);
               case f:
                  return $$0.a(d, dge.c);
               case g:
                  return $$0.a(d, dge.j);
               case h:
                  return $$0.a(d, dge.g);
               case i:
                  return $$0.a(d, dge.h);
               case j:
                  return $$0.a(d, dge.i);
               case a:
                  return $$0.a(d, dge.b);
               case b:
                  return $$0.a(d, dge.a);
            }
         case b:
            switch ((dge)$$0.c(d)) {
               case c:
                  return $$0.a(d, dge.f);
               case d:
                  return $$0.a(d, dge.e);
               case e:
                  return $$0.a(d, dge.c);
               case f:
                  return $$0.a(d, dge.d);
               case g:
                  return $$0.a(d, dge.h);
               case h:
                  return $$0.a(d, dge.i);
               case i:
                  return $$0.a(d, dge.j);
               case j:
                  return $$0.a(d, dge.g);
               case a:
                  return $$0.a(d, dge.b);
               case b:
                  return $$0.a(d, dge.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      dge $$2 = $$0.c(d);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(d, dge.f);
               case f:
                  return $$0.a(d, dge.e);
               case g:
                  return $$0.a(d, dge.j);
               case h:
                  return $$0.a(d, dge.i);
               case i:
                  return $$0.a(d, dge.h);
               case j:
                  return $$0.a(d, dge.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(d, dge.d);
               case d:
                  return $$0.a(d, dge.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(d, dge.h);
               case h:
                  return $$0.a(d, dge.g);
               case i:
                  return $$0.a(d, dge.j);
               case j:
                  return $$0.a(d, dge.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(d, e, c);
   }
}
