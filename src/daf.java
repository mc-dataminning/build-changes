import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class daf extends cyu {
   private static final Map<bwm<? extends bxe>, daf> a = Maps.newIdentityHashMap();
   private final bwm<?> b;

   public daf(bwm<? extends bxe> $$0, cyu.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bub a(dct $$0) {
      div $$1 = $$0.q();
      if ($$1.C) {
         return bub.a;
      } else {
         cyy $$2 = $$0.n();
         iu $$3 = $$0.a();
         ja $$4 = $$0.k();
         dzz $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof djq $$6) {
            bwm<?> $$7 = this.a($$1.F_(), $$2);
            $$6.a($$7, $$1.C_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), eez.c, $$3);
            $$2.h(1);
            return bub.a;
         } else {
            iu $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bwm<?> $$10 = this.a($$1.F_(), $$2);
            if ($$10.a((arq)$$1, $$2, $$0.o(), $$8, bwl.m, true, !Objects.equals($$3, $$8) && $$4 == ja.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), eez.t, $$3);
            }

            return bub.a;
         }
      }
   }

   @Override
   public bub a(div $$0, cqy $$1, bua $$2) {
      cyy $$3 = $$1.b($$2);
      fee $$4 = a($$0, $$1, die.b.b);
      if ($$4.d() != feg.a.b) {
         return bub.e;
      } else if ($$0 instanceof arq $$5) {
         iu $$8 = $$4.b();
         if (!($$0.a_($$8).b() instanceof dqv)) {
            return bub.e;
         } else if ($$0.a($$1, $$8) && $$1.a($$8, $$4.c(), $$3)) {
            bwm<?> $$9 = this.a($$5.F_(), $$3);
            bwd $$10 = $$9.a($$5, $$3, $$1, $$8, bwl.m, false, false);
            if ($$10 == null) {
               return bub.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awx.c.b(this));
               $$0.a($$1, eez.t, $$10.dt());
               return bub.a;
            }
         } else {
            return bub.d;
         }
      } else {
         return bub.a;
      }
   }

   public boolean a(jg.a $$0, cyy $$1, bwm<?> $$2) {
      return Objects.equals(this.a($$0, $$1), $$2);
   }

   @Nullable
   public static daf a(@Nullable bwm<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<daf> a() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bwm<?> a(jg.a $$0, cyy $$1) {
      dbg $$2 = $$1.a(kj.Y, dbg.a);
      if (!$$2.c()) {
         bwm<?> $$3 = $$2.a($$0, mg.B);
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.b;
   }

   @Override
   public cuh k() {
      return this.b.k();
   }

   public Optional<bxe> a(cqy $$0, bxe $$1, bwm<? extends bxe> $$2, arq $$3, fei $$4, cyy $$5) {
      if (!this.a($$3.F_(), $$5, $$2)) {
         return Optional.empty();
      } else {
         bxe $$6;
         if ($$1 instanceof bvt) {
            $$6 = ((bvt)$$1).a($$3, (bvt)$$1);
         } else {
            $$6 = $$2.a($$3, bwl.m);
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
               $$6.c($$5);
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }

   @Override
   public boolean a(cyy $$0, @Nullable cqy $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dbg $$2 = $$0.a(kj.Y);
         if ($$2 != null) {
            bwm<?> $$3 = $$2.a($$1.dV().F_(), mg.B);
            return $$3 != null && $$3.s();
         }
      }

      return false;
   }
}
