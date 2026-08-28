import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwy extends cvk {
   private static final Map<btv<? extends bum>, cwy> a = Maps.newIdentityHashMap();
   private static final MapCodec<btv<?>> b = lu.f.q().fieldOf("id");
   private final int c;
   private final int d;
   private final btv<?> k;

   public cwy(btv<? extends bum> $$0, int $$1, int $$2, cvk.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.d = $$2;
      a.put($$0, this);
   }

   @Override
   public brp a(czm $$0) {
      deg $$1 = $$0.q();
      if ($$1.B) {
         return brp.a;
      } else {
         cvp $$2 = $$0.n();
         je $$3 = $$0.a();
         jj $$4 = $$0.k();
         duo $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dfa $$6) {
            btv<?> $$7 = this.g($$2);
            $$6.a($$7, $$1.C_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dzl.c, $$3);
            $$2.h(1);
            return brp.a;
         } else {
            je $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            btv<?> $$10 = this.g($$2);
            if ($$10.a((arh)$$1, $$2, $$0.o(), $$8, btu.m, true, !Objects.equals($$3, $$8) && $$4 == jj.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dzl.t, $$3);
            }

            return brp.a;
         }
      }
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      cvp $$3 = $$1.b($$2);
      eyo $$4 = a($$0, $$1, ddo.b.b);
      if ($$4.d() != eyq.a.b) {
         return brp.e;
      } else if ($$0.B) {
         return brp.a;
      } else {
         je $$6 = $$4.b();
         if (!($$0.a_($$6).b() instanceof dlz)) {
            return brp.e;
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.c(), $$3)) {
            btv<?> $$7 = this.g($$3);
            bto $$8 = $$7.a((arh)$$0, $$3, $$1, $$6, btu.m, false, false);
            if ($$8 == null) {
               return brp.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awo.c.b(this));
               $$0.a($$1, dzl.t, $$8.dq());
               return brp.a;
            }
         } else {
            return brp.d;
         }
      }
   }

   public boolean a(cvp $$0, btv<?> $$1) {
      return Objects.equals(this.g($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.d;
   }

   @Nullable
   public static cwy a(@Nullable btv<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cwy> c() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public btv<?> g(cvp $$0) {
      cye $$1 = $$0.a(kr.R, cye.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cqn i() {
      return this.k.i();
   }

   public Optional<bum> a(cnu $$0, bum $$1, btv<? extends bum> $$2, arh $$3, eys $$4, cvp $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bum $$6;
         if ($$1 instanceof bth) {
            $$6 = ((bth)$$1).a($$3, (bth)$$1);
         } else {
            $$6 = $$2.a($$3, btu.m);
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
