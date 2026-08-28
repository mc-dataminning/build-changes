import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bym<E extends bvm> extends bwx<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cfv h;
   private final int i;
   private final Function<E, awn> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bym.a> l = Optional.empty();

   public bym(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cfv $$4, int $$5, Function<E, awn> $$6) {
      super(ImmutableMap.of(cei.n, cej.c, cei.V, cej.b, cei.h, cej.a, cei.W, cej.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(arq $$0, bvm $$1, long $$2) {
      bwg<?> $$3 = $$1.ee();
      $$3.c(cei.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(arq $$0, E $$1, long $$2) {
      bwg<?> $$3 = $$1.ee();
      if (!$$3.a(cei.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(cei.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(arq $$0, bvm $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bN();
   }

   protected void d(arq $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.ee().a(cei.m, new cel(this.l.get().a(), this.g, 0));
         $$1.ee().a(cei.n, new bxi(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dy().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.P().o();
            this.b($$1, this.l.get().c);
         } else {
            jh $$4 = $$1.dy();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.ee().a(cei.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), awp.g, 1.0F, $$1.fk());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private ezr a(jh $$0, jh $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)azn.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)azn.j((double)($$1.w() - $$0.w()));
      return ezr.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<jh> a(bvm $$0, bve $$1) {
      jh $$2 = $$1.dy();
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

         ceq $$7 = $$0.P();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dy()::j)).filter($$1x -> {
            esc $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bvm $$0, jh $$1) {
      return $$0.P().a($$1) && $$0.a(esk.b($$0, $$1)) == 0.0F;
   }

   private void b(bvm $$0, bve $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bym.a($$1x, $$1.dy(), $$1));
   }

   public static class a {
      private final jh a;
      private final jh b;
      final bve c;

      public a(jh $$0, jh $$1, bve $$2) {
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

      public bve c() {
         return this.c;
      }
   }
}
