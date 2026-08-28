import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class czz extends cyo {
   private static final Map<bwj<? extends bxb>, czz> a = Maps.newIdentityHashMap();
   private final bwj<?> b;

   public czz(bwj<? extends bxb> $$0, cyo.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bty a(dcn $$0) {
      dip $$1 = $$0.q();
      if ($$1.C) {
         return bty.a;
      } else {
         cys $$2 = $$0.n();
         iu $$3 = $$0.a();
         ja $$4 = $$0.k();
         dzo $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof djk $$6) {
            bwj<?> $$7 = this.a($$1.F_(), $$2);
            $$6.a($$7, $$1.C_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), eeo.c, $$3);
            $$2.h(1);
            return bty.a;
         } else {
            iu $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bwj<?> $$10 = this.a($$1.F_(), $$2);
            if ($$10.a((aro)$$1, $$2, $$0.o(), $$8, bwi.m, true, !Objects.equals($$3, $$8) && $$4 == ja.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), eeo.t, $$3);
            }

            return bty.a;
         }
      }
   }

   @Override
   public bty a(dip $$0, cqs $$1, btx $$2) {
      cys $$3 = $$1.b($$2);
      fds $$4 = a($$0, $$1, dhy.b.b);
      if ($$4.d() != fdu.a.b) {
         return bty.e;
      } else if ($$0 instanceof aro $$5) {
         iu $$8 = $$4.b();
         if (!($$0.a_($$8).b() instanceof dqo)) {
            return bty.e;
         } else if ($$0.a($$1, $$8) && $$1.a($$8, $$4.c(), $$3)) {
            bwj<?> $$9 = this.a($$5.F_(), $$3);
            bwa $$10 = $$9.a($$5, $$3, $$1, $$8, bwi.m, false, false);
            if ($$10 == null) {
               return bty.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awv.c.b(this));
               $$0.a($$1, eeo.t, $$10.dt());
               return bty.a;
            }
         } else {
            return bty.d;
         }
      } else {
         return bty.a;
      }
   }

   public boolean a(jg.a $$0, cys $$1, bwj<?> $$2) {
      return Objects.equals(this.a($$0, $$1), $$2);
   }

   @Nullable
   public static czz a(@Nullable bwj<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<czz> a() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bwj<?> a(jg.a $$0, cys $$1) {
      dba $$2 = $$1.a(kj.Y, dba.a);
      if (!$$2.c()) {
         bwj<?> $$3 = $$2.a($$0, mg.B);
         if ($$3 != null) {
            return $$3;
         }
      }

      return this.b;
   }

   @Override
   public cub k() {
      return this.b.k();
   }

   public Optional<bxb> a(cqs $$0, bxb $$1, bwj<? extends bxb> $$2, aro $$3, fdw $$4, cys $$5) {
      if (!this.a($$3.F_(), $$5, $$2)) {
         return Optional.empty();
      } else {
         bxb $$6;
         if ($$1 instanceof bvq) {
            $$6 = ((bvq)$$1).a($$3, (bvq)$$1);
         } else {
            $$6 = $$2.a($$3, bwi.m);
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
   public boolean a(cys $$0, @Nullable cqs $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dba $$2 = $$0.a(kj.Y);
         if ($$2 != null) {
            bwj<?> $$3 = $$2.a($$1.dV().F_(), mg.B);
            return $$3 != null && $$3.s();
         }
      }

      return false;
   }
}
