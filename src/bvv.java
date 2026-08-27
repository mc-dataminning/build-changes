import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bvv<E extends bsw> extends bug<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cde h;
   private final int i;
   private final Function<E, avn> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bvv.a> l = Optional.empty();

   public bvv(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cde $$4, int $$5, Function<E, avn> $$6) {
      super(ImmutableMap.of(cbr.n, cbs.c, cbr.V, cbs.b, cbr.h, cbs.a, cbr.W, cbs.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(aqt $$0, bsw $$1, long $$2) {
      btp<?> $$3 = $$1.dZ();
      $$3.c(cbr.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(aqt $$0, E $$1, long $$2) {
      btp<?> $$3 = $$1.dZ();
      if (!$$3.a(cbr.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(cbr.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(aqt $$0, bsw $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bI();
   }

   protected void d(aqt $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dZ().a(cbr.m, new cbu(this.l.get().a(), this.g, 0));
         $$1.dZ().a(cbr.n, new bur(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().du().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.J().n();
            this.b($$1, this.l.get().c);
         } else {
            ir $$4 = $$1.du();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dZ().a(cbr.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), avq.g, 1.0F, $$1.fo());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private ewu a(ir $$0, ir $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)aym.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)aym.j((double)($$1.w() - $$0.w()));
      return ewu.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<ir> a(bsw $$0, bso $$1) {
      ir $$2 = $$1.du();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<ir> $$3 = Lists.newArrayList();
         ir.a $$4 = $$2.j();

         for (iw $$5 : iw.c.a) {
            $$4.g($$2);

            for (int $$6 = 0; $$6 < this.f; $$6++) {
               if (!this.a($$0, $$4.d($$5))) {
                  $$4.d($$5.g());
                  break;
               }
            }

            if ($$4.k($$2) >= this.e) {
               $$3.add($$4.i());
            }
         }

         cbz $$7 = $$0.J();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.du()::j)).filter($$1x -> {
            eps $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bsw $$0, ir $$1) {
      return $$0.J().a($$1) && $$0.a(eqa.b($$0, $$1)) == 0.0F;
   }

   private void b(bsw $$0, bso $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bvv.a($$1x, $$1.du(), $$1));
   }

   public static class a {
      private final ir a;
      private final ir b;
      final bso c;

      public a(ir $$0, ir $$1, bso $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ir a() {
         return this.a;
      }

      public ir b() {
         return this.b;
      }

      public bso c() {
         return this.c;
      }
   }
}
