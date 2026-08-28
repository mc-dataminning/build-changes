import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bzx<E extends bwz> extends byi<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final chg h;
   private final int i;
   private final Function<E, awj> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bzx.a> l = Optional.empty();

   public bzx(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, chg $$4, int $$5, Function<E, awj> $$6) {
      super(ImmutableMap.of(cft.o, cfu.c, cft.W, cfu.b, cft.h, cfu.a, cft.X, cfu.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(arn $$0, bwz $$1, long $$2) {
      bxr<?> $$3 = $$1.eb();
      $$3.c(cft.h).flatMap($$2x -> $$2x.a($$2xx -> this.h.a($$0, $$1, $$2xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(arn $$0, E $$1, long $$2) {
      bxr<?> $$3 = $$1.eb();
      if (!$$3.a(cft.X)) {
         $$0.a($$1, (byte)59);
         $$3.a(cft.W, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(arn $$0, bwz $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bK();
   }

   protected void d(arn $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.eb().a(cft.n, new cfw(this.l.get().a(), this.g, 0));
         $$1.eb().a(cft.o, new byt(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dv().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.O().m();
            this.b($$1, this.l.get().c);
         } else {
            jj $$4 = $$1.dv();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.eb().a(cft.X, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), awl.g, 1.0F, $$1.fe());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private fcu a(jj $$0, jj $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)azk.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)azk.j((double)($$1.w() - $$0.w()));
      return fcu.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<jj> a(bwz $$0, bwr $$1) {
      jj $$2 = $$1.dv();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<jj> $$3 = Lists.newArrayList();
         jj.a $$4 = $$2.k();

         for (jo $$5 : jo.c.a) {
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

         cgb $$7 = $$0.O();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dv()::j)).filter($$1x -> {
            evh $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bwz $$0, jj $$1) {
      return $$0.O().a($$1) && $$0.a(evp.b($$0, $$1)) == 0.0F;
   }

   private void b(bwz $$0, bwr $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bzx.a($$1x, $$1.dv(), $$1));
   }

   public static class a {
      private final jj a;
      private final jj b;
      final bwr c;

      public a(jj $$0, jj $$1, bwr $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public jj a() {
         return this.a;
      }

      public jj b() {
         return this.b;
      }

      public bwr c() {
         return this.c;
      }
   }
}
