import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxw extends cwj {
   private static final Map<buq<? extends bvh>, cxw> a = Maps.newIdentityHashMap();
   private static final MapCodec<buq<?>> b = mb.f.q().fieldOf("id");
   private final buq<?> c;

   public cxw(buq<? extends bvh> $$0, cwj.a $$1) {
      super($$1);
      this.c = $$0;
      a.put($$0, this);
   }

   @Override
   public bsi a(dag $$0) {
      dgg $$1 = $$0.q();
      if ($$1.C) {
         return bsi.a;
      } else {
         cwn $$2 = $$0.n();
         ji $$3 = $$0.a();
         jn $$4 = $$0.k();
         dwv $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dhb $$6) {
            buq<?> $$7 = this.g($$2);
            $$6.a($$7, $$1.H_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), ebr.c, $$3);
            $$2.h(1);
            return bsi.a;
         } else {
            ji $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            buq<?> $$10 = this.g($$2);
            if ($$10.a((arc)$$1, $$2, $$0.o(), $$8, bup.m, true, !Objects.equals($$3, $$8) && $$4 == jn.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), ebr.t, $$3);
            }

            return bsi.a;
         }
      }
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      fau $$4 = a($$0, $$1, dfo.b.b);
      if ($$4.d() != faw.a.b) {
         return bsi.e;
      } else if ($$0.C) {
         return bsi.a;
      } else {
         ji $$6 = $$4.b();
         if (!($$0.a_($$6).b() instanceof doc)) {
            return bsi.e;
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.c(), $$3)) {
            buq<?> $$7 = this.g($$3);
            buj $$8 = $$7.a((arc)$$0, $$3, $$1, $$6, bup.m, false, false);
            if ($$8 == null) {
               return bsi.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awj.c.b(this));
               $$0.a($$1, ebr.t, $$8.du());
               return bsi.a;
            }
         } else {
            return bsi.d;
         }
      }
   }

   public boolean a(cwn $$0, buq<?> $$1) {
      return Objects.equals(this.g($$0), $$1);
   }

   @Nullable
   public static cxw a(@Nullable buq<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cxw> b() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public buq<?> g(cwn $$0) {
      cyw $$1 = $$0.a(kv.W, cyw.a);
      return !$$1.c() ? $$1.a(b).result().orElse(this.c) : this.c;
   }

   @Override
   public crr i() {
      return this.c.i();
   }

   public Optional<bvh> a(cov $$0, bvh $$1, buq<? extends bvh> $$2, arc $$3, fay $$4, cwn $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bvh $$6;
         if ($$1 instanceof bua) {
            $$6 = ((bua)$$1).a($$3, (bua)$$1);
         } else {
            $$6 = $$2.a($$3, bup.m);
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
}
