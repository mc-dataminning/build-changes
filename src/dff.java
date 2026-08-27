import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dff extends dct {
   public static final MapCodec<dff> d = b(dff::new);
   public static final drf<drl> e = dqx.ah;
   public static final dqy f = dqx.w;
   private static final int g = 20;

   @Override
   public MapCodec<dff> a() {
      return d;
   }

   public dff(dqg.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, drl.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dqh $$0) {
      return true;
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dqh $$0, czj $$1, in $$2, is $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == is.b ? 15 : 0;
      }
   }

   private void a(dad $$0, in $$1, dqh $$2) {
      if (this.a($$2, (dag)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cnc> $$5 = this.a($$0, $$1, cnc.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dqh $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dqh $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(dad $$0, in $$1, dqh $$2, boolean $$3) {
      dje $$4 = new dje($$0, $$1, $$2);

      for (in $$6 : $$4.a()) {
         dqh $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dqh $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public drk<drl> c() {
      return e;
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      if ($$0.c(f)) {
         List<cnk> $$3 = this.a($$1, $$2, cnk.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<cnc> $$4 = this.a($$1, $$2, cnc.class, brm.d);
         if (!$$4.isEmpty()) {
            return cod.b((bpf)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cnc> List<T> a(dad $$0, in $$1, Class<T> $$2, Predicate<brh> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private etk a(in $$0) {
      double $$1 = 0.2;
      return new etk(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      switch ($$1) {
         case c:
            switch ((drl)$$0.c(e)) {
               case c:
                  return $$0.a(e, drl.d);
               case d:
                  return $$0.a(e, drl.c);
               case e:
                  return $$0.a(e, drl.f);
               case f:
                  return $$0.a(e, drl.e);
               case g:
                  return $$0.a(e, drl.i);
               case h:
                  return $$0.a(e, drl.j);
               case i:
                  return $$0.a(e, drl.g);
               case j:
                  return $$0.a(e, drl.h);
            }
         case d:
            switch ((drl)$$0.c(e)) {
               case c:
                  return $$0.a(e, drl.e);
               case d:
                  return $$0.a(e, drl.f);
               case e:
                  return $$0.a(e, drl.d);
               case f:
                  return $$0.a(e, drl.c);
               case g:
                  return $$0.a(e, drl.j);
               case h:
                  return $$0.a(e, drl.g);
               case i:
                  return $$0.a(e, drl.h);
               case j:
                  return $$0.a(e, drl.i);
               case a:
                  return $$0.a(e, drl.b);
               case b:
                  return $$0.a(e, drl.a);
            }
         case b:
            switch ((drl)$$0.c(e)) {
               case c:
                  return $$0.a(e, drl.f);
               case d:
                  return $$0.a(e, drl.e);
               case e:
                  return $$0.a(e, drl.c);
               case f:
                  return $$0.a(e, drl.d);
               case g:
                  return $$0.a(e, drl.h);
               case h:
                  return $$0.a(e, drl.i);
               case i:
                  return $$0.a(e, drl.j);
               case j:
                  return $$0.a(e, drl.g);
               case a:
                  return $$0.a(e, drl.b);
               case b:
                  return $$0.a(e, drl.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      drl $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, drl.f);
               case f:
                  return $$0.a(e, drl.e);
               case g:
                  return $$0.a(e, drl.j);
               case h:
                  return $$0.a(e, drl.i);
               case i:
                  return $$0.a(e, drl.h);
               case j:
                  return $$0.a(e, drl.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, drl.d);
               case d:
                  return $$0.a(e, drl.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, drl.h);
               case h:
                  return $$0.a(e, drl.g);
               case i:
                  return $$0.a(e, drl.j);
               case j:
                  return $$0.a(e, drl.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(e, f, c);
   }
}
