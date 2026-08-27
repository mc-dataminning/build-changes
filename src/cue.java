import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class cue extends csu {
   private static final Map<brn<? extends bsc>, cue> a = Maps.newIdentityHashMap();
   private static final MapCodec<brn<?>> b = ld.g.q().fieldOf("id");
   private final int c;
   private final int j;
   private final brn<?> k;

   public cue(brn<? extends bsc> $$0, int $$1, int $$2, csu.a $$3) {
      super($$3);
      this.k = $$0;
      this.c = $$1;
      this.j = $$2;
      a.put($$0, this);
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      if (!($$1 instanceof aqh)) {
         return bpm.a;
      } else {
         csz $$2 = $$0.n();
         in $$3 = $$0.a();
         is $$4 = $$0.k();
         dqh $$5 = $$1.a_($$3);
         if ($$1.c_($$3) instanceof dav $$6) {
            brn<?> $$7 = this.j($$2);
            $$6.a($$7, $$1.E_());
            $$1.a($$3, $$5, $$5, 3);
            $$1.a($$0.o(), dva.c, $$3);
            $$2.h(1);
            return bpm.b;
         } else {
            in $$8;
            if ($$5.k($$1, $$3).c()) {
               $$8 = $$3;
            } else {
               $$8 = $$3.a($$4);
            }

            brn<?> $$10 = this.j($$2);
            if ($$10.a((aqh)$$1, $$2, $$0.o(), $$8, bse.m, true, !Objects.equals($$3, $$8) && $$4 == is.b) != null) {
               $$2.h(1);
               $$1.a($$0.o(), dva.t, $$3);
            }

            return bpm.b;
         }
      }
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      etl $$4 = a($$0, $$1, czm.b.b);
      if ($$4.c() != etn.a.b) {
         return bpn.c($$3);
      } else if (!($$0 instanceof aqh)) {
         return bpn.a($$3);
      } else {
         in $$6 = $$4.a();
         if (!($$0.a_($$6).b() instanceof dhu)) {
            return bpn.c($$3);
         } else if ($$0.a($$1, $$6) && $$1.a($$6, $$4.b(), $$3)) {
            brn<?> $$7 = this.j($$3);
            brh $$8 = $$7.a((aqh)$$0, $$3, $$1, $$6, bse.m, false, false);
            if ($$8 == null) {
               return bpn.c($$3);
            } else {
               $$3.a(1, $$1);
               $$1.b(avm.c.b(this));
               $$0.a($$1, dva.t, $$8.dl());
               return bpn.b($$3);
            }
         } else {
            return bpn.d($$3);
         }
      }
   }

   public boolean a(csz $$0, brn<?> $$1) {
      return Objects.equals(this.j($$0), $$1);
   }

   public int a(int $$0) {
      return $$0 == 0 ? this.c : this.j;
   }

   @Nullable
   public static cue a(@Nullable brn<?> $$0) {
      return a.get($$0);
   }

   public static Iterable<cue> h() {
      return Iterables.unmodifiableIterable(a.values());
   }

   public brn<?> j(csz $$0) {
      cvm $$1 = $$0.a(ka.K, cvm.a);
      return !$$1.b() ? $$1.a(b).result().orElse(this.k) : this.k;
   }

   @Override
   public cnu m() {
      return this.k.m();
   }

   public Optional<bsc> a(clh $$0, bsc $$1, brn<? extends bsc> $$2, aqh $$3, etp $$4, csz $$5) {
      if (!this.a($$5, $$2)) {
         return Optional.empty();
      } else {
         bsc $$6;
         if ($$1 instanceof brb) {
            $$6 = ((brb)$$1).a($$3, (brb)$$1);
         } else {
            $$6 = $$2.a((dad)$$3);
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
               $$6.b($$5.a(ka.f));
               $$5.a(1, $$0);
               return Optional.of($$6);
            }
         }
      }
   }
}
