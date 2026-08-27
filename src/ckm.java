import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckm extends cjc {
   private static final Map<biw<? extends bjk>, ckm> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final biw<?> d;

   public ckm(biw<? extends bjk> $$0, int $$1, int $$2, cjc.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bha a(clr $$0) {
      cpx $$1 = $$0.q();
      if (!($$1 instanceof aks)) {
         return bha.a;
      } else {
         cjh $$2 = $$0.n();
         gw $$3 = $$0.a();
         hc $$4 = $$0.k();
         dfl $$5 = $$1.a_($$3);
         if ($$5.a(csy.ct)) {
            dcx $$6 = $$1.c_($$3);
            if ($$6 instanceof dej $$7) {
               biw<?> $$8 = this.a($$2.v());
               $$7.a($$8, $$1.D_());
               $$6.e();
               $$1.a($$3, $$5, $$5, 3);
               $$1.a($$0.o(), djv.c, $$3);
               $$2.h(1);
               return bha.b;
            }
         }

         gw $$9;
         if ($$5.k($$1, $$3).c()) {
            $$9 = $$3;
         } else {
            $$9 = $$3.a($$4);
         }

         biw<?> $$11 = this.a($$2.v());
         if ($$11.a((aks)$$1, $$2, $$0.o(), $$9, bjm.m, true, !Objects.equals($$3, $$9) && $$4 == hc.b) != null) {
            $$2.h(1);
            $$1.a($$0.o(), djv.t, $$3);
         }

         return bha.b;
      }
   }

   @Override
   public bhb<cjh> a(cpx $$0, cbw $$1, bgz $$2) {
      cjh $$3 = $$1.b($$2);
      ehl $$4 = a($$0, $$1, cpg.b.b);
      if ($$4.c() != ehn.a.b) {
         return bhb.c($$3);
      } else if (!($$0 instanceof aks)) {
         return bhb.a($$3);
      } else {
         gw $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof cxk)) {
            return bhb.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            biw<?> $$7 = this.a($$3.v());
            bis $$8 = $$7.a((aks)$$0, $$3, $$1, $$6, bjm.m, false, false);
            if ($$8 == null) {
               return bhb.c($$3);
            } else {
               if (!$$1.fS().d) {
                  $$3.h(1);
               }

               $$1.b(app.c.b(this));
               $$0.a($$1, djv.t, $$8.dj());
               return bhb.b($$3);
            }
         } else {
            return bhb.d($$3);
         }
      }
   }

   public boolean a(@Nullable qy $$0, biw<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static ckm a(@Nullable biw<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<ckm> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public biw<?> a(@Nullable qy $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         qy $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return biw.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public cee m() {
      return this.d.m();
   }

   public Optional<bjk> a(cbw $$0, bjk $$1, biw<? extends bjk> $$2, aks $$3, ehp $$4, cjh $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         bjk $$6;
         if ($$1 instanceof bin) {
            $$6 = ((bin)$$1).a($$3, (bin)$$1);
         } else {
            $$6 = $$2.a((cpx)$$3);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.m_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               if ($$5.A()) {
                  $$6.b($$5.y());
               }

               if (!$$0.fS().d) {
                  $$5.h(1);
               }

               return Optional.of($$6);
            }
         }
      }
   }
}
