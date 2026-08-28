import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgb extends diq implements dex {
   public static final MapCodec<dgb> a = b(dgb::new);
   public static final int b = 2;
   public static final dsx c = dsn.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final ewf[] m = new ewf[]{
      deu.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), deu.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), deu.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final ewf[] n = new ewf[]{
      deu.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), deu.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), deu.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final ewf[] o = new ewf[]{
      deu.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), deu.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), deu.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final ewf[] F = new ewf[]{
      deu.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), deu.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), deu.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   public dgb(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, je.c).a(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean d_(drx $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      drx $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(awl.z);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      int $$4 = $$0.c(c);
      switch ((je)$$0.c(aE)) {
         case d:
            return F[$$4];
         case c:
         default:
            return o[$$4];
         case e:
            return n[$$4];
         case f:
            return m[$$4];
      }
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      drx $$1 = this.n();
      dbw $$2 = $$0.q();
      iz $$3 = $$0.a();

      for (je $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.a(aE, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(aE, c);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
