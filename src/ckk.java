import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckk extends cja {
   private static final Map<biu<? extends bji>, ckk> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final biu<?> d;

   public ckk(biu<? extends bji> $$0, int $$1, int $$2, cja.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      if (!($$1 instanceof akq)) {
         return bgy.a;
      } else {
         cjf $$2 = $$0.n();
         gw $$3 = $$0.a();
         ha $$4 = $$0.k();
         dfj $$5 = $$1.a_($$3);
         if ($$5.a(csw.ct)) {
            dcv $$6 = $$1.c_($$3);
            if ($$6 instanceof deh $$7) {
               biu<?> $$8 = this.a($$2.v());
               $$7.a($$8, $$1.D_());
               $$6.e();
               $$1.a($$3, $$5, $$5, 3);
               $$1.a($$0.o(), djt.c, $$3);
               $$2.h(1);
               return bgy.b;
            }
         }

         gw $$9;
         if ($$5.k($$1, $$3).c()) {
            $$9 = $$3;
         } else {
            $$9 = $$3.a($$4);
         }

         biu<?> $$11 = this.a($$2.v());
         if ($$11.a((akq)$$1, $$2, $$0.o(), $$9, bjk.m, true, !Objects.equals($$3, $$9) && $$4 == ha.b) != null) {
            $$2.h(1);
            $$1.a($$0.o(), djt.t, $$3);
         }

         return bgy.b;
      }
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      cjf $$3 = $$1.b($$2);
      ehj $$4 = a($$0, $$1, cpe.b.b);
      if ($$4.c() != ehl.a.b) {
         return bgz.c($$3);
      } else if (!($$0 instanceof akq)) {
         return bgz.a($$3);
      } else {
         gw $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof cxi)) {
            return bgz.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            biu<?> $$7 = this.a($$3.v());
            biq $$8 = $$7.a((akq)$$0, $$3, $$1, $$6, bjk.m, false, false);
            if ($$8 == null) {
               return bgz.c($$3);
            } else {
               if (!$$1.fS().d) {
                  $$3.h(1);
               }

               $$1.b(apn.c.b(this));
               $$0.a($$1, djt.t, $$8.dj());
               return bgz.b($$3);
            }
         } else {
            return bgz.d($$3);
         }
      }
   }

   public boolean a(@Nullable qw $$0, biu<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static ckk a(@Nullable biu<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<ckk> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public biu<?> a(@Nullable qw $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         qw $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return biu.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public cec m() {
      return this.d.m();
   }

   public Optional<bji> a(cbu $$0, bji $$1, biu<? extends bji> $$2, akq $$3, ehn $$4, cjf $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         bji $$6;
         if ($$1 instanceof bil) {
            $$6 = ((bil)$$1).a($$3, (bil)$$1);
         } else {
            $$6 = $$2.a((cpv)$$3);
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
