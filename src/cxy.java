import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxy extends cwl {
   private static final Map<bur<? extends bvi>, cxy> a = Maps.newIdentityHashMap();
   private static final MapCodec<bur<?>> b = mb.f.q().fieldOf("id");
   private final bur<?> c;

   public cxy(bur<? extends bvi> $$0, cwl.a $$1) {
      super($$1);
      this.c = $$0;
      a.put($$0, this);
   }

   @Override
   public bsj a(dai $$0) {
      dgi $$1 = $$0.q();
      if ($$1.C) {
         return bsj.a;
      } else {
         cwp $$2 = $$0.n();
         ji $$3 = $$0.a();
         jn $$4 = $$0.k();
         dwx $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dhd $$6) {
            bur<?> $$7 = this.g($$2);
            $$6.a($$7, $$1.H_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), ebt.c, $$3);
            $$2.h(1);
            return bsj.a;
         } else {
            ji $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bur<?> $$10 = this.g($$2);
            if ($$10.a((arc)$$1, $$2, $$0.o(), $$8, buq.m, true, !Objects.equals($$3, $$8) && $$4 == jn.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), ebt.t, $$3);
            }

            return bsj.a;
         }
      }
   }

   @Override
   public bsj a(dgi $$0, cox $$1, bsi $$2) {
      cwp $$3 = $$1.b($$2);
      faw $$4 = a($$0, $$1, dfq.b.b);
      if ($$4.d() != fay.a.b) {
         return bsj.e;
      } else if ($$0.C) {
         return bsj.a;
      } else {
         ji $$6 = $$4.b();
         if (!($$0.a_($$6).b() instanceof doe)) {
            return bsj.e;
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.c(), $$3)) {
            bur<?> $$7 = this.g($$3);
            buk $$8 = $$7.a((arc)$$0, $$3, $$1, $$6, buq.m, false, false);
            if ($$8 == null) {
               return bsj.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awk.c.b(this));
               $$0.a($$1, ebt.t, $$8.du());
               return bsj.a;
            }
         } else {
            return bsj.d;
         }
      }
   }

   public boolean a(cwp $$0, bur<?> $$1) {
      return Objects.equals(this.g($$0), $$1);
   }

   @Nullable
   public static cxy a(@Nullable bur<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cxy> b() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bur<?> g(cwp $$0) {
      cyy $$1 = $$0.a(kv.W, cyy.a);
      return !$$1.c() ? $$1.a(b).result().orElse(this.c) : this.c;
   }

   @Override
   public crt i() {
      return this.c.i();
   }

   public Optional<bvi> a(cox $$0, bvi $$1, bur<? extends bvi> $$2, arc $$3, fba $$4, cwp $$5) {
      if (!this.a($$5, $$2)) {
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
}
