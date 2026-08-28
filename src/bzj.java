import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bzj<E extends bwj> extends bxu<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cgs h;
   private final int i;
   private final Function<E, axe> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bzj.a> l = Optional.empty();

   public bzj(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cgs $$4, int $$5, Function<E, axe> $$6) {
      super(ImmutableMap.of(cff.n, cfg.c, cff.V, cfg.b, cff.h, cfg.a, cff.W, cfg.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(ash $$0, bwj $$1, long $$2) {
      bxd<?> $$3 = $$1.eb();
      $$3.c(cff.h).flatMap($$2x -> $$2x.a($$2xx -> this.h.a($$0, $$1, $$2xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(ash $$0, E $$1, long $$2) {
      bxd<?> $$3 = $$1.eb();
      if (!$$3.a(cff.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(cff.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(ash $$0, bwj $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bL();
   }

   protected void d(ash $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.eb().a(cff.m, new cfi(this.l.get().a(), this.g, 0));
         $$1.eb().a(cff.n, new byf(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dv().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.L().o();
            this.b($$1, this.l.get().c);
         } else {
            jh $$4 = $$1.dv();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.eb().a(cff.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), axg.g, 1.0F, $$1.ff());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private fbs a(jh $$0, jh $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)bae.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)bae.j((double)($$1.w() - $$0.w()));
      return fbs.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<jh> a(bwj $$0, bwb $$1) {
      jh $$2 = $$1.dv();
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

         cfn $$7 = $$0.L();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dv()::j)).filter($$1x -> {
            eud $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bwj $$0, jh $$1) {
      return $$0.L().a($$1) && $$0.a(eul.b($$0, $$1)) == 0.0F;
   }

   private void b(bwj $$0, bwb $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bzj.a($$1x, $$1.dv(), $$1));
   }

   public static class a {
      private final jh a;
      private final jh b;
      final bwb c;

      public a(jh $$0, jh $$1, bwb $$2) {
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

      public bwb c() {
         return this.c;
      }
   }
}
