import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bul<E extends brm> extends bsw<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cbu h;
   private final int i;
   private final Function<E, auy> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bul.a> l = Optional.empty();

   public bul(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cbu $$4, int $$5, Function<E, auy> $$6) {
      super(ImmutableMap.of(cah.n, cai.c, cah.V, cai.b, cah.h, cai.a, cah.W, cai.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(aqe $$0, brm $$1, long $$2) {
      bsf<?> $$3 = $$1.dQ();
      $$3.c(cah.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(aqe $$0, E $$1, long $$2) {
      bsf<?> $$3 = $$1.dQ();
      if (!$$3.a(cah.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(cah.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(aqe $$0, brm $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bB();
   }

   protected void d(aqe $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dQ().a(cah.m, new cak(this.l.get().a(), this.g, 0));
         $$1.dQ().a(cah.n, new bth(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dn().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.K().n();
            this.b($$1, this.l.get().c);
         } else {
            im $$4 = $$1.dn();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dQ().a(cah.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), ava.g, 1.0F, $$1.fd());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private etf a(im $$0, im $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)axw.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)axw.j((double)($$1.w() - $$0.w()));
      return etf.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<im> a(brm $$0, bre $$1) {
      im $$2 = $$1.dn();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<im> $$3 = Lists.newArrayList();
         im.a $$4 = $$2.j();

         for (ir $$5 : ir.c.a) {
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

         cap $$7 = $$0.K();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dn()::j)).filter($$1x -> {
            emf $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(brm $$0, im $$1) {
      return $$0.K().a($$1) && $$0.a(emn.b($$0, $$1)) == 0.0F;
   }

   private void b(brm $$0, bre $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bul.a($$1x, $$1.dn(), $$1));
   }

   public static class a {
      private final im a;
      private final im b;
      final bre c;

      public a(im $$0, im $$1, bre $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public im a() {
         return this.a;
      }

      public im b() {
         return this.b;
      }

      public bre c() {
         return this.c;
      }
   }
}
