import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dhi extends dew {
   public static final MapCodec<dhi> d = b(dhi::new);
   public static final dti<dto> e = dta.ah;
   public static final dtb f = dta.w;
   private static final int g = 20;

   @Override
   public MapCodec<dhi> a() {
      return d;
   }

   public dhi(dsj.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dto.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dsk $$0) {
      return true;
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jf.b ? 15 : 0;
      }
   }

   private void a(dcf $$0, ja $$1, dsk $$2) {
      if (this.a($$2, (dci)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cof> $$5 = this.a($$0, $$1, cof.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dsk $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dsk $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(dcf $$0, ja $$1, dsk $$2, boolean $$3) {
      dlh $$4 = new dlh($$0, $$1, $$2);

      for (ja $$6 : $$4.a()) {
         dsk $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dsk $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dtn<dto> c() {
      return e;
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      if ($$0.c(f)) {
         List<coo> $$3 = this.a($$1, $$2, coo.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<cof> $$4 = this.a($$1, $$2, cof.class, bsl.d);
         if (!$$4.isEmpty()) {
            return cph.b((bpz)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cof> List<T> a(dcf $$0, ja $$1, Class<T> $$2, Predicate<bsg> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ewa a(ja $$0) {
      double $$1 = 0.2;
      return new ewa(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      switch ($$1) {
         case c:
            switch ((dto)$$0.c(e)) {
               case c:
                  return $$0.a(e, dto.d);
               case d:
                  return $$0.a(e, dto.c);
               case e:
                  return $$0.a(e, dto.f);
               case f:
                  return $$0.a(e, dto.e);
               case g:
                  return $$0.a(e, dto.i);
               case h:
                  return $$0.a(e, dto.j);
               case i:
                  return $$0.a(e, dto.g);
               case j:
                  return $$0.a(e, dto.h);
            }
         case d:
            switch ((dto)$$0.c(e)) {
               case c:
                  return $$0.a(e, dto.e);
               case d:
                  return $$0.a(e, dto.f);
               case e:
                  return $$0.a(e, dto.d);
               case f:
                  return $$0.a(e, dto.c);
               case g:
                  return $$0.a(e, dto.j);
               case h:
                  return $$0.a(e, dto.g);
               case i:
                  return $$0.a(e, dto.h);
               case j:
                  return $$0.a(e, dto.i);
               case a:
                  return $$0.a(e, dto.b);
               case b:
                  return $$0.a(e, dto.a);
            }
         case b:
            switch ((dto)$$0.c(e)) {
               case c:
                  return $$0.a(e, dto.f);
               case d:
                  return $$0.a(e, dto.e);
               case e:
                  return $$0.a(e, dto.c);
               case f:
                  return $$0.a(e, dto.d);
               case g:
                  return $$0.a(e, dto.h);
               case h:
                  return $$0.a(e, dto.i);
               case i:
                  return $$0.a(e, dto.j);
               case j:
                  return $$0.a(e, dto.g);
               case a:
                  return $$0.a(e, dto.b);
               case b:
                  return $$0.a(e, dto.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      dto $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dto.f);
               case f:
                  return $$0.a(e, dto.e);
               case g:
                  return $$0.a(e, dto.j);
               case h:
                  return $$0.a(e, dto.i);
               case i:
                  return $$0.a(e, dto.h);
               case j:
                  return $$0.a(e, dto.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dto.d);
               case d:
                  return $$0.a(e, dto.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dto.h);
               case h:
                  return $$0.a(e, dto.g);
               case i:
                  return $$0.a(e, dto.j);
               case j:
                  return $$0.a(e, dto.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(e, f, c);
   }
}
