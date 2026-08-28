import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bxu<E extends buv> extends bwf<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cfd h;
   private final int i;
   private final Function<E, awf> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bxu.a> l = Optional.empty();

   public bxu(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cfd $$4, int $$5, Function<E, awf> $$6) {
      super(ImmutableMap.of(cdq.n, cdr.c, cdq.V, cdr.b, cdq.h, cdr.a, cdq.W, cdr.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(arj $$0, buv $$1, long $$2) {
      bvo<?> $$3 = $$1.dY();
      $$3.c(cdq.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(arj $$0, E $$1, long $$2) {
      bvo<?> $$3 = $$1.dY();
      if (!$$3.a(cdq.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(cdq.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(arj $$0, buv $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bI();
   }

   protected void d(arj $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dY().a(cdq.m, new cdt(this.l.get().a(), this.g, 0));
         $$1.dY().a(cdq.n, new bwq(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().ds().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.P().o();
            this.b($$1, this.l.get().c);
         } else {
            jf $$4 = $$1.ds();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dY().a(cdq.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), awh.g, 1.0F, $$1.fe());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private eyw a(jf $$0, jf $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)azf.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)azf.j((double)($$1.w() - $$0.w()));
      return eyw.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<jf> a(buv $$0, bun $$1) {
      jf $$2 = $$1.ds();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<jf> $$3 = Lists.newArrayList();
         jf.a $$4 = $$2.k();

         for (jk $$5 : jk.c.a) {
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

         cdy $$7 = $$0.P();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.ds()::j)).filter($$1x -> {
            erh $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(buv $$0, jf $$1) {
      return $$0.P().a($$1) && $$0.a(erp.b($$0, $$1)) == 0.0F;
   }

   private void b(buv $$0, bun $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bxu.a($$1x, $$1.ds(), $$1));
   }

   public static class a {
      private final jf a;
      private final jf b;
      final bun c;

      public a(jf $$0, jf $$1, bun $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public jf a() {
         return this.a;
      }

      public jf b() {
         return this.b;
      }

      public bun c() {
         return this.c;
      }
   }
}
