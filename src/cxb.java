import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxb extends cvn {
   private static final Map<bty<? extends bup>, cxb> a = Maps.newIdentityHashMap();
   private static final MapCodec<bty<?>> b = lv.f.q().fieldOf("id");
   private final int c;
   private final int d;
   private final bty<?> k;

   public cxb(bty<? extends bup> $$0, int $$1, int $$2, cvn.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.d = $$2;
      a.put($$0, this);
   }

   @Override
   public brs a(czp $$0) {
      dej $$1 = $$0.q();
      if ($$1.B) {
         return brs.a;
      } else {
         cvs $$2 = $$0.n();
         jf $$3 = $$0.a();
         jk $$4 = $$0.k();
         dus $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dfd $$6) {
            bty<?> $$7 = this.g($$2);
            $$6.a($$7, $$1.D_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dzp.c, $$3);
            $$2.h(1);
            return brs.a;
         } else {
            jf $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bty<?> $$10 = this.g($$2);
            if ($$10.a((arj)$$1, $$2, $$0.o(), $$8, btx.m, true, !Objects.equals($$3, $$8) && $$4 == jk.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dzp.t, $$3);
            }

            return brs.a;
         }
      }
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      eys $$4 = a($$0, $$1, ddr.b.b);
      if ($$4.d() != eyu.a.b) {
         return brs.e;
      } else if ($$0.B) {
         return brs.a;
      } else {
         jf $$6 = $$4.b();
         if (!($$0.a_($$6).b() instanceof dmc)) {
            return brs.e;
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.c(), $$3)) {
            bty<?> $$7 = this.g($$3);
            btr $$8 = $$7.a((arj)$$0, $$3, $$1, $$6, btx.m, false, false);
            if ($$8 == null) {
               return brs.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awq.c.b(this));
               $$0.a($$1, dzp.t, $$8.dq());
               return brs.a;
            }
         } else {
            return brs.d;
         }
      }
   }

   public boolean a(cvs $$0, bty<?> $$1) {
      return Objects.equals(this.g($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.d;
   }

   @Nullable
   public static cxb a(@Nullable bty<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cxb> c() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bty<?> g(cvs $$0) {
      cyh $$1 = $$0.a(ks.R, cyh.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cqq i() {
      return this.k.i();
   }

   public Optional<bup> a(cnx $$0, bup $$1, bty<? extends bup> $$2, arj $$3, eyw $$4, cvs $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bup $$6;
         if ($$1 instanceof btk) {
            $$6 = ((btk)$$1).a($$3, (btk)$$1);
         } else {
            $$6 = $$2.a($$3, btx.m);
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
               $$6.b($$5.a(ks.g));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
