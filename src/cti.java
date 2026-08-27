import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cti extends cry {
   private static final Map<bqr<? extends brg>, cti> a = Maps.newIdentityHashMap();
   private static final MapCodec<bqr<?>> b = lc.g.q().fieldOf("id");
   private final int c;
   private final int j;
   private final bqr<?> k;

   public cti(bqr<? extends brg> $$0, int $$1, int $$2, cry.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public boq a(cvn $$0) {
      czu $$1 = $$0.q();
      if (!($$1 instanceof aqe)) {
         return boq.a;
      } else {
         csd $$2 = $$0.n();
         im $$3 = $$0.a();
         ir $$4 = $$0.k();
         dpy $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dam $$6) {
            bqr<?> $$7 = this.j($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dur.c, $$3);
            $$2.g(1);
            return boq.b;
         } else {
            im $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bqr<?> $$10 = this.j($$2);
            if ($$10.a((aqe)$$1, $$2, $$0.o(), $$8, bri.m, true, !Objects.equals($$3, $$8) && $$4 == ir.b) != null) {
               $$2.g(1);
               $$1.a($$0.o(), dur.t, $$3);
            }

            return boq.b;
         }
      }
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      csd $$3 = $$1.b($$2);
      etb $$4 = a($$0, $$1, czd.b.b);
      if ($$4.c() != etd.a.b) {
         return bor.c($$3);
      } else if (!($$0 instanceof aqe)) {
         return bor.a($$3);
      } else {
         im $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof dhl)) {
            return bor.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bqr<?> $$7 = this.j($$3);
            bql $$8 = $$7.a((aqe)$$0, $$3, $$1, $$6, bri.m, false, false);
            if ($$8 == null) {
               return bor.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(avj.c.b(this));
               $$0.a($$1, dur.t, $$8.dl());
               return bor.b($$3);
            }
         } else {
            return bor.d($$3);
         }
      }
   }

   public boolean a(csd $$0, bqr<?> $$1) {
      return Objects.equals(this.j($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cti a(@Nullable bqr<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cti> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bqr<?> j(csd $$0) {
      cuq $$1 = $$0.a(jz.D, cuq.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cmy m() {
      return this.k.m();
   }

   public Optional<brg> a(ckl $$0, brg $$1, bqr<? extends brg> $$2, aqe $$3, etf $$4, csd $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         brg $$6;
         if ($$1 instanceof bqf) {
            $$6 = ((bqf)$$1).a($$3, (bqf)$$1);
         } else {
            $$6 = $$2.a((czu)$$3);
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
               $$6.b($$5.a(jz.d));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
