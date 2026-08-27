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

public class bxq extends dmu<bxs> {
   public static final int a = 6;
   public static final int b = 1;
   private final bxq.a d;
   private final LongSet e = new LongOpenHashSet();

   public bxq(Path $$0, DataFixer $$1, boolean $$2, iu $$3, ctz $$4) {
      super($$0, bxs::a, bxs::new, $$1, avx.q, $$2, $$3, $$4);
      this.d = new bxq.a();
   }

   public void a(hx $$0, ih<bxt> $$1) {
      this.f(iz.c($$0)).a($$0, $$1);
   }

   public void a(hx $$0) {
      this.d(iz.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<ih<bxt>> $$0, hx $$1, int $$2, bxq.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(ahg<bxt> $$0, hx $$1) {
      return this.a($$1, (Predicate<ih<bxt>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<bxr> b(Predicate<ih<bxt>> $$0, hx $$1, int $$2, bxq.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return cte.a(new cte($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         hx $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<bxr> c(Predicate<ih<bxt>> $$0, hx $$1, int $$2, bxq.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @avu
   public Stream<bxr> a(Predicate<ih<bxt>> $$0, cte $$1, bxq.b $$2) {
      return IntStream.range(this.c.an(), this.c.ao())
         .boxed()
         .map($$1x -> this.d(iz.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((bxs)$$2x.get()).a($$0, $$2));
   }

   public Stream<hx> a(Predicate<ih<bxt>> $$0, Predicate<hx> $$1, hx $$2, int $$3, bxq.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(bxr::f).filter($$1);
   }

   public Stream<Pair<ih<bxt>, hx>> b(Predicate<ih<bxt>> $$0, Predicate<hx> $$1, hx $$2, int $$3, bxq.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<ih<bxt>, hx>> c(Predicate<ih<bxt>> $$0, Predicate<hx> $$1, hx $$2, int $$3, bxq.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((hx)$$1x.getSecond()).j($$2)));
   }

   public Optional<hx> d(Predicate<ih<bxt>> $$0, Predicate<hx> $$1, hx $$2, int $$3, bxq.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<hx> d(Predicate<ih<bxt>> $$0, hx $$1, int $$2, bxq.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(bxr::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<ih<bxt>, hx>> e(Predicate<ih<bxt>> $$0, hx $$1, int $$2, bxq.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<hx> e(Predicate<ih<bxt>> $$0, Predicate<hx> $$1, hx $$2, int $$3, bxq.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(bxr::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<hx> a(Predicate<ih<bxt>> $$0, BiPredicate<ih<bxt>, hx> $$1, hx $$2, int $$3) {
      return this.c($$0, $$2, $$3, bxq.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<hx> a(Predicate<ih<bxt>> $$0, Predicate<hx> $$1, bxq.b $$2, hx $$3, int $$4, auw $$5) {
      List<bxr> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(bxr::f);
   }

   public boolean b(hx $$0) {
      return this.d(iz.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(hx $$0, Predicate<ih<bxt>> $$1) {
      return this.d(iz.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<ih<bxt>> c(hx $$0) {
      return this.d(iz.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @avu
   public int d(hx $$0) {
      return this.d(iz.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(iz $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<bxs> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(ass.b), bxq.b.b).findAny().isPresent()).orElse(false);
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

   public void a(iz $$0, dlx $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            bxs $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dlx $$0) {
      return $$0.a(bxu::b);
   }

   private void a(dlx $$0, iz $$1, BiConsumer<hx, ih<bxt>> $$2) {
      $$1.t().forEach($$2x -> {
         djp $$3 = $$0.a(iz.b($$2x.u()), iz.b($$2x.v()), iz.b($$2x.w()));
         bxu.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(cua $$0, hx $$1, int $$2) {
      iz.a(new cte($$1), Math.floorDiv($$2, 16), this.c.an(), this.c.ao())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(bxs::a).orElse(false))
         .map($$0x -> ((iz)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dlq.c));
   }

   final class a extends ana {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return bxq.this.g($$0) ? 0 : 7;
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
      a(bxr::d),
      b(bxr::e),
      c($$0 -> true);

      private final Predicate<? super bxr> d;

      private b(Predicate<? super bxr> $$0) {
         this.d = $$0;
      }

      public Predicate<? super bxr> a() {
         return this.d;
      }
   }
}
