import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bww<E extends btw> extends bvh<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cef h;
   private final int i;
   private final Function<E, avo> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bww.a> l = Optional.empty();

   public bww(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cef $$4, int $$5, Function<E, avo> $$6) {
      super(ImmutableMap.of(ccs.n, cct.c, ccs.V, cct.b, ccs.h, cct.a, ccs.W, cct.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(aqu $$0, btw $$1, long $$2) {
      buq<?> $$3 = $$1.dT();
      $$3.c(ccs.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(aqu $$0, E $$1, long $$2) {
      buq<?> $$3 = $$1.dT();
      if (!$$3.a(ccs.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(ccs.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(aqu $$0, btw $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bE();
   }

   protected void d(aqu $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dT().a(ccs.m, new ccv(this.l.get().a(), this.g, 0));
         $$1.dT().a(ccs.n, new bvs(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().do().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.N().n();
            this.b($$1, this.l.get().c);
         } else {
            jd $$4 = $$1.do();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dT().a(ccs.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), avq.g, 1.0F, $$1.fb());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private exc a(jd $$0, jd $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)ayo.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)ayo.j((double)($$1.w() - $$0.w()));
      return exc.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<jd> a(btw $$0, btn $$1) {
      jd $$2 = $$1.do();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<jd> $$3 = Lists.newArrayList();
         jd.a $$4 = $$2.k();

         for (ji $$5 : ji.c.a) {
            $$4.g($$2);

            for (int $$6 = 0; $$6 < this.f; $$6++) {
               if (!this.a($$0, $$4.c($$5))) {
                  $$4.c($$5.g());
                  break;
               }
            }

            if ($$4.k($$2) >= this.e) {
               $$3.add($$4.j());
            }
         }

         cda $$7 = $$0.N();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.do()::j)).filter($$1x -> {
            eps $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(btw $$0, jd $$1) {
      return $$0.N().a($$1) && $$0.a(eqa.b($$0, $$1)) == 0.0F;
   }

   private void b(btw $$0, btn $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bww.a($$1x, $$1.do(), $$1));
   }

   public static class a {
      private final jd a;
      private final jd b;
      final btn c;

      public a(jd $$0, jd $$1, btn $$2) {
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

      public btn c() {
         return this.c;
      }
   }
}
