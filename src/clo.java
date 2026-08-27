import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class clo extends cke {
   private static final Map<bjx<? extends bkl>, clo> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bjx<?> d;

   public clo(bjx<? extends bkl> $$0, int $$1, int $$2, cke.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      if (!($$1 instanceof alq)) {
         return bib.a;
      } else {
         ckj $$2 = $$0.n();
         ht $$3 = $$0.a();
         hx $$4 = $$0.k();
         dgb $$5 = $$1.a_($$3);
         if ($$5.a(cuc.ct)) {
            ddx $$6 = $$1.c_($$3);
            if ($$6 instanceof dfj $$7) {
               bjx<?> $$8 = this.a($$2.v());
               $$7.a($$8, $$1.E_());
               $$6.e();
               $$1.a($$3, $$5, $$5, 3);
               $$1.a($$0.o(), dkl.c, $$3);
               $$2.h(1);
               return bib.b;
            }
         }

         ht $$9;
         if ($$5.k($$1, $$3).c()) {
            $$9 = $$3;
         } else {
            $$9 = $$3.a($$4);
         }

         bjx<?> $$11 = this.a($$2.v());
         if ($$11.a((alq)$$1, $$2, $$0.o(), $$9, bkn.m, true, !Objects.equals($$3, $$9) && $$4 == hx.b) != null) {
            $$2.h(1);
            $$1.a($$0.o(), dkl.t, $$3);
         }

         return bib.b;
      }
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      ckj $$3 = $$1.b($$2);
      eib $$4 = a($$0, $$1, cqi.b.b);
      if ($$4.c() != eid.a.b) {
         return bic.c($$3);
      } else if (!($$0 instanceof alq)) {
         return bic.a($$3);
      } else {
         ht $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof cyo)) {
            return bic.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bjx<?> $$7 = this.a($$3.v());
            bjt $$8 = $$7.a((alq)$$0, $$3, $$1, $$6, bkn.m, false, false);
            if ($$8 == null) {
               return bic.c($$3);
            } else {
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(aqn.c.b(this));
               $$0.a($$1, dkl.t, $$8.dj());
               return bic.b($$3);
            }
         } else {
            return bic.d($$3);
         }
      }
   }

   public boolean a(@Nullable rt $$0, bjx<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static clo a(@Nullable bjx<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<clo> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bjx<?> a(@Nullable rt $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         rt $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bjx.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public cfg m() {
      return this.d.m();
   }

   public Optional<bkl> a(ccx $$0, bkl $$1, bjx<? extends bkl> $$2, alq $$3, eif $$4, ckj $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         bkl $$6;
         if ($$1 instanceof bjo) {
            $$6 = ((bjo)$$1).a($$3, (bjo)$$1);
         } else {
            $$6 = $$2.a((cqz)$$3);
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

               if (!$$0.fT().d) {
                  $$5.h(1);
               }

               return Optional.of($$6);
            }
         }
      }
   }
}
