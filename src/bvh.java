import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bvh<E extends bsi> extends bts<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final ccq h;
   private final int i;
   private final Function<E, avb> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bvh.a> l = Optional.empty();

   public bvh(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, ccq $$4, int $$5, Function<E, avb> $$6) {
      super(ImmutableMap.of(cbd.n, cbe.c, cbd.V, cbe.b, cbd.h, cbe.a, cbd.W, cbe.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(aqh $$0, bsi $$1, long $$2) {
      btb<?> $$3 = $$1.dQ();
      $$3.c(cbd.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(aqh $$0, E $$1, long $$2) {
      btb<?> $$3 = $$1.dQ();
      if (!$$3.a(cbd.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(cbd.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(aqh $$0, bsi $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bB();
   }

   protected void d(aqh $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dQ().a(cbd.m, new cbg(this.l.get().a(), this.g, 0));
         $$1.dQ().a(cbd.n, new bud(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dn().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.K().n();
            this.b($$1, this.l.get().c);
         } else {
            in $$4 = $$1.dn();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dQ().a(cbd.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), avd.g, 1.0F, $$1.fd());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private etp a(in $$0, in $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)axz.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)axz.j((double)($$1.w() - $$0.w()));
      return etp.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<in> a(bsi $$0, bsa $$1) {
      in $$2 = $$1.dn();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<in> $$3 = Lists.newArrayList();
         in.a $$4 = $$2.j();

         for (is $$5 : is.c.a) {
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

         cbl $$7 = $$0.K();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dn()::j)).filter($$1x -> {
            emo $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bsi $$0, in $$1) {
      return $$0.K().a($$1) && $$0.a(emw.b($$0, $$1)) == 0.0F;
   }

   private void b(bsi $$0, bsa $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bvh.a($$1x, $$1.dn(), $$1));
   }

   public static class a {
      private final in a;
      private final in b;
      final bsa c;

      public a(in $$0, in $$1, bsa $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public in a() {
         return this.a;
      }

      public in b() {
         return this.b;
      }

      public bsa c() {
         return this.c;
      }
   }
}
