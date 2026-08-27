import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckq extends cjg {
   private static final Map<bja<? extends bjo>, ckq> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bja<?> d;

   public ckq(bja<? extends bjo> $$0, int $$1, int $$2, cjg.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      if (!($$1 instanceof akt)) {
         return bhe.a;
      } else {
         cjl $$2 = $$0.n();
         gw $$3 = $$0.a();
         ha $$4 = $$0.k();
         dfd $$5 = $$1.a_($$3);
         if ($$5.a(cte.ct)) {
            dcz $$6 = $$1.c_($$3);
            if ($$6 instanceof del $$7) {
               bja<?> $$8 = this.a($$2.v());
               $$7.a($$8, $$1.D_());
               $$6.e();
               $$1.a($$3, $$5, $$5, 3);
               $$1.a($$0.o(), djn.c, $$3);
               $$2.h(1);
               return bhe.b;
            }
         }

         gw $$9;
         if ($$5.k($$1, $$3).c()) {
            $$9 = $$3;
         } else {
            $$9 = $$3.a($$4);
         }

         bja<?> $$11 = this.a($$2.v());
         if ($$11.a((akt)$$1, $$2, $$0.o(), $$9, bjq.m, true, !Objects.equals($$3, $$9) && $$4 == ha.b) != null) {
            $$2.h(1);
            $$1.a($$0.o(), djn.t, $$3);
         }

         return bhe.b;
      }
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      ehd $$4 = a($$0, $$1, cpk.b.b);
      if ($$4.c() != ehf.a.b) {
         return bhf.c($$3);
      } else if (!($$0 instanceof akt)) {
         return bhf.a($$3);
      } else {
         gw $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof cxq)) {
            return bhf.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bja<?> $$7 = this.a($$3.v());
            biw $$8 = $$7.a((akt)$$0, $$3, $$1, $$6, bjq.m, false, false);
            if ($$8 == null) {
               return bhf.c($$3);
            } else {
               if (!$$1.fT().d) {
                  $$3.h(1);
               }

               $$1.b(apq.c.b(this));
               $$0.a($$1, djn.t, $$8.dj());
               return bhf.b($$3);
            }
         } else {
            return bhf.d($$3);
         }
      }
   }

   public boolean a(@Nullable qw $$0, bja<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static ckq a(@Nullable bja<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<ckq> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bja<?> a(@Nullable qw $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         qw $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bja.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public cei m() {
      return this.d.m();
   }

   public Optional<bjo> a(cca $$0, bjo $$1, bja<? extends bjo> $$2, akt $$3, ehh $$4, cjl $$5) {
      if (!this.a($$5.v(), $$2)) {
         return Optional.empty();
      } else {
         bjo $$6;
         if ($$1 instanceof bir) {
            $$6 = ((bir)$$1).a($$3, (bir)$$1);
         } else {
            $$6 = $$2.a((cqb)$$3);
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

               if (!$$0.fT().d) {
                  $$5.h(1);
               }

               return Optional.of($$6);
            }
         }
      }
   }
}
