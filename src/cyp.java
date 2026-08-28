import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyp extends cxc {
   private static final Map<bvi<? extends bvz>, cyp> a = Maps.newIdentityHashMap();
   private static final MapCodec<bvi<?>> b = ma.f.q().fieldOf("id");
   private final int c;
   private final int d;
   private final bvi<?> m;

   public cyp(bvi<? extends bvz> $$0, int $$1, int $$2, cxc.a $$3) {
      super($$3);
      this.m = $$0;
      this.c = $$1;
      this.d = $$2;
      a.put($$0, this);
   }

   @Override
   public bta a(daz $$0) {
      dgz $$1 = $$0.q();
      if ($$1.C) {
         return bta.a;
      } else {
         cxg $$2 = $$0.n();
         jh $$3 = $$0.a();
         jm $$4 = $$0.k();
         dxo $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dhu $$6) {
            bvi<?> $$7 = this.g($$2);
            $$6.a($$7, $$1.H_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), eck.c, $$3);
            $$2.h(1);
            return bta.a;
         } else {
            jh $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bvi<?> $$10 = this.g($$2);
            if ($$10.a((arx)$$1, $$2, $$0.o(), $$8, bvh.m, true, !Objects.equals($$3, $$8) && $$4 == jm.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), eck.t, $$3);
            }

            return bta.a;
         }
      }
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      fbn $$4 = a($$0, $$1, dgh.b.b);
      if ($$4.d() != fbp.a.b) {
         return bta.e;
      } else if ($$0.C) {
         return bta.a;
      } else {
         jh $$6 = $$4.b();
         if (!($$0.a_($$6).b() instanceof dov)) {
            return bta.e;
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.c(), $$3)) {
            bvi<?> $$7 = this.g($$3);
            bvb $$8 = $$7.a((arx)$$0, $$3, $$1, $$6, bvh.m, false, false);
            if ($$8 == null) {
               return bta.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(axf.c.b(this));
               $$0.a($$1, eck.t, $$8.du());
               return bta.a;
            }
         } else {
            return bta.d;
         }
      }
   }

   public boolean a(cxg $$0, bvi<?> $$1) {
      return Objects.equals(this.g($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.d;
   }

   @Nullable
   public static cyp a(@Nullable bvi<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cyp> b() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bvi<?> g(cxg $$0) {
      czp $$1 = $$0.a(ku.W, czp.a);
      return !$$1.c() ? $$1.a(b).result().orElse(this.m) : this.m;
   }

   @Override
   public csk i() {
      return this.m.i();
   }

   public Optional<bvz> a(cpo $$0, bvz $$1, bvi<? extends bvz> $$2, arx $$3, fbr $$4, cxg $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bvz $$6;
         if ($$1 instanceof bus) {
            $$6 = ((bus)$$1).a($$3, (bus)$$1);
         } else {
            $$6 = $$2.a($$3, bvh.m);
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
