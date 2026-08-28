import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class dak extends cyz {
   private static final Map<bwo<? extends bxg>, dak> a = Maps.newIdentityHashMap();
   private final bwo<?> b;

   public dak(bwo<? extends bxg> $$0, cyz.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bud a(dcy $$0) {
      dja $$1 = $$0.q();
      if ($$1.C) {
         return bud.a;
      } else {
         czd $$2 = $$0.n();
         iu $$3 = $$0.a();
         ja $$4 = $$0.k();
         eah $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof djv $$6) {
            bwo<?> $$7 = this.a($$1.F_(), $$2);
            $$6.a($$7, $$1.C_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), efh.c, $$3);
            $$2.h(1);
            return bud.a;
         } else {
            iu $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bwo<?> $$10 = this.a($$1.F_(), $$2);
            if ($$10.a((arq)$$1, $$2, $$0.o(), $$8, bwn.m, true, !Objects.equals($$3, $$8) && $$4 == ja.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), efh.t, $$3);
            }

            return bud.a;
         }
      }
   }

   @Override
   public bud a(dja $$0, crc $$1, buc $$2) {
      czd $$3 = $$1.b($$2);
      fem $$4 = a($$0, $$1, dij.b.b);
      if ($$4.d() != feo.a.b) {
         return bud.e;
      } else if ($$0 instanceof arq $$5) {
         iu $$8 = $$4.b();
         if (!($$0.a_($$8).b() instanceof drb)) {
            return bud.e;
         } else if ($$0.a($$1, $$8) && $$1.a($$8, $$4.c(), $$3)) {
            bwo<?> $$9 = this.a($$5.F_(), $$3);
            bwf $$10 = $$9.a($$5, $$3, $$1, $$8, bwn.m, false, false);
            if ($$10 == null) {
               return bud.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awx.c.b(this));
               $$0.a($$1, efh.t, $$10.dt());
               return bud.a;
            }
         } else {
            return bud.d;
         }
      } else {
         return bud.a;
      }
   }

   public boolean a(jg.a $$0, czd $$1, bwo<?> $$2) {
      return Objects.equals(this.a($$0, $$1), $$2);
   }

   @Nullable
   public static dak a(@Nullable bwo<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<dak> a() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bwo<?> a(jg.a $$0, czd $$1) {
      dbl $$2 = $$1.a(kj.Y, dbl.a);
      if (!$$2.c()) {
         bwo<?> $$3 = $$2.a($$0, mg.B);
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.b;
   }

   @Override
   public cum k() {
      return this.b.k();
   }

   public Optional<bxg> a(crc $$0, bxg $$1, bwo<? extends bxg> $$2, arq $$3, feq $$4, czd $$5) {
      if (!this.a($$3.F_(), $$5, $$2)) {
         return Optional.empty();
      } else {
         bxg $$6;
         if ($$1 instanceof bvv) {
            $$6 = ((bvv)$$1).a($$3, (bvv)$$1);
         } else {
            $$6 = $$2.a($$3, bwn.m);
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
   public boolean a(czd $$0, @Nullable crc $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dbl $$2 = $$0.a(kj.Y);
         if ($$2 != null) {
            bwo<?> $$3 = $$2.a($$1.dV().F_(), mg.B);
            return $$3 != null && $$3.s();
         }
      }

      return false;
   }
}
