import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqe extends cou {
   private static final Map<bnu<? extends boi>, cqe> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bnu<?> d;

   public cqe(bnu<? extends boi> $$0, int $$1, int $$2, cou.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      if (!($$1 instanceof aov)) {
         return blu.a;
      } else {
         coz $$2 = $$0.n();
         hz $$3 = $$0.a();
         ie $$4 = $$0.k();
         dlf $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof cwf $$6) {
            bnu<?> $$7 = this.a($$2.w());
            $$6.a($$7, $$1.F_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dpp.c, $$3);
            $$2.h(1);
            return blu.b;
         } else {
            hz $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bnu<?> $$10 = this.a($$2.w());
            if ($$10.a((aov)$$1, $$2, $$0.o(), $$8, bok.m, true, !Objects.equals($$3, $$8) && $$4 == ie.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dpp.t, $$3);
            }

            return blu.b;
         }
      }
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      eno $$4 = a($$0, $$1, cuw.b.b);
      if ($$4.c() != enq.a.b) {
         return blv.c($$3);
      } else if (!($$0 instanceof aov)) {
         return blv.a($$3);
      } else {
         hz $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof ddd)) {
            return blv.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bnu<?> $$7 = this.a($$3.w());
            bno $$8 = $$7.a((aov)$$0, $$3, $$1, $$6, bok.m, false, false);
            if ($$8 == null) {
               return blv.c($$3);
            } else {
               if (!$$1.fU().d) {
                  $$3.h(1);
               }

               $$1.b(atu.c.b(this));
               $$0.a($$1, dpp.t, $$8.dk());
               return blv.b($$3);
            }
         } else {
            return blv.d($$3);
         }
      }
   }

   public boolean a(@Nullable sw $$0, bnu<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static cqe a(@Nullable bnu<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cqe> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bnu<?> a(@Nullable sw $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         sw $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bnu.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public cjs m() {
      return this.d.m();
   }

   public Optional<boi> a(chh $$0, boi $$1, bnu<? extends boi> $$2, aov $$3, ens $$4, coz $$5) {
      if (!this.a($$5.w(), $$2)) {
         return Optional.empty();
      } else {
         boi $$6;
         if ($$1 instanceof bnj) {
            $$6 = ((bnj)$$1).a($$3, (bnj)$$1);
         } else {
            $$6 = $$2.a((cvn)$$3);
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

               if (!$$0.fU().d) {
                  $$5.h(1);
               }

               return Optional.of($$6);
            }
         }
      }
   }
}
