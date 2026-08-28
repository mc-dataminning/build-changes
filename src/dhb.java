import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dhb extends dep {
   public static final MapCodec<dhb> d = b(dhb::new);
   public static final dtb<dth> e = dst.ah;
   public static final dsu f = dst.w;
   private static final int g = 20;

   @Override
   public MapCodec<dhb> a() {
      return d;
   }

   public dhb(dsc.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dth.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dsd $$0) {
      return true;
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dsd $$0, dbf $$1, iz $$2, je $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == je.b ? 15 : 0;
      }
   }

   private void a(dbz $$0, iz $$1, dsd $$2) {
      if (this.a($$2, (dcc)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cou> $$5 = this.a($$0, $$1, cou.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dsd $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dsd $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(dbz $$0, iz $$1, dsd $$2, boolean $$3) {
      dla $$4 = new dla($$0, $$1, $$2);

      for (iz $$6 : $$4.a()) {
         dsd $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dsd $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dtg<dth> c() {
      return e;
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      if ($$0.c(f)) {
         List<cpc> $$3 = this.a($$1, $$2, cpc.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<cou> $$4 = this.a($$1, $$2, cou.class, bta.d);
         if (!$$4.isEmpty()) {
            return cpv.b((bqo)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cou> List<T> a(dbz $$0, iz $$1, Class<T> $$2, Predicate<bsv> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private evn a(iz $$0) {
      double $$1 = 0.2;
      return new evn(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      switch ($$1) {
         case c:
            switch ((dth)$$0.c(e)) {
               case c:
                  return $$0.a(e, dth.d);
               case d:
                  return $$0.a(e, dth.c);
               case e:
                  return $$0.a(e, dth.f);
               case f:
                  return $$0.a(e, dth.e);
               case g:
                  return $$0.a(e, dth.i);
               case h:
                  return $$0.a(e, dth.j);
               case i:
                  return $$0.a(e, dth.g);
               case j:
                  return $$0.a(e, dth.h);
            }
         case d:
            switch ((dth)$$0.c(e)) {
               case c:
                  return $$0.a(e, dth.e);
               case d:
                  return $$0.a(e, dth.f);
               case e:
                  return $$0.a(e, dth.d);
               case f:
                  return $$0.a(e, dth.c);
               case g:
                  return $$0.a(e, dth.j);
               case h:
                  return $$0.a(e, dth.g);
               case i:
                  return $$0.a(e, dth.h);
               case j:
                  return $$0.a(e, dth.i);
               case a:
                  return $$0.a(e, dth.b);
               case b:
                  return $$0.a(e, dth.a);
            }
         case b:
            switch ((dth)$$0.c(e)) {
               case c:
                  return $$0.a(e, dth.f);
               case d:
                  return $$0.a(e, dth.e);
               case e:
                  return $$0.a(e, dth.c);
               case f:
                  return $$0.a(e, dth.d);
               case g:
                  return $$0.a(e, dth.h);
               case h:
                  return $$0.a(e, dth.i);
               case i:
                  return $$0.a(e, dth.j);
               case j:
                  return $$0.a(e, dth.g);
               case a:
                  return $$0.a(e, dth.b);
               case b:
                  return $$0.a(e, dth.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      dth $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dth.f);
               case f:
                  return $$0.a(e, dth.e);
               case g:
                  return $$0.a(e, dth.j);
               case h:
                  return $$0.a(e, dth.i);
               case i:
                  return $$0.a(e, dth.h);
               case j:
                  return $$0.a(e, dth.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dth.d);
               case d:
                  return $$0.a(e, dth.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dth.h);
               case h:
                  return $$0.a(e, dth.g);
               case i:
                  return $$0.a(e, dth.j);
               case j:
                  return $$0.a(e, dth.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(e, f, c);
   }
}
