import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dot extends dmg {
   public static final MapCodec<dot> b = b(dot::new);
   public static final ebr<ebx> c = ebj.ak;
   public static final ebk d = ebj.A;
   private static final int e = 20;

   @Override
   public MapCodec<dot> a() {
      return b;
   }

   public dot(eas.d $$0) {
      super(true, $$0);
      this.l(this.C.b().b(d, Boolean.valueOf(false)).b(c, ebx.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(eat $$0) {
      return true;
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if (!$$1.C) {
         if (!$$0.c(d)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(d)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(eat $$0, diq $$1, iv $$2, jb $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$3 == jb.b ? 15 : 0;
      }
   }

   private void a(djm $$0, iv $$1, eat $$2) {
      if (this.a($$2, (djp)$$0, $$1)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = false;
         List<ctz> $$5 = this.a($$0, $$1, ctz.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            eat $$6 = $$2.b(d, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            eat $$7 = $$2.b(d, Boolean.valueOf(false));
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

   protected void b(djm $$0, iv $$1, eat $$2, boolean $$3) {
      dsy $$4 = new dsy($$0, $$1, $$2);

      for (iv $$6 : $$4.a()) {
         eat $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         eat $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public ebw<ebx> c() {
      return c;
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      if ($$0.c(d)) {
         List<cuj> $$3 = this.a($$1, $$2, cuj.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).q().k();
         }

         List<ctz> $$4 = this.a($$1, $$2, ctz.class, bwp.d);
         if (!$$4.isEmpty()) {
            return cvf.b((btz)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends ctz> List<T> a(djm $$0, iv $$1, Class<T> $$2, Predicate<bwi> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fex a(iv $$0) {
      double $$1 = 0.2;
      return new fex(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      switch ($$1) {
         case c:
            switch ((ebx)$$0.c(c)) {
               case c:
                  return $$0.b(c, ebx.d);
               case d:
                  return $$0.b(c, ebx.c);
               case e:
                  return $$0.b(c, ebx.f);
               case f:
                  return $$0.b(c, ebx.e);
               case g:
                  return $$0.b(c, ebx.i);
               case h:
                  return $$0.b(c, ebx.j);
               case i:
                  return $$0.b(c, ebx.g);
               case j:
                  return $$0.b(c, ebx.h);
            }
         case d:
            switch ((ebx)$$0.c(c)) {
               case c:
                  return $$0.b(c, ebx.e);
               case d:
                  return $$0.b(c, ebx.f);
               case e:
                  return $$0.b(c, ebx.d);
               case f:
                  return $$0.b(c, ebx.c);
               case g:
                  return $$0.b(c, ebx.j);
               case h:
                  return $$0.b(c, ebx.g);
               case i:
                  return $$0.b(c, ebx.h);
               case j:
                  return $$0.b(c, ebx.i);
               case a:
                  return $$0.b(c, ebx.b);
               case b:
                  return $$0.b(c, ebx.a);
            }
         case b:
            switch ((ebx)$$0.c(c)) {
               case c:
                  return $$0.b(c, ebx.f);
               case d:
                  return $$0.b(c, ebx.e);
               case e:
                  return $$0.b(c, ebx.c);
               case f:
                  return $$0.b(c, ebx.d);
               case g:
                  return $$0.b(c, ebx.h);
               case h:
                  return $$0.b(c, ebx.i);
               case i:
                  return $$0.b(c, ebx.j);
               case j:
                  return $$0.b(c, ebx.g);
               case a:
                  return $$0.b(c, ebx.b);
               case b:
                  return $$0.b(c, ebx.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      ebx $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, ebx.f);
               case f:
                  return $$0.b(c, ebx.e);
               case g:
                  return $$0.b(c, ebx.j);
               case h:
                  return $$0.b(c, ebx.i);
               case i:
                  return $$0.b(c, ebx.h);
               case j:
                  return $$0.b(c, ebx.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, ebx.d);
               case d:
                  return $$0.b(c, ebx.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, ebx.h);
               case h:
                  return $$0.b(c, ebx.g);
               case i:
                  return $$0.b(c, ebx.j);
               case j:
                  return $$0.b(c, ebx.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c, d, a);
   }
}
