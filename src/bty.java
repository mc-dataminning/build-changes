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

public class bty extends dif<bua> {
   public static final int a = 6;
   public static final int b = 1;
   private final bty.a d;
   private final LongSet e = new LongOpenHashSet();

   public bty(Path $$0, DataFixer $$1, boolean $$2, hs $$3, cpo $$4) {
      super($$0, bua::a, bua::new, $$1, ass.q, $$2, $$3, $$4);
      this.d = new bty.a();
   }

   public void a(gu $$0, he<bub> $$1) {
      this.f(hx.c($$0)).a($$0, $$1);
   }

   public void a(gu $$0) {
      this.d(hx.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<he<bub>> $$0, gu $$1, int $$2, bty.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(aeq<bub> $$0, gu $$1) {
      return this.a($$1, (Predicate<he<bub>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<btz> b(Predicate<he<bub>> $$0, gu $$1, int $$2, bty.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return cot.a(new cot($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         gu $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<btz> c(Predicate<he<bub>> $$0, gu $$1, int $$2, bty.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @asq
   public Stream<btz> a(Predicate<he<bub>> $$0, cot $$1, bty.b $$2) {
      return IntStream.range(this.c.al(), this.c.am())
         .boxed()
         .map($$1x -> this.d(hx.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((bua)$$2x.get()).a($$0, $$2));
   }

   public Stream<gu> a(Predicate<he<bub>> $$0, Predicate<gu> $$1, gu $$2, int $$3, bty.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(btz::f).filter($$1);
   }

   public Stream<Pair<he<bub>, gu>> b(Predicate<he<bub>> $$0, Predicate<gu> $$1, gu $$2, int $$3, bty.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<he<bub>, gu>> c(Predicate<he<bub>> $$0, Predicate<gu> $$1, gu $$2, int $$3, bty.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((gu)$$1x.getSecond()).j($$2)));
   }

   public Optional<gu> d(Predicate<he<bub>> $$0, Predicate<gu> $$1, gu $$2, int $$3, bty.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<gu> d(Predicate<he<bub>> $$0, gu $$1, int $$2, bty.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(btz::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<he<bub>, gu>> e(Predicate<he<bub>> $$0, gu $$1, int $$2, bty.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<gu> e(Predicate<he<bub>> $$0, Predicate<gu> $$1, gu $$2, int $$3, bty.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(btz::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<gu> a(Predicate<he<bub>> $$0, BiPredicate<he<bub>, gu> $$1, gu $$2, int $$3) {
      return this.c($$0, $$2, $$3, bty.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<gu> a(Predicate<he<bub>> $$0, Predicate<gu> $$1, bty.b $$2, gu $$3, int $$4, aru $$5) {
      List<btz> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(btz::f);
   }

   public boolean b(gu $$0) {
      return this.d(hx.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(gu $$0, Predicate<he<bub>> $$1) {
      return this.d(hx.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<he<bub>> c(gu $$0) {
      return this.d(hx.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @asq
   public int d(gu $$0) {
      return this.d(hx.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(hx $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<bua> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(apv.b), bty.b.b).findAny().isPresent()).orElse(false);
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

   public void a(hx $$0, dhi $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            bua $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dhi $$0) {
      return $$0.a(buc::b);
   }

   private void a(dhi $$0, hx $$1, BiConsumer<gu, he<bub>> $$2) {
      $$1.t().forEach($$2x -> {
         dfa $$3 = $$0.a(hx.b($$2x.u()), hx.b($$2x.v()), hx.b($$2x.w()));
         buc.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(cpp $$0, gu $$1, int $$2) {
      hx.a(new cot($$1), Math.floorDiv($$2, 16), this.c.al(), this.c.am())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(bua::a).orElse(false))
         .map($$0x -> ((hx)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dhb.c));
   }

   final class a extends akg {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return bty.this.g($$0) ? 0 : 7;
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
      a(btz::d),
      b(btz::e),
      c($$0 -> true);

      private final Predicate<? super btz> d;

      private b(Predicate<? super btz> $$0) {
         this.d = $$0;
      }

      public Predicate<? super btz> a() {
         return this.d;
      }
   }
}
