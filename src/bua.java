import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bua<E extends brb> extends bsl<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cbj h;
   private final int i;
   private final Function<E, aun> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bua.a> l = Optional.empty();

   public bua(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cbj $$4, int $$5, Function<E, aun> $$6) {
      super(ImmutableMap.of(bzw.n, bzx.c, bzw.V, bzx.b, bzw.h, bzx.a, bzw.W, bzx.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(apu $$0, brb $$1, long $$2) {
      bru<?> $$3 = $$1.dP();
      $$3.c(bzw.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(apu $$0, E $$1, long $$2) {
      bru<?> $$3 = $$1.dP();
      if (!$$3.a(bzw.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(bzw.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(apu $$0, brb $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bA();
   }

   protected void d(apu $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dP().a(bzw.m, new bzz(this.l.get().a(), this.g, 0));
         $$1.dP().a(bzw.n, new bsw(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dm().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.K().n();
            this.b($$1, this.l.get().c);
         } else {
            id $$4 = $$1.dm();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dP().a(bzw.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), aup.g, 1.0F, $$1.fc());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private esj a(id $$0, id $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)axm.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)axm.j((double)($$1.w() - $$0.w()));
      return esj.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<id> a(brb $$0, bqt $$1) {
      id $$2 = $$1.dm();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<id> $$3 = Lists.newArrayList();
         id.a $$4 = $$2.j();

         for (ij $$5 : ij.c.a) {
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

         cae $$7 = $$0.K();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dm()::j)).filter($$1x -> {
            elp $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(brb $$0, id $$1) {
      return $$0.K().a($$1) && $$0.a(elx.b($$0, $$1)) == 0.0F;
   }

   private void b(brb $$0, bqt $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bua.a($$1x, $$1.dm(), $$1));
   }

   public static class a {
      private final id a;
      private final id b;
      final bqt c;

      public a(id $$0, id $$1, bqt $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public id a() {
         return this.a;
      }

      public id b() {
         return this.b;
      }

      public bqt c() {
         return this.c;
      }
   }
}
