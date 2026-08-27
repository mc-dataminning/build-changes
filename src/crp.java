import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class crp extends cqf {
   private static final Map<bpc<? extends bpq>, crp> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bpc<?> d;

   public crp(bpc<? extends bpq> $$0, int $$1, int $$2, cqf.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bnc a(csu $$0) {
      cwz $$1 = $$0.q();
      if (!($$1 instanceof apf)) {
         return bnc.a;
      } else {
         cqk $$2 = $$0.n();
         ib $$3 = $$0.a();
         ih $$4 = $$0.k();
         dmz $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof cxr $$6) {
            bpc<?> $$7 = this.a($$2.w());
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), drn.c, $$3);
            $$2.h(1);
            return bnc.b;
         } else {
            ib $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bpc<?> $$10 = this.a($$2.w());
            if ($$10.a((apf)$$1, $$2, $$0.o(), $$8, bps.m, true, !Objects.equals($$3, $$8) && $$4 == ih.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), drn.t, $$3);
            }

            return bnc.b;
         }
      }
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      epn $$4 = a($$0, $$1, cwi.b.b);
      if ($$4.c() != epp.a.b) {
         return bnd.c($$3);
      } else if (!($$0 instanceof apf)) {
         return bnd.a($$3);
      } else {
         ib $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof dep)) {
            return bnd.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bpc<?> $$7 = this.a($$3.w());
            bow $$8 = $$7.a((apf)$$0, $$3, $$1, $$6, bps.m, false, false);
            if ($$8 == null) {
               return bnd.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(aui.c.b(this));
               $$0.a($$1, drn.t, $$8.dk());
               return bnd.b($$3);
            }
         } else {
            return bnd.d($$3);
         }
      }
   }

   public boolean a(@Nullable ta $$0, bpc<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static crp a(@Nullable bpc<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<crp> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bpc<?> a(@Nullable ta $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         ta $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bpc.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public clf m() {
      return this.d.m();
   }

   public Optional<bpq> a(cis $$0, bpq $$1, bpc<? extends bpq> $$2, apf $$3, epr $$4, cqk $$5) {
      if (!this.a($$5.w(), $$2)) {
         return Optional.empty();
      } else {
         bpq $$6;
         if ($$1 instanceof bor) {
            $$6 = ((bor)$$1).a($$3, (bor)$$1);
         } else {
            $$6 = $$2.a((cwz)$$3);
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
