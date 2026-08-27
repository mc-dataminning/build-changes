import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bmc<E extends bjf> extends bko<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final btj h;
   private final int i;
   private final Function<E, aot> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bmc.a> l = Optional.empty();

   public bmc(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, btj $$4, int $$5, Function<E, aot> $$6) {
      super(ImmutableMap.of(bry.n, brz.c, bry.U, brz.b, bry.h, brz.a, bry.V, brz.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(aki $$0, bjf $$1, long $$2) {
      bjx<?> $$3 = $$1.dM();
      $$3.c(bry.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(aki $$0, E $$1, long $$2) {
      bjx<?> $$3 = $$1.dM();
      if (!$$3.a(bry.V)) {
         $$0.a($$1, (byte)59);
         $$3.a(bry.U, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(aki $$0, bjf $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bv();
   }

   protected void d(aki $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dM().a(bry.m, new bsb(this.l.get().a(), this.g, 0));
         $$1.dM().a(bry.n, new bkz(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dk().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.H().n();
            this.b($$1, this.l.get().c);
         } else {
            gv $$4 = $$1.dk();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dM().a(bry.V, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), aov.g, 1.0F, $$1.eV());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private ehf a(gv $$0, gv $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)aro.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)aro.j((double)($$1.w() - $$0.w()));
      return ehf.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<gv> a(bjf $$0, biw $$1) {
      gv $$2 = $$1.dk();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<gv> $$3 = Lists.newArrayList();
         gv.a $$4 = $$2.j();

         for (hb $$5 : hb.c.a) {
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

         bsg $$7 = $$0.H();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dk()::j)).filter($$1x -> {
            eaq $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bjf $$0, gv $$1) {
      return $$0.H().a($$1) && $$0.a(eav.a($$0.dK(), $$1.j())) == 0.0F;
   }

   private void b(bjf $$0, biw $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bmc.a($$1x, $$1.dk(), $$1));
   }

   public static class a {
      private final gv a;
      private final gv b;
      final biw c;

      public a(gv $$0, gv $$1, biw $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public gv a() {
         return this.a;
      }

      public gv b() {
         return this.b;
      }

      public biw c() {
         return this.c;
      }
   }
}
