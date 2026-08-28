import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class djz extends dhn {
   public static final MapCodec<djz> d = b(djz::new);
   public static final dwb<dwh> e = dvt.ah;
   public static final dvu f = dvt.w;
   private static final int g = 20;

   @Override
   public MapCodec<djz> a() {
      return d;
   }

   public djz(dvc.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(e, dwh.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dvd $$0) {
      return true;
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      if (!$$1.C) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dvd $$0, dea $$1, jg $$2, jl $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == jl.b ? 15 : 0;
      }
   }

   private void a(dev $$0, jg $$1, dvd $$2) {
      if (this.a($$2, (dey)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cqf> $$5 = this.a($$0, $$1, cqf.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dvd $$6 = $$2.b(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dvd $$7 = $$2.b(f, Boolean.valueOf(false));
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

   protected void b(dev $$0, jg $$1, dvd $$2, boolean $$3) {
      dny $$4 = new dny($$0, $$1, $$2);

      for (jg $$6 : $$4.a()) {
         dvd $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dvd $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dwg<dwh> c() {
      return e;
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      if ($$0.c(f)) {
         List<cqo> $$3 = this.a($$1, $$2, cqo.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).E().k();
         }

         List<cqf> $$4 = this.a($$1, $$2, cqf.class, bue.d);
         if (!$$4.isEmpty()) {
            return crj.b((brr)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cqf> List<T> a(dev $$0, jg $$1, Class<T> $$2, Predicate<btz> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ezc a(jg $$0) {
      double $$1 = 0.2;
      return new ezc(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      switch ($$1) {
         case c:
            switch ((dwh)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwh.d);
               case d:
                  return $$0.b(e, dwh.c);
               case e:
                  return $$0.b(e, dwh.f);
               case f:
                  return $$0.b(e, dwh.e);
               case g:
                  return $$0.b(e, dwh.i);
               case h:
                  return $$0.b(e, dwh.j);
               case i:
                  return $$0.b(e, dwh.g);
               case j:
                  return $$0.b(e, dwh.h);
            }
         case d:
            switch ((dwh)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwh.e);
               case d:
                  return $$0.b(e, dwh.f);
               case e:
                  return $$0.b(e, dwh.d);
               case f:
                  return $$0.b(e, dwh.c);
               case g:
                  return $$0.b(e, dwh.j);
               case h:
                  return $$0.b(e, dwh.g);
               case i:
                  return $$0.b(e, dwh.h);
               case j:
                  return $$0.b(e, dwh.i);
               case a:
                  return $$0.b(e, dwh.b);
               case b:
                  return $$0.b(e, dwh.a);
            }
         case b:
            switch ((dwh)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwh.f);
               case d:
                  return $$0.b(e, dwh.e);
               case e:
                  return $$0.b(e, dwh.c);
               case f:
                  return $$0.b(e, dwh.d);
               case g:
                  return $$0.b(e, dwh.h);
               case h:
                  return $$0.b(e, dwh.i);
               case i:
                  return $$0.b(e, dwh.j);
               case j:
                  return $$0.b(e, dwh.g);
               case a:
                  return $$0.b(e, dwh.b);
               case b:
                  return $$0.b(e, dwh.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      dwh $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dwh.f);
               case f:
                  return $$0.b(e, dwh.e);
               case g:
                  return $$0.b(e, dwh.j);
               case h:
                  return $$0.b(e, dwh.i);
               case i:
                  return $$0.b(e, dwh.h);
               case j:
                  return $$0.b(e, dwh.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dwh.d);
               case d:
                  return $$0.b(e, dwh.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dwh.h);
               case h:
                  return $$0.b(e, dwh.g);
               case i:
                  return $$0.b(e, dwh.j);
               case j:
                  return $$0.b(e, dwh.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(e, f, c);
   }
}
