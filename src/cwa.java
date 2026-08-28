import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwa extends cul {
   private static final Map<bsx<? extends btp>, cwa> a = Maps.newIdentityHashMap();
   private static final MapCodec<bsx<?>> b = lt.f.r().fieldOf("id");
   private final int c;
   private final int j;
   private final bsx<?> k;

   public cwa(bsx<? extends btp> $$0, int $$1, int $$2, cul.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bqr a(cyf $$0) {
      dcw $$1 = $$0.q();
      if (!($$1 instanceof aqu)) {
         return bqr.a;
      } else {
         cuq $$2 = $$0.n();
         jd $$3 = $$0.a();
         ji $$4 = $$0.k();
         dtc $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof ddp $$6) {
            bsx<?> $$7 = this.i($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dxz.c, $$3);
            $$2.h(1);
            return bqr.c;
         } else {
            jd $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bsx<?> $$10 = this.i($$2);
            if ($$10.a((aqu)$$1, $$2, $$0.o(), $$8, btr.m, true, !Objects.equals($$3, $$8) && $$4 == ji.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dxz.t, $$3);
            }

            return bqr.c;
         }
      }
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      eww $$4 = a($$0, $$1, dcf.b.b);
      if ($$4.c() != ewy.a.b) {
         return bqs.c($$3);
      } else if (!($$0 instanceof aqu)) {
         return bqs.a($$3);
      } else {
         jd $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof dko)) {
            return bqs.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            bsx<?> $$7 = this.i($$3);
            bsr $$8 = $$7.a((aqu)$$0, $$3, $$1, $$6, btr.m, false, false);
            if ($$8 == null) {
               return bqs.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(avz.c.b(this));
               $$0.a($$1, dxz.t, $$8.dn());
               return bqs.b($$3);
            }
         } else {
            return bqs.d($$3);
         }
      }
   }

   public boolean a(cuq $$0, bsx<?> $$1) {
      return Objects.equals(this.i($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cwa a(@Nullable bsx<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cwa> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bsx<?> i(cuq $$0) {
      cxh $$1 = $$0.a(kq.M, cxh.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cpl i() {
      return this.k.i();
   }

   public Optional<btp> a(cmx $$0, btp $$1, bsx<? extends btp> $$2, aqu $$3, exa $$4, cuq $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         btp $$6;
         if ($$1 instanceof bsl) {
            $$6 = ((bsl)$$1).a($$3, (bsl)$$1);
         } else {
            $$6 = $$2.a((dcw)$$3);
         }

         if ($$6 == null) {
            return Optional.empty();
         } else {
            $$6.a(true);
            if (!$$6.o_()) {
               return Optional.empty();
            } else {
               $$6.b($$4.a(), $$4.b(), $$4.c(), 0.0F, 0.0F);
               $$3.a_($$6);
               $$6.b($$5.a(kq.g));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
