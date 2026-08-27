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

public class car extends dqh<cat> {
   public static final int a = 6;
   public static final int b = 1;
   private final car.a d;
   private final LongSet e = new LongOpenHashSet();

   public car(dqg $$0, Path $$1, DataFixer $$2, boolean $$3, iz $$4, cxb $$5) {
      super(new dqi($$0, $$1, $$2, $$3, ayc.q), cat::a, cat::new, $$4, $$5);
      this.d = new car.a();
   }

   public void a(ib $$0, il<cau> $$1) {
      this.f(je.c($$0)).a($$0, $$1);
   }

   public void a(ib $$0) {
      this.d(je.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<il<cau>> $$0, ib $$1, int $$2, car.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(ajg<cau> $$0, ib $$1) {
      return this.a($$1, (Predicate<il<cau>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cas> b(Predicate<il<cau>> $$0, ib $$1, int $$2, car.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return cwg.a(new cwg($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         ib $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cas> c(Predicate<il<cau>> $$0, ib $$1, int $$2, car.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @axz
   public Stream<cas> a(Predicate<il<cau>> $$0, cwg $$1, car.b $$2) {
      return IntStream.range(this.c.am(), this.c.an())
         .boxed()
         .map($$1x -> this.d(je.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cat)$$2x.get()).a($$0, $$2));
   }

   public Stream<ib> a(Predicate<il<cau>> $$0, Predicate<ib> $$1, ib $$2, int $$3, car.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cas::f).filter($$1);
   }

   public Stream<Pair<il<cau>, ib>> b(Predicate<il<cau>> $$0, Predicate<ib> $$1, ib $$2, int $$3, car.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<il<cau>, ib>> c(Predicate<il<cau>> $$0, Predicate<ib> $$1, ib $$2, int $$3, car.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((ib)$$1x.getSecond()).j($$2)));
   }

   public Optional<ib> d(Predicate<il<cau>> $$0, Predicate<ib> $$1, ib $$2, int $$3, car.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<ib> d(Predicate<il<cau>> $$0, ib $$1, int $$2, car.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cas::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<il<cau>, ib>> e(Predicate<il<cau>> $$0, ib $$1, int $$2, car.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<ib> e(Predicate<il<cau>> $$0, Predicate<ib> $$1, ib $$2, int $$3, car.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cas::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<ib> a(Predicate<il<cau>> $$0, BiPredicate<il<cau>, ib> $$1, ib $$2, int $$3) {
      return this.c($$0, $$2, $$3, car.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<ib> a(Predicate<il<cau>> $$0, Predicate<ib> $$1, car.b $$2, ib $$3, int $$4, axd $$5) {
      List<cas> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(cas::f);
   }

   public boolean b(ib $$0) {
      return this.d(je.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(ib $$0, Predicate<il<cau>> $$1) {
      return this.d(je.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<il<cau>> c(ib $$0) {
      return this.d(je.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @axz
   public int d(ib $$0) {
      return this.d(je.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(je $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cat> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(auy.b), car.b.b).findAny().isPresent()).orElse(false);
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

   public void a(je $$0, dph $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cat $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dph $$0) {
      return $$0.a(cav::b);
   }

   private void a(dph $$0, je $$1, BiConsumer<ib, il<cau>> $$2) {
      $$1.t().forEach($$2x -> {
         dmz $$3 = $$0.a(je.b($$2x.u()), je.b($$2x.v()), je.b($$2x.w()));
         cav.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(cxc $$0, ib $$1, int $$2) {
      je.a(new cwg($$1), Math.floorDiv($$2, 16), this.c.am(), this.c.an())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cat::a).orElse(false))
         .map($$0x -> ((je)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dpa.c));
   }

   final class a extends apb {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return car.this.g($$0) ? 0 : 7;
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
      a(cas::d),
      b(cas::e),
      c($$0 -> true);

      private final Predicate<? super cas> d;

      private b(Predicate<? super cas> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cas> a() {
         return this.d;
      }
   }
}
