import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dgb extends ddp {
   public static final MapCodec<dgb> d = b(dgb::new);
   public static final dsb<dsh> e = drt.ah;
   public static final dru f = drt.w;
   private static final int g = 20;

   @Override
   public MapCodec<dgb> a() {
      return d;
   }

   public dgb(drc.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dsh.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(drd $$0) {
      return true;
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(drd $$0, daf $$1, io $$2, it $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == it.b ? 15 : 0;
      }
   }

   private void a(daz $$0, io $$1, drd $$2) {
      if (this.a($$2, (dbc)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cnt> $$5 = this.a($$0, $$1, cnt.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            drd $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            drd $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(daz $$0, io $$1, drd $$2, boolean $$3) {
      dka $$4 = new dka($$0, $$1, $$2);

      for (io $$6 : $$4.a()) {
         drd $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         drd $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dsg<dsh> c() {
      return e;
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      if ($$0.c(f)) {
         List<cob> $$3 = this.a($$1, $$2, cob.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<cnt> $$4 = this.a($$1, $$2, cnt.class, bsb.d);
         if (!$$4.isEmpty()) {
            return cov.b((bpp)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cnt> List<T> a(daz $$0, io $$1, Class<T> $$2, Predicate<brw> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private euh a(io $$0) {
      double $$1 = 0.2;
      return new euh(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      switch ($$1) {
         case c:
            switch ((dsh)$$0.c(e)) {
               case c:
                  return $$0.a(e, dsh.d);
               case d:
                  return $$0.a(e, dsh.c);
               case e:
                  return $$0.a(e, dsh.f);
               case f:
                  return $$0.a(e, dsh.e);
               case g:
                  return $$0.a(e, dsh.i);
               case h:
                  return $$0.a(e, dsh.j);
               case i:
                  return $$0.a(e, dsh.g);
               case j:
                  return $$0.a(e, dsh.h);
            }
         case d:
            switch ((dsh)$$0.c(e)) {
               case c:
                  return $$0.a(e, dsh.e);
               case d:
                  return $$0.a(e, dsh.f);
               case e:
                  return $$0.a(e, dsh.d);
               case f:
                  return $$0.a(e, dsh.c);
               case g:
                  return $$0.a(e, dsh.j);
               case h:
                  return $$0.a(e, dsh.g);
               case i:
                  return $$0.a(e, dsh.h);
               case j:
                  return $$0.a(e, dsh.i);
               case a:
                  return $$0.a(e, dsh.b);
               case b:
                  return $$0.a(e, dsh.a);
            }
         case b:
            switch ((dsh)$$0.c(e)) {
               case c:
                  return $$0.a(e, dsh.f);
               case d:
                  return $$0.a(e, dsh.e);
               case e:
                  return $$0.a(e, dsh.c);
               case f:
                  return $$0.a(e, dsh.d);
               case g:
                  return $$0.a(e, dsh.h);
               case h:
                  return $$0.a(e, dsh.i);
               case i:
                  return $$0.a(e, dsh.j);
               case j:
                  return $$0.a(e, dsh.g);
               case a:
                  return $$0.a(e, dsh.b);
               case b:
                  return $$0.a(e, dsh.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      dsh $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dsh.f);
               case f:
                  return $$0.a(e, dsh.e);
               case g:
                  return $$0.a(e, dsh.j);
               case h:
                  return $$0.a(e, dsh.i);
               case i:
                  return $$0.a(e, dsh.h);
               case j:
                  return $$0.a(e, dsh.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dsh.d);
               case d:
                  return $$0.a(e, dsh.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dsh.h);
               case h:
                  return $$0.a(e, dsh.g);
               case i:
                  return $$0.a(e, dsh.j);
               case j:
                  return $$0.a(e, dsh.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(e, f, c);
   }
}
