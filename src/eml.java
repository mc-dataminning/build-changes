import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class eml extends ekw<eoa> {
   public eml(Codec<eoa> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<eoa> $$0) {
      dli $$1 = $$0.b();
      eoa $$2 = $$0.f();
      bai $$3 = $$0.d();
      iw $$4 = $$0.e();
      Predicate<ebq> $$5 = $$1x -> $$1x.a($$2.b);
      int $$6 = $$2.j.a($$3) + 1;
      int $$7 = $$2.j.a($$3) + 1;
      Set<iw> $$8 = this.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.a($$0, $$1, $$2, $$3, $$8, $$6, $$7);
      return !$$8.isEmpty();
   }

   protected Set<iw> a(dli $$0, eoa $$1, bai $$2, iw $$3, Predicate<ebq> $$4, int $$5, int $$6) {
      iw.a $$7 = $$3.k();
      iw.a $$8 = $$7.k();
      jc $$9 = $$1.e.a();
      jc $$10 = $$9.g();
      Set<iw> $$11 = new HashSet<>();

      for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
         boolean $$13 = $$12 == -$$5 || $$12 == $$5;

         for (int $$14 = -$$6; $$14 <= $$6; $$14++) {
            boolean $$15 = $$14 == -$$6 || $$14 == $$6;
            boolean $$16 = $$13 || $$15;
            boolean $$17 = $$13 && $$15;
            boolean $$18 = $$16 && !$$17;
            if (!$$17 && (!$$18 || $$1.k != 0.0F && !($$2.i() > $$1.k))) {
               $$7.a($$3, $$12, 0, $$14);

               for (int $$19 = 0; $$0.a($$7, ebp.a::l) && $$19 < $$1.h; $$19++) {
                  $$7.c($$9);
               }

               for (int var25 = 0; $$0.a($$7, $$0x -> !$$0x.l()) && var25 < $$1.h; var25++) {
                  $$7.c($$10);
               }

               $$8.a($$7, $$1.e.a());
               ebq $$20 = $$0.a_($$8);
               if ($$0.v($$7) && $$20.c($$0, $$8, $$1.e.a().g())) {
                  int $$21 = $$1.f.a($$2) + ($$1.g > 0.0F && $$2.i() < $$1.g ? 1 : 0);
                  iw $$22 = $$8.j();
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

   protected void a(eky<eoa> $$0, dli $$1, eoa $$2, bai $$3, Set<iw> $$4, int $$5, int $$6) {
      for (iw $$7 : $$4) {
         if ($$2.i > 0.0F && $$3.i() < $$2.i) {
            this.a($$1, $$2, $$0.c(), $$3, $$7);
         }
      }
   }

   protected boolean a(dli $$0, eoa $$1, edo $$2, bai $$3, iw $$4) {
      return $$1.d.a().a($$0, $$2, $$3, $$4.a($$1.e.a().g()));
   }

   protected boolean a(dli $$0, eoa $$1, Predicate<ebq> $$2, bai $$3, iw.a $$4, int $$5) {
      for (int $$6 = 0; $$6 < $$5; $$6++) {
         ebq $$7 = $$1.c.a($$3, $$4);
         ebq $$8 = $$0.a_($$4);
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
