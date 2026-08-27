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

public class bww extends dlu<bwy> {
   public static final int a = 6;
   public static final int b = 1;
   private final bww.a d;
   private final LongSet e = new LongOpenHashSet();

   public bww(Path $$0, DataFixer $$1, boolean $$2, is $$3, cta $$4) {
      super($$0, bwy::a, bwy::new, $$1, avg.q, $$2, $$3, $$4);
      this.d = new bww.a();
   }

   public void a(hv $$0, ie<bwz> $$1) {
      this.f(ix.c($$0)).a($$0, $$1);
   }

   public void a(hv $$0) {
      this.d(ix.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<ie<bwz>> $$0, hv $$1, int $$2, bww.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(ags<bwz> $$0, hv $$1) {
      return this.a($$1, (Predicate<ie<bwz>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<bwx> b(Predicate<ie<bwz>> $$0, hv $$1, int $$2, bww.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return csf.a(new csf($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         hv $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<bwx> c(Predicate<ie<bwz>> $$0, hv $$1, int $$2, bww.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @avd
   public Stream<bwx> a(Predicate<ie<bwz>> $$0, csf $$1, bww.b $$2) {
      return IntStream.range(this.c.am(), this.c.an())
         .boxed()
         .map($$1x -> this.d(ix.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((bwy)$$2x.get()).a($$0, $$2));
   }

   public Stream<hv> a(Predicate<ie<bwz>> $$0, Predicate<hv> $$1, hv $$2, int $$3, bww.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(bwx::f).filter($$1);
   }

   public Stream<Pair<ie<bwz>, hv>> b(Predicate<ie<bwz>> $$0, Predicate<hv> $$1, hv $$2, int $$3, bww.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<ie<bwz>, hv>> c(Predicate<ie<bwz>> $$0, Predicate<hv> $$1, hv $$2, int $$3, bww.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((hv)$$1x.getSecond()).j($$2)));
   }

   public Optional<hv> d(Predicate<ie<bwz>> $$0, Predicate<hv> $$1, hv $$2, int $$3, bww.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<hv> d(Predicate<ie<bwz>> $$0, hv $$1, int $$2, bww.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(bwx::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<ie<bwz>, hv>> e(Predicate<ie<bwz>> $$0, hv $$1, int $$2, bww.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<hv> e(Predicate<ie<bwz>> $$0, Predicate<hv> $$1, hv $$2, int $$3, bww.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(bwx::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<hv> a(Predicate<ie<bwz>> $$0, BiPredicate<ie<bwz>, hv> $$1, hv $$2, int $$3) {
      return this.c($$0, $$2, $$3, bww.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<hv> a(Predicate<ie<bwz>> $$0, Predicate<hv> $$1, bww.b $$2, hv $$3, int $$4, auf $$5) {
      List<bwx> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(bwx::f);
   }

   public boolean b(hv $$0) {
      return this.d(ix.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(hv $$0, Predicate<ie<bwz>> $$1) {
      return this.d(ix.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<ie<bwz>> c(hv $$0) {
      return this.d(ix.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @avd
   public int d(hv $$0) {
      return this.d(ix.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(ix $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<bwy> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(asb.b), bww.b.b).findAny().isPresent()).orElse(false);
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

   public void a(ix $$0, dkx $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            bwy $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dkx $$0) {
      return $$0.a(bxa::b);
   }

   private void a(dkx $$0, ix $$1, BiConsumer<hv, ie<bwz>> $$2) {
      $$1.t().forEach($$2x -> {
         dip $$3 = $$0.a(ix.b($$2x.u()), ix.b($$2x.v()), ix.b($$2x.w()));
         bxa.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(ctb $$0, hv $$1, int $$2) {
      ix.a(new csf($$1), Math.floorDiv($$2, 16), this.c.am(), this.c.an())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(bwy::a).orElse(false))
         .map($$0x -> ((ix)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dkq.c));
   }

   final class a extends aml {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return bww.this.g($$0) ? 0 : 7;
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
      a(bwx::d),
      b(bwx::e),
      c($$0 -> true);

      private final Predicate<? super bwx> d;

      private b(Predicate<? super bwx> $$0) {
         this.d = $$0;
      }

      public Predicate<? super bwx> a() {
         return this.d;
      }
   }
}
