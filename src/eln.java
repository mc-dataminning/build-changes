import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class eln extends ejy<enb> {
   public eln(Codec<enb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eka<enb> $$0) {
      dkl $$1 = $$0.b();
      enb $$2 = $$0.f();
      azv $$3 = $$0.d();
      iv $$4 = $$0.e();
      Predicate<eat> $$5 = $$1x -> $$1x.a($$2.b);
      int $$6 = $$2.j.a($$3) + 1;
      int $$7 = $$2.j.a($$3) + 1;
      Set<iv> $$8 = this.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.a($$0, $$1, $$2, $$3, $$8, $$6, $$7);
      return !$$8.isEmpty();
   }

   protected Set<iv> a(dkl $$0, enb $$1, azv $$2, iv $$3, Predicate<eat> $$4, int $$5, int $$6) {
      iv.a $$7 = $$3.k();
      iv.a $$8 = $$7.k();
      jb $$9 = $$1.e.a();
      jb $$10 = $$9.g();
      Set<iv> $$11 = new HashSet<>();

      for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
         boolean $$13 = $$12 == -$$5 || $$12 == $$5;

         for (int $$14 = -$$6; $$14 <= $$6; $$14++) {
            boolean $$15 = $$14 == -$$6 || $$14 == $$6;
            boolean $$16 = $$13 || $$15;
            boolean $$17 = $$13 && $$15;
            boolean $$18 = $$16 && !$$17;
            if (!$$17 && (!$$18 || $$1.k != 0.0F && !($$2.i() > $$1.k))) {
               $$7.a($$3, $$12, 0, $$14);

               for (int $$19 = 0; $$0.a($$7, eas.a::l) && $$19 < $$1.h; $$19++) {
                  $$7.c($$9);
               }

               for (int var25 = 0; $$0.a($$7, $$0x -> !$$0x.l()) && var25 < $$1.h; var25++) {
                  $$7.c($$10);
               }

               $$8.a($$7, $$1.e.a());
               eat $$20 = $$0.a_($$8);
               if ($$0.v($$7) && $$20.c($$0, $$8, $$1.e.a().g())) {
                  int $$21 = $$1.f.a($$2) + ($$1.g > 0.0F && $$2.i() < $$1.g ? 1 : 0);
                  iv $$22 = $$8.j();
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

   protected void a(eka<enb> $$0, dkl $$1, enb $$2, azv $$3, Set<iv> $$4, int $$5, int $$6) {
      for (iv $$7 : $$4) {
         if ($$2.i > 0.0F && $$3.i() < $$2.i) {
            this.a($$1, $$2, $$0.c(), $$3, $$7);
         }
      }
   }

   protected boolean a(dkl $$0, enb $$1, ecr $$2, azv $$3, iv $$4) {
      return $$1.d.a().a($$0, $$2, $$3, $$4.a($$1.e.a().g()));
   }

   protected boolean a(dkl $$0, enb $$1, Predicate<eat> $$2, azv $$3, iv.a $$4, int $$5) {
      for (int $$6 = 0; $$6 < $$5; $$6++) {
         eat $$7 = $$1.c.a($$3, $$4);
         eat $$8 = $$0.a_($$4);
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
