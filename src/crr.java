import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class crr extends cqh {
   private static final Map<bpd<? extends bpr>, crr> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bpd<?> d;

   public crr(bpd<? extends bpr> $$0, int $$1, int $$2, cqh.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bnd a(csw $$0) {
      cxb $$1 = $$0.q();
      if (!($$1 instanceof apf)) {
         return bnd.a;
      } else {
         cqm $$2 = $$0.n();
         ib $$3 = $$0.a();
         ih $$4 = $$0.k();
         dnb $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof cxt $$6) {
            bpd<?> $$7 = this.a($$2.w());
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), drp.c, $$3);
            $$2.h(1);
            return bnd.b;
         } else {
            ib $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bpd<?> $$10 = this.a($$2.w());
            if ($$10.a((apf)$$1, $$2, $$0.o(), $$8, bpt.m, true, !Objects.equals($$3, $$8) && $$4 == ih.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), drp.t, $$3);
            }

            return bnd.b;
         }
      }
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      cqm $$3 = $$1.b($$2);
      epp $$4 = a($$0, $$1, cwk.b.b);
      if ($$4.c() != epr.a.b) {
         return bne.c($$3);
      } else if (!($$0 instanceof apf)) {
         return bne.a($$3);
      } else {
         ib $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof der)) {
            return bne.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bpd<?> $$7 = this.a($$3.w());
            box $$8 = $$7.a((apf)$$0, $$3, $$1, $$6, bpt.m, false, false);
            if ($$8 == null) {
               return bne.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(aui.c.b(this));
               $$0.a($$1, drp.t, $$8.dk());
               return bne.b($$3);
            }
         } else {
            return bne.d($$3);
         }
      }
   }

   public boolean a(@Nullable ta $$0, bpd<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static crr a(@Nullable bpd<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<crr> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bpd<?> a(@Nullable ta $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         ta $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bpd.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public clh m() {
      return this.d.m();
   }

   public Optional<bpr> a(ciu $$0, bpr $$1, bpd<? extends bpr> $$2, apf $$3, ept $$4, cqm $$5) {
      if (!this.a($$5.w(), $$2)) {
         return Optional.empty();
      } else {
         bpr $$6;
         if ($$1 instanceof bos) {
            $$6 = ((bos)$$1).a($$3, (bos)$$1);
         } else {
            $$6 = $$2.a((cxb)$$3);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.o_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               if ($$5.B()) {
                  $$6.b($$5.z());
               }

               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
