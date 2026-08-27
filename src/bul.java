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

public class bul extends dii<bun> {
   public static final int a = 6;
   public static final int b = 1;
   private final bul.a d;
   private final LongSet e = new LongOpenHashSet();

   public bul(Path $$0, DataFixer $$1, boolean $$2, hr $$3, cqd $$4) {
      super($$0, bun::a, bun::new, $$1, atg.q, $$2, $$3, $$4);
      this.d = new bul.a();
   }

   public void a(gw $$0, he<buo> $$1) {
      this.f(hw.c($$0)).a($$0, $$1);
   }

   public void a(gw $$0) {
      this.d(hw.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<he<buo>> $$0, gw $$1, int $$2, bul.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(aey<buo> $$0, gw $$1) {
      return this.a($$1, (Predicate<he<buo>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<bum> b(Predicate<he<buo>> $$0, gw $$1, int $$2, bul.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return cpi.a(new cpi($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         gw $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<bum> c(Predicate<he<buo>> $$0, gw $$1, int $$2, bul.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @atd
   public Stream<bum> a(Predicate<he<buo>> $$0, cpi $$1, bul.b $$2) {
      return IntStream.range(this.c.al(), this.c.am())
         .boxed()
         .map($$1x -> this.d(hw.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((bun)$$2x.get()).a($$0, $$2));
   }

   public Stream<gw> a(Predicate<he<buo>> $$0, Predicate<gw> $$1, gw $$2, int $$3, bul.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(bum::f).filter($$1);
   }

   public Stream<Pair<he<buo>, gw>> b(Predicate<he<buo>> $$0, Predicate<gw> $$1, gw $$2, int $$3, bul.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<he<buo>, gw>> c(Predicate<he<buo>> $$0, Predicate<gw> $$1, gw $$2, int $$3, bul.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((gw)$$1x.getSecond()).j($$2)));
   }

   public Optional<gw> d(Predicate<he<buo>> $$0, Predicate<gw> $$1, gw $$2, int $$3, bul.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<gw> d(Predicate<he<buo>> $$0, gw $$1, int $$2, bul.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(bum::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<he<buo>, gw>> e(Predicate<he<buo>> $$0, gw $$1, int $$2, bul.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<gw> e(Predicate<he<buo>> $$0, Predicate<gw> $$1, gw $$2, int $$3, bul.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(bum::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<gw> a(Predicate<he<buo>> $$0, BiPredicate<he<buo>, gw> $$1, gw $$2, int $$3) {
      return this.c($$0, $$2, $$3, bul.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<gw> a(Predicate<he<buo>> $$0, Predicate<gw> $$1, bul.b $$2, gw $$3, int $$4, ash $$5) {
      List<bum> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(bum::f);
   }

   public boolean b(gw $$0) {
      return this.d(hw.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(gw $$0, Predicate<he<buo>> $$1) {
      return this.d(hw.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<he<buo>> c(gw $$0) {
      return this.d(hw.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @atd
   public int d(gw $$0) {
      return this.d(hw.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(hw $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<bun> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(aqf.b), bul.b.b).findAny().isPresent()).orElse(false);
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

   public void a(hw $$0, dhl $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            bun $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dhl $$0) {
      return $$0.a(bup::b);
   }

   private void a(dhl $$0, hw $$1, BiConsumer<gw, he<buo>> $$2) {
      $$1.t().forEach($$2x -> {
         dfd $$3 = $$0.a(hw.b($$2x.u()), hw.b($$2x.v()), hw.b($$2x.w()));
         bup.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(cqe $$0, gw $$1, int $$2) {
      hw.a(new cpi($$1), Math.floorDiv($$2, 16), this.c.al(), this.c.am())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(bun::a).orElse(false))
         .map($$0x -> ((hw)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dhe.c));
   }

   final class a extends akp {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return bul.this.g($$0) ? 0 : 7;
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
      a(bum::d),
      b(bum::e),
      c($$0 -> true);

      private final Predicate<? super bum> d;

      private b(Predicate<? super bum> $$0) {
         this.d = $$0;
      }

      public Predicate<? super bum> a() {
         return this.d;
      }
   }
}
