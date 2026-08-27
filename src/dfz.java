import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dfz extends ddn {
   public static final MapCodec<dfz> d = b(dfz::new);
   public static final drz<dsf> e = drr.ah;
   public static final drs f = drr.w;
   private static final int g = 20;

   @Override
   public MapCodec<dfz> a() {
      return d;
   }

   public dfz(dra.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dsf.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(drb $$0) {
      return true;
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(drb $$0, dad $$1, io $$2, it $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(drb $$0, dad $$1, io $$2, it $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == it.b ? 15 : 0;
      }
   }

   private void a(dax $$0, io $$1, drb $$2) {
      if (this.a($$2, (dba)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cnr> $$5 = this.a($$0, $$1, cnr.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            drb $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            drb $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(dax $$0, io $$1, drb $$2, boolean $$3) {
      djy $$4 = new djy($$0, $$1, $$2);

      for (io $$6 : $$4.a()) {
         drb $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         drb $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dse<dsf> c() {
      return e;
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      if ($$0.c(f)) {
         List<cnz> $$3 = this.a($$1, $$2, cnz.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<cnr> $$4 = this.a($$1, $$2, cnr.class, brz.d);
         if (!$$4.isEmpty()) {
            return cot.b((bpn)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cnr> List<T> a(dax $$0, io $$1, Class<T> $$2, Predicate<bru> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private euf a(io $$0) {
      double $$1 = 0.2;
      return new euf(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      switch ($$1) {
         case c:
            switch ((dsf)$$0.c(e)) {
               case c:
                  return $$0.a(e, dsf.d);
               case d:
                  return $$0.a(e, dsf.c);
               case e:
                  return $$0.a(e, dsf.f);
               case f:
                  return $$0.a(e, dsf.e);
               case g:
                  return $$0.a(e, dsf.i);
               case h:
                  return $$0.a(e, dsf.j);
               case i:
                  return $$0.a(e, dsf.g);
               case j:
                  return $$0.a(e, dsf.h);
            }
         case d:
            switch ((dsf)$$0.c(e)) {
               case c:
                  return $$0.a(e, dsf.e);
               case d:
                  return $$0.a(e, dsf.f);
               case e:
                  return $$0.a(e, dsf.d);
               case f:
                  return $$0.a(e, dsf.c);
               case g:
                  return $$0.a(e, dsf.j);
               case h:
                  return $$0.a(e, dsf.g);
               case i:
                  return $$0.a(e, dsf.h);
               case j:
                  return $$0.a(e, dsf.i);
               case a:
                  return $$0.a(e, dsf.b);
               case b:
                  return $$0.a(e, dsf.a);
            }
         case b:
            switch ((dsf)$$0.c(e)) {
               case c:
                  return $$0.a(e, dsf.f);
               case d:
                  return $$0.a(e, dsf.e);
               case e:
                  return $$0.a(e, dsf.c);
               case f:
                  return $$0.a(e, dsf.d);
               case g:
                  return $$0.a(e, dsf.h);
               case h:
                  return $$0.a(e, dsf.i);
               case i:
                  return $$0.a(e, dsf.j);
               case j:
                  return $$0.a(e, dsf.g);
               case a:
                  return $$0.a(e, dsf.b);
               case b:
                  return $$0.a(e, dsf.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      dsf $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dsf.f);
               case f:
                  return $$0.a(e, dsf.e);
               case g:
                  return $$0.a(e, dsf.j);
               case h:
                  return $$0.a(e, dsf.i);
               case i:
                  return $$0.a(e, dsf.h);
               case j:
                  return $$0.a(e, dsf.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dsf.d);
               case d:
                  return $$0.a(e, dsf.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dsf.h);
               case h:
                  return $$0.a(e, dsf.g);
               case i:
                  return $$0.a(e, dsf.j);
               case j:
                  return $$0.a(e, dsf.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(e, f, c);
   }
}
