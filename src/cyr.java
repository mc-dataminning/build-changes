import java.util.Optional;
import java.util.function.Consumer;

public class cyr extends cyz {
   private static final wy a = wy.c("painting.random").a(n.h);
   private final bwo<? extends cmz> b;

   public cyr(bwo<? extends cmz> $$0, cyz.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bud a(dcy $$0) {
      iu $$1 = $$0.a();
      ja $$2 = $$0.k();
      iu $$3 = $$1.a($$2);
      crc $$4 = $$0.o();
      czd $$5 = $$0.n();
      if ($$4 != null && !this.a($$4, $$2, $$5, $$3)) {
         return bud.d;
      } else {
         dja $$6 = $$0.q();
         cmz $$8;
         if (this.b == bwo.aK) {
            Optional<cnc> $$7 = cnc.a($$6, $$3, $$2);
            if ($$7.isEmpty()) {
               return bud.c;
            }

            $$8 = $$7.get();
         } else if (this.b == bwo.as) {
            $$8 = new cna($$6, $$3, $$2);
         } else {
            if (this.b != bwo.af) {
               return bud.a;
            }

            $$8 = new cmy($$6, $$3, $$2);
         }

         bwo.<cmz>a($$6, $$5, $$4).accept($$8);
         if ($$8.g()) {
            if (!$$6.C) {
               $$8.v();
               $$6.a($$4, efh.t, $$8.dt());
               $$6.b($$8);
            }

            $$5.h(1);
            return bud.a;
         } else {
            return bud.c;
         }
      }
   }

   protected boolean a(crc $$0, ja $$1, czd $$2, iu $$3) {
      return !$$1.o().b() && $$0.a($$3, $$1, $$2);
   }

   @Override
   public void a(czd $$0, cyz.b $$1, dch $$2, Consumer<wy> $$3, das $$4) {
      if (this.b == bwo.aK && $$2.a(kj.aL)) {
         je<cnd> $$5 = $$0.a(kj.aL);
         if ($$5 != null) {
            $$5.a().e().ifPresent($$3);
            $$5.a().f().ifPresent($$3);
            $$3.accept(wy.a("painting.dimensions", $$5.a().b(), $$5.a().c()));
         } else if ($$4.b()) {
            $$3.accept(a);
         }
      }
   }
}
