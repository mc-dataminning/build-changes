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

public class ces extends dwt<ceu> {
   public static final int a = 6;
   public static final int b = 1;
   private final ces.a d;
   private final LongSet e = new LongOpenHashSet();

   public ces(dws $$0, Path $$1, DataFixer $$2, boolean $$3, ka $$4, dwg $$5, dcy $$6) {
      super(new dwu($$0, $$1, $$2, $$3, azw.q), ceu::a, ceu::new, $$4, $$5, $$6);
      this.d = new ces.a();
   }

   public void a(jd $$0, jm<cev> $$1) {
      this.f(kf.c($$0)).a($$0, $$1);
   }

   public void a(jd $$0) {
      this.d(kf.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<jm<cev>> $$0, jd $$1, int $$2, ces.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(akq<cev> $$0, jd $$1) {
      return this.a($$1, (Predicate<jm<cev>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cet> b(Predicate<jm<cev>> $$0, jd $$1, int $$2, ces.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return dcd.a(new dcd($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         jd $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cet> c(Predicate<jm<cev>> $$0, jd $$1, int $$2, ces.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @azt
   public Stream<cet> a(Predicate<jm<cev>> $$0, dcd $$1, ces.b $$2) {
      return IntStream.range(this.c.ao(), this.c.ap())
         .boxed()
         .map($$1x -> this.d(kf.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((ceu)$$2x.get()).a($$0, $$2));
   }

   public Stream<jd> a(Predicate<jm<cev>> $$0, Predicate<jd> $$1, jd $$2, int $$3, ces.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cet::f).filter($$1);
   }

   public Stream<Pair<jm<cev>, jd>> b(Predicate<jm<cev>> $$0, Predicate<jd> $$1, jd $$2, int $$3, ces.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<jm<cev>, jd>> c(Predicate<jm<cev>> $$0, Predicate<jd> $$1, jd $$2, int $$3, ces.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((jd)$$1x.getSecond()).j($$2)));
   }

   public Optional<jd> d(Predicate<jm<cev>> $$0, Predicate<jd> $$1, jd $$2, int $$3, ces.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<jd> d(Predicate<jm<cev>> $$0, jd $$1, int $$2, ces.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cet::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<jm<cev>, jd>> e(Predicate<jm<cev>> $$0, jd $$1, int $$2, ces.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<jd> e(Predicate<jm<cev>> $$0, Predicate<jd> $$1, jd $$2, int $$3, ces.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cet::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<jd> a(Predicate<jm<cev>> $$0, BiPredicate<jm<cev>, jd> $$1, jd $$2, int $$3) {
      return this.c($$0, $$2, $$3, ces.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<jd> a(Predicate<jm<cev>> $$0, Predicate<jd> $$1, ces.b $$2, jd $$3, int $$4, ayw $$5) {
      List<cet> $$6 = ad.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(cet::f);
   }

   public boolean b(jd $$0) {
      return this.d(kf.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ad.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(jd $$0, Predicate<jm<cev>> $$1) {
      return this.d(kf.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<jm<cev>> c(jd $$0) {
      return this.d(kf.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @azt
   public int d(jd $$0) {
      return this.d(kf.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(kf $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<ceu> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(awp.b), ces.b.b).findAny().isPresent()).orElse(false);
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

   public void a(kf $$0, dvj $$1) {
      ad.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            ceu $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dvj $$0) {
      return $$0.a(cew::b);
   }

   private void a(dvj $$0, kf $$1, BiConsumer<jd, jm<cev>> $$2) {
      $$1.t().forEach($$2x -> {
         dtc $$3 = $$0.a(kf.b($$2x.u()), kf.b($$2x.v()), kf.b($$2x.w()));
         cew.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dcz $$0, jd $$1, int $$2) {
      kf.a(new dcd($$1), Math.floorDiv($$2, 16), this.c.ao(), this.c.ap())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(ceu::a).orElse(false))
         .map($$0x -> ((kf)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dvz.c));
   }

   final class a extends aqq {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return ces.this.g($$0) ? 0 : 7;
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
      a(cet::d),
      b(cet::e),
      c($$0 -> true);

      private final Predicate<? super cet> d;

      private b(final Predicate<? super cet> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cet> a() {
         return this.d;
      }
   }
}
