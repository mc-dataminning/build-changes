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

public class bwf extends dkn<bwh> {
   public static final int a = 6;
   public static final int b = 1;
   private final bwf.a d;
   private final LongSet e = new LongOpenHashSet();

   public bwf(Path $$0, DataFixer $$1, boolean $$2, ip $$3, csc $$4) {
      super($$0, bwh::a, bwh::new, $$1, aus.q, $$2, $$3, $$4);
      this.d = new bwf.a();
   }

   public void a(ht $$0, ib<bwi> $$1) {
      this.f(iu.c($$0)).a($$0, $$1);
   }

   public void a(ht $$0) {
      this.d(iu.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<ib<bwi>> $$0, ht $$1, int $$2, bwf.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(agh<bwi> $$0, ht $$1) {
      return this.a($$1, (Predicate<ib<bwi>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<bwg> b(Predicate<ib<bwi>> $$0, ht $$1, int $$2, bwf.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return crh.a(new crh($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         ht $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<bwg> c(Predicate<ib<bwi>> $$0, ht $$1, int $$2, bwf.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @aup
   public Stream<bwg> a(Predicate<ib<bwi>> $$0, crh $$1, bwf.b $$2) {
      return IntStream.range(this.c.am(), this.c.an())
         .boxed()
         .map($$1x -> this.d(iu.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((bwh)$$2x.get()).a($$0, $$2));
   }

   public Stream<ht> a(Predicate<ib<bwi>> $$0, Predicate<ht> $$1, ht $$2, int $$3, bwf.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(bwg::f).filter($$1);
   }

   public Stream<Pair<ib<bwi>, ht>> b(Predicate<ib<bwi>> $$0, Predicate<ht> $$1, ht $$2, int $$3, bwf.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<ib<bwi>, ht>> c(Predicate<ib<bwi>> $$0, Predicate<ht> $$1, ht $$2, int $$3, bwf.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((ht)$$1x.getSecond()).j($$2)));
   }

   public Optional<ht> d(Predicate<ib<bwi>> $$0, Predicate<ht> $$1, ht $$2, int $$3, bwf.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<ht> d(Predicate<ib<bwi>> $$0, ht $$1, int $$2, bwf.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(bwg::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<ib<bwi>, ht>> e(Predicate<ib<bwi>> $$0, ht $$1, int $$2, bwf.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<ht> e(Predicate<ib<bwi>> $$0, Predicate<ht> $$1, ht $$2, int $$3, bwf.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(bwg::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<ht> a(Predicate<ib<bwi>> $$0, BiPredicate<ib<bwi>, ht> $$1, ht $$2, int $$3) {
      return this.c($$0, $$2, $$3, bwf.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<ht> a(Predicate<ib<bwi>> $$0, Predicate<ht> $$1, bwf.b $$2, ht $$3, int $$4, ats $$5) {
      List<bwg> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(bwg::f);
   }

   public boolean b(ht $$0) {
      return this.d(iu.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(ht $$0, Predicate<ib<bwi>> $$1) {
      return this.d(iu.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<ib<bwi>> c(ht $$0) {
      return this.d(iu.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @aup
   public int d(ht $$0) {
      return this.d(iu.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(iu $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<bwh> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(arq.b), bwf.b.b).findAny().isPresent()).orElse(false);
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

   public void a(iu $$0, djq $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            bwh $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(djq $$0) {
      return $$0.a(bwj::b);
   }

   private void a(djq $$0, iu $$1, BiConsumer<ht, ib<bwi>> $$2) {
      $$1.t().forEach($$2x -> {
         dhi $$3 = $$0.a(iu.b($$2x.u()), iu.b($$2x.v()), iu.b($$2x.w()));
         bwj.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(csd $$0, ht $$1, int $$2) {
      iu.a(new crh($$1), Math.floorDiv($$2, 16), this.c.am(), this.c.an())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(bwh::a).orElse(false))
         .map($$0x -> ((iu)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, djj.c));
   }

   final class a extends ama {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return bwf.this.g($$0) ? 0 : 7;
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
      a(bwg::d),
      b(bwg::e),
      c($$0 -> true);

      private final Predicate<? super bwg> d;

      private b(Predicate<? super bwg> $$0) {
         this.d = $$0;
      }

      public Predicate<? super bwg> a() {
         return this.d;
      }
   }
}
