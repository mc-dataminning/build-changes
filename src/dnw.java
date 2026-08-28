import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dnw extends dlj {
   public static final MapCodec<dnw> b = b(dnw::new);
   public static final eam<eas> c = eae.ak;
   public static final eaf d = eae.A;
   private static final int e = 20;

   @Override
   public MapCodec<dnw> a() {
      return b;
   }

   public dnw(dzn.d $$0) {
      super(true, $$0);
      this.l(this.B.b().b(d, Boolean.valueOf(false)).b(c, eas.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dzo $$0) {
      return true;
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if (!$$1.C) {
         if (!$$0.c(d)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$0.c(d)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$3 == ja.b ? 15 : 0;
      }
   }

   private void a(dip $$0, iu $$1, dzo $$2) {
      if (this.a($$2, (dis)$$0, $$1)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = false;
         List<cte> $$5 = this.a($$0, $$1, cte.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dzo $$6 = $$2.b(d, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dzo $$7 = $$2.b(d, Boolean.valueOf(false));
            $$0.a($$1, $$7, 3);
            this.b($$0, $$1, $$7, false);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$7);
         }

         if ($$4) {
            $$0.a($$1, this, 20);
         }

         $$0.b($$1, this);
      }
   }

   protected void b(dip $$0, iu $$1, dzo $$2, boolean $$3) {
      drz $$4 = new drz($$0, $$1, $$2);

      for (iu $$6 : $$4.a()) {
         dzo $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dzo $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public ear<eas> c() {
      return c;
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      if ($$0.c(d)) {
         List<cto> $$3 = this.a($$1, $$2, cto.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).q().k();
         }

         List<cte> $$4 = this.a($$1, $$2, cte.class, bwh.d);
         if (!$$4.isEmpty()) {
            return cuk.b((btr)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cte> List<T> a(dip $$0, iu $$1, Class<T> $$2, Predicate<bwa> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fdr a(iu $$0) {
      double $$1 = 0.2;
      return new fdr(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      switch ($$1) {
         case c:
            switch ((eas)$$0.c(c)) {
               case c:
                  return $$0.b(c, eas.d);
               case d:
                  return $$0.b(c, eas.c);
               case e:
                  return $$0.b(c, eas.f);
               case f:
                  return $$0.b(c, eas.e);
               case g:
                  return $$0.b(c, eas.i);
               case h:
                  return $$0.b(c, eas.j);
               case i:
                  return $$0.b(c, eas.g);
               case j:
                  return $$0.b(c, eas.h);
            }
         case d:
            switch ((eas)$$0.c(c)) {
               case c:
                  return $$0.b(c, eas.e);
               case d:
                  return $$0.b(c, eas.f);
               case e:
                  return $$0.b(c, eas.d);
               case f:
                  return $$0.b(c, eas.c);
               case g:
                  return $$0.b(c, eas.j);
               case h:
                  return $$0.b(c, eas.g);
               case i:
                  return $$0.b(c, eas.h);
               case j:
                  return $$0.b(c, eas.i);
               case a:
                  return $$0.b(c, eas.b);
               case b:
                  return $$0.b(c, eas.a);
            }
         case b:
            switch ((eas)$$0.c(c)) {
               case c:
                  return $$0.b(c, eas.f);
               case d:
                  return $$0.b(c, eas.e);
               case e:
                  return $$0.b(c, eas.c);
               case f:
                  return $$0.b(c, eas.d);
               case g:
                  return $$0.b(c, eas.h);
               case h:
                  return $$0.b(c, eas.i);
               case i:
                  return $$0.b(c, eas.j);
               case j:
                  return $$0.b(c, eas.g);
               case a:
                  return $$0.b(c, eas.b);
               case b:
                  return $$0.b(c, eas.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      eas $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, eas.f);
               case f:
                  return $$0.b(c, eas.e);
               case g:
                  return $$0.b(c, eas.j);
               case h:
                  return $$0.b(c, eas.i);
               case i:
                  return $$0.b(c, eas.h);
               case j:
                  return $$0.b(c, eas.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, eas.d);
               case d:
                  return $$0.b(c, eas.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, eas.h);
               case h:
                  return $$0.b(c, eas.g);
               case i:
                  return $$0.b(c, eas.j);
               case j:
                  return $$0.b(c, eas.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c, d, a);
   }
}
