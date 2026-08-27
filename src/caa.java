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

public class caa extends dpl<cac> {
   public static final int a = 6;
   public static final int b = 1;
   private final caa.a d;
   private final LongSet e = new LongOpenHashSet();

   public caa(Path $$0, DataFixer $$1, boolean $$2, iy $$3, cwg $$4) {
      super(new dpm($$0, $$1, $$2, "poi", axs.q), cac::a, cac::new, $$3, $$4);
      this.d = new caa.a();
   }

   public void a(ib $$0, il<cad> $$1) {
      this.f(jd.c($$0)).a($$0, $$1);
   }

   public void a(ib $$0) {
      this.d(jd.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<il<cad>> $$0, ib $$1, int $$2, caa.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(ajb<cad> $$0, ib $$1) {
      return this.a($$1, (Predicate<il<cad>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cab> b(Predicate<il<cad>> $$0, ib $$1, int $$2, caa.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return cvl.a(new cvl($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         ib $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cab> c(Predicate<il<cad>> $$0, ib $$1, int $$2, caa.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @axp
   public Stream<cab> a(Predicate<il<cad>> $$0, cvl $$1, caa.b $$2) {
      return IntStream.range(this.c.am(), this.c.an())
         .boxed()
         .map($$1x -> this.d(jd.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cac)$$2x.get()).a($$0, $$2));
   }

   public Stream<ib> a(Predicate<il<cad>> $$0, Predicate<ib> $$1, ib $$2, int $$3, caa.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cab::f).filter($$1);
   }

   public Stream<Pair<il<cad>, ib>> b(Predicate<il<cad>> $$0, Predicate<ib> $$1, ib $$2, int $$3, caa.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<il<cad>, ib>> c(Predicate<il<cad>> $$0, Predicate<ib> $$1, ib $$2, int $$3, caa.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((ib)$$1x.getSecond()).j($$2)));
   }

   public Optional<ib> d(Predicate<il<cad>> $$0, Predicate<ib> $$1, ib $$2, int $$3, caa.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<ib> d(Predicate<il<cad>> $$0, ib $$1, int $$2, caa.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cab::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<il<cad>, ib>> e(Predicate<il<cad>> $$0, ib $$1, int $$2, caa.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<ib> e(Predicate<il<cad>> $$0, Predicate<ib> $$1, ib $$2, int $$3, caa.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cab::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<ib> a(Predicate<il<cad>> $$0, BiPredicate<il<cad>, ib> $$1, ib $$2, int $$3) {
      return this.c($$0, $$2, $$3, caa.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<ib> a(Predicate<il<cad>> $$0, Predicate<ib> $$1, caa.b $$2, ib $$3, int $$4, awt $$5) {
      List<cab> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(cab::f);
   }

   public boolean b(ib $$0) {
      return this.d(jd.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(ib $$0, Predicate<il<cad>> $$1) {
      return this.d(jd.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<il<cad>> c(ib $$0) {
      return this.d(jd.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @axp
   public int d(ib $$0) {
      return this.d(jd.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(jd $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cac> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(auo.b), caa.b.b).findAny().isPresent()).orElse(false);
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

   public void a(jd $$0, dom $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cac $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dom $$0) {
      return $$0.a(cae::b);
   }

   private void a(dom $$0, jd $$1, BiConsumer<ib, il<cad>> $$2) {
      $$1.t().forEach($$2x -> {
         dme $$3 = $$0.a(jd.b($$2x.u()), jd.b($$2x.v()), jd.b($$2x.w()));
         cae.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(cwh $$0, ib $$1, int $$2) {
      jd.a(new cvl($$1), Math.floorDiv($$2, 16), this.c.am(), this.c.an())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cac::a).orElse(false))
         .map($$0x -> ((jd)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dof.c));
   }

   final class a extends aow {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return caa.this.g($$0) ? 0 : 7;
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
      a(cab::d),
      b(cab::e),
      c($$0 -> true);

      private final Predicate<? super cab> d;

      private b(Predicate<? super cab> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cab> a() {
         return this.d;
      }
   }
}
