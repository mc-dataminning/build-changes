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

public class chf extends ebc<chh, chh.a> {
   public static final int a = 6;
   public static final int b = 1;
   private final chf.a d;
   private final LongSet e = new LongOpenHashSet();

   public chf(ebb $$0, Path $$1, DataFixer $$2, boolean $$3, ke $$4, eaq $$5, dhc $$6) {
      super(new ebe($$0, $$1, $$2, $$3, bbo.q), chh.a.a, chh::a, chh.a::a, chh::new, $$4, $$5, $$6);
      this.d = new chf.a();
   }

   public void a(jh $$0, jq<chi> $$1) {
      this.f(kj.c($$0)).a($$0, $$1);
   }

   public void a(jh $$0) {
      this.d(kj.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<jq<chi>> $$0, jh $$1, int $$2, chf.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(aly<chi> $$0, jh $$1) {
      return this.a($$1, (Predicate<jq<chi>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<chg> b(Predicate<jq<chi>> $$0, jh $$1, int $$2, chf.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return dgg.a(new dgg($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         jh $$3x = $$2x.g();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<chg> c(Predicate<jq<chi>> $$0, jh $$1, int $$2, chf.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.g().j($$1) <= (double)$$4);
   }

   @bbl
   public Stream<chg> a(Predicate<jq<chi>> $$0, dgg $$1, chf.b $$2) {
      return IntStream.rangeClosed(this.c.ao(), this.c.ap())
         .boxed()
         .map($$1x -> this.d(kj.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((chh)$$2x.get()).a($$0, $$2));
   }

   public Stream<jh> a(Predicate<jq<chi>> $$0, Predicate<jh> $$1, jh $$2, int $$3, chf.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(chg::g).filter($$1);
   }

   public Stream<Pair<jq<chi>, jh>> b(Predicate<jq<chi>> $$0, Predicate<jh> $$1, jh $$2, int $$3, chf.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.g())).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Stream<Pair<jq<chi>, jh>> c(Predicate<jq<chi>> $$0, Predicate<jh> $$1, jh $$2, int $$3, chf.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((jh)$$1x.getSecond()).j($$2)));
   }

   public Optional<jh> d(Predicate<jq<chi>> $$0, Predicate<jh> $$1, jh $$2, int $$3, chf.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<jh> d(Predicate<jq<chi>> $$0, jh $$1, int $$2, chf.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(chg::g).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<jq<chi>, jh>> e(Predicate<jq<chi>> $$0, jh $$1, int $$2, chf.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.g().j($$1))).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Optional<jh> e(Predicate<jq<chi>> $$0, Predicate<jh> $$1, jh $$2, int $$3, chf.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(chg::g).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<jh> a(Predicate<jq<chi>> $$0, BiPredicate<jq<chi>, jh> $$1, jh $$2, int $$3) {
      return this.c($$0, $$2, $$3, chf.b.a).filter($$1x -> $$1.test($$1x.h(), $$1x.g())).findFirst().map($$0x -> {
         $$0x.c();
         return $$0x.g();
      });
   }

   public Optional<jh> a(Predicate<jq<chi>> $$0, Predicate<jh> $$1, chf.b $$2, jh $$3, int $$4, bam $$5) {
      List<chg> $$6 = ae.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.g())).findFirst().map(chg::g);
   }

   public boolean b(jh $$0) {
      return this.d(kj.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ae.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(jh $$0, Predicate<jq<chi>> $$1) {
      return this.d(kj.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<jq<chi>> c(jh $$0) {
      return this.d(kj.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @bbl
   public int d(jh $$0) {
      return this.d(kj.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(kj $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<chh> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(ayf.b), chf.b.b).findAny().isPresent()).orElse(false);
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

   public void a(kj $$0, dzt $$1) {
      ae.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            chh $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dzt $$0) {
      return $$0.a(chj::b);
   }

   private void a(dzt $$0, kj $$1, BiConsumer<jh, jq<chi>> $$2) {
      $$1.t().forEach($$2x -> {
         dxn $$3 = $$0.a(kj.b($$2x.u()), kj.b($$2x.v()), kj.b($$2x.w()));
         chj.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dhd $$0, jh $$1, int $$2) {
      kj.a(new dgg($$1), Math.floorDiv($$2, 16), this.c.ao(), this.c.ap())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(chh::b).orElse(false))
         .map($$0x -> ((kj)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.g, $$1x.h, eaj.c));
   }

   final class a extends asc {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return chf.this.g($$0) ? 0 : 7;
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
      a(chg::e),
      b(chg::f),
      c($$0 -> true);

      private final Predicate<? super chg> d;

      private b(final Predicate<? super chg> $$0) {
         this.d = $$0;
      }

      public Predicate<? super chg> a() {
         return this.d;
      }
   }
}
