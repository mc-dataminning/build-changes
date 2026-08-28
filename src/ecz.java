import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class ecz extends ebk<een> {
   public ecz(Codec<een> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<een> $$0) {
      ddb $$1 = $$0.b();
      een $$2 = $$0.f();
      ayo $$3 = $$0.d();
      ja $$4 = $$0.e();
      Predicate<dsk> $$5 = $$1x -> $$1x.a($$2.b);
      int $$6 = $$2.j.a($$3) + 1;
      int $$7 = $$2.j.a($$3) + 1;
      Set<ja> $$8 = this.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.a($$0, $$1, $$2, $$3, $$8, $$6, $$7);
      return !$$8.isEmpty();
   }

   protected Set<ja> a(ddb $$0, een $$1, ayo $$2, ja $$3, Predicate<dsk> $$4, int $$5, int $$6) {
      ja.a $$7 = $$3.j();
      ja.a $$8 = $$7.j();
      jf $$9 = $$1.e.a();
      jf $$10 = $$9.g();
      Set<ja> $$11 = new HashSet<>();

      for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
         boolean $$13 = $$12 == -$$5 || $$12 == $$5;

         for (int $$14 = -$$6; $$14 <= $$6; $$14++) {
            boolean $$15 = $$14 == -$$6 || $$14 == $$6;
            boolean $$16 = $$13 || $$15;
            boolean $$17 = $$13 && $$15;
            boolean $$18 = $$16 && !$$17;
            if (!$$17 && (!$$18 || $$1.k != 0.0F && !($$2.i() > $$1.k))) {
               $$7.a($$3, $$12, 0, $$14);

               for (int $$19 = 0; $$0.a($$7, dsj.a::i) && $$19 < $$1.h; $$19++) {
                  $$7.c($$9);
               }

               for (int var25 = 0; $$0.a($$7, $$0x -> !$$0x.i()) && var25 < $$1.h; var25++) {
                  $$7.c($$10);
               }

               $$8.a($$7, $$1.e.a());
               dsk $$20 = $$0.a_($$8);
               if ($$0.u($$7) && $$20.d($$0, $$8, $$1.e.a().g())) {
                  int $$21 = $$1.f.a($$2) + ($$1.g > 0.0F && $$2.i() < $$1.g ? 1 : 0);
                  ja $$22 = $$8.i();
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

   protected void a(ebm<een> $$0, ddb $$1, een $$2, ayo $$3, Set<ja> $$4, int $$5, int $$6) {
      for (ja $$7 : $$4) {
         if ($$2.i > 0.0F && $$3.i() < $$2.i) {
            this.a($$1, $$2, $$0.c(), $$3, $$7);
         }
      }
   }

   protected boolean a(ddb $$0, een $$1, duh $$2, ayo $$3, ja $$4) {
      return $$1.d.a().a($$0, $$2, $$3, $$4.a($$1.e.a().g()));
   }

   protected boolean a(ddb $$0, een $$1, Predicate<dsk> $$2, ayo $$3, ja.a $$4, int $$5) {
      for (int $$6 = 0; $$6 < $$5; $$6++) {
         dsk $$7 = $$1.c.a($$3, $$4);
         dsk $$8 = $$0.a_($$4);
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
