import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dew extends dck {
   public static final MapCodec<dew> d = b(dew::new);
   public static final dqw<drc> e = dqo.ah;
   public static final dqp f = dqo.w;
   private static final int g = 20;

   @Override
   public MapCodec<dew> a() {
      return d;
   }

   public dew(dpx.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, drc.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dpy $$0) {
      return true;
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dpy $$0, cza $$1, im $$2, ir $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dpy $$0, cza $$1, im $$2, ir $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ir.b ? 15 : 0;
      }
   }

   private void a(czu $$0, im $$1, dpy $$2) {
      if (this.a($$2, (czx)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cmg> $$5 = this.a($$0, $$1, cmg.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dpy $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dpy $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(czu $$0, im $$1, dpy $$2, boolean $$3) {
      div $$4 = new div($$0, $$1, $$2);

      for (im $$6 : $$4.a()) {
         dpy $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dpy $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public drb<drc> c() {
      return e;
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      if ($$0.c(f)) {
         List<cmo> $$3 = this.a($$1, $$2, cmo.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<cmg> $$4 = this.a($$1, $$2, cmg.class, bqq.d);
         if (!$$4.isEmpty()) {
            return cnh.b((boj)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cmg> List<T> a(czu $$0, im $$1, Class<T> $$2, Predicate<bql> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private eta a(im $$0) {
      double $$1 = 0.2;
      return new eta(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      switch ($$1) {
         case c:
            switch ((drc)$$0.c(e)) {
               case c:
                  return $$0.a(e, drc.d);
               case d:
                  return $$0.a(e, drc.c);
               case e:
                  return $$0.a(e, drc.f);
               case f:
                  return $$0.a(e, drc.e);
               case g:
                  return $$0.a(e, drc.i);
               case h:
                  return $$0.a(e, drc.j);
               case i:
                  return $$0.a(e, drc.g);
               case j:
                  return $$0.a(e, drc.h);
            }
         case d:
            switch ((drc)$$0.c(e)) {
               case c:
                  return $$0.a(e, drc.e);
               case d:
                  return $$0.a(e, drc.f);
               case e:
                  return $$0.a(e, drc.d);
               case f:
                  return $$0.a(e, drc.c);
               case g:
                  return $$0.a(e, drc.j);
               case h:
                  return $$0.a(e, drc.g);
               case i:
                  return $$0.a(e, drc.h);
               case j:
                  return $$0.a(e, drc.i);
               case a:
                  return $$0.a(e, drc.b);
               case b:
                  return $$0.a(e, drc.a);
            }
         case b:
            switch ((drc)$$0.c(e)) {
               case c:
                  return $$0.a(e, drc.f);
               case d:
                  return $$0.a(e, drc.e);
               case e:
                  return $$0.a(e, drc.c);
               case f:
                  return $$0.a(e, drc.d);
               case g:
                  return $$0.a(e, drc.h);
               case h:
                  return $$0.a(e, drc.i);
               case i:
                  return $$0.a(e, drc.j);
               case j:
                  return $$0.a(e, drc.g);
               case a:
                  return $$0.a(e, drc.b);
               case b:
                  return $$0.a(e, drc.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      drc $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, drc.f);
               case f:
                  return $$0.a(e, drc.e);
               case g:
                  return $$0.a(e, drc.j);
               case h:
                  return $$0.a(e, drc.i);
               case i:
                  return $$0.a(e, drc.h);
               case j:
                  return $$0.a(e, drc.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, drc.d);
               case d:
                  return $$0.a(e, drc.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, drc.h);
               case h:
                  return $$0.a(e, drc.g);
               case i:
                  return $$0.a(e, drc.j);
               case j:
                  return $$0.a(e, drc.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(e, f, c);
   }
}
