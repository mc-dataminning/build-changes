import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxg extends cvt {
   private static final Map<bug<? extends bux>, cxg> a = Maps.newIdentityHashMap();
   private static final MapCodec<bug<?>> b = lx.f.q().fieldOf("id");
   private final int c;
   private final int d;
   private final bug<?> l;

   public cxg(bug<? extends bux> $$0, int $$1, int $$2, cvt.a $$3) {
      super($$3);
      this.l = $$0;
      this.c = $$1;
      this.d = $$2;
      a.put($$0, this);
   }

   @Override
   public bry a(czo $$0) {
      dev $$1 = $$0.q();
      if ($$1.C) {
         return bry.a;
      } else {
         cvx $$2 = $$0.n();
         jg $$3 = $$0.a();
         jl $$4 = $$0.k();
         dvd $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dfp $$6) {
            bug<?> $$7 = this.g($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), eaa.c, $$3);
            $$2.h(1);
            return bry.a;
         } else {
            jg $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bug<?> $$10 = this.g($$2);
            if ($$10.a((arm)$$1, $$2, $$0.o(), $$8, buf.m, true, !Objects.equals($$3, $$8) && $$4 == jl.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), eaa.t, $$3);
            }

            return bry.a;
         }
      }
   }

   @Override
   public bry a(dev $$0, coh $$1, brx $$2) {
      cvx $$3 = $$1.b($$2);
      ezd $$4 = a($$0, $$1, ded.b.b);
      if ($$4.d() != ezf.a.b) {
         return bry.e;
      } else if ($$0.C) {
         return bry.a;
      } else {
         jg $$6 = $$4.b();
         if (!($$0.a_($$6).b() instanceof dmn)) {
            return bry.e;
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.c(), $$3)) {
            bug<?> $$7 = this.g($$3);
            btz $$8 = $$7.a((arm)$$0, $$3, $$1, $$6, buf.m, false, false);
            if ($$8 == null) {
               return bry.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awu.c.b(this));
               $$0.a($$1, eaa.t, $$8.dv());
               return bry.a;
            }
         } else {
            return bry.d;
         }
      }
   }

   public boolean a(cvx $$0, bug<?> $$1) {
      return Objects.equals(this.g($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.d;
   }

   @Nullable
   public static cxg a(@Nullable bug<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cxg> c() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bug<?> g(cvx $$0) {
      cyg $$1 = $$0.a(kt.V, cyg.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.l) : this.l;
   }

   @Override
   public cra i() {
      return this.l.i();
   }

   public Optional<bux> a(coh $$0, bux $$1, bug<? extends bux> $$2, arm $$3, ezh $$4, cvx $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bux $$6;
         if ($$1 instanceof btq) {
            $$6 = ((btq)$$1).a($$3, (btq)$$1);
         } else {
            $$6 = $$2.a($$3, buf.m);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.p_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               $$6.b($$5.a(kt.g));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
