import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dei extends dbw {
   public static final MapCodec<dei> d = b(dei::new);
   public static final dqg<dqm> e = dpy.ah;
   public static final dpz f = dpy.w;
   private static final int g = 20;

   @Override
   public MapCodec<dei> a() {
      return d;
   }

   public dei(dph.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dqm.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dpi $$0) {
      return true;
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dpi $$0, cym $$1, id $$2, ij $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ij.b ? 15 : 0;
      }
   }

   private void a(czg $$0, id $$1, dpi $$2) {
      if (this.a($$2, (czj)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<clv> $$5 = this.a($$0, $$1, clv.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dpi $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dpi $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(czg $$0, id $$1, dpi $$2, boolean $$3) {
      dig $$4 = new dig($$0, $$1, $$2);

      for (id $$6 : $$4.a()) {
         dpi $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dpi $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dql<dqm> c() {
      return e;
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      if ($$0.c(f)) {
         List<cmd> $$3 = this.a($$1, $$2, cmd.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<clv> $$4 = this.a($$1, $$2, clv.class, bqf.d);
         if (!$$4.isEmpty()) {
            return cmw.b((bny)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends clv> List<T> a(czg $$0, id $$1, Class<T> $$2, Predicate<bqa> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ese a(id $$0) {
      double $$1 = 0.2;
      return new ese(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      switch ($$1) {
         case c:
            switch ((dqm)$$0.c(e)) {
               case c:
                  return $$0.a(e, dqm.d);
               case d:
                  return $$0.a(e, dqm.c);
               case e:
                  return $$0.a(e, dqm.f);
               case f:
                  return $$0.a(e, dqm.e);
               case g:
                  return $$0.a(e, dqm.i);
               case h:
                  return $$0.a(e, dqm.j);
               case i:
                  return $$0.a(e, dqm.g);
               case j:
                  return $$0.a(e, dqm.h);
            }
         case d:
            switch ((dqm)$$0.c(e)) {
               case c:
                  return $$0.a(e, dqm.e);
               case d:
                  return $$0.a(e, dqm.f);
               case e:
                  return $$0.a(e, dqm.d);
               case f:
                  return $$0.a(e, dqm.c);
               case g:
                  return $$0.a(e, dqm.j);
               case h:
                  return $$0.a(e, dqm.g);
               case i:
                  return $$0.a(e, dqm.h);
               case j:
                  return $$0.a(e, dqm.i);
               case a:
                  return $$0.a(e, dqm.b);
               case b:
                  return $$0.a(e, dqm.a);
            }
         case b:
            switch ((dqm)$$0.c(e)) {
               case c:
                  return $$0.a(e, dqm.f);
               case d:
                  return $$0.a(e, dqm.e);
               case e:
                  return $$0.a(e, dqm.c);
               case f:
                  return $$0.a(e, dqm.d);
               case g:
                  return $$0.a(e, dqm.h);
               case h:
                  return $$0.a(e, dqm.i);
               case i:
                  return $$0.a(e, dqm.j);
               case j:
                  return $$0.a(e, dqm.g);
               case a:
                  return $$0.a(e, dqm.b);
               case b:
                  return $$0.a(e, dqm.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      dqm $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dqm.f);
               case f:
                  return $$0.a(e, dqm.e);
               case g:
                  return $$0.a(e, dqm.j);
               case h:
                  return $$0.a(e, dqm.i);
               case i:
                  return $$0.a(e, dqm.h);
               case j:
                  return $$0.a(e, dqm.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dqm.d);
               case d:
                  return $$0.a(e, dqm.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dqm.h);
               case h:
                  return $$0.a(e, dqm.g);
               case i:
                  return $$0.a(e, dqm.j);
               case j:
                  return $$0.a(e, dqm.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(e, f, c);
   }
}
