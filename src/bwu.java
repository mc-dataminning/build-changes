import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bwu<E extends btu> extends bvf<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final ced h;
   private final int i;
   private final Function<E, avn> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bwu.a> l = Optional.empty();

   public bwu(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, ced $$4, int $$5, Function<E, avn> $$6) {
      super(ImmutableMap.of(ccq.n, ccr.c, ccq.V, ccr.b, ccq.h, ccr.a, ccq.W, ccr.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(aqt $$0, btu $$1, long $$2) {
      buo<?> $$3 = $$1.dU();
      $$3.c(ccq.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(aqt $$0, E $$1, long $$2) {
      buo<?> $$3 = $$1.dU();
      if (!$$3.a(ccq.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(ccq.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(aqt $$0, btu $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bE();
   }

   protected void d(aqt $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dU().a(ccq.m, new cct(this.l.get().a(), this.g, 0));
         $$1.dU().a(ccq.n, new bvq(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dq().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.J().n();
            this.b($$1, this.l.get().c);
         } else {
            jd $$4 = $$1.dq();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dU().a(ccq.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), avp.g, 1.0F, $$1.fc());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private eww a(jd $$0, jd $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)ayn.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)ayn.j((double)($$1.w() - $$0.w()));
      return eww.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<jd> a(btu $$0, btl $$1) {
      jd $$2 = $$1.dq();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<jd> $$3 = Lists.newArrayList();
         jd.a $$4 = $$2.j();

         for (ji $$5 : ji.c.a) {
            $$4.g($$2);

            for (int $$6 = 0; $$6 < this.f; $$6++) {
               if (!this.a($$0, $$4.c($$5))) {
                  $$4.c($$5.g());
                  break;
               }
            }

            if ($$4.k($$2) >= this.e) {
               $$3.add($$4.i());
            }
         }

         ccy $$7 = $$0.J();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dq()::j)).filter($$1x -> {
            epm $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(btu $$0, jd $$1) {
      return $$0.J().a($$1) && $$0.a(epu.b($$0, $$1)) == 0.0F;
   }

   private void b(btu $$0, btl $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bwu.a($$1x, $$1.dq(), $$1));
   }

   public static class a {
      private final jd a;
      private final jd b;
      final btl c;

      public a(jd $$0, jd $$1, btl $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public jd a() {
         return this.a;
      }

      public jd b() {
         return this.b;
      }

      public btl c() {
         return this.c;
      }
   }
}
