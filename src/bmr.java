import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class bmr<E extends bjv> extends bld<E> {
   public static final int c = 160;
   private final ToIntFunction<E> d;
   private final int e;
   private final int f;
   private final float g;
   private final bty h;
   private final int i;
   private final Function<E, apf> j;
   private Optional<Long> k = Optional.empty();
   private Optional<bmr.a> l = Optional.empty();

   public bmr(ToIntFunction<E> $$0, int $$1, int $$2, float $$3, bty $$4, int $$5, Function<E, apf> $$6) {
      super(ImmutableMap.of(bsn.n, bso.c, bsn.U, bso.b, bsn.h, bso.a, bsn.V, bso.b), 160);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   protected void a(akt $$0, bjv $$1, long $$2) {
      bkm<?> $$3 = $$1.dN();
      $$3.c(bsn.h).flatMap($$1x -> $$1x.a($$1xx -> this.h.a($$1, $$1xx))).ifPresent($$1x -> this.b($$1, $$1x));
   }

   protected void b(akt $$0, E $$1, long $$2) {
      bkm<?> $$3 = $$1.dN();
      if (!$$3.a(bsn.V)) {
         $$0.a($$1, (byte)59);
         $$3.a(bsn.U, this.d.applyAsInt($$1));
      }
   }

   protected boolean c(akt $$0, bjv $$1, long $$2) {
      return this.l.isPresent() && this.l.get().c().bv();
   }

   protected void d(akt $$0, E $$1, long $$2) {
      if (!this.l.isEmpty()) {
         $$1.dN().a(bsn.m, new bsq(this.l.get().a(), this.g, 0));
         $$1.dN().a(bsn.n, new blo(this.l.get().c(), true));
         boolean $$3 = !this.l.get().c().dl().equals(this.l.get().b());
         if ($$3) {
            $$0.a($$1, (byte)59);
            $$1.L().n();
            this.b($$1, this.l.get().c);
         } else {
            gw $$4 = $$1.dl();
            if ($$4.equals(this.l.get().a())) {
               $$0.a($$1, (byte)58);
               if (this.k.isEmpty()) {
                  this.k = Optional.of($$2);
               }

               if ($$2 - this.k.get() >= (long)this.i) {
                  $$1.dN().a(bsn.V, this.a($$4, this.l.get().b()));
                  $$0.a(null, $$1, this.j.apply($$1), aph.g, 1.0F, $$1.eW());
                  this.l = Optional.empty();
               }
            }
         }
      }
   }

   private ehh a(gw $$0, gw $$1) {
      double $$2 = 0.5;
      double $$3 = 0.5 * (double)asb.j((double)($$1.u() - $$0.u()));
      double $$4 = 0.5 * (double)asb.j((double)($$1.w() - $$0.w()));
      return ehh.c($$1).b($$3, 0.0, $$4);
   }

   private Optional<gw> a(bjv $$0, bjm $$1) {
      gw $$2 = $$1.dl();
      if (!this.a($$0, $$2)) {
         return Optional.empty();
      } else {
         List<gw> $$3 = Lists.newArrayList();
         gw.a $$4 = $$2.j();

         for (ha $$5 : ha.c.a) {
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

         bsv $$7 = $$0.L();
         return $$3.stream().sorted(Comparator.comparingDouble($$0.dl()::j)).filter($$1x -> {
            eav $$2x = $$7.a($$1x, 0);
            return $$2x != null && $$2x.j();
         }).findFirst();
      }
   }

   private boolean a(bjv $$0, gw $$1) {
      return $$0.L().a($$1) && $$0.a(eba.a($$0.dL(), $$1.j())) == 0.0F;
   }

   private void b(bjv $$0, bjm $$1) {
      this.k = Optional.empty();
      this.l = this.a($$0, $$1).map($$1x -> new bmr.a($$1x, $$1.dl(), $$1));
   }

   public static class a {
      private final gw a;
      private final gw b;
      final bjm c;

      public a(gw $$0, gw $$1, bjm $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public gw a() {
         return this.a;
      }

      public gw b() {
         return this.b;
      }

      public bjm c() {
         return this.c;
      }
   }
}
