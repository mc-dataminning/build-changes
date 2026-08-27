import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dti extends drt<duw> {
   public dti(Codec<duw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<duw> $$0) {
      cuj $$1 = $$0.b();
      duw $$2 = $$0.f();
      auu $$3 = $$0.d();
      hx $$4 = $$0.e();
      Predicate<djg> $$5 = $$1x -> $$1x.a($$2.b);
      int $$6 = $$2.j.a($$3) + 1;
      int $$7 = $$2.j.a($$3) + 1;
      Set<hx> $$8 = this.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.a($$0, $$1, $$2, $$3, $$8, $$6, $$7);
      return !$$8.isEmpty();
   }

   protected Set<hx> a(cuj $$0, duw $$1, auu $$2, hx $$3, Predicate<djg> $$4, int $$5, int $$6) {
      hx.a $$7 = $$3.j();
      hx.a $$8 = $$7.j();
      ic $$9 = $$1.e.a();
      ic $$10 = $$9.g();
      Set<hx> $$11 = new HashSet<>();

      for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
         boolean $$13 = $$12 == -$$5 || $$12 == $$5;

         for (int $$14 = -$$6; $$14 <= $$6; $$14++) {
            boolean $$15 = $$14 == -$$6 || $$14 == $$6;
            boolean $$16 = $$13 || $$15;
            boolean $$17 = $$13 && $$15;
            boolean $$18 = $$16 && !$$17;
            if (!$$17 && (!$$18 || $$1.k != 0.0F && !($$2.i() > $$1.k))) {
               $$7.a($$3, $$12, 0, $$14);

               for (int $$19 = 0; $$0.a($$7, djf.a::i) && $$19 < $$1.h; $$19++) {
                  $$7.c($$9);
               }

               for (int var25 = 0; $$0.a($$7, $$0x -> !$$0x.i()) && var25 < $$1.h; var25++) {
                  $$7.c($$10);
               }

               $$8.a($$7, $$1.e.a());
               djg $$20 = $$0.a_($$8);
               if ($$0.u($$7) && $$20.d($$0, $$8, $$1.e.a().g())) {
                  int $$21 = $$1.f.a($$2) + ($$1.g > 0.0F && $$2.i() < $$1.g ? 1 : 0);
                  hx $$22 = $$8.i();
                  boolean $$23 = this.a($$0, $$1, $$4, $$2, $$8, $$21);
                  if ($$23) {
                     $$11.add($$22);
                  }
               }
            }
         }
      }

      return $$11;
   }

   protected void a(drv<duw> $$0, cuj $$1, duw $$2, auu $$3, Set<hx> $$4, int $$5, int $$6) {
      for (hx $$7 : $$4) {
         if ($$2.i > 0.0F && $$3.i() < $$2.i) {
            this.a($$1, $$2, $$0.c(), $$3, $$7);
         }
      }
   }

   protected boolean a(cuj $$0, duw $$1, dld $$2, auu $$3, hx $$4) {
      return $$1.d.a().a($$0, $$2, $$3, $$4.a($$1.e.a().g()));
   }

   protected boolean a(cuj $$0, duw $$1, Predicate<djg> $$2, auu $$3, hx.a $$4, int $$5) {
      for (int $$6 = 0; $$6 < $$5; $$6++) {
         djg $$7 = $$1.c.a($$3, $$4);
         djg $$8 = $$0.a_($$4);
         if (!$$7.a($$8.b())) {
            if (!$$2.test($$8)) {
               return $$6 != 0;
            }

            $$0.a($$4, $$7, 2);
            $$4.c($$1.e.a());
         }
      }

      return true;
   }
}
