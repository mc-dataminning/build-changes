import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxo extends cwb {
   private static final Map<bup<? extends bvg>, cxo> a = Maps.newIdentityHashMap();
   private static final MapCodec<bup<?>> b = lz.f.q().fieldOf("id");
   private final int c;
   private final int d;
   private final bup<?> l;

   public cxo(bup<? extends bvg> $$0, int $$1, int $$2, cwb.a $$3) {
      super($$3);
      this.l = $$0;
      this.c = $$1;
      this.d = $$2;
      a.put($$0, this);
   }

   @Override
   public bsh a(czy $$0) {
      dff $$1 = $$0.q();
      if ($$1.C) {
         return bsh.a;
      } else {
         cwf $$2 = $$0.n();
         jh $$3 = $$0.a();
         jm $$4 = $$0.k();
         dvo $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dga $$6) {
            bup<?> $$7 = this.g($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), eak.c, $$3);
            $$2.h(1);
            return bsh.a;
         } else {
            jh $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bup<?> $$10 = this.g($$2);
            if ($$10.a((arq)$$1, $$2, $$0.o(), $$8, buo.m, true, !Objects.equals($$3, $$8) && $$4 == jm.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), eak.t, $$3);
            }

            return bsh.a;
         }
      }
   }

   @Override
   public bsh a(dff $$0, cor $$1, bsg $$2) {
      cwf $$3 = $$1.b($$2);
      ezn $$4 = a($$0, $$1, den.b.b);
      if ($$4.d() != ezp.a.b) {
         return bsh.e;
      } else if ($$0.C) {
         return bsh.a;
      } else {
         jh $$6 = $$4.b();
         if (!($$0.a_($$6).b() instanceof dmy)) {
            return bsh.e;
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.c(), $$3)) {
            bup<?> $$7 = this.g($$3);
            bui $$8 = $$7.a((arq)$$0, $$3, $$1, $$6, buo.m, false, false);
            if ($$8 == null) {
               return bsh.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awy.c.b(this));
               $$0.a($$1, eak.t, $$8.dw());
               return bsh.a;
            }
         } else {
            return bsh.d;
         }
      }
   }

   public boolean a(cwf $$0, bup<?> $$1) {
      return Objects.equals(this.g($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.d;
   }

   @Nullable
   public static cxo a(@Nullable bup<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cxo> b() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bup<?> g(cwf $$0) {
      cyo $$1 = $$0.a(ku.W, cyo.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.l) : this.l;
   }

   @Override
   public crj i() {
      return this.l.i();
   }

   public Optional<bvg> a(cor $$0, bvg $$1, bup<? extends bvg> $$2, arq $$3, ezr $$4, cwf $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bvg $$6;
         if ($$1 instanceof btz) {
            $$6 = ((btz)$$1).a($$3, (btz)$$1);
         } else {
            $$6 = $$2.a($$3, buo.m);
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
               $$6.b($$5.a(ku.g));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
