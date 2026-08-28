import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvy extends cuj {
   private static final Map<bsw<? extends btn>, cvy> a = Maps.newIdentityHashMap();
   private static final MapCodec<bsw<?>> b = lt.f.r().fieldOf("id");
   private final int c;
   private final int j;
   private final bsw<?> k;

   public cvy(bsw<? extends btn> $$0, int $$1, int $$2, cuj.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bqq a(cyd $$0) {
      dcu $$1 = $$0.q();
      if (!($$1 instanceof aqt)) {
         return bqq.a;
      } else {
         cuo $$2 = $$0.n();
         jd $$3 = $$0.a();
         ji $$4 = $$0.k();
         dta $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof ddn $$6) {
            bsw<?> $$7 = this.i($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dxw.c, $$3);
            $$2.h(1);
            return bqq.c;
         } else {
            jd $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bsw<?> $$10 = this.i($$2);
            if ($$10.a((aqt)$$1, $$2, $$0.o(), $$8, btp.m, true, !Objects.equals($$3, $$8) && $$4 == ji.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dxw.t, $$3);
            }

            return bqq.c;
         }
      }
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      ews $$4 = a($$0, $$1, dcd.b.b);
      if ($$4.c() != ewu.a.b) {
         return bqr.c($$3);
      } else if (!($$0 instanceof aqt)) {
         return bqr.a($$3);
      } else {
         jd $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof dkm)) {
            return bqr.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bsw<?> $$7 = this.i($$3);
            bsq $$8 = $$7.a((aqt)$$0, $$3, $$1, $$6, btp.m, false, false);
            if ($$8 == null) {
               return bqr.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(avy.c.b(this));
               $$0.a($$1, dxw.t, $$8.do());
               return bqr.b($$3);
            }
         } else {
            return bqr.d($$3);
         }
      }
   }

   public boolean a(cuo $$0, bsw<?> $$1) {
      return Objects.equals(this.i($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cvy a(@Nullable bsw<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cvy> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bsw<?> i(cuo $$0) {
      cxf $$1 = $$0.a(kq.M, cxf.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cpj i() {
      return this.k.i();
   }

   public Optional<btn> a(cmv $$0, btn $$1, bsw<? extends btn> $$2, aqt $$3, eww $$4, cuo $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         btn $$6;
         if ($$1 instanceof bsk) {
            $$6 = ((bsk)$$1).a($$3, (bsk)$$1);
         } else {
            $$6 = $$2.a((dcu)$$3);
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
               $$6.b($$5.a(kq.g));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
