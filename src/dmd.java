import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmd extends deu {
   public static final MapCodec<dmd> a = b(dmd::new);
   public static final int b = 8;
   public static final dsx c = dsn.aF;
   protected static final ewf[] d = new ewf[]{
      ewc.a(),
      deu.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dmd> a() {
      return a;
   }

   protected dmd(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      switch ($$1) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected ewf b_(drx $$0, daz $$1, iz $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected ewf c(drx $$0, daz $$1, iz $$2, evr $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean f_(drx $$0) {
      return true;
   }

   @Override
   protected float d(drx $$0, daz $$1, iz $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      drx $$3 = $$1.a_($$2.d());
      if ($$3.a(awl.co)) {
         return false;
      } else {
         return $$3.a(awl.cp) ? true : deu.a($$3.k($$1, $$2.d()), je.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$1.a(dcc.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(drx $$0, cxv $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.r()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == je.b : true;
      }
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      drx $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c);
   }
}
