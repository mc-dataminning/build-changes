import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class cai<E extends bxk> extends byt<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final chr h;
   private final int i;
   private final Function<E, awm> j;
   private Optional<Long> k = Optional.empty();
   private Optional<cai.a> l = Optional.empty();

   public cai(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, chr $$4, int $$5, Function<E, awm> $$6) {
      super(ImmutableMap.of(cge.o, cgf.c, cge.W, cgf.b, cge.h, cgf.a, cge.X, cgf.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(arq $$0, bxk $$1, long $$2) {
      byc<?> $$3 = $$1.eb();
      $$3.c(cge.h).flatMap($$2x -> $$2x.a($$2xx -> this.h.a($$0, $$1, $$2xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(arq $$0, E $$1, long $$2) {
      byc<?> $$3 = $$1.eb();
      if (!$$3.a(cge.X)) {
         $$0.a($$1, (byte)59);
         $$3.a(cge.W, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(arq $$0, bxk $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bK();
   }

   protected void d(arq $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.eb().a(cge.n, new cgh(this.l.get().a(), this.g, 0));
         $$1.eb().a(cge.o, new bze(this.l.get().c(), true));
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
                  $$1.eb().a(cge.X, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), awo.g, 1.0F, $$1.fe());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private fei a(iu $$0, iu $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)azm.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)azm.j((double)($$1.w() - $$0.w()));
      return fei.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<iu> a(bxk $$0, bxc $$1) {
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

         cgm $$7 = $$0.O();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dv()::j)).filter($$1x -> {
            ewu $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bxk $$0, iu $$1) {
      return $$0.O().a($$1) && $$0.a(exc.b($$0, $$1)) == 0.0F;
   }

   private void b(bxk $$0, bxc $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new cai.a($$1x, $$1.dv(), $$1));
   }

   public static class a {
      private final iu a;
      private final iu b;
      final bxc c;

      public a(iu $$0, iu $$1, bxc $$2) {
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

      public bxc c() {
         return this.c;
      }
   }
}
