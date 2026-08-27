import com.mojang.serialization.MapCodec;

public class dcf extends cwy implements cxb {
   public static final MapCodec<dcf> a = b(dcf::new);

   @Override
   public MapCodec<dcf> a() {
      return a;
   }

   public dcf(djo.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      if (!$$0.a_($$1.c()).a((ctd)$$0, $$1)) {
         return false;
      } else {
         for (hx $$3 : hx.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(asi.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (hx $$6 : hx.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         djp $$7 = $$0.a_($$6);
         if ($$7.a(cxa.on)) {
            $$5 = true;
         }

         if ($$7.a(cxa.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? cxa.on.o() : cxa.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, cxa.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, cxa.ow.o(), 3);
      }
   }

   @Override
   public cxb.a av_() {
      return cxb.a.a;
   }
}
