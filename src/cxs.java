import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cxs extends cxu {
   private final axp<cxr> a;

   public cxs(axp<cxr> $$0, cxu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      super.a($$0, $$1, $$2, $$3);
      ju.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<js<cxr>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            xj $$6 = $$5.get().a().d().f();
            wy.a($$6, xs.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cxy a(cxu $$0, js<cxr> $$1) {
      cxy $$2 = new cxy($$0);
      $$2.b(kx.ab, $$1);
      return $$2;
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      Optional<? extends js<cxr>> $$4 = this.a($$3, $$1.dX());
      if ($$4.isPresent()) {
         cxr $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gE().a($$3, azk.d($$5.b() * 20.0F));
         $$1.b(awu.c.b(this));
         return btq.c;
      } else {
         return btq.d;
      }
   }

   @Override
   public int a(cxy $$0, bwr $$1) {
      Optional<js<cxr>> $$2 = this.a($$0, $$1.dX());
      return $$2.<Integer>map($$0x -> azk.d(((cxr)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<js<cxr>> a(cxy $$0, ju.a $$1) {
      js<cxr> $$2 = $$0.a(kx.ab);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<jw.c<cxr>> $$3 = $$1.e(me.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<js<cxr>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cya b(cxy $$0) {
      return cya.i;
   }

   private static void a(dhp $$0, cqi $$1, cxr $$2) {
      awj $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awl.c, $$4, 1.0F);
      $$0.a(edm.B, $$1.dt(), edm.a.a($$1));
   }
}
