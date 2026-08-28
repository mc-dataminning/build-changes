import com.mojang.serialization.MapCodec;

public class dlg extends dfy implements dgb {
   public static final MapCodec<dlg> a = b(dlg::new);

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   public dlg(dtb.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      if (!$$0.a_($$1.d()).a((dcc)$$0, $$1)) {
         return false;
      } else {
         for (jd $$3 : jd.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(awe.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (jd $$6 : jd.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dtc $$7 = $$0.a_($$6);
         if ($$7.a(dga.on)) {
            $$5 = true;
         }

         if ($$7.a(dga.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dga.on.o() : dga.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, dga.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, dga.ow.o(), 3);
      }
   }

   @Override
   public dgb.a au_() {
      return dgb.a.a;
   }
}
