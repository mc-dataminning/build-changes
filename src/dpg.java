import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class dpg extends dnr<dqu> {
   public dpg(Codec<dqu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dqu> $$0) {
      cqk $$1 = $$0.b();
      dqu $$2 = $$0.f();
      arx $$3 = $$0.d();
      gw $$4 = $$0.e();
      Predicate<dfe> $$5 = $$1x -> $$1x.a($$2.b);
      int $$6 = $$2.j.a($$3) + 1;
      int $$7 = $$2.j.a($$3) + 1;
      Set<gw> $$8 = this.a($$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.a($$0, $$1, $$2, $$3, $$8, $$6, $$7);
      return !$$8.isEmpty();
   }

   protected Set<gw> a(cqk $$0, dqu $$1, arx $$2, gw $$3, Predicate<dfe> $$4, int $$5, int $$6) {
      gw.a $$7 = $$3.j();
      gw.a $$8 = $$7.j();
      hc $$9 = $$1.e.a();
      hc $$10 = $$9.g();
      Set<gw> $$11 = new HashSet<>();

      for (int $$12 = -$$5; $$12 <= $$5; $$12++) {
         boolean $$13 = $$12 == -$$5 || $$12 == $$5;

         for (int $$14 = -$$6; $$14 <= $$6; $$14++) {
            boolean $$15 = $$14 == -$$6 || $$14 == $$6;
            boolean $$16 = $$13 || $$15;
            boolean $$17 = $$13 && $$15;
            boolean $$18 = $$16 && !$$17;
            if (!$$17 && (!$$18 || $$1.k != 0.0F && !($$2.i() > $$1.k))) {
               $$7.a($$3, $$12, 0, $$14);

               for (int $$19 = 0; $$0.a($$7, dfd.a::i) && $$19 < $$1.h; $$19++) {
                  $$7.c($$9);
               }

               for (int var25 = 0; $$0.a($$7, $$0x -> !$$0x.i()) && var25 < $$1.h; var25++) {
                  $$7.c($$10);
               }

               $$8.a($$7, $$1.e.a());
               dfe $$20 = $$0.a_($$8);
               if ($$0.t($$7) && $$20.d($$0, $$8, $$1.e.a().g())) {
                  int $$21 = $$1.f.a($$2) + ($$1.g > 0.0F && $$2.i() < $$1.g ? 1 : 0);
                  gw $$22 = $$8.i();
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

   protected void a(dnt<dqu> $$0, cqk $$1, dqu $$2, arx $$3, Set<gw> $$4, int $$5, int $$6) {
      for (gw $$7 : $$4) {
         if ($$2.i > 0.0F && $$3.i() < $$2.i) {
            this.a($$1, $$2, $$0.c(), $$3, $$7);
         }
      }
   }

   protected boolean a(cqk $$0, dqu $$1, dhb $$2, arx $$3, gw $$4) {
      return $$1.d.a().a($$0, $$2, $$3, $$4.a($$1.e.a().g()));
   }

   protected boolean a(cqk $$0, dqu $$1, Predicate<dfe> $$2, arx $$3, gw.a $$4, int $$5) {
      for (int $$6 = 0; $$6 < $$5; $$6++) {
         dfe $$7 = $$1.c.a($$3, $$4);
         dfe $$8 = $$0.a_($$4);
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
