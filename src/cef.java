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

public class cef extends dwa<ceh> {
   public static final int a = 6;
   public static final int b = 1;
   private final cef.a d;
   private final LongSet e = new LongOpenHashSet();

   public cef(dvz $$0, Path $$1, DataFixer $$2, boolean $$3, jx $$4, dch $$5) {
      super(new dwb($$0, $$1, $$2, $$3, azo.q), ceh::a, ceh::new, $$4, $$5);
      this.d = new cef.a();
   }

   public void a(ja $$0, jj<cei> $$1) {
      this.f(kc.c($$0)).a($$0, $$1);
   }

   public void a(ja $$0) {
      this.d(kc.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<jj<cei>> $$0, ja $$1, int $$2, cef.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(akj<cei> $$0, ja $$1) {
      return this.a($$1, (Predicate<jj<cei>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<ceg> b(Predicate<jj<cei>> $$0, ja $$1, int $$2, cef.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return dbm.a(new dbm($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         ja $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<ceg> c(Predicate<jj<cei>> $$0, ja $$1, int $$2, cef.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @azl
   public Stream<ceg> a(Predicate<jj<cei>> $$0, dbm $$1, cef.b $$2) {
      return IntStream.range(this.c.ao(), this.c.ap())
         .boxed()
         .map($$1x -> this.d(kc.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((ceh)$$2x.get()).a($$0, $$2));
   }

   public Stream<ja> a(Predicate<jj<cei>> $$0, Predicate<ja> $$1, ja $$2, int $$3, cef.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(ceg::f).filter($$1);
   }

   public Stream<Pair<jj<cei>, ja>> b(Predicate<jj<cei>> $$0, Predicate<ja> $$1, ja $$2, int $$3, cef.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<jj<cei>, ja>> c(Predicate<jj<cei>> $$0, Predicate<ja> $$1, ja $$2, int $$3, cef.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((ja)$$1x.getSecond()).j($$2)));
   }

   public Optional<ja> d(Predicate<jj<cei>> $$0, Predicate<ja> $$1, ja $$2, int $$3, cef.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<ja> d(Predicate<jj<cei>> $$0, ja $$1, int $$2, cef.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(ceg::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<jj<cei>, ja>> e(Predicate<jj<cei>> $$0, ja $$1, int $$2, cef.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<ja> e(Predicate<jj<cei>> $$0, Predicate<ja> $$1, ja $$2, int $$3, cef.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(ceg::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<ja> a(Predicate<jj<cei>> $$0, BiPredicate<jj<cei>, ja> $$1, ja $$2, int $$3) {
      return this.c($$0, $$2, $$3, cef.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<ja> a(Predicate<jj<cei>> $$0, Predicate<ja> $$1, cef.b $$2, ja $$3, int $$4, ayo $$5) {
      List<ceg> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(ceg::f);
   }

   public boolean b(ja $$0) {
      return this.d(kc.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(ja $$0, Predicate<jj<cei>> $$1) {
      return this.d(kc.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<jj<cei>> c(ja $$0) {
      return this.d(kc.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @azl
   public int d(ja $$0) {
      return this.d(kc.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(kc $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<ceh> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(awh.b), cef.b.b).findAny().isPresent()).orElse(false);
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

   public void a(kc $$0, dur $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            ceh $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dur $$0) {
      return $$0.a(cej::b);
   }

   private void a(dur $$0, kc $$1, BiConsumer<ja, jj<cei>> $$2) {
      $$1.t().forEach($$2x -> {
         dsk $$3 = $$0.a(kc.b($$2x.u()), kc.b($$2x.v()), kc.b($$2x.w()));
         cej.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dci $$0, ja $$1, int $$2) {
      kc.a(new dbm($$1), Math.floorDiv($$2, 16), this.c.ao(), this.c.ap())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(ceh::a).orElse(false))
         .map($$0x -> ((kc)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dvh.c));
   }

   final class a extends aqi {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cef.this.g($$0) ? 0 : 7;
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
      a(ceg::d),
      b(ceg::e),
      c($$0 -> true);

      private final Predicate<? super ceg> d;

      private b(final Predicate<? super ceg> $$0) {
         this.d = $$0;
      }

      public Predicate<? super ceg> a() {
         return this.d;
      }
   }
}
