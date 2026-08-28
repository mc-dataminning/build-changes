import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class byp<E extends bvp> extends bxa<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final cfy h;
   private final int i;
   private final Function<E, avz> j;
   private Optional<Long> k = Optional.empty();
   private Optional<byp.a> l = Optional.empty();

   public byp(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, cfy $$4, int $$5, Function<E, avz> $$6) {
      super(ImmutableMap.of(cel.n, cem.c, cel.V, cem.b, cel.h, cem.a, cel.W, cem.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(ard $$0, bvp $$1, long $$2) {
      bwj<?> $$3 = $$1.eb();
      $$3.c(cel.h).flatMap($$2x -> $$2x.a($$2xx -> this.h.a($$0, $$1, $$2xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(ard $$0, E $$1, long $$2) {
      bwj<?> $$3 = $$1.eb();
      if (!$$3.a(cel.W)) {
         $$0.a($$1, (byte)59);
         $$3.a(cel.V, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(ard $$0, bvp $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bL();
   }

   protected void d(ard $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.eb().a(cel.m, new ceo(this.l.get().a(), this.g, 0));
         $$1.eb().a(cel.n, new bxl(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dv().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.P().m();
            this.b($$1, this.l.get().c);
         } else {
            ji $$4 = $$1.dv();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.eb().a(cel.W, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), awb.g, 1.0F, $$1.fh());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private fba a(ji $$0, ji $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)ayz.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)ayz.j((double)($$1.w() - $$0.w()));
      return fba.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<ji> a(bvp $$0, bvh $$1) {
      ji $$2 = $$1.dv();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<ji> $$3 = Lists.newArrayList();
         ji.a $$4 = $$2.k();

         for (jn $$5 : jn.c.a) {
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

         cet $$7 = $$0.P();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dv()::j)).filter($$1x -> {
            etn $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bvp $$0, ji $$1) {
      return $$0.P().a($$1) && $$0.a(etv.b($$0, $$1)) == 0.0F;
   }

   private void b(bvp $$0, bvh $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new byp.a($$1x, $$1.dv(), $$1));
   }

   public static class a {
      private final ji a;
      private final ji b;
      final bvh c;

      public a(ji $$0, ji $$1, bvh $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public ji a() {
         return this.a;
      }

      public ji b() {
         return this.b;
      }

      public bvh c() {
         return this.c;
      }
   }
}
