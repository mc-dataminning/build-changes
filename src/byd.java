import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class byd<E extends bvd> extends bwo<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cfm h;
   private final int i;
   private final Function<E, awj> j;
   private Optional<Long> k = Optional.empty();
   private Optional<byd.a> l = Optional.empty();

   public byd(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cfm $$4, int $$5, Function<E, awj> $$6) {
      super(ImmutableMap.of(cdz.n, cea.c, cdz.V, cea.b, cdz.h, cea.a, cdz.W, cea.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(arm $$0, bvd $$1, long $$2) {
      bvx<?> $$3 = $$1.ed();
      $$3.c(cdz.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(arm $$0, E $$1, long $$2) {
      bvx<?> $$3 = $$1.ed();
      if (!$$3.a(cdz.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(cdz.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(arm $$0, bvd $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bM();
   }

   protected void d(arm $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.ed().a(cdz.m, new cec(this.l.get().a(), this.g, 0));
         $$1.ed().a(cdz.n, new bwz(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dx().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.P().o();
            this.b($$1, this.l.get().c);
         } else {
            jg $$4 = $$1.dx();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.ed().a(cdz.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), awl.g, 1.0F, $$1.fj());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private ezh a(jg $$0, jg $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)azj.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)azj.j((double)($$1.w() - $$0.w()));
      return ezh.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<jg> a(bvd $$0, buv $$1) {
      jg $$2 = $$1.dx();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<jg> $$3 = Lists.newArrayList();
         jg.a $$4 = $$2.k();

         for (jl $$5 : jl.c.a) {
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

         ceh $$7 = $$0.P();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dx()::j)).filter($$1x -> {
            ers $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bvd $$0, jg $$1) {
      return $$0.P().a($$1) && $$0.a(esa.b($$0, $$1)) == 0.0F;
   }

   private void b(bvd $$0, buv $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new byd.a($$1x, $$1.dx(), $$1));
   }

   public static class a {
      private final jg a;
      private final jg b;
      final buv c;

      public a(jg $$0, jg $$1, buv $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public jg a() {
         return this.a;
      }

      public jg b() {
         return this.b;
      }

      public buv c() {
         return this.c;
      }
   }
}
