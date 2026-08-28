import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class cak<E extends bxm> extends byv<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cht h;
   private final int i;
   private final Function<E, awm> j;
   private Optional<Long> k = Optional.empty();
   private Optional<cak.a> l = Optional.empty();

   public cak(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cht $$4, int $$5, Function<E, awm> $$6) {
      super(ImmutableMap.of(cgg.o, cgh.c, cgg.W, cgh.b, cgg.h, cgh.a, cgg.X, cgh.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(arq $$0, bxm $$1, long $$2) {
      bye<?> $$3 = $$1.ec();
      $$3.c(cgg.h).flatMap($$2x -> $$2x.a($$2xx -> this.h.a($$0, $$1, $$2xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(arq $$0, E $$1, long $$2) {
      bye<?> $$3 = $$1.ec();
      if (!$$3.a(cgg.X)) {
         $$0.a($$1, (byte)59);
         $$3.a(cgg.W, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(arq $$0, bxm $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bK();
   }

   protected void d(arq $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.ec().a(cgg.n, new cgj(this.l.get().a(), this.g, 0));
         $$1.ec().a(cgg.o, new bzg(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dv().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.O().m();
            this.b($$1, this.l.get().c);
         } else {
            iu $$4 = $$1.dv();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.ec().a(cgg.X, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), awo.g, 1.0F, $$1.ff());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private feq a(iu $$0, iu $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)azm.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)azm.j((double)($$1.w() - $$0.w()));
      return feq.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<iu> a(bxm $$0, bxe $$1) {
      iu $$2 = $$1.dv();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<iu> $$3 = Lists.newArrayList();
         iu.a $$4 = $$2.k();

         for (ja $$5 : ja.c.a) {
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

         cgo $$7 = $$0.O();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dv()::j)).filter($$1x -> {
            exc $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bxm $$0, iu $$1) {
      return $$0.O().a($$1) && $$0.a(exk.b($$0, $$1)) == 0.0F;
   }

   private void b(bxm $$0, bxe $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new cak.a($$1x, $$1.dv(), $$1));
   }

   public static class a {
      private final iu a;
      private final iu b;
      final bxe c;

      public a(iu $$0, iu $$1, bxe $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public iu a() {
         return this.a;
      }

      public iu b() {
         return this.b;
      }

      public bxe c() {
         return this.c;
      }
   }
}
