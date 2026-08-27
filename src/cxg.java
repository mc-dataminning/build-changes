import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class cxg extends cuu {
   public static final MapCodec<cxg> d = b(cxg::new);
   public static final dil<dir> e = did.ah;
   public static final die f = did.w;
   private static final int g = 20;

   @Override
   public MapCodec<cxg> a() {
      return d;
   }

   public cxg(dhm.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dir.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2, ib $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ib.b ? 15 : 0;
      }
   }

   private void a(csf $$0, hx $$1, dhn $$2) {
      if (this.a($$2, (csi)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cfq> $$5 = this.a($$0, $$1, cfq.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dhn $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dhn $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(csf $$0, hx $$1, dhn $$2, boolean $$3) {
      dbe $$4 = new dbe($$0, $$1, $$2);

      for (hx $$6 : $$4.a()) {
         dhn $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dhn $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public diq<dir> c() {
      return e;
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      if ($$0.c(f)) {
         List<cfy> $$3 = this.a($$1, $$2, cfy.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).C().k();
         }

         List<cfq> $$4 = this.a($$1, $$2, cfq.class, bky.d);
         if (!$$4.isEmpty()) {
            return cgr.b((biu)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cfq> List<T> a(csf $$0, hx $$1, Class<T> $$2, Predicate<bkv> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private eju a(hx $$0) {
      double $$1 = 0.2;
      return new eju(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      switch ($$1) {
         case c:
            switch ((dir)$$0.c(e)) {
               case c:
                  return $$0.a(e, dir.d);
               case d:
                  return $$0.a(e, dir.c);
               case e:
                  return $$0.a(e, dir.f);
               case f:
                  return $$0.a(e, dir.e);
               case g:
                  return $$0.a(e, dir.i);
               case h:
                  return $$0.a(e, dir.j);
               case i:
                  return $$0.a(e, dir.g);
               case j:
                  return $$0.a(e, dir.h);
            }
         case d:
            switch ((dir)$$0.c(e)) {
               case c:
                  return $$0.a(e, dir.e);
               case d:
                  return $$0.a(e, dir.f);
               case e:
                  return $$0.a(e, dir.d);
               case f:
                  return $$0.a(e, dir.c);
               case g:
                  return $$0.a(e, dir.j);
               case h:
                  return $$0.a(e, dir.g);
               case i:
                  return $$0.a(e, dir.h);
               case j:
                  return $$0.a(e, dir.i);
               case a:
                  return $$0.a(e, dir.b);
               case b:
                  return $$0.a(e, dir.a);
            }
         case b:
            switch ((dir)$$0.c(e)) {
               case c:
                  return $$0.a(e, dir.f);
               case d:
                  return $$0.a(e, dir.e);
               case e:
                  return $$0.a(e, dir.c);
               case f:
                  return $$0.a(e, dir.d);
               case g:
                  return $$0.a(e, dir.h);
               case h:
                  return $$0.a(e, dir.i);
               case i:
                  return $$0.a(e, dir.j);
               case j:
                  return $$0.a(e, dir.g);
               case a:
                  return $$0.a(e, dir.b);
               case b:
                  return $$0.a(e, dir.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      dir $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dir.f);
               case f:
                  return $$0.a(e, dir.e);
               case g:
                  return $$0.a(e, dir.j);
               case h:
                  return $$0.a(e, dir.i);
               case i:
                  return $$0.a(e, dir.h);
               case j:
                  return $$0.a(e, dir.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dir.d);
               case d:
                  return $$0.a(e, dir.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dir.h);
               case h:
                  return $$0.a(e, dir.g);
               case i:
                  return $$0.a(e, dir.j);
               case j:
                  return $$0.a(e, dir.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(e, f, c);
   }
}
