import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqv extends cpl {
   private static final Map<bol<? extends boz>, cqv> a = Maps.newIdentityHashMap();
   private final int b;
   private final int c;
   private final bol<?> d;

   public cqv(bol<? extends boz> $$0, int $$1, int $$2, cpl.a $$3) {
      super($$3);
      this.d = $$0;
      this.b = $$1;
      this.c = $$2;
      a.put($$0, this);
   }

   @Override
   public bml a(crz $$0) {
      cwe $$1 = $$0.q();
      if (!($$1 instanceof apa)) {
         return bml.a;
      } else {
         cpq $$2 = $$0.n();
         ib $$3 = $$0.a();
         ih $$4 = $$0.k();
         dme $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof cww $$6) {
            bol<?> $$7 = this.a($$2.w());
            $$6.a($$7, $$1.F_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dqr.c, $$3);
            $$2.h(1);
            return bml.b;
         } else {
            ib $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bol<?> $$10 = this.a($$2.w());
            if ($$10.a((apa)$$1, $$2, $$0.o(), $$8, bpb.m, true, !Objects.equals($$3, $$8) && $$4 == ih.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dqr.t, $$3);
            }

            return bml.b;
         }
      }
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      eor $$4 = a($$0, $$1, cvn.b.b);
      if ($$4.c() != eot.a.b) {
         return bmm.c($$3);
      } else if (!($$0 instanceof apa)) {
         return bmm.a($$3);
      } else {
         ib $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof ddu)) {
            return bmm.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bol<?> $$7 = this.a($$3.w());
            bof $$8 = $$7.a((apa)$$0, $$3, $$1, $$6, bpb.m, false, false);
            if ($$8 == null) {
               return bmm.c($$3);
            } else {
               if (!$$1.fW().d) {
                  $$3.h(1);
               }

               $$1.b(atz.c.b(this));
               $$0.a($$1, dqr.t, $$8.dh());
               return bmm.b($$3);
            }
         } else {
            return bmm.d($$3);
         }
      }
   }

   public boolean a(@Nullable sy $$0, bol<?> $$1) {
      return Objects.equals(this.a($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.b : this.c;
   }

   @Nullable
   public static cqv a(@Nullable bol<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cqv> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bol<?> a(@Nullable sy $$0) {
      if ($$0 != null && $$0.b("EntityTag", 10)) {
         sy $$1 = $$0.p("EntityTag");
         if ($$1.b("id", 8)) {
            return bol.a($$1.l("id")).orElse(this.d);
         }
      }

      return this.d;
   }

   @Override
   public ckl m() {
      return this.d.m();
   }

   public Optional<boz> a(cia $$0, boz $$1, bol<? extends boz> $$2, apa $$3, eov $$4, cpq $$5) {
      if (!this.a($$5.w(), $$2)) {
         return Optional.empty();
      } else {
         boz $$6;
         if ($$1 instanceof boa) {
            $$6 = ((boa)$$1).a($$3, (boa)$$1);
         } else {
            $$6 = $$2.a((cwe)$$3);
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

               if (!$$0.fW().d) {
                  $$5.h(1);
               }

               return Optional.of($$6);
            }
         }
      }
   }
}
