import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cuv extends ctj {
   private static final Map<bsa<? extends bsq>, cuv> a = Maps.newIdentityHashMap();
   private static final MapCodec<bsa<?>> b = le.g.q().fieldOf("id");
   private final int c;
   private final int j;
   private final bsa<?> k;

   public cuv(bsa<? extends bsq> $$0, int $$1, int $$2, ctj.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bpu a(cxb $$0) {
      dax $$1 = $$0.q();
      if (!($$1 instanceof aqm)) {
         return bpu.a;
      } else {
         cto $$2 = $$0.n();
         io $$3 = $$0.a();
         it $$4 = $$0.k();
         drb $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dbp $$6) {
            bsa<?> $$7 = this.j($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dvu.c, $$3);
            $$2.h(1);
            return bpu.b;
         } else {
            io $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bsa<?> $$10 = this.j($$2);
            if ($$10.a((aqm)$$1, $$2, $$0.o(), $$8, bss.m, true, !Objects.equals($$3, $$8) && $$4 == it.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dvu.t, $$3);
            }

            return bpu.b;
         }
      }
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      eug $$4 = a($$0, $$1, dag.b.b);
      if ($$4.c() != eui.a.b) {
         return bpv.c($$3);
      } else if (!($$0 instanceof aqm)) {
         return bpv.a($$3);
      } else {
         io $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof dio)) {
            return bpv.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bsa<?> $$7 = this.j($$3);
            bru $$8 = $$7.a((aqm)$$0, $$3, $$1, $$6, bss.m, false, false);
            if ($$8 == null) {
               return bpv.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(avr.c.b(this));
               $$0.a($$1, dvu.t, $$8.dn());
               return bpv.b($$3);
            }
         } else {
            return bpv.d($$3);
         }
      }
   }

   public boolean a(cto $$0, bsa<?> $$1) {
      return Objects.equals(this.j($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cuv a(@Nullable bsa<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cuv> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bsa<?> j(cto $$0) {
      cwd $$1 = $$0.a(kb.L, cwd.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public coj i() {
      return this.k.i();
   }

   public Optional<bsq> a(clw $$0, bsq $$1, bsa<? extends bsq> $$2, aqm $$3, euk $$4, cto $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bsq $$6;
         if ($$1 instanceof bro) {
            $$6 = ((bro)$$1).a($$3, (bro)$$1);
         } else {
            $$6 = $$2.a((dax)$$3);
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
               $$6.b($$5.a(kb.f));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
