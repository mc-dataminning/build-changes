import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class ebm extends dzx<eda> {
   public ebm(Codec<eda> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<eda> $$0) {
      dbs $$1 = $$0.b();
      eda $$2 = $$0.f();
      ayk $$3 = $$0.d();
      io $$4 = $$0.e();
      Predicate<drb> $$5 = $$1x -> $$1x.a($$2.b);
      int $$6 = $$2.j.a($$3) + 1;
      int $$7 = $$2.j.a($$3) + 1;
      Set<io> $$8 = this.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.a($$0, $$1, $$2, $$3, $$8, $$6, $$7);
      return !$$8.isEmpty();
   }

   protected Set<io> a(dbs $$0, eda $$1, ayk $$2, io $$3, Predicate<drb> $$4, int $$5, int $$6) {
      io.a $$7 = $$3.j();
      io.a $$8 = $$7.j();
      it $$9 = $$1.e.a();
      it $$10 = $$9.g();
      Set<io> $$11 = new HashSet<>();

      for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
         boolean $$13 = $$12 == -$$5 || $$12 == $$5;

         for (int $$14 = -$$6; $$14 <= $$6; $$14++) {
            boolean $$15 = $$14 == -$$6 || $$14 == $$6;
            boolean $$16 = $$13 || $$15;
            boolean $$17 = $$13 && $$15;
            boolean $$18 = $$16 && !$$17;
            if (!$$17 && (!$$18 || $$1.k != 0.0F && !($$2.i() > $$1.k))) {
               $$7.a($$3, $$12, 0, $$14);

               for (int $$19 = 0; $$0.a($$7, dra.a::i) && $$19 < $$1.h; $$19++) {
                  $$7.c($$9);
               }

               for (int var25 = 0; $$0.a($$7, $$0x -> !$$0x.i()) && var25 < $$1.h; var25++) {
                  $$7.c($$10);
               }

               $$8.a($$7, $$1.e.a());
               drb $$20 = $$0.a_($$8);
               if ($$0.u($$7) && $$20.d($$0, $$8, $$1.e.a().g())) {
                  int $$21 = $$1.f.a($$2) + ($$1.g > 0.0F && $$2.i() < $$1.g ? 1 : 0);
                  io $$22 = $$8.i();
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

   protected void a(dzz<eda> $$0, dbs $$1, eda $$2, ayk $$3, Set<io> $$4, int $$5, int $$6) {
      for (io $$7 : $$4) {
         if ($$2.i > 0.0F && $$3.i() < $$2.i) {
            this.a($$1, $$2, $$0.c(), $$3, $$7);
         }
      }
   }

   protected boolean a(dbs $$0, eda $$1, dsy $$2, ayk $$3, io $$4) {
      return $$1.d.a().a($$0, $$2, $$3, $$4.a($$1.e.a().g()));
   }

   protected boolean a(dbs $$0, eda $$1, Predicate<drb> $$2, ayk $$3, io.a $$4, int $$5) {
      for (int $$6 = 0; $$6 < $$5; $$6++) {
         drb $$7 = $$1.c.a($$3, $$4);
         drb $$8 = $$0.a_($$4);
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
