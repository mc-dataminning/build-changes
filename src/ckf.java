import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckf extends civ {
   private static final Map<bip<? extends bjd>, ckf> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bip<?> d;

   public ckf(bip<? extends bjd> $$0, int $$1, int $$2, civ.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bgt a(clk $$0) {
      cpq $$1 = $$0.q();
      if (!($$1 instanceof akn)) {
         return bgt.a;
      } else {
         cja $$2 = $$0.n();
         gw $$3 = $$0.a();
         hc $$4 = $$0.k();
         dfe $$5 = $$1.a_($$3);
         if ($$5.a(csr.ct)) {
            dcq $$6 = $$1.c_($$3);
            if ($$6 instanceof dec $$7) {
               bip<?> $$8 = this.a($$2.v());
               $$7.a($$8, $$1.y_());
               $$6.e();
               $$1.a($$3, $$5, $$5, 3);
               $$1.a($$0.o(), djo.c, $$3);
               $$2.h(1);
               return bgt.b;
            }
         }

         gw $$9;
         if ($$5.k($$1, $$3).c()) {
            $$9 = $$3;
         } else {
            $$9 = $$3.a($$4);
         }

         bip<?> $$11 = this.a($$2.v());
         if ($$11.a((akn)$$1, $$2, $$0.o(), $$9, bjf.m, true, !Objects.equals($$3, $$9) && $$4 == hc.b) != null) {
            $$2.h(1);
            $$1.a($$0.o(), djo.t, $$3);
         }

         return bgt.b;
      }
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      cja $$3 = $$1.b($$2);
      ehe $$4 = a($$0, $$1, coz.b.b);
      if ($$4.c() != ehg.a.b) {
         return bgu.c($$3);
      } else if (!($$0 instanceof akn)) {
         return bgu.a($$3);
      } else {
         gw $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof cxd)) {
            return bgu.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bip<?> $$7 = this.a($$3.v());
            bil $$8 = $$7.a((akn)$$0, $$3, $$1, $$6, bjf.m, false, false);
            if ($$8 == null) {
               return bgu.c($$3);
            } else {
               if (!$$1.fR().d) {
                  $$3.h(1);
               }

               $$1.b(apj.c.b(this));
               $$0.a($$1, djo.t, $$8.di());
               return bgu.b($$3);
            }
         } else {
            return bgu.d($$3);
         }
      }
   }

   public boolean a(@Nullable qu $$0, bip<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static ckf a(@Nullable bip<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<ckf> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bip<?> a(@Nullable qu $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         qu $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bip.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public cdx m() {
      return this.d.m();
   }

   public Optional<bjd> a(cbp $$0, bjd $$1, bip<? extends bjd> $$2, akn $$3, ehi $$4, cja $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         bjd $$6;
         if ($$1 instanceof big) {
            $$6 = ((big)$$1).a($$3, (big)$$1);
         } else {
            $$6 = $$2.a((cpq)$$3);
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
