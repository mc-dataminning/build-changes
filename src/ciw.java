import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ciw extends eev<ciy, ciy.a> {
   public static final int a = 6;
   public static final int b = 1;
   private final ciw.a d;
   private final LongSet e = new LongOpenHashSet();

   public ciw(eeu $$0, Path $$1, DataFixer $$2, boolean $$3, jt $$4, eej $$5, djz $$6) {
      super(new eex($$0, $$1, $$2, $$3, bbd.q), ciy.a.a, ciy::a, ciy.a::a, ciy::new, $$4, $$5, $$6);
      this.d = new ciw.a();
   }

   public void a(iv $$0, jf<ciz> $$1) {
      this.f(jy.c($$0)).a($$0, $$1);
   }

   public void a(iv $$0) {
      this.d(jy.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<jf<ciz>> $$0, iv $$1, int $$2, ciw.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(alh<ciz> $$0, iv $$1) {
      return this.a($$1, (Predicate<jf<ciz>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cix> b(Predicate<jf<ciz>> $$0, iv $$1, int $$2, ciw.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return djc.a(new djc($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         iv $$3x = $$2x.g();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cix> c(Predicate<jf<ciz>> $$0, iv $$1, int $$2, ciw.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.g().j($$1) <= (double)$$4);
   }

   @bax
   public Stream<cix> a(Predicate<jf<ciz>> $$0, djc $$1, ciw.b $$2) {
      return IntStream.rangeClosed(this.c.aq(), this.c.ar())
         .boxed()
         .map($$1x -> this.d(jy.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((ciy)$$2x.get()).a($$0, $$2));
   }

   public Stream<iv> a(Predicate<jf<ciz>> $$0, Predicate<iv> $$1, iv $$2, int $$3, ciw.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cix::g).filter($$1);
   }

   public Stream<Pair<jf<ciz>, iv>> b(Predicate<jf<ciz>> $$0, Predicate<iv> $$1, iv $$2, int $$3, ciw.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.g())).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Stream<Pair<jf<ciz>, iv>> c(Predicate<jf<ciz>> $$0, Predicate<iv> $$1, iv $$2, int $$3, ciw.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((iv)$$1x.getSecond()).j($$2)));
   }

   public Optional<iv> d(Predicate<jf<ciz>> $$0, Predicate<iv> $$1, iv $$2, int $$3, ciw.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<iv> d(Predicate<jf<ciz>> $$0, iv $$1, int $$2, ciw.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cix::g).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<jf<ciz>, iv>> e(Predicate<jf<ciz>> $$0, iv $$1, int $$2, ciw.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.g().j($$1))).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Optional<iv> e(Predicate<jf<ciz>> $$0, Predicate<iv> $$1, iv $$2, int $$3, ciw.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cix::g).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<iv> a(Predicate<jf<ciz>> $$0, BiPredicate<jf<ciz>, iv> $$1, iv $$2, int $$3) {
      return this.c($$0, $$2, $$3, ciw.b.a).filter($$1x -> $$1.test($$1x.h(), $$1x.g())).findFirst().map($$0x -> {
         $$0x.c();
         return $$0x.g();
      });
   }

   public Optional<iv> a(Predicate<jf<ciz>> $$0, Predicate<iv> $$1, ciw.b $$2, iv $$3, int $$4, azx $$5) {
      List<cix> $$6 = ag.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.g())).findFirst().map(cix::g);
   }

   public boolean b(iv $$0) {
      return this.d(jy.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ag.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(iv $$0, Predicate<jf<ciz>> $$1) {
      return this.d(jy.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<jf<ciz>> c(iv $$0) {
      return this.d(jy.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @bax
   public int d(iv $$0) {
      return this.d(jy.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(jy $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<ciy> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(axo.b), ciw.b.b).findAny().isPresent()).orElse(false);
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      this.d.a();
   }

   @Override
   protected void a(long $$0) {
      super.a($$0);
      this.d.b($$0, this.d.b($$0), false);
   }

   @Override
   protected void b(long $$0) {
      this.d.b($$0, this.d.b($$0), false);
   }

   public void a(jy $$0, edm $$1) {
      ag.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            ciy $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(edm $$0) {
      return $$0.a(cja::b);
   }

   private void a(edm $$0, jy $$1, BiConsumer<iv, jf<ciz>> $$2) {
      $$1.t().forEach($$2x -> {
         ebe $$3 = $$0.a(jy.b($$2x.u()), jy.b($$2x.v()), jy.b($$2x.w()));
         cja.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dka $$0, iv $$1, int $$2) {
      jy.a(new djc($$1), Math.floorDiv($$2, 16), this.c.aq(), this.c.ar())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(ciy::b).orElse(false))
         .map($$0x -> ((jy)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.h, $$1x.i, eec.c));
   }

   final class a extends arn {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return ciw.this.g($$0) ? 0 : 7;
      }

      @Override
      protected int c(long $$0) {
         return this.b.get($$0);
      }

      @Override
      protected void a(long $$0, int $$1) {
         if ($$1 > 6) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, (byte)$$1);
         }
      }

      public void a() {
         super.b(Integer.MAX_VALUE);
      }
   }

   public static enum b {
      a(cix::e),
      b(cix::f),
      c($$0 -> true);

      private final Predicate<? super cix> d;

      private b(final Predicate<? super cix> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cix> a() {
         return this.d;
      }
   }
}
