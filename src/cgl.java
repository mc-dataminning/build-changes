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

public class cgl extends dzk<cgn, cgn.a> {
   public static final int a = 6;
   public static final int b = 1;
   private final cgl.a d;
   private final LongSet e = new LongOpenHashSet();

   public cgl(dzj $$0, Path $$1, DataFixer $$2, boolean $$3, ke $$4, dyy $$5, dfo $$6) {
      super(new dzm($$0, $$1, $$2, $$3, baw.q), cgn.a.a, cgn::a, cgn.a::a, cgn::new, $$4, $$5, $$6);
      this.d = new cgl.a();
   }

   public void a(jh $$0, jq<cgo> $$1) {
      this.f(kj.c($$0)).a($$0, $$1);
   }

   public void a(jh $$0) {
      this.d(kj.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<jq<cgo>> $$0, jh $$1, int $$2, cgl.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(ali<cgo> $$0, jh $$1) {
      return this.a($$1, (Predicate<jq<cgo>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cgm> b(Predicate<jq<cgo>> $$0, jh $$1, int $$2, cgl.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return des.a(new des($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         jh $$3x = $$2x.g();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cgm> c(Predicate<jq<cgo>> $$0, jh $$1, int $$2, cgl.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.g().j($$1) <= (double)$$4);
   }

   @bat
   public Stream<cgm> a(Predicate<jq<cgo>> $$0, des $$1, cgl.b $$2) {
      return IntStream.rangeClosed(this.c.an(), this.c.ao())
         .boxed()
         .map($$1x -> this.d(kj.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cgn)$$2x.get()).a($$0, $$2));
   }

   public Stream<jh> a(Predicate<jq<cgo>> $$0, Predicate<jh> $$1, jh $$2, int $$3, cgl.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cgm::g).filter($$1);
   }

   public Stream<Pair<jq<cgo>, jh>> b(Predicate<jq<cgo>> $$0, Predicate<jh> $$1, jh $$2, int $$3, cgl.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.g())).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Stream<Pair<jq<cgo>, jh>> c(Predicate<jq<cgo>> $$0, Predicate<jh> $$1, jh $$2, int $$3, cgl.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((jh)$$1x.getSecond()).j($$2)));
   }

   public Optional<jh> d(Predicate<jq<cgo>> $$0, Predicate<jh> $$1, jh $$2, int $$3, cgl.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<jh> d(Predicate<jq<cgo>> $$0, jh $$1, int $$2, cgl.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cgm::g).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<jq<cgo>, jh>> e(Predicate<jq<cgo>> $$0, jh $$1, int $$2, cgl.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.g().j($$1))).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Optional<jh> e(Predicate<jq<cgo>> $$0, Predicate<jh> $$1, jh $$2, int $$3, cgl.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cgm::g).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<jh> a(Predicate<jq<cgo>> $$0, BiPredicate<jq<cgo>, jh> $$1, jh $$2, int $$3) {
      return this.c($$0, $$2, $$3, cgl.b.a).filter($$1x -> $$1.test($$1x.h(), $$1x.g())).findFirst().map($$0x -> {
         $$0x.c();
         return $$0x.g();
      });
   }

   public Optional<jh> a(Predicate<jq<cgo>> $$0, Predicate<jh> $$1, cgl.b $$2, jh $$3, int $$4, azu $$5) {
      List<cgm> $$6 = ae.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.g())).findFirst().map(cgm::g);
   }

   public boolean b(jh $$0) {
      return this.d(kj.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ae.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(jh $$0, Predicate<jq<cgo>> $$1) {
      return this.d(kj.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<jq<cgo>> c(jh $$0) {
      return this.d(kj.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @bat
   public int d(jh $$0) {
      return this.d(kj.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(kj $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cgn> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(axn.b), cgl.b.b).findAny().isPresent()).orElse(false);
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

   public void a(kj $$0, dyb $$1) {
      ae.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cgn $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dyb $$0) {
      return $$0.a(cgp::b);
   }

   private void a(dyb $$0, kj $$1, BiConsumer<jh, jq<cgo>> $$2) {
      $$1.t().forEach($$2x -> {
         dvv $$3 = $$0.a(kj.b($$2x.u()), kj.b($$2x.v()), kj.b($$2x.w()));
         cgp.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dfp $$0, jh $$1, int $$2) {
      kj.a(new des($$1), Math.floorDiv($$2, 16), this.c.an(), this.c.ao())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cgn::b).orElse(false))
         .map($$0x -> ((kj)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.g, $$1x.h, dyr.c));
   }

   final class a extends ark {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cgl.this.g($$0) ? 0 : 7;
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
      a(cgm::e),
      b(cgm::f),
      c($$0 -> true);

      private final Predicate<? super cgm> d;

      private b(final Predicate<? super cgm> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cgm> a() {
         return this.d;
      }
   }
}
