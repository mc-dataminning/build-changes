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

public class cgj extends eak<cgl, cgl.a> {
   public static final int a = 6;
   public static final int b = 1;
   private final cgj.a d;
   private final LongSet e = new LongOpenHashSet();

   public cgj(eaj $$0, Path $$1, DataFixer $$2, boolean $$3, kf $$4, dzy $$5, dgi $$6) {
      super(new eam($$0, $$1, $$2, $$3, bam.q), cgl.a.a, cgl::a, cgl.a::a, cgl::new, $$4, $$5, $$6);
      this.d = new cgj.a();
   }

   public void a(ji $$0, jr<cgm> $$1) {
      this.f(kk.c($$0)).a($$0, $$1);
   }

   public void a(ji $$0) {
      this.d(kk.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<jr<cgm>> $$0, ji $$1, int $$2, cgj.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(akt<cgm> $$0, ji $$1) {
      return this.a($$1, (Predicate<jr<cgm>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cgk> b(Predicate<jr<cgm>> $$0, ji $$1, int $$2, cgj.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return dfm.a(new dfm($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         ji $$3x = $$2x.g();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cgk> c(Predicate<jr<cgm>> $$0, ji $$1, int $$2, cgj.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.g().j($$1) <= (double)$$4);
   }

   @baf
   public Stream<cgk> a(Predicate<jr<cgm>> $$0, dfm $$1, cgj.b $$2) {
      return IntStream.rangeClosed(this.c.ap(), this.c.aq())
         .boxed()
         .map($$1x -> this.d(kk.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cgl)$$2x.get()).a($$0, $$2));
   }

   public Stream<ji> a(Predicate<jr<cgm>> $$0, Predicate<ji> $$1, ji $$2, int $$3, cgj.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cgk::g).filter($$1);
   }

   public Stream<Pair<jr<cgm>, ji>> b(Predicate<jr<cgm>> $$0, Predicate<ji> $$1, ji $$2, int $$3, cgj.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.g())).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Stream<Pair<jr<cgm>, ji>> c(Predicate<jr<cgm>> $$0, Predicate<ji> $$1, ji $$2, int $$3, cgj.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((ji)$$1x.getSecond()).j($$2)));
   }

   public Optional<ji> d(Predicate<jr<cgm>> $$0, Predicate<ji> $$1, ji $$2, int $$3, cgj.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<ji> d(Predicate<jr<cgm>> $$0, ji $$1, int $$2, cgj.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cgk::g).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<jr<cgm>, ji>> e(Predicate<jr<cgm>> $$0, ji $$1, int $$2, cgj.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.g().j($$1))).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Optional<ji> e(Predicate<jr<cgm>> $$0, Predicate<ji> $$1, ji $$2, int $$3, cgj.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cgk::g).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<ji> a(Predicate<jr<cgm>> $$0, BiPredicate<jr<cgm>, ji> $$1, ji $$2, int $$3) {
      return this.c($$0, $$2, $$3, cgj.b.a).filter($$1x -> $$1.test($$1x.h(), $$1x.g())).findFirst().map($$0x -> {
         $$0x.c();
         return $$0x.g();
      });
   }

   public Optional<ji> a(Predicate<jr<cgm>> $$0, Predicate<ji> $$1, cgj.b $$2, ji $$3, int $$4, azg $$5) {
      List<cgk> $$6 = af.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.g())).findFirst().map(cgk::g);
   }

   public boolean b(ji $$0) {
      return this.d(kk.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> af.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(ji $$0, Predicate<jr<cgm>> $$1) {
      return this.d(kk.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<jr<cgm>> c(ji $$0) {
      return this.d(kk.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @baf
   public int d(ji $$0) {
      return this.d(kk.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(kk $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cgl> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(awz.b), cgj.b.b).findAny().isPresent()).orElse(false);
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

   public void a(kk $$0, dzb $$1) {
      af.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cgl $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dzb $$0) {
      return $$0.a(cgn::b);
   }

   private void a(dzb $$0, kk $$1, BiConsumer<ji, jr<cgm>> $$2) {
      $$1.t().forEach($$2x -> {
         dwv $$3 = $$0.a(kk.b($$2x.u()), kk.b($$2x.v()), kk.b($$2x.w()));
         cgn.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dgj $$0, ji $$1, int $$2) {
      kk.a(new dfm($$1), Math.floorDiv($$2, 16), this.c.ap(), this.c.aq())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cgl::b).orElse(false))
         .map($$0x -> ((kk)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.h, $$1x.i, dzr.c));
   }

   final class a extends aqx {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cgj.this.g($$0) ? 0 : 7;
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
      a(cgk::e),
      b(cgk::f),
      c($$0 -> true);

      private final Predicate<? super cgk> d;

      private b(final Predicate<? super cgk> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cgk> a() {
         return this.d;
      }
   }
}
