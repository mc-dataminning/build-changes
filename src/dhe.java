import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dhe extends deq {
   public static final MapCodec<dhe> d = b(dhe::new);
   public static final dua<dug> e = dts.ah;
   public static final dtt f = dts.w;
   private static final int g = 20;

   @Override
   public MapCodec<dhe> a() {
      return d;
   }

   public dhe(dtb.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dug.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if (!$$1.C) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == iw.b ? 15 : 0;
      }
   }

   private void a(dca $$0, ir $$1, dtc $$2) {
      if (this.a($$2, (dcd)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cnw> $$5 = this.a($$0, $$1, cnw.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dtc $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dtc $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(dca $$0, ir $$1, dtc $$2, boolean $$3) {
      dlq $$4 = new dlq($$0, $$1, $$2);

      for (ir $$6 : $$4.a()) {
         dtc $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dtc $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public duf<dug> c() {
      return e;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      if ($$0.c(f)) {
         List<coe> $$3 = this.a($$1, $$2, coe.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<cnw> $$4 = this.a($$1, $$2, cnw.class, bsa.d);
         if (!$$4.isEmpty()) {
            return cpg.b((bpt)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cnw> List<T> a(dca $$0, ir $$1, Class<T> $$2, Predicate<brv> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ewp a(ir $$0) {
      double $$1 = 0.2;
      return new ewp(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      switch ($$1) {
         case c:
            switch ((dug)$$0.c(e)) {
               case c:
                  return $$0.a(e, dug.d);
               case d:
                  return $$0.a(e, dug.c);
               case e:
                  return $$0.a(e, dug.f);
               case f:
                  return $$0.a(e, dug.e);
               case g:
                  return $$0.a(e, dug.i);
               case h:
                  return $$0.a(e, dug.j);
               case i:
                  return $$0.a(e, dug.g);
               case j:
                  return $$0.a(e, dug.h);
            }
         case d:
            switch ((dug)$$0.c(e)) {
               case c:
                  return $$0.a(e, dug.e);
               case d:
                  return $$0.a(e, dug.f);
               case e:
                  return $$0.a(e, dug.d);
               case f:
                  return $$0.a(e, dug.c);
               case g:
                  return $$0.a(e, dug.j);
               case h:
                  return $$0.a(e, dug.g);
               case i:
                  return $$0.a(e, dug.h);
               case j:
                  return $$0.a(e, dug.i);
               case a:
                  return $$0.a(e, dug.b);
               case b:
                  return $$0.a(e, dug.a);
            }
         case b:
            switch ((dug)$$0.c(e)) {
               case c:
                  return $$0.a(e, dug.f);
               case d:
                  return $$0.a(e, dug.e);
               case e:
                  return $$0.a(e, dug.c);
               case f:
                  return $$0.a(e, dug.d);
               case g:
                  return $$0.a(e, dug.h);
               case h:
                  return $$0.a(e, dug.i);
               case i:
                  return $$0.a(e, dug.j);
               case j:
                  return $$0.a(e, dug.g);
               case a:
                  return $$0.a(e, dug.b);
               case b:
                  return $$0.a(e, dug.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      dug $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dug.f);
               case f:
                  return $$0.a(e, dug.e);
               case g:
                  return $$0.a(e, dug.j);
               case h:
                  return $$0.a(e, dug.i);
               case i:
                  return $$0.a(e, dug.h);
               case j:
                  return $$0.a(e, dug.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dug.d);
               case d:
                  return $$0.a(e, dug.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dug.h);
               case h:
                  return $$0.a(e, dug.g);
               case i:
                  return $$0.a(e, dug.j);
               case j:
                  return $$0.a(e, dug.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(e, f, c);
   }
}
