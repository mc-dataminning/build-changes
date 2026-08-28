import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class cbl<E extends byn> extends bzw<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final ciu h;
   private final int i;
   private final Function<E, awx> j;
   private Optional<Long> k = Optional.empty();
   private Optional<cbl.a> l = Optional.empty();

   public cbl(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, ciu $$4, int $$5, Function<E, awx> $$6) {
      super(ImmutableMap.of(chh.o, chi.c, chh.W, chi.b, chh.h, chi.a, chh.X, chi.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(asb $$0, byn $$1, long $$2) {
      bzf<?> $$3 = $$1.ec();
      $$3.c(chh.h).flatMap($$2x -> $$2x.a($$2xx -> this.h.a($$0, $$1, $$2xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(asb $$0, E $$1, long $$2) {
      bzf<?> $$3 = $$1.ec();
      if (!$$3.a(chh.X)) {
         $$0.a($$1, (byte)59);
         $$3.a(chh.W, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(asb $$0, byn $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bJ();
   }

   protected void d(asb $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.ec().a(chh.n, new chk(this.l.get().a(), this.g, 0));
         $$1.ec().a(chh.o, new cah(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dv().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.N().m();
            this.b($$1, this.l.get().c);
         } else {
            iw $$4 = $$1.dv();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.ec().a(chh.X, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), awz.g, 1.0F, $$1.ff());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private fgc a(iw $$0, iw $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)azz.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)azz.j((double)($$1.w() - $$0.w()));
      return fgc.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<iw> a(byn $$0, byf $$1) {
      iw $$2 = $$1.dv();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<iw> $$3 = Lists.newArrayList();
         iw.a $$4 = $$2.k();

         for (jc $$5 : jc.c.a) {
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

         chp $$7 = $$0.N();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dv()::j)).filter($$1x -> {
            eyo $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(byn $$0, iw $$1) {
      return $$0.N().a($$1) && $$0.a(eyw.b($$0, $$1)) == 0.0F;
   }

   private void b(byn $$0, byf $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new cbl.a($$1x, $$1.dv(), $$1));
   }

   public static class a {
      private final iw a;
      private final iw b;
      final byf c;

      public a(iw $$0, iw $$1, byf $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public iw a() {
         return this.a;
      }

      public iw b() {
         return this.b;
      }

      public byf c() {
         return this.c;
      }
   }
}
