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

public class cfi extends dxq<cfk, cfk.a> {
   public static final int a = 6;
   public static final int b = 1;
   private final cfi.a d;
   private final LongSet e = new LongOpenHashSet();

   public cfi(dxp $$0, Path $$1, DataFixer $$2, boolean $$3, kb $$4, dxe $$5, ddu $$6) {
      super(new dxs($$0, $$1, $$2, $$3, bal.q), cfk.a.a, cfk::a, cfk.a::a, cfk::new, $$4, $$5, $$6);
      this.d = new cfi.a();
   }

   public void a(je $$0, jn<cfl> $$1) {
      this.f(kg.c($$0)).a($$0, $$1);
   }

   public void a(je $$0) {
      this.d(kg.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<jn<cfl>> $$0, je $$1, int $$2, cfi.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(ala<cfl> $$0, je $$1) {
      return this.a($$1, (Predicate<jn<cfl>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cfj> b(Predicate<jn<cfl>> $$0, je $$1, int $$2, cfi.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return dcy.a(new dcy($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         je $$3x = $$2x.g();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cfj> c(Predicate<jn<cfl>> $$0, je $$1, int $$2, cfi.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.g().j($$1) <= (double)$$4);
   }

   @bai
   public Stream<cfj> a(Predicate<jn<cfl>> $$0, dcy $$1, cfi.b $$2) {
      return IntStream.range(this.c.ap(), this.c.aq())
         .boxed()
         .map($$1x -> this.d(kg.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cfk)$$2x.get()).a($$0, $$2));
   }

   public Stream<je> a(Predicate<jn<cfl>> $$0, Predicate<je> $$1, je $$2, int $$3, cfi.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cfj::g).filter($$1);
   }

   public Stream<Pair<jn<cfl>, je>> b(Predicate<jn<cfl>> $$0, Predicate<je> $$1, je $$2, int $$3, cfi.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.g())).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Stream<Pair<jn<cfl>, je>> c(Predicate<jn<cfl>> $$0, Predicate<je> $$1, je $$2, int $$3, cfi.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((je)$$1x.getSecond()).j($$2)));
   }

   public Optional<je> d(Predicate<jn<cfl>> $$0, Predicate<je> $$1, je $$2, int $$3, cfi.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<je> d(Predicate<jn<cfl>> $$0, je $$1, int $$2, cfi.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cfj::g).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<jn<cfl>, je>> e(Predicate<jn<cfl>> $$0, je $$1, int $$2, cfi.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.g().j($$1))).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Optional<je> e(Predicate<jn<cfl>> $$0, Predicate<je> $$1, je $$2, int $$3, cfi.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cfj::g).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<je> a(Predicate<jn<cfl>> $$0, BiPredicate<jn<cfl>, je> $$1, je $$2, int $$3) {
      return this.c($$0, $$2, $$3, cfi.b.a).filter($$1x -> $$1.test($$1x.h(), $$1x.g())).findFirst().map($$0x -> {
         $$0x.c();
         return $$0x.g();
      });
   }

   public Optional<je> a(Predicate<jn<cfl>> $$0, Predicate<je> $$1, cfi.b $$2, je $$3, int $$4, azk $$5) {
      List<cfj> $$6 = ad.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.g())).findFirst().map(cfj::g);
   }

   public boolean b(je $$0) {
      return this.d(kg.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ad.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(je $$0, Predicate<jn<cfl>> $$1) {
      return this.d(kg.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<jn<cfl>> c(je $$0) {
      return this.d(kg.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @bai
   public int d(je $$0) {
      return this.d(kg.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(kg $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cfk> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(axd.b), cfi.b.b).findAny().isPresent()).orElse(false);
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

   public void a(kg $$0, dwh $$1) {
      ad.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cfk $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dwh $$0) {
      return $$0.a(cfm::b);
   }

   private void a(dwh $$0, kg $$1, BiConsumer<je, jn<cfl>> $$2) {
      $$1.t().forEach($$2x -> {
         dua $$3 = $$0.a(kg.b($$2x.u()), kg.b($$2x.v()), kg.b($$2x.w()));
         cfm.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(ddv $$0, je $$1, int $$2) {
      kg.a(new dcy($$1), Math.floorDiv($$2, 16), this.c.ap(), this.c.aq())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cfk::b).orElse(false))
         .map($$0x -> ((kg)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dwx.c));
   }

   final class a extends arc {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cfi.this.g($$0) ? 0 : 7;
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
      a(cfj::e),
      b(cfj::f),
      c($$0 -> true);

      private final Predicate<? super cfj> d;

      private b(final Predicate<? super cfj> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cfj> a() {
         return this.d;
      }
   }
}
