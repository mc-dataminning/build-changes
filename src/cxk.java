import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxk extends cvx {
   private static final Map<bul<? extends bvc>, cxk> a = Maps.newIdentityHashMap();
   private static final MapCodec<bul<?>> b = ly.f.q().fieldOf("id");
   private final int c;
   private final int d;
   private final bul<?> l;

   public cxk(bul<? extends bvc> $$0, int $$1, int $$2, cvx.a $$3) {
      super($$3);
      this.l = $$0;
      this.c = $$1;
      this.d = $$2;
      a.put($$0, this);
   }

   @Override
   public bsd a(czu $$0) {
      dfb $$1 = $$0.q();
      if ($$1.C) {
         return bsd.a;
      } else {
         cwb $$2 = $$0.n();
         jh $$3 = $$0.a();
         jm $$4 = $$0.k();
         dvj $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dfv $$6) {
            bul<?> $$7 = this.g($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), eag.c, $$3);
            $$2.h(1);
            return bsd.a;
         } else {
            jh $$8;
            if ($$5.g($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            bul<?> $$10 = this.g($$2);
            if ($$10.a((arn)$$1, $$2, $$0.o(), $$8, buk.m, true, !Objects.equals($$3, $$8) && $$4 == jm.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), eag.t, $$3);
            }

            return bsd.a;
         }
      }
   }

   @Override
   public bsd a(dfb $$0, com $$1, bsc $$2) {
      cwb $$3 = $$1.b($$2);
      ezj $$4 = a($$0, $$1, dej.b.b);
      if ($$4.d() != ezl.a.b) {
         return bsd.e;
      } else if ($$0.C) {
         return bsd.a;
      } else {
         jh $$6 = $$4.b();
         if (!($$0.a_($$6).b() instanceof dmt)) {
            return bsd.e;
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.c(), $$3)) {
            bul<?> $$7 = this.g($$3);
            bue $$8 = $$7.a((arn)$$0, $$3, $$1, $$6, buk.m, false, false);
            if ($$8 == null) {
               return bsd.e;
            } else {
               $$3.a(1, $$1);
               $$1.b(awv.c.b(this));
               $$0.a($$1, eag.t, $$8.dv());
               return bsd.a;
            }
         } else {
            return bsd.d;
         }
      }
   }

   public boolean a(cwb $$0, bul<?> $$1) {
      return Objects.equals(this.g($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.d;
   }

   @Nullable
   public static cxk a(@Nullable bul<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cxk> b() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public bul<?> g(cwb $$0) {
      cyk $$1 = $$0.a(ku.W, cyk.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.l) : this.l;
   }

   @Override
   public crf i() {
      return this.l.i();
   }

   public Optional<bvc> a(com $$0, bvc $$1, bul<? extends bvc> $$2, arn $$3, ezn $$4, cwb $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bvc $$6;
         if ($$1 instanceof btv) {
            $$6 = ((btv)$$1).a($$3, (btv)$$1);
         } else {
            $$6 = $$2.a($$3, buk.m);
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
