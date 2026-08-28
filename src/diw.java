import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class diw extends dgk {
   public static final MapCodec<diw> d = b(diw::new);
   public static final duy<dve> e = duq.ah;
   public static final dur f = duq.w;
   private static final int g = 20;

   @Override
   public MapCodec<diw> a() {
      return d;
   }

   public diw(dtz.d $$0) {
      super(true, $$0);
      this.l(this.E.b().b(f, Boolean.valueOf(false)).b(e, dve.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dua $$0) {
      return true;
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dua $$0, dcx $$1, je $$2, jj $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jj.b ? 15 : 0;
      }
   }

   private void a(dds $$0, je $$1, dua $$2) {
      if (this.a($$2, (ddv)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cpm> $$5 = this.a($$0, $$1, cpm.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dua $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dua $$7 = $$2.b(f, Boolean.valueOf(false));
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

   protected void b(dds $$0, je $$1, dua $$2, boolean $$3) {
      dmw $$4 = new dmw($$0, $$1, $$2);

      for (je $$6 : $$4.a()) {
         dua $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dua $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dvd<dve> c() {
      return e;
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      if ($$0.c(f)) {
         List<cpv> $$3 = this.a($$1, $$2, cpv.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).E().k();
         }

         List<cpm> $$4 = this.a($$1, $$2, cpm.class, bto.d);
         if (!$$4.isEmpty()) {
            return cqq.b((brd)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cpm> List<T> a(dds $$0, je $$1, Class<T> $$2, Predicate<btj> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private exz a(je $$0) {
      double $$1 = 0.2;
      return new exz(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      switch ($$1) {
         case c:
            switch ((dve)$$0.c(e)) {
               case c:
                  return $$0.b(e, dve.d);
               case d:
                  return $$0.b(e, dve.c);
               case e:
                  return $$0.b(e, dve.f);
               case f:
                  return $$0.b(e, dve.e);
               case g:
                  return $$0.b(e, dve.i);
               case h:
                  return $$0.b(e, dve.j);
               case i:
                  return $$0.b(e, dve.g);
               case j:
                  return $$0.b(e, dve.h);
            }
         case d:
            switch ((dve)$$0.c(e)) {
               case c:
                  return $$0.b(e, dve.e);
               case d:
                  return $$0.b(e, dve.f);
               case e:
                  return $$0.b(e, dve.d);
               case f:
                  return $$0.b(e, dve.c);
               case g:
                  return $$0.b(e, dve.j);
               case h:
                  return $$0.b(e, dve.g);
               case i:
                  return $$0.b(e, dve.h);
               case j:
                  return $$0.b(e, dve.i);
               case a:
                  return $$0.b(e, dve.b);
               case b:
                  return $$0.b(e, dve.a);
            }
         case b:
            switch ((dve)$$0.c(e)) {
               case c:
                  return $$0.b(e, dve.f);
               case d:
                  return $$0.b(e, dve.e);
               case e:
                  return $$0.b(e, dve.c);
               case f:
                  return $$0.b(e, dve.d);
               case g:
                  return $$0.b(e, dve.h);
               case h:
                  return $$0.b(e, dve.i);
               case i:
                  return $$0.b(e, dve.j);
               case j:
                  return $$0.b(e, dve.g);
               case a:
                  return $$0.b(e, dve.b);
               case b:
                  return $$0.b(e, dve.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      dve $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dve.f);
               case f:
                  return $$0.b(e, dve.e);
               case g:
                  return $$0.b(e, dve.j);
               case h:
                  return $$0.b(e, dve.i);
               case i:
                  return $$0.b(e, dve.h);
               case j:
                  return $$0.b(e, dve.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dve.d);
               case d:
                  return $$0.b(e, dve.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dve.h);
               case h:
                  return $$0.b(e, dve.g);
               case i:
                  return $$0.b(e, dve.j);
               case j:
                  return $$0.b(e, dve.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(e, f, c);
   }
}
