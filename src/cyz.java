import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class cyz extends cwn {
   public static final MapCodec<cyz> d = b(cyz::new);
   public static final dkn<dkt> e = dkf.ah;
   public static final dkg f = dkf.w;
   private static final int g = 20;

   @Override
   public MapCodec<cyz> a() {
      return d;
   }

   public cyz(djo.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dkt.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(djp $$0) {
      return true;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   public int b(djp $$0, ctd $$1, hx $$2, ic $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ic.b ? 15 : 0;
      }
   }

   private void a(ctx $$0, hx $$1, djp $$2) {
      if (this.a($$2, (cua)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<chi> $$5 = this.a($$0, $$1, chi.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            djp $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            djp $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(ctx $$0, hx $$1, djp $$2, boolean $$3) {
      dcx $$4 = new dcx($$0, $$1, $$2);

      for (hx $$6 : $$4.a()) {
         djp $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         djp $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dks<dkt> c() {
      return e;
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      if ($$0.c(f)) {
         List<chq> $$3 = this.a($$1, $$2, chq.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).C().k();
         }

         List<chi> $$4 = this.a($$1, $$2, chi.class, bmb.d);
         if (!$$4.isEmpty()) {
            return cij.b((bjv)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends chi> List<T> a(ctx $$0, hx $$1, Class<T> $$2, Predicate<blw> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private elx a(hx $$0) {
      double $$1 = 0.2;
      return new elx(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      switch ($$1) {
         case c:
            switch ((dkt)$$0.c(e)) {
               case c:
                  return $$0.a(e, dkt.d);
               case d:
                  return $$0.a(e, dkt.c);
               case e:
                  return $$0.a(e, dkt.f);
               case f:
                  return $$0.a(e, dkt.e);
               case g:
                  return $$0.a(e, dkt.i);
               case h:
                  return $$0.a(e, dkt.j);
               case i:
                  return $$0.a(e, dkt.g);
               case j:
                  return $$0.a(e, dkt.h);
            }
         case d:
            switch ((dkt)$$0.c(e)) {
               case c:
                  return $$0.a(e, dkt.e);
               case d:
                  return $$0.a(e, dkt.f);
               case e:
                  return $$0.a(e, dkt.d);
               case f:
                  return $$0.a(e, dkt.c);
               case g:
                  return $$0.a(e, dkt.j);
               case h:
                  return $$0.a(e, dkt.g);
               case i:
                  return $$0.a(e, dkt.h);
               case j:
                  return $$0.a(e, dkt.i);
               case a:
                  return $$0.a(e, dkt.b);
               case b:
                  return $$0.a(e, dkt.a);
            }
         case b:
            switch ((dkt)$$0.c(e)) {
               case c:
                  return $$0.a(e, dkt.f);
               case d:
                  return $$0.a(e, dkt.e);
               case e:
                  return $$0.a(e, dkt.c);
               case f:
                  return $$0.a(e, dkt.d);
               case g:
                  return $$0.a(e, dkt.h);
               case h:
                  return $$0.a(e, dkt.i);
               case i:
                  return $$0.a(e, dkt.j);
               case j:
                  return $$0.a(e, dkt.g);
               case a:
                  return $$0.a(e, dkt.b);
               case b:
                  return $$0.a(e, dkt.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      dkt $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dkt.f);
               case f:
                  return $$0.a(e, dkt.e);
               case g:
                  return $$0.a(e, dkt.j);
               case h:
                  return $$0.a(e, dkt.i);
               case i:
                  return $$0.a(e, dkt.h);
               case j:
                  return $$0.a(e, dkt.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dkt.d);
               case d:
                  return $$0.a(e, dkt.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dkt.h);
               case h:
                  return $$0.a(e, dkt.g);
               case i:
                  return $$0.a(e, dkt.j);
               case j:
                  return $$0.a(e, dkt.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(e, f, c);
   }
}
