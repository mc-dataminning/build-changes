import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwv extends cvg {
   private static final Map<btq<? extends buh>, cwv> a = Maps.newIdentityHashMap();
   private static final MapCodec<btq<?>> b = lu.f.q().fieldOf("id");
   private final int c;
   private final int d;
   private final btq<?> k;

   public cwv(btq<? extends buh> $$0, int $$1, int $$2, cvg.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.d = $$2;
      a.put($$0, this);
   }

   @Override
   public brk a(cyy $$0) {
      dds $$1 = $$0.q();
      if ($$1.B) {
         return brk.a;
      } else {
         cvl $$2 = $$0.n();
         je $$3 = $$0.a();
         jj $$4 = $$0.k();
         dua $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dem $$6) {
            btq<?> $$7 = this.h($$2);
            $$6.a($$7, $$1.C_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dyx.c, $$3);
            $$2.h(1);
            return brk.a;
         } else {
            je $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            btq<?> $$10 = this.h($$2);
            if ($$10.a((arg)$$1, $$2, $$0.o(), $$8, btp.m, true, !Objects.equals($$3, $$8) && $$4 == jj.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dyx.t, $$3);
            }

            return brk.a;
         }
      }
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      cvl $$3 = $$1.b($$2);
      eya $$4 = a($$0, $$1, dda.b.b);
      if ($$4.c() != eyc.a.b) {
         return brk.e;
      } else if ($$0.B) {
         return brk.a;
      } else {
         je $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof dll)) {
            return brk.e;
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            btq<?> $$7 = this.h($$3);
            btj $$8 = $$7.a((arg)$$0, $$3, $$1, $$6, btp.m, false, false);
            if ($$8 == null) {
               return brk.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awn.c.b(this));
               $$0.a($$1, dyx.t, $$8.dq());
               return brk.a;
            }
         } else {
            return brk.d;
         }
      }
   }

   public boolean a(cvl $$0, btq<?> $$1) {
      return Objects.equals(this.h($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.d;
   }

   @Nullable
   public static cwv a(@Nullable btq<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cwv> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public btq<?> h(cvl $$0) {
      cya $$1 = $$0.a(kr.O, cya.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cqh i() {
      return this.k.i();
   }

   public Optional<buh> a(cnp $$0, buh $$1, btq<? extends buh> $$2, arg $$3, eye $$4, cvl $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         buh $$6;
         if ($$1 instanceof btc) {
            $$6 = ((btc)$$1).a($$3, (btc)$$1);
         } else {
            $$6 = $$2.a($$3, btp.m);
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
               $$6.b($$5.a(kr.g));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
