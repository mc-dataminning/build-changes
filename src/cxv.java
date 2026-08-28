import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxv extends cwi {
   private static final Map<bus<? extends bvj>, cxv> a = Maps.newIdentityHashMap();
   private static final MapCodec<bus<?>> b = lz.f.q().fieldOf("id");
   private final int c;
   private final int d;
   private final bus<?> l;

   public cxv(bus<? extends bvj> $$0, int $$1, int $$2, cwi.a $$3) {
      super($$3);
      this.l = $$0;
      this.c = $$1;
      this.d = $$2;
      a.put($$0, this);
   }

   @Override
   public bsk a(daf $$0) {
      dfm $$1 = $$0.q();
      if ($$1.C) {
         return bsk.a;
      } else {
         cwm $$2 = $$0.n();
         jh $$3 = $$0.a();
         jm $$4 = $$0.k();
         dvv $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dgh $$6) {
            bus<?> $$7 = this.g($$2);
            $$6.a($$7, $$1.G_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), ear.c, $$3);
            $$2.h(1);
            return bsk.a;
         } else {
            jh $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bus<?> $$10 = this.g($$2);
            if ($$10.a((arp)$$1, $$2, $$0.o(), $$8, bur.m, true, !Objects.equals($$3, $$8) && $$4 == jm.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), ear.t, $$3);
            }

            return bsk.a;
         }
      }
   }

   @Override
   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      cwm $$3 = $$1.b($$2);
      ezu $$4 = a($$0, $$1, deu.b.b);
      if ($$4.d() != ezw.a.b) {
         return bsk.e;
      } else if ($$0.C) {
         return bsk.a;
      } else {
         jh $$6 = $$4.b();
         if (!($$0.a_($$6).b() instanceof dnf)) {
            return bsk.e;
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.c(), $$3)) {
            bus<?> $$7 = this.g($$3);
            bul $$8 = $$7.a((arp)$$0, $$3, $$1, $$6, bur.m, false, false);
            if ($$8 == null) {
               return bsk.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awx.c.b(this));
               $$0.a($$1, ear.t, $$8.dt());
               return bsk.a;
            }
         } else {
            return bsk.d;
         }
      }
   }

   public boolean a(cwm $$0, bus<?> $$1) {
      return Objects.equals(this.g($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.d;
   }

   @Nullable
   public static cxv a(@Nullable bus<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cxv> b() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bus<?> g(cwm $$0) {
      cyv $$1 = $$0.a(ku.W, cyv.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.l) : this.l;
   }

   @Override
   public crq i() {
      return this.l.i();
   }

   public Optional<bvj> a(cou $$0, bvj $$1, bus<? extends bvj> $$2, arp $$3, ezy $$4, cwm $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bvj $$6;
         if ($$1 instanceof buc) {
            $$6 = ((buc)$$1).a($$3, (buc)$$1);
         } else {
            $$6 = $$2.a($$3, bur.m);
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
               $$6.b($$5.a(ku.g));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
