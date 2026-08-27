import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class cwt extends cui {
   public static final MapCodec<cwt> d = b(cwt::new);
   public static final dhu<dia> e = dhm.ah;
   public static final dhn f = dhm.w;
   private static final int g = 20;

   @Override
   public MapCodec<cwt> a() {
      return d;
   }

   public cwt(dgv.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, dia.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   public int b(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == hx.b ? 15 : 0;
      }
   }

   private void a(crs $$0, ht $$1, dgw $$2) {
      if (this.a($$2, (crv)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cfd> $$5 = this.a($$0, $$1, cfd.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dgw $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dgw $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(crs $$0, ht $$1, dgw $$2, boolean $$3) {
      das $$4 = new das($$0, $$1, $$2);

      for (ht $$6 : $$4.a()) {
         dgw $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dgw $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dhz<dia> c() {
      return e;
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      if ($$0.c(f)) {
         List<cfl> $$3 = this.a($$1, $$2, cfl.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<cfd> $$4 = this.a($$1, $$2, cfd.class, bkl.d);
         if (!$$4.isEmpty()) {
            return cge.b((bij)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cfd> List<T> a(crs $$0, ht $$1, Class<T> $$2, Predicate<bki> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ejd a(ht $$0) {
      double $$1 = 0.2;
      return new ejd(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      switch ($$1) {
         case c:
            switch ((dia)$$0.c(e)) {
               case c:
                  return $$0.a(e, dia.d);
               case d:
                  return $$0.a(e, dia.c);
               case e:
                  return $$0.a(e, dia.f);
               case f:
                  return $$0.a(e, dia.e);
               case g:
                  return $$0.a(e, dia.i);
               case h:
                  return $$0.a(e, dia.j);
               case i:
                  return $$0.a(e, dia.g);
               case j:
                  return $$0.a(e, dia.h);
            }
         case d:
            switch ((dia)$$0.c(e)) {
               case c:
                  return $$0.a(e, dia.e);
               case d:
                  return $$0.a(e, dia.f);
               case e:
                  return $$0.a(e, dia.d);
               case f:
                  return $$0.a(e, dia.c);
               case g:
                  return $$0.a(e, dia.j);
               case h:
                  return $$0.a(e, dia.g);
               case i:
                  return $$0.a(e, dia.h);
               case j:
                  return $$0.a(e, dia.i);
               case a:
                  return $$0.a(e, dia.b);
               case b:
                  return $$0.a(e, dia.a);
            }
         case b:
            switch ((dia)$$0.c(e)) {
               case c:
                  return $$0.a(e, dia.f);
               case d:
                  return $$0.a(e, dia.e);
               case e:
                  return $$0.a(e, dia.c);
               case f:
                  return $$0.a(e, dia.d);
               case g:
                  return $$0.a(e, dia.h);
               case h:
                  return $$0.a(e, dia.i);
               case i:
                  return $$0.a(e, dia.j);
               case j:
                  return $$0.a(e, dia.g);
               case a:
                  return $$0.a(e, dia.b);
               case b:
                  return $$0.a(e, dia.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      dia $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dia.f);
               case f:
                  return $$0.a(e, dia.e);
               case g:
                  return $$0.a(e, dia.j);
               case h:
                  return $$0.a(e, dia.i);
               case i:
                  return $$0.a(e, dia.h);
               case j:
                  return $$0.a(e, dia.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dia.d);
               case d:
                  return $$0.a(e, dia.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dia.h);
               case h:
                  return $$0.a(e, dia.g);
               case i:
                  return $$0.a(e, dia.j);
               case j:
                  return $$0.a(e, dia.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(e, f, c);
   }
}
