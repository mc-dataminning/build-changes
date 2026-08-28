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

public class cfq extends dyi<cfs, cfs.a> {
   public static final int a = 6;
   public static final int b = 1;
   private final cfq.a d;
   private final LongSet e = new LongOpenHashSet();

   public cfq(dyh $$0, Path $$1, DataFixer $$2, boolean $$3, kc $$4, dxw $$5, del $$6) {
      super(new dyk($$0, $$1, $$2, $$3, bao.q), cfs.a.a, cfs::a, cfs.a::a, cfs::new, $$4, $$5, $$6);
      this.d = new cfq.a();
   }

   public void a(jf $$0, jo<cft> $$1) {
      this.f(kh.c($$0)).a($$0, $$1);
   }

   public void a(jf $$0) {
      this.d(kh.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<jo<cft>> $$0, jf $$1, int $$2, cfq.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(ald<cft> $$0, jf $$1) {
      return this.a($$1, (Predicate<jo<cft>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cfr> b(Predicate<jo<cft>> $$0, jf $$1, int $$2, cfq.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return ddp.a(new ddp($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         jf $$3x = $$2x.g();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cfr> c(Predicate<jo<cft>> $$0, jf $$1, int $$2, cfq.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.g().j($$1) <= (double)$$4);
   }

   @bal
   public Stream<cfr> a(Predicate<jo<cft>> $$0, ddp $$1, cfq.b $$2) {
      return IntStream.rangeClosed(this.c.ap(), this.c.aq())
         .boxed()
         .map($$1x -> this.d(kh.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cfs)$$2x.get()).a($$0, $$2));
   }

   public Stream<jf> a(Predicate<jo<cft>> $$0, Predicate<jf> $$1, jf $$2, int $$3, cfq.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cfr::g).filter($$1);
   }

   public Stream<Pair<jo<cft>, jf>> b(Predicate<jo<cft>> $$0, Predicate<jf> $$1, jf $$2, int $$3, cfq.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.g())).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Stream<Pair<jo<cft>, jf>> c(Predicate<jo<cft>> $$0, Predicate<jf> $$1, jf $$2, int $$3, cfq.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((jf)$$1x.getSecond()).j($$2)));
   }

   public Optional<jf> d(Predicate<jo<cft>> $$0, Predicate<jf> $$1, jf $$2, int $$3, cfq.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<jf> d(Predicate<jo<cft>> $$0, jf $$1, int $$2, cfq.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cfr::g).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<jo<cft>, jf>> e(Predicate<jo<cft>> $$0, jf $$1, int $$2, cfq.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.g().j($$1))).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Optional<jf> e(Predicate<jo<cft>> $$0, Predicate<jf> $$1, jf $$2, int $$3, cfq.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cfr::g).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<jf> a(Predicate<jo<cft>> $$0, BiPredicate<jo<cft>, jf> $$1, jf $$2, int $$3) {
      return this.c($$0, $$2, $$3, cfq.b.a).filter($$1x -> $$1.test($$1x.h(), $$1x.g())).findFirst().map($$0x -> {
         $$0x.c();
         return $$0x.g();
      });
   }

   public Optional<jf> a(Predicate<jo<cft>> $$0, Predicate<jf> $$1, cfq.b $$2, jf $$3, int $$4, azn $$5) {
      List<cfr> $$6 = ad.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.g())).findFirst().map(cfr::g);
   }

   public boolean b(jf $$0) {
      return this.d(kh.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ad.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(jf $$0, Predicate<jo<cft>> $$1) {
      return this.d(kh.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<jo<cft>> c(jf $$0) {
      return this.d(kh.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @bal
   public int d(jf $$0) {
      return this.d(kh.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(kh $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cfs> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(axg.b), cfq.b.b).findAny().isPresent()).orElse(false);
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

   public void a(kh $$0, dwz $$1) {
      ad.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cfs $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dwz $$0) {
      return $$0.a(cfu::b);
   }

   private void a(dwz $$0, kh $$1, BiConsumer<jf, jo<cft>> $$2) {
      $$1.t().forEach($$2x -> {
         dus $$3 = $$0.a(kh.b($$2x.u()), kh.b($$2x.v()), kh.b($$2x.w()));
         cfu.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dem $$0, jf $$1, int $$2) {
      kh.a(new ddp($$1), Math.floorDiv($$2, 16), this.c.ap(), this.c.aq())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cfs::b).orElse(false))
         .map($$0x -> ((kh)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dxp.c));
   }

   final class a extends arf {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cfq.this.g($$0) ? 0 : 7;
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
      a(cfr::e),
      b(cfr::f),
      c($$0 -> true);

      private final Predicate<? super cfr> d;

      private b(final Predicate<? super cfr> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cfr> a() {
         return this.d;
      }
   }
}
