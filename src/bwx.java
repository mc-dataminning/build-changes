import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bwx<E extends bty> extends bvi<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final ceg h;
   private final int i;
   private final Function<E, avz> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bwx.a> l = Optional.empty();

   public bwx(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, ceg $$4, int $$5, Function<E, avz> $$6) {
      super(ImmutableMap.of(cct.n, ccu.c, cct.V, ccu.b, cct.h, ccu.a, cct.W, ccu.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(arf $$0, bty $$1, long $$2) {
      bur<?> $$3 = $$1.dS();
      $$3.c(cct.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(arf $$0, E $$1, long $$2) {
      bur<?> $$3 = $$1.dS();
      if (!$$3.a(cct.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(cct.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(arf $$0, bty $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bD();
   }

   protected void d(arf $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dS().a(cct.m, new ccw(this.l.get().a(), this.g, 0));
         $$1.dS().a(cct.n, new bvt(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dp().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.K().n();
            this.b($$1, this.l.get().c);
         } else {
            iz $$4 = $$1.dp();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dS().a(cct.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), awb.g, 1.0F, $$1.ff());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private evr a(iz $$0, iz $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)ayz.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)ayz.j((double)($$1.w() - $$0.w()));
      return evr.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<iz> a(bty $$0, btp $$1) {
      iz $$2 = $$1.dp();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<iz> $$3 = Lists.newArrayList();
         iz.a $$4 = $$2.j();

         for (je $$5 : je.c.a) {
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

         cdb $$7 = $$0.K();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dp()::j)).filter($$1x -> {
            eoj $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bty $$0, iz $$1) {
      return $$0.K().a($$1) && $$0.a(eor.b($$0, $$1)) == 0.0F;
   }

   private void b(bty $$0, btp $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bwx.a($$1x, $$1.dp(), $$1));
   }

   public static class a {
      private final iz a;
      private final iz b;
      final btp c;

      public a(iz $$0, iz $$1, btp $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public iz a() {
         return this.a;
      }

      public iz b() {
         return this.b;
      }

      public btp c() {
         return this.c;
      }
   }
}
