import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyy extends cxl {
   private static final Map<bvr<? extends bwi>, cyy> a = Maps.newIdentityHashMap();
   private static final MapCodec<bvr<?>> b = ma.f.q().fieldOf("id");
   private final int c;
   private final int d;
   private final bvr<?> m;

   public cyy(bvr<? extends bwi> $$0, int $$1, int $$2, cxl.a $$3) {
      super($$3);
      this.m = $$0;
      this.c = $$1;
      this.d = $$2;
      a.put($$0, this);
   }

   @Override
   public btj a(dbi $$0) {
      dhi $$1 = $$0.q();
      if ($$1.C) {
         return btj.a;
      } else {
         cxp $$2 = $$0.n();
         jh $$3 = $$0.a();
         jm $$4 = $$0.k();
         dxv $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof did $$6) {
            bvr<?> $$7 = this.g($$2);
            $$6.a($$7, $$1.H_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), ecr.c, $$3);
            $$2.h(1);
            return btj.a;
         } else {
            jh $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bvr<?> $$10 = this.g($$2);
            if ($$10.a((ash)$$1, $$2, $$0.o(), $$8, bvq.m, true, !Objects.equals($$3, $$8) && $$4 == jm.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), ecr.t, $$3);
            }

            return btj.a;
         }
      }
   }

   @Override
   public btj a(dhi $$0, cpx $$1, bti $$2) {
      cxp $$3 = $$1.b($$2);
      fbu $$4 = a($$0, $$1, dgq.b.b);
      if ($$4.d() != fbw.a.b) {
         return btj.e;
      } else if ($$0.C) {
         return btj.a;
      } else {
         jh $$6 = $$4.b();
         if (!($$0.a_($$6).b() instanceof dpe)) {
            return btj.e;
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.c(), $$3)) {
            bvr<?> $$7 = this.g($$3);
            bvk $$8 = $$7.a((ash)$$0, $$3, $$1, $$6, bvq.m, false, false);
            if ($$8 == null) {
               return btj.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(axp.c.b(this));
               $$0.a($$1, ecr.t, $$8.du());
               return btj.a;
            }
         } else {
            return btj.d;
         }
      }
   }

   public boolean a(cxp $$0, bvr<?> $$1) {
      return Objects.equals(this.g($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.d;
   }

   @Nullable
   public static cyy a(@Nullable bvr<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cyy> b() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bvr<?> g(cxp $$0) {
      czy $$1 = $$0.a(ku.W, czy.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.m) : this.m;
   }

   @Override
   public cst i() {
      return this.m.i();
   }

   public Optional<bwi> a(cpx $$0, bwi $$1, bvr<? extends bwi> $$2, ash $$3, fby $$4, cxp $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bwi $$6;
         if ($$1 instanceof bvb) {
            $$6 = ((bvb)$$1).a($$3, (bvb)$$1);
         } else {
            $$6 = $$2.a($$3, bvq.m);
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
