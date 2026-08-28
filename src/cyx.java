import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyx extends cxk {
   private static final Map<bvq<? extends bwh>, cyx> a = Maps.newIdentityHashMap();
   private static final MapCodec<bvq<?>> b = ma.f.q().fieldOf("id");
   private final int c;
   private final int d;
   private final bvq<?> l;

   public cyx(bvq<? extends bwh> $$0, int $$1, int $$2, cxk.a $$3) {
      super($$3);
      this.l = $$0;
      this.c = $$1;
      this.d = $$2;
      a.put($$0, this);
   }

   @Override
   public bti a(dbh $$0) {
      dhh $$1 = $$0.q();
      if ($$1.C) {
         return bti.a;
      } else {
         cxo $$2 = $$0.n();
         jh $$3 = $$0.a();
         jm $$4 = $$0.k();
         dxu $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dic $$6) {
            bvq<?> $$7 = this.g($$2);
            $$6.a($$7, $$1.H_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), ecq.c, $$3);
            $$2.h(1);
            return bti.a;
         } else {
            jh $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bvq<?> $$10 = this.g($$2);
            if ($$10.a((ash)$$1, $$2, $$0.o(), $$8, bvp.m, true, !Objects.equals($$3, $$8) && $$4 == jm.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), ecq.t, $$3);
            }

            return bti.a;
         }
      }
   }

   @Override
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      cxo $$3 = $$1.b($$2);
      fbt $$4 = a($$0, $$1, dgp.b.b);
      if ($$4.d() != fbv.a.b) {
         return bti.e;
      } else if ($$0.C) {
         return bti.a;
      } else {
         jh $$6 = $$4.b();
         if (!($$0.a_($$6).b() instanceof dpd)) {
            return bti.e;
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.c(), $$3)) {
            bvq<?> $$7 = this.g($$3);
            bvj $$8 = $$7.a((ash)$$0, $$3, $$1, $$6, bvp.m, false, false);
            if ($$8 == null) {
               return bti.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(axp.c.b(this));
               $$0.a($$1, ecq.t, $$8.dt());
               return bti.a;
            }
         } else {
            return bti.d;
         }
      }
   }

   public boolean a(cxo $$0, bvq<?> $$1) {
      return Objects.equals(this.g($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.d;
   }

   @Nullable
   public static cyx a(@Nullable bvq<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cyx> b() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bvq<?> g(cxo $$0) {
      czx $$1 = $$0.a(ku.W, czx.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.l) : this.l;
   }

   @Override
   public css i() {
      return this.l.i();
   }

   public Optional<bwh> a(cpw $$0, bwh $$1, bvq<? extends bwh> $$2, ash $$3, fbx $$4, cxo $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bwh $$6;
         if ($$1 instanceof bva) {
            $$6 = ((bva)$$1).a($$3, (bva)$$1);
         } else {
            $$6 = $$2.a($$3, bvp.m);
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
