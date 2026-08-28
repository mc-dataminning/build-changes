import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class djk extends dgy {
   public static final MapCodec<djk> d = b(djk::new);
   public static final dvm<dvs> e = dve.ah;
   public static final dvf f = dve.w;
   private static final int g = 20;

   @Override
   public MapCodec<djk> a() {
      return d;
   }

   public djk(dun.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(e, dvs.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(duo $$0) {
      return true;
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(duo $$0, ddl $$1, je $$2, jj $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jj.b ? 15 : 0;
      }
   }

   private void a(deg $$0, je $$1, duo $$2) {
      if (this.a($$2, (dej)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cps> $$5 = this.a($$0, $$1, cps.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            duo $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            duo $$7 = $$2.b(f, Boolean.valueOf(false));
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

   protected void b(deg $$0, je $$1, duo $$2, boolean $$3) {
      dnk $$4 = new dnk($$0, $$1, $$2);

      for (je $$6 : $$4.a()) {
         duo $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         duo $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dvr<dvs> c() {
      return e;
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected int a(duo $$0, deg $$1, je $$2) {
      if ($$0.c(f)) {
         List<cqb> $$3 = this.a($$1, $$2, cqb.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).F().k();
         }

         List<cps> $$4 = this.a($$1, $$2, cps.class, btt.d);
         if (!$$4.isEmpty()) {
            return cqw.b((bri)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cps> List<T> a(deg $$0, je $$1, Class<T> $$2, Predicate<bto> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private eyn a(je $$0) {
      double $$1 = 0.2;
      return new eyn(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      switch ($$1) {
         case c:
            switch ((dvs)$$0.c(e)) {
               case c:
                  return $$0.b(e, dvs.d);
               case d:
                  return $$0.b(e, dvs.c);
               case e:
                  return $$0.b(e, dvs.f);
               case f:
                  return $$0.b(e, dvs.e);
               case g:
                  return $$0.b(e, dvs.i);
               case h:
                  return $$0.b(e, dvs.j);
               case i:
                  return $$0.b(e, dvs.g);
               case j:
                  return $$0.b(e, dvs.h);
            }
         case d:
            switch ((dvs)$$0.c(e)) {
               case c:
                  return $$0.b(e, dvs.e);
               case d:
                  return $$0.b(e, dvs.f);
               case e:
                  return $$0.b(e, dvs.d);
               case f:
                  return $$0.b(e, dvs.c);
               case g:
                  return $$0.b(e, dvs.j);
               case h:
                  return $$0.b(e, dvs.g);
               case i:
                  return $$0.b(e, dvs.h);
               case j:
                  return $$0.b(e, dvs.i);
               case a:
                  return $$0.b(e, dvs.b);
               case b:
                  return $$0.b(e, dvs.a);
            }
         case b:
            switch ((dvs)$$0.c(e)) {
               case c:
                  return $$0.b(e, dvs.f);
               case d:
                  return $$0.b(e, dvs.e);
               case e:
                  return $$0.b(e, dvs.c);
               case f:
                  return $$0.b(e, dvs.d);
               case g:
                  return $$0.b(e, dvs.h);
               case h:
                  return $$0.b(e, dvs.i);
               case i:
                  return $$0.b(e, dvs.j);
               case j:
                  return $$0.b(e, dvs.g);
               case a:
                  return $$0.b(e, dvs.b);
               case b:
                  return $$0.b(e, dvs.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      dvs $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dvs.f);
               case f:
                  return $$0.b(e, dvs.e);
               case g:
                  return $$0.b(e, dvs.j);
               case h:
                  return $$0.b(e, dvs.i);
               case i:
                  return $$0.b(e, dvs.h);
               case j:
                  return $$0.b(e, dvs.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dvs.d);
               case d:
                  return $$0.b(e, dvs.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dvs.h);
               case h:
                  return $$0.b(e, dvs.g);
               case i:
                  return $$0.b(e, dvs.j);
               case j:
                  return $$0.b(e, dvs.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(e, f, c);
   }
}
