import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class byi<E extends bvi> extends bwt<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cfr h;
   private final int i;
   private final Function<E, awk> j;
   private Optional<Long> k = Optional.empty();
   private Optional<byi.a> l = Optional.empty();

   public byi(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cfr $$4, int $$5, Function<E, awk> $$6) {
      super(ImmutableMap.of(cee.n, cef.c, cee.V, cef.b, cee.h, cef.a, cee.W, cef.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(arn $$0, bvi $$1, long $$2) {
      bwc<?> $$3 = $$1.ed();
      $$3.c(cee.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(arn $$0, E $$1, long $$2) {
      bwc<?> $$3 = $$1.ed();
      if (!$$3.a(cee.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(cee.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(arn $$0, bvi $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bM();
   }

   protected void d(arn $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.ed().a(cee.m, new ceh(this.l.get().a(), this.g, 0));
         $$1.ed().a(cee.n, new bxe(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dx().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.P().o();
            this.b($$1, this.l.get().c);
         } else {
            jh $$4 = $$1.dx();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.ed().a(cee.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), awm.g, 1.0F, $$1.fj());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private ezn a(jh $$0, jh $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)azk.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)azk.j((double)($$1.w() - $$0.w()));
      return ezn.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<jh> a(bvi $$0, bva $$1) {
      jh $$2 = $$1.dx();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<jh> $$3 = Lists.newArrayList();
         jh.a $$4 = $$2.k();

         for (jm $$5 : jm.c.a) {
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

         cem $$7 = $$0.P();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dx()::j)).filter($$1x -> {
            ery $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bvi $$0, jh $$1) {
      return $$0.P().a($$1) && $$0.a(esg.b($$0, $$1)) == 0.0F;
   }

   private void b(bvi $$0, bva $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new byi.a($$1x, $$1.dx(), $$1));
   }

   public static class a {
      private final jh a;
      private final jh b;
      final bva c;

      public a(jh $$0, jh $$1, bva $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public jh a() {
         return this.a;
      }

      public jh b() {
         return this.b;
      }

      public bva c() {
         return this.c;
      }
   }
}
