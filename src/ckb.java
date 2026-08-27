import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckb extends cir {
   private static final Map<bik<? extends biy>, ckb> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bik<?> d;

   public ckb(bik<? extends biy> $$0, int $$1, int $$2, cir.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bgo a(clg $$0) {
      cpk $$1 = $$0.q();
      if (!($$1 instanceof aki)) {
         return bgo.a;
      } else {
         ciw $$2 = $$0.n();
         gv $$3 = $$0.a();
         hb $$4 = $$0.k();
         dey $$5 = $$1.a_($$3);
         if ($$5.a(csl.ct)) {
            dck $$6 = $$1.c_($$3);
            if ($$6 instanceof ddw $$7) {
               bik<?> $$8 = this.a($$2.v());
               $$7.a($$8, $$1.y_());
               $$6.e();
               $$1.a($$3, $$5, $$5, 3);
               $$1.a($$0.o(), dji.c, $$3);
               $$2.h(1);
               return bgo.b;
            }
         }

         gv $$9;
         if ($$5.k($$1, $$3).c()) {
            $$9 = $$3;
         } else {
            $$9 = $$3.a($$4);
         }

         bik<?> $$11 = this.a($$2.v());
         if ($$11.a((aki)$$1, $$2, $$0.o(), $$9, bja.m, true, !Objects.equals($$3, $$9) && $$4 == hb.b) != null) {
            $$2.h(1);
            $$1.a($$0.o(), dji.t, $$3);
         }

         return bgo.b;
      }
   }

   @Override
   public bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      ciw $$3 = $$1.b($$2);
      ehb $$4 = a($$0, $$1, cot.b.b);
      if ($$4.c() != ehd.a.b) {
         return bgp.c($$3);
      } else if (!($$0 instanceof aki)) {
         return bgp.a($$3);
      } else {
         gv $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof cwx)) {
            return bgp.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bik<?> $$7 = this.a($$3.v());
            big $$8 = $$7.a((aki)$$0, $$3, $$1, $$6, bja.m, false, false);
            if ($$8 == null) {
               return bgp.c($$3);
            } else {
               if (!$$1.fR().d) {
                  $$3.h(1);
               }

               $$1.b(ape.c.b(this));
               $$0.a($$1, dji.t, $$8.di());
               return bgp.b($$3);
            }
         } else {
            return bgp.d($$3);
         }
      }
   }

   public boolean a(@Nullable qs $$0, bik<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static ckb a(@Nullable bik<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<ckb> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bik<?> a(@Nullable qs $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         qs $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bik.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public cdt m() {
      return this.d.m();
   }

   public Optional<biy> a(cbl $$0, biy $$1, bik<? extends biy> $$2, aki $$3, ehf $$4, ciw $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         biy $$6;
         if ($$1 instanceof bib) {
            $$6 = ((bib)$$1).a($$3, (bib)$$1);
         } else {
            $$6 = $$2.a((cpk)$$3);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.i_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               if ($$5.A()) {
                  $$6.b($$5.y());
               }

               if (!$$0.fR().d) {
                  $$5.h(1);
               }

               return Optional.of($$6);
            }
         }
      }
   }
}
