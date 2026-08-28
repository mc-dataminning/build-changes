import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dkf extends dht {
   public static final MapCodec<dkf> d = b(dkf::new);
   public static final dwh<dwn> e = dvz.ah;
   public static final dwa f = dvz.w;
   private static final int g = 20;

   @Override
   public MapCodec<dkf> a() {
      return d;
   }

   public dkf(dvi.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(e, dwn.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dvj $$0) {
      return true;
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if (!$$1.C) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dvj $$0, deg $$1, jh $$2, jm $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dvj $$0, deg $$1, jh $$2, jm $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jm.b ? 15 : 0;
      }
   }

   private void a(dfb $$0, jh $$1, dvj $$2) {
      if (this.a($$2, (dfe)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cqk> $$5 = this.a($$0, $$1, cqk.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dvj $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dvj $$7 = $$2.b(f, Boolean.valueOf(false));
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

   protected void b(dfb $$0, jh $$1, dvj $$2, boolean $$3) {
      doe $$4 = new doe($$0, $$1, $$2);

      for (jh $$6 : $$4.a()) {
         dvj $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dvj $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dwm<dwn> c() {
      return e;
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      if ($$0.c(f)) {
         List<cqt> $$3 = this.a($$1, $$2, cqt.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).E().k();
         }

         List<cqk> $$4 = this.a($$1, $$2, cqk.class, buj.d);
         if (!$$4.isEmpty()) {
            return cro.b((brw)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cqk> List<T> a(dfb $$0, jh $$1, Class<T> $$2, Predicate<bue> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ezi a(jh $$0) {
      double $$1 = 0.2;
      return new ezi(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      switch ($$1) {
         case c:
            switch ((dwn)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwn.d);
               case d:
                  return $$0.b(e, dwn.c);
               case e:
                  return $$0.b(e, dwn.f);
               case f:
                  return $$0.b(e, dwn.e);
               case g:
                  return $$0.b(e, dwn.i);
               case h:
                  return $$0.b(e, dwn.j);
               case i:
                  return $$0.b(e, dwn.g);
               case j:
                  return $$0.b(e, dwn.h);
            }
         case d:
            switch ((dwn)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwn.e);
               case d:
                  return $$0.b(e, dwn.f);
               case e:
                  return $$0.b(e, dwn.d);
               case f:
                  return $$0.b(e, dwn.c);
               case g:
                  return $$0.b(e, dwn.j);
               case h:
                  return $$0.b(e, dwn.g);
               case i:
                  return $$0.b(e, dwn.h);
               case j:
                  return $$0.b(e, dwn.i);
               case a:
                  return $$0.b(e, dwn.b);
               case b:
                  return $$0.b(e, dwn.a);
            }
         case b:
            switch ((dwn)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwn.f);
               case d:
                  return $$0.b(e, dwn.e);
               case e:
                  return $$0.b(e, dwn.c);
               case f:
                  return $$0.b(e, dwn.d);
               case g:
                  return $$0.b(e, dwn.h);
               case h:
                  return $$0.b(e, dwn.i);
               case i:
                  return $$0.b(e, dwn.j);
               case j:
                  return $$0.b(e, dwn.g);
               case a:
                  return $$0.b(e, dwn.b);
               case b:
                  return $$0.b(e, dwn.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      dwn $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dwn.f);
               case f:
                  return $$0.b(e, dwn.e);
               case g:
                  return $$0.b(e, dwn.j);
               case h:
                  return $$0.b(e, dwn.i);
               case i:
                  return $$0.b(e, dwn.h);
               case j:
                  return $$0.b(e, dwn.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dwn.d);
               case d:
                  return $$0.b(e, dwn.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dwn.h);
               case h:
                  return $$0.b(e, dwn.g);
               case i:
                  return $$0.b(e, dwn.j);
               case j:
                  return $$0.b(e, dwn.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(e, f, c);
   }
}
