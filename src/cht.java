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

public class cht extends ecd<chv, chv.a> {
   public static final int a = 6;
   public static final int b = 1;
   private final cht.a d;
   private final LongSet e = new LongOpenHashSet();

   public cht(ecc $$0, Path $$1, DataFixer $$2, boolean $$3, kg $$4, ebr $$5, dhr $$6) {
      super(new ecf($$0, $$1, $$2, $$3, bax.q), chv.a.a, chv::a, chv.a::a, chv::new, $$4, $$5, $$6);
      this.d = new cht.a();
   }

   public void a(jj $$0, js<chw> $$1) {
      this.f(kl.c($$0)).a($$0, $$1);
   }

   public void a(jj $$0) {
      this.d(kl.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<js<chw>> $$0, jj $$1, int $$2, cht.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(alc<chw> $$0, jj $$1) {
      return this.a($$1, (Predicate<js<chw>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<chu> b(Predicate<js<chw>> $$0, jj $$1, int $$2, cht.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return dgw.a(new dgw($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         jj $$3x = $$2x.g();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<chu> c(Predicate<js<chw>> $$0, jj $$1, int $$2, cht.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.g().j($$1) <= (double)$$4);
   }

   @bar
   public Stream<chu> a(Predicate<js<chw>> $$0, dgw $$1, cht.b $$2) {
      return IntStream.rangeClosed(this.c.aq(), this.c.ar())
         .boxed()
         .map($$1x -> this.d(kl.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((chv)$$2x.get()).a($$0, $$2));
   }

   public Stream<jj> a(Predicate<js<chw>> $$0, Predicate<jj> $$1, jj $$2, int $$3, cht.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(chu::g).filter($$1);
   }

   public Stream<Pair<js<chw>, jj>> b(Predicate<js<chw>> $$0, Predicate<jj> $$1, jj $$2, int $$3, cht.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.g())).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Stream<Pair<js<chw>, jj>> c(Predicate<js<chw>> $$0, Predicate<jj> $$1, jj $$2, int $$3, cht.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((jj)$$1x.getSecond()).j($$2)));
   }

   public Optional<jj> d(Predicate<js<chw>> $$0, Predicate<jj> $$1, jj $$2, int $$3, cht.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<jj> d(Predicate<js<chw>> $$0, jj $$1, int $$2, cht.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(chu::g).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<js<chw>, jj>> e(Predicate<js<chw>> $$0, jj $$1, int $$2, cht.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.g().j($$1))).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Optional<jj> e(Predicate<js<chw>> $$0, Predicate<jj> $$1, jj $$2, int $$3, cht.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(chu::g).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<jj> a(Predicate<js<chw>> $$0, BiPredicate<js<chw>, jj> $$1, jj $$2, int $$3) {
      return this.c($$0, $$2, $$3, cht.b.a).filter($$1x -> $$1.test($$1x.h(), $$1x.g())).findFirst().map($$0x -> {
         $$0x.c();
         return $$0x.g();
      });
   }

   public Optional<jj> a(Predicate<js<chw>> $$0, Predicate<jj> $$1, cht.b $$2, jj $$3, int $$4, azs $$5) {
      List<chu> $$6 = af.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.g())).findFirst().map(chu::g);
   }

   public boolean b(jj $$0) {
      return this.d(kl.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> af.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(jj $$0, Predicate<js<chw>> $$1) {
      return this.d(kl.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<js<chw>> c(jj $$0) {
      return this.d(kl.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @bar
   public int d(jj $$0) {
      return this.d(kl.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(kl $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<chv> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(axk.b), cht.b.b).findAny().isPresent()).orElse(false);
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

   public void a(kl $$0, eau $$1) {
      af.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            chv $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(eau $$0) {
      return $$0.a(chx::b);
   }

   private void a(eau $$0, kl $$1, BiConsumer<jj, js<chw>> $$2) {
      $$1.t().forEach($$2x -> {
         dym $$3 = $$0.a(kl.b($$2x.u()), kl.b($$2x.v()), kl.b($$2x.w()));
         chx.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dhs $$0, jj $$1, int $$2) {
      kl.a(new dgw($$1), Math.floorDiv($$2, 16), this.c.aq(), this.c.ar())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(chv::b).orElse(false))
         .map($$0x -> ((kl)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.h, $$1x.i, ebk.c));
   }

   final class a extends ari {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cht.this.g($$0) ? 0 : 7;
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
      a(chu::e),
      b(chu::f),
      c($$0 -> true);

      private final Predicate<? super chu> d;

      private b(final Predicate<? super chu> $$0) {
         this.d = $$0;
      }

      public Predicate<? super chu> a() {
         return this.d;
      }
   }
}
