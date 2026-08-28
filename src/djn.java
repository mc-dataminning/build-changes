import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class djn extends dhb {
   public static final MapCodec<djn> d = b(djn::new);
   public static final dvq<dvw> e = dvi.ah;
   public static final dvj f = dvi.w;
   private static final int g = 20;

   @Override
   public MapCodec<djn> a() {
      return d;
   }

   public djn(dur.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(e, dvw.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dus $$0, ddo $$1, jf $$2, jk $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jk.b ? 15 : 0;
      }
   }

   private void a(dej $$0, jf $$1, dus $$2) {
      if (this.a($$2, (dem)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cpv> $$5 = this.a($$0, $$1, cpv.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dus $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dus $$7 = $$2.b(f, Boolean.valueOf(false));
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

   protected void b(dej $$0, jf $$1, dus $$2, boolean $$3) {
      dnn $$4 = new dnn($$0, $$1, $$2);

      for (jf $$6 : $$4.a()) {
         dus $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dus $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dvv<dvw> c() {
      return e;
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      if ($$0.c(f)) {
         List<cqe> $$3 = this.a($$1, $$2, cqe.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).F().k();
         }

         List<cpv> $$4 = this.a($$1, $$2, cpv.class, btw.d);
         if (!$$4.isEmpty()) {
            return cqz.b((brl)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cpv> List<T> a(dej $$0, jf $$1, Class<T> $$2, Predicate<btr> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private eyr a(jf $$0) {
      double $$1 = 0.2;
      return new eyr(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      switch ($$1) {
         case c:
            switch ((dvw)$$0.c(e)) {
               case c:
                  return $$0.b(e, dvw.d);
               case d:
                  return $$0.b(e, dvw.c);
               case e:
                  return $$0.b(e, dvw.f);
               case f:
                  return $$0.b(e, dvw.e);
               case g:
                  return $$0.b(e, dvw.i);
               case h:
                  return $$0.b(e, dvw.j);
               case i:
                  return $$0.b(e, dvw.g);
               case j:
                  return $$0.b(e, dvw.h);
            }
         case d:
            switch ((dvw)$$0.c(e)) {
               case c:
                  return $$0.b(e, dvw.e);
               case d:
                  return $$0.b(e, dvw.f);
               case e:
                  return $$0.b(e, dvw.d);
               case f:
                  return $$0.b(e, dvw.c);
               case g:
                  return $$0.b(e, dvw.j);
               case h:
                  return $$0.b(e, dvw.g);
               case i:
                  return $$0.b(e, dvw.h);
               case j:
                  return $$0.b(e, dvw.i);
               case a:
                  return $$0.b(e, dvw.b);
               case b:
                  return $$0.b(e, dvw.a);
            }
         case b:
            switch ((dvw)$$0.c(e)) {
               case c:
                  return $$0.b(e, dvw.f);
               case d:
                  return $$0.b(e, dvw.e);
               case e:
                  return $$0.b(e, dvw.c);
               case f:
                  return $$0.b(e, dvw.d);
               case g:
                  return $$0.b(e, dvw.h);
               case h:
                  return $$0.b(e, dvw.i);
               case i:
                  return $$0.b(e, dvw.j);
               case j:
                  return $$0.b(e, dvw.g);
               case a:
                  return $$0.b(e, dvw.b);
               case b:
                  return $$0.b(e, dvw.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      dvw $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dvw.f);
               case f:
                  return $$0.b(e, dvw.e);
               case g:
                  return $$0.b(e, dvw.j);
               case h:
                  return $$0.b(e, dvw.i);
               case i:
                  return $$0.b(e, dvw.h);
               case j:
                  return $$0.b(e, dvw.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dvw.d);
               case d:
                  return $$0.b(e, dvw.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dvw.h);
               case h:
                  return $$0.b(e, dvw.g);
               case i:
                  return $$0.b(e, dvw.j);
               case j:
                  return $$0.b(e, dvw.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(e, f, c);
   }
}
