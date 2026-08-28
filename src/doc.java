import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class doc extends dlp {
   public static final MapCodec<doc> b = b(doc::new);
   public static final eax<ebd> c = eap.ak;
   public static final eaq d = eap.A;
   private static final int e = 20;

   @Override
   public MapCodec<doc> a() {
      return b;
   }

   public doc(dzy.d $$0) {
      super(true, $$0);
      this.l(this.B.b().b(d, Boolean.valueOf(false)).b(c, ebd.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dzz $$0) {
      return true;
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if (!$$1.C) {
         if (!$$0.c(d)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(d)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dzz $$0, dib $$1, iu $$2, ja $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$3 == ja.b ? 15 : 0;
      }
   }

   private void a(div $$0, iu $$1, dzz $$2) {
      if (this.a($$2, (diy)$$0, $$1)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = false;
         List<ctk> $$5 = this.a($$0, $$1, ctk.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dzz $$6 = $$2.b(d, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dzz $$7 = $$2.b(d, Boolean.valueOf(false));
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

   protected void b(div $$0, iu $$1, dzz $$2, boolean $$3) {
      dsg $$4 = new dsg($$0, $$1, $$2);

      for (iu $$6 : $$4.a()) {
         dzz $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dzz $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public ebc<ebd> c() {
      return c;
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      if ($$0.c(d)) {
         List<ctu> $$3 = this.a($$1, $$2, ctu.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).q().k();
         }

         List<ctk> $$4 = this.a($$1, $$2, ctk.class, bwk.d);
         if (!$$4.isEmpty()) {
            return cuq.b((btu)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends ctk> List<T> a(div $$0, iu $$1, Class<T> $$2, Predicate<bwd> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fed a(iu $$0) {
      double $$1 = 0.2;
      return new fed(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      switch ($$1) {
         case c:
            switch ((ebd)$$0.c(c)) {
               case c:
                  return $$0.b(c, ebd.d);
               case d:
                  return $$0.b(c, ebd.c);
               case e:
                  return $$0.b(c, ebd.f);
               case f:
                  return $$0.b(c, ebd.e);
               case g:
                  return $$0.b(c, ebd.i);
               case h:
                  return $$0.b(c, ebd.j);
               case i:
                  return $$0.b(c, ebd.g);
               case j:
                  return $$0.b(c, ebd.h);
            }
         case d:
            switch ((ebd)$$0.c(c)) {
               case c:
                  return $$0.b(c, ebd.e);
               case d:
                  return $$0.b(c, ebd.f);
               case e:
                  return $$0.b(c, ebd.d);
               case f:
                  return $$0.b(c, ebd.c);
               case g:
                  return $$0.b(c, ebd.j);
               case h:
                  return $$0.b(c, ebd.g);
               case i:
                  return $$0.b(c, ebd.h);
               case j:
                  return $$0.b(c, ebd.i);
               case a:
                  return $$0.b(c, ebd.b);
               case b:
                  return $$0.b(c, ebd.a);
            }
         case b:
            switch ((ebd)$$0.c(c)) {
               case c:
                  return $$0.b(c, ebd.f);
               case d:
                  return $$0.b(c, ebd.e);
               case e:
                  return $$0.b(c, ebd.c);
               case f:
                  return $$0.b(c, ebd.d);
               case g:
                  return $$0.b(c, ebd.h);
               case h:
                  return $$0.b(c, ebd.i);
               case i:
                  return $$0.b(c, ebd.j);
               case j:
                  return $$0.b(c, ebd.g);
               case a:
                  return $$0.b(c, ebd.b);
               case b:
                  return $$0.b(c, ebd.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      ebd $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, ebd.f);
               case f:
                  return $$0.b(c, ebd.e);
               case g:
                  return $$0.b(c, ebd.j);
               case h:
                  return $$0.b(c, ebd.i);
               case i:
                  return $$0.b(c, ebd.h);
               case j:
                  return $$0.b(c, ebd.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, ebd.d);
               case d:
                  return $$0.b(c, ebd.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, ebd.h);
               case h:
                  return $$0.b(c, ebd.g);
               case i:
                  return $$0.b(c, ebd.j);
               case j:
                  return $$0.b(c, ebd.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c, d, a);
   }
}
