import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cux extends ctl {
   private static final Map<bsc<? extends bss>, cux> a = Maps.newIdentityHashMap();
   private static final MapCodec<bsc<?>> b = le.g.q().fieldOf("id");
   private final int c;
   private final int j;
   private final bsc<?> k;

   public cux(bsc<? extends bss> $$0, int $$1, int $$2, ctl.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      if (!($$1 instanceof aqn)) {
         return bpw.a;
      } else {
         ctq $$2 = $$0.n();
         io $$3 = $$0.a();
         it $$4 = $$0.k();
         drd $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dbr $$6) {
            bsc<?> $$7 = this.j($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dvw.c, $$3);
            $$2.h(1);
            return bpw.b;
         } else {
            io $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bsc<?> $$10 = this.j($$2);
            if ($$10.a((aqn)$$1, $$2, $$0.o(), $$8, bsu.m, true, !Objects.equals($$3, $$8) && $$4 == it.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dvw.t, $$3);
            }

            return bpw.b;
         }
      }
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      eui $$4 = a($$0, $$1, dai.b.b);
      if ($$4.c() != euk.a.b) {
         return bpx.c($$3);
      } else if (!($$0 instanceof aqn)) {
         return bpx.a($$3);
      } else {
         io $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof diq)) {
            return bpx.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bsc<?> $$7 = this.j($$3);
            brw $$8 = $$7.a((aqn)$$0, $$3, $$1, $$6, bsu.m, false, false);
            if ($$8 == null) {
               return bpx.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(avs.c.b(this));
               $$0.a($$1, dvw.t, $$8.dn());
               return bpx.b($$3);
            }
         } else {
            return bpx.d($$3);
         }
      }
   }

   public boolean a(ctq $$0, bsc<?> $$1) {
      return Objects.equals(this.j($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cux a(@Nullable bsc<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cux> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bsc<?> j(ctq $$0) {
      cwf $$1 = $$0.a(kb.L, cwf.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public col i() {
      return this.k.i();
   }

   public Optional<bss> a(cly $$0, bss $$1, bsc<? extends bss> $$2, aqn $$3, eum $$4, ctq $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bss $$6;
         if ($$1 instanceof brq) {
            $$6 = ((brq)$$1).a($$3, (brq)$$1);
         } else {
            $$6 = $$2.a((daz)$$3);
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
