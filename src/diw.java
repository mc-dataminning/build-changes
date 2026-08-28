import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diw extends dff implements dmg {
   public static final MapCodec<diw> a = b(diw::new);
   private static final dsy c = dsx.C;
   protected static final ews b = dff.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   protected diw(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(c) ? eoc.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = super.a($$0);
      if ($$1 != null) {
         eob $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == eoc.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      ja $$3 = $$2.c();
      dsh $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, jf.a);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$1 == jf.b && !this.a($$0, $$3, $$4)) {
         return dfh.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eoc.c, eoc.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
