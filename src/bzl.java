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

public class bzl extends doq<bzn> {
   public static final int a = 6;
   public static final int b = 1;
   private final bzl.a d;
   private final LongSet e = new LongOpenHashSet();

   public bzl(Path $$0, DataFixer $$1, boolean $$2, iw $$3, cvt $$4) {
      super(new dor($$0, $$1, $$2, "poi", axo.q), bzn::a, bzn::new, $$3, $$4);
      this.d = new bzl.a();
   }

   public void a(hz $$0, ij<bzo> $$1) {
      this.f(jb.c($$0)).a($$0, $$1);
   }

   public void a(hz $$0) {
      this.d(jb.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<ij<bzo>> $$0, hz $$1, int $$2, bzl.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(aix<bzo> $$0, hz $$1) {
      return this.a($$1, (Predicate<ij<bzo>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<bzm> b(Predicate<ij<bzo>> $$0, hz $$1, int $$2, bzl.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return cuy.a(new cuy($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         hz $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<bzm> c(Predicate<ij<bzo>> $$0, hz $$1, int $$2, bzl.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @axl
   public Stream<bzm> a(Predicate<ij<bzo>> $$0, cuy $$1, bzl.b $$2) {
      return IntStream.range(this.c.am(), this.c.an())
         .boxed()
         .map($$1x -> this.d(jb.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((bzn)$$2x.get()).a($$0, $$2));
   }

   public Stream<hz> a(Predicate<ij<bzo>> $$0, Predicate<hz> $$1, hz $$2, int $$3, bzl.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(bzm::f).filter($$1);
   }

   public Stream<Pair<ij<bzo>, hz>> b(Predicate<ij<bzo>> $$0, Predicate<hz> $$1, hz $$2, int $$3, bzl.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<ij<bzo>, hz>> c(Predicate<ij<bzo>> $$0, Predicate<hz> $$1, hz $$2, int $$3, bzl.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((hz)$$1x.getSecond()).j($$2)));
   }

   public Optional<hz> d(Predicate<ij<bzo>> $$0, Predicate<hz> $$1, hz $$2, int $$3, bzl.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<hz> d(Predicate<ij<bzo>> $$0, hz $$1, int $$2, bzl.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(bzm::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<ij<bzo>, hz>> e(Predicate<ij<bzo>> $$0, hz $$1, int $$2, bzl.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<hz> e(Predicate<ij<bzo>> $$0, Predicate<hz> $$1, hz $$2, int $$3, bzl.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(bzm::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<hz> a(Predicate<ij<bzo>> $$0, BiPredicate<ij<bzo>, hz> $$1, hz $$2, int $$3) {
      return this.c($$0, $$2, $$3, bzl.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<hz> a(Predicate<ij<bzo>> $$0, Predicate<hz> $$1, bzl.b $$2, hz $$3, int $$4, awp $$5) {
      List<bzm> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(bzm::f);
   }

   public boolean b(hz $$0) {
      return this.d(jb.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(hz $$0, Predicate<ij<bzo>> $$1) {
      return this.d(jb.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<ij<bzo>> c(hz $$0) {
      return this.d(jb.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @axl
   public int d(hz $$0) {
      return this.d(jb.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(jb $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<bzn> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(auk.b), bzl.b.b).findAny().isPresent()).orElse(false);
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

   public void a(jb $$0, dnr $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            bzn $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dnr $$0) {
      return $$0.a(bzp::b);
   }

   private void a(dnr $$0, jb $$1, BiConsumer<hz, ij<bzo>> $$2) {
      $$1.t().forEach($$2x -> {
         dlj $$3 = $$0.a(jb.b($$2x.u()), jb.b($$2x.v()), jb.b($$2x.w()));
         bzp.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(cvu $$0, hz $$1, int $$2) {
      jb.a(new cuy($$1), Math.floorDiv($$2, 16), this.c.am(), this.c.an())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(bzn::a).orElse(false))
         .map($$0x -> ((jb)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dnk.c));
   }

   final class a extends aos {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return bzl.this.g($$0) ? 0 : 7;
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
      a(bzm::d),
      b(bzm::e),
      c($$0 -> true);

      private final Predicate<? super bzm> d;

      private b(Predicate<? super bzm> $$0) {
         this.d = $$0;
      }

      public Predicate<? super bzm> a() {
         return this.d;
      }
   }
}
