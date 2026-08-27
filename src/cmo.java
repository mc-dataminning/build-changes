import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmo extends cle {
   private static final Map<bku<? extends bli>, cmo> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bku<?> d;

   public cmo(bku<? extends bli> $$0, int $$1, int $$2, cle.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      if (!($$1 instanceof ame)) {
         return bix.a;
      } else {
         clj $$2 = $$0.n();
         ht $$3 = $$0.a();
         hx $$4 = $$0.k();
         dhi $$5 = $$1.a_($$3);
         if ($$5.a(cvc.ct)) {
            dfd $$6 = $$1.c_($$3);
            if ($$6 instanceof dgq $$7) {
               bku<?> $$8 = this.a($$2.v());
               $$7.a($$8, $$1.E_());
               $$6.e();
               $$1.a($$3, $$5, $$5, 3);
               $$1.a($$0.o(), dls.c, $$3);
               $$2.h(1);
               return bix.b;
            }
         }

         ht $$9;
         if ($$5.k($$1, $$3).c()) {
            $$9 = $$3;
         } else {
            $$9 = $$3.a($$4);
         }

         bku<?> $$11 = this.a($$2.v());
         if ($$11.a((ame)$$1, $$2, $$0.o(), $$9, blk.m, true, !Objects.equals($$3, $$9) && $$4 == hx.b) != null) {
            $$2.h(1);
            $$1.a($$0.o(), dls.t, $$3);
         }

         return bix.b;
      }
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      clj $$3 = $$1.b($$2);
      ejq $$4 = a($$0, $$1, crj.b.b);
      if ($$4.c() != ejs.a.b) {
         return biy.c($$3);
      } else if (!($$0 instanceof ame)) {
         return biy.a($$3);
      } else {
         ht $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof czp)) {
            return biy.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bku<?> $$7 = this.a($$3.v());
            bkq $$8 = $$7.a((ame)$$0, $$3, $$1, $$6, blk.m, false, false);
            if ($$8 == null) {
               return biy.c($$3);
            } else {
               if (!$$1.fU().d) {
                  $$3.h(1);
               }

               $$1.b(arb.c.b(this));
               $$0.a($$1, dls.t, $$8.dl());
               return biy.b($$3);
            }
         } else {
            return biy.d($$3);
         }
      }
   }

   public boolean a(@Nullable rz $$0, bku<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static cmo a(@Nullable bku<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cmo> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bku<?> a(@Nullable rz $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         rz $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bku.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public cgd m() {
      return this.d.m();
   }

   public Optional<bli> a(cdu $$0, bli $$1, bku<? extends bli> $$2, ame $$3, eju $$4, clj $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         bli $$6;
         if ($$1 instanceof bkl) {
            $$6 = ((bkl)$$1).a($$3, (bkl)$$1);
         } else {
            $$6 = $$2.a((csa)$$3);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.n_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               if ($$5.A()) {
                  $$6.b($$5.y());
               }

               if (!$$0.fU().d) {
                  $$5.h(1);
               }

               return Optional.of($$6);
            }
         }
      }
   }
}
