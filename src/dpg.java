import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dpg extends dmt {
   public static final MapCodec<dpg> b = b(dpg::new);
   public static final ece<eck> c = ebw.ak;
   public static final ebx d = ebw.A;
   private static final int e = 20;

   @Override
   public MapCodec<dpg> a() {
      return b;
   }

   public dpg(ebf.d $$0) {
      super(true, $$0);
      this.l(this.C.b().b(d, Boolean.valueOf(false)).b(c, eck.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(ebg $$0) {
      return true;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if (!$$1.C) {
         if (!$$0.c(d)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$0.c(d)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(ebg $$0, djd $$1, iw $$2, jc $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$3 == jc.b ? 15 : 0;
      }
   }

   private void a(djz $$0, iw $$1, ebg $$2) {
      if (this.a($$2, (dkc)$$0, $$1)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = false;
         List<cum> $$5 = this.a($$0, $$1, cum.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            ebg $$6 = $$2.b(d, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            ebg $$7 = $$2.b(d, Boolean.valueOf(false));
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

   protected void b(djz $$0, iw $$1, ebg $$2, boolean $$3) {
      dtl $$4 = new dtl($$0, $$1, $$2);

      for (iw $$6 : $$4.a()) {
         ebg $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         ebg $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public ecj<eck> c() {
      return c;
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      if ($$0.c(d)) {
         List<cuw> $$3 = this.a($$1, $$2, cuw.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).q().k();
         }

         List<cum> $$4 = this.a($$1, $$2, cum.class, bxc.d);
         if (!$$4.isEmpty()) {
            return cvs.b((bum)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cum> List<T> a(djz $$0, iw $$1, Class<T> $$2, Predicate<bwv> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ffn a(iw $$0) {
      double $$1 = 0.2;
      return new ffn(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      switch ($$1) {
         case c:
            switch ((eck)$$0.c(c)) {
               case c:
                  return $$0.b(c, eck.d);
               case d:
                  return $$0.b(c, eck.c);
               case e:
                  return $$0.b(c, eck.f);
               case f:
                  return $$0.b(c, eck.e);
               case g:
                  return $$0.b(c, eck.i);
               case h:
                  return $$0.b(c, eck.j);
               case i:
                  return $$0.b(c, eck.g);
               case j:
                  return $$0.b(c, eck.h);
            }
         case d:
            switch ((eck)$$0.c(c)) {
               case c:
                  return $$0.b(c, eck.e);
               case d:
                  return $$0.b(c, eck.f);
               case e:
                  return $$0.b(c, eck.d);
               case f:
                  return $$0.b(c, eck.c);
               case g:
                  return $$0.b(c, eck.j);
               case h:
                  return $$0.b(c, eck.g);
               case i:
                  return $$0.b(c, eck.h);
               case j:
                  return $$0.b(c, eck.i);
               case a:
                  return $$0.b(c, eck.b);
               case b:
                  return $$0.b(c, eck.a);
            }
         case b:
            switch ((eck)$$0.c(c)) {
               case c:
                  return $$0.b(c, eck.f);
               case d:
                  return $$0.b(c, eck.e);
               case e:
                  return $$0.b(c, eck.c);
               case f:
                  return $$0.b(c, eck.d);
               case g:
                  return $$0.b(c, eck.h);
               case h:
                  return $$0.b(c, eck.i);
               case i:
                  return $$0.b(c, eck.j);
               case j:
                  return $$0.b(c, eck.g);
               case a:
                  return $$0.b(c, eck.b);
               case b:
                  return $$0.b(c, eck.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      eck $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, eck.f);
               case f:
                  return $$0.b(c, eck.e);
               case g:
                  return $$0.b(c, eck.j);
               case h:
                  return $$0.b(c, eck.i);
               case i:
                  return $$0.b(c, eck.h);
               case j:
                  return $$0.b(c, eck.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, eck.d);
               case d:
                  return $$0.b(c, eck.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, eck.h);
               case h:
                  return $$0.b(c, eck.g);
               case i:
                  return $$0.b(c, eck.j);
               case j:
                  return $$0.b(c, eck.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, d, a);
   }
}
