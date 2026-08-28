import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxx extends cwk {
   private static final Map<bur<? extends bvi>, cxx> a = Maps.newIdentityHashMap();
   private final bur<?> b;

   public cxx(bur<? extends bvi> $$0, cwk.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bsj a(dah $$0) {
      dgh $$1 = $$0.q();
      if ($$1.C) {
         return bsj.a;
      } else {
         cwo $$2 = $$0.n();
         ji $$3 = $$0.a();
         jn $$4 = $$0.k();
         dww $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dhc $$6) {
            bur<?> $$7 = this.a($$1.K_(), $$2);
            $$6.a($$7, $$1.H_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), ebs.c, $$3);
            $$2.h(1);
            return bsj.a;
         } else {
            ji $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bur<?> $$10 = this.a($$1.K_(), $$2);
            if ($$10.a((ard)$$1, $$2, $$0.o(), $$8, buq.m, true, !Objects.equals($$3, $$8) && $$4 == jn.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), ebs.t, $$3);
            }

            return bsj.a;
         }
      }
   }

   @Override
   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      cwo $$3 = $$1.b($$2);
      fav $$4 = a($$0, $$1, dfp.b.b);
      if ($$4.d() != fax.a.b) {
         return bsj.e;
      } else if ($$0 instanceof ard $$5) {
         ji $$8 = $$4.b();
         if (!($$0.a_($$8).b() instanceof dod)) {
            return bsj.e;
         } else if ($$0.a($$1, $$8) && $$1.a($$8, $$4.c(), $$3)) {
            bur<?> $$9 = this.a($$5.K_(), $$3);
            buk $$10 = $$9.a($$5, $$3, $$1, $$8, buq.m, false, false);
            if ($$10 == null) {
               return bsj.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awk.c.b(this));
               $$0.a($$1, ebs.t, $$10.dt());
               return bsj.a;
            }
         } else {
            return bsj.d;
         }
      } else {
         return bsj.a;
      }
   }

   public boolean a(jt.a $$0, cwo $$1, bur<?> $$2) {
      return Objects.equals(this.a($$0, $$1), $$2);
   }

   @Nullable
   public static cxx a(@Nullable bur<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cxx> b() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bur<?> a(jt.a $$0, cwo $$1) {
      cyx $$2 = $$1.a(kv.W, cyx.a);
      if (!$$2.c()) {
         bur<?> $$3 = $$2.a($$0, mc.z);
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.b;
   }

   @Override
   public crs i() {
      return this.b.i();
   }

   public Optional<bvi> a(cow $$0, bvi $$1, bur<? extends bvi> $$2, ard $$3, faz $$4, cwo $$5) {
      if (!this.a($$3.K_(), $$5, $$2)) {
         return Optional.empty();
      } else {
         bvi $$6;
         if ($$1 instanceof bub) {
            $$6 = ((bub)$$1).a($$3, (bub)$$1);
         } else {
            $$6 = $$2.a($$3, buq.m);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.e_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               $$6.b($$5.a(kv.g));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }

   @Override
   public boolean a(cwo $$0, @Nullable cow $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         cyx $$2 = $$0.a(kv.W);
         if ($$2 != null) {
            bur<?> $$3 = $$2.a($$1.dV().K_(), mc.z);
            return $$3 != null && $$3.s();
         }
      }

      return false;
   }
}
