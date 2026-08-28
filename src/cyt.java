import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyt extends cxg {
   private static final Map<bvm<? extends bwd>, cyt> a = Maps.newIdentityHashMap();
   private static final MapCodec<bvm<?>> b = ma.f.q().fieldOf("id");
   private final int c;
   private final int d;
   private final bvm<?> l;

   public cyt(bvm<? extends bwd> $$0, int $$1, int $$2, cxg.a $$3) {
      super($$3);
      this.l = $$0;
      this.c = $$1;
      this.d = $$2;
      a.put($$0, this);
   }

   @Override
   public bte a(dbd $$0) {
      dha $$1 = $$0.q();
      if ($$1.C) {
         return bte.a;
      } else {
         cxk $$2 = $$0.n();
         jh $$3 = $$0.a();
         jm $$4 = $$0.k();
         dxn $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dhv $$6) {
            bvm<?> $$7 = this.g($$2);
            $$6.a($$7, $$1.H_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), ecj.c, $$3);
            $$2.h(1);
            return bte.a;
         } else {
            jh $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bvm<?> $$10 = this.g($$2);
            if ($$10.a((ash)$$1, $$2, $$0.o(), $$8, bvl.m, true, !Objects.equals($$3, $$8) && $$4 == jm.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), ecj.t, $$3);
            }

            return bte.a;
         }
      }
   }

   @Override
   public bte a(dha $$0, cps $$1, btd $$2) {
      cxk $$3 = $$1.b($$2);
      fbo $$4 = a($$0, $$1, dgi.b.b);
      if ($$4.d() != fbq.a.b) {
         return bte.e;
      } else if ($$0.C) {
         return bte.a;
      } else {
         jh $$6 = $$4.b();
         if (!($$0.a_($$6).b() instanceof dow)) {
            return bte.e;
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.c(), $$3)) {
            bvm<?> $$7 = this.g($$3);
            bvf $$8 = $$7.a((ash)$$0, $$3, $$1, $$6, bvl.m, false, false);
            if ($$8 == null) {
               return bte.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(axp.c.b(this));
               $$0.a($$1, ecj.t, $$8.dt());
               return bte.a;
            }
         } else {
            return bte.d;
         }
      }
   }

   public boolean a(cxk $$0, bvm<?> $$1) {
      return Objects.equals(this.g($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.d;
   }

   @Nullable
   public static cyt a(@Nullable bvm<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cyt> b() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bvm<?> g(cxk $$0) {
      czt $$1 = $$0.a(ku.W, czt.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.l) : this.l;
   }

   @Override
   public cso i() {
      return this.l.i();
   }

   public Optional<bwd> a(cps $$0, bwd $$1, bvm<? extends bwd> $$2, ash $$3, fbs $$4, cxk $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bwd $$6;
         if ($$1 instanceof buw) {
            $$6 = ((buw)$$1).a($$3, (buw)$$1);
         } else {
            $$6 = $$2.a($$3, bvl.m);
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
