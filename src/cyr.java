import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class cyr extends cwf {
   public static final MapCodec<cyr> d = b(cyr::new);
   public static final dkf<dkl> e = djx.ah;
   public static final djy f = djx.w;
   private static final int g = 20;

   @Override
   public MapCodec<cyr> a() {
      return d;
   }

   public cyr(djg.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dkl.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(djh $$0) {
      return true;
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   public int b(djh $$0, csv $$1, hx $$2, ic $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ic.b ? 15 : 0;
      }
   }

   private void a(ctp $$0, hx $$1, djh $$2) {
      if (this.a($$2, (cts)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cha> $$5 = this.a($$0, $$1, cha.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            djh $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            djh $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(ctp $$0, hx $$1, djh $$2, boolean $$3) {
      dcp $$4 = new dcp($$0, $$1, $$2);

      for (hx $$6 : $$4.a()) {
         djh $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         djh $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dkk<dkl> c() {
      return e;
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      if ($$0.c(f)) {
         List<chi> $$3 = this.a($$1, $$2, chi.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).C().k();
         }

         List<cha> $$4 = this.a($$1, $$2, cha.class, bly.d);
         if (!$$4.isEmpty()) {
            return cib.b((bju)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cha> List<T> a(ctp $$0, hx $$1, Class<T> $$2, Predicate<blv> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private elo a(hx $$0) {
      double $$1 = 0.2;
      return new elo(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      switch ($$1) {
         case c:
            switch ((dkl)$$0.c(e)) {
               case c:
                  return $$0.a(e, dkl.d);
               case d:
                  return $$0.a(e, dkl.c);
               case e:
                  return $$0.a(e, dkl.f);
               case f:
                  return $$0.a(e, dkl.e);
               case g:
                  return $$0.a(e, dkl.i);
               case h:
                  return $$0.a(e, dkl.j);
               case i:
                  return $$0.a(e, dkl.g);
               case j:
                  return $$0.a(e, dkl.h);
            }
         case d:
            switch ((dkl)$$0.c(e)) {
               case c:
                  return $$0.a(e, dkl.e);
               case d:
                  return $$0.a(e, dkl.f);
               case e:
                  return $$0.a(e, dkl.d);
               case f:
                  return $$0.a(e, dkl.c);
               case g:
                  return $$0.a(e, dkl.j);
               case h:
                  return $$0.a(e, dkl.g);
               case i:
                  return $$0.a(e, dkl.h);
               case j:
                  return $$0.a(e, dkl.i);
               case a:
                  return $$0.a(e, dkl.b);
               case b:
                  return $$0.a(e, dkl.a);
            }
         case b:
            switch ((dkl)$$0.c(e)) {
               case c:
                  return $$0.a(e, dkl.f);
               case d:
                  return $$0.a(e, dkl.e);
               case e:
                  return $$0.a(e, dkl.c);
               case f:
                  return $$0.a(e, dkl.d);
               case g:
                  return $$0.a(e, dkl.h);
               case h:
                  return $$0.a(e, dkl.i);
               case i:
                  return $$0.a(e, dkl.j);
               case j:
                  return $$0.a(e, dkl.g);
               case a:
                  return $$0.a(e, dkl.b);
               case b:
                  return $$0.a(e, dkl.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      dkl $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dkl.f);
               case f:
                  return $$0.a(e, dkl.e);
               case g:
                  return $$0.a(e, dkl.j);
               case h:
                  return $$0.a(e, dkl.i);
               case i:
                  return $$0.a(e, dkl.h);
               case j:
                  return $$0.a(e, dkl.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dkl.d);
               case d:
                  return $$0.a(e, dkl.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dkl.h);
               case h:
                  return $$0.a(e, dkl.g);
               case i:
                  return $$0.a(e, dkl.j);
               case j:
                  return $$0.a(e, dkl.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(e, f, c);
   }
}
