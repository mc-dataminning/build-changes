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

public class cdd extends dtu<cdf> {
   public static final int a = 6;
   public static final int b = 1;
   private final cdd.a d;
   private final LongSet e = new LongOpenHashSet();

   public cdd(dtt $$0, Path $$1, DataFixer $$2, boolean $$3, jk $$4, daf $$5) {
      super(new dtv($$0, $$1, $$2, $$3, azf.q), cdf::a, cdf::new, $$4, $$5);
      this.d = new cdd.a();
   }

   public void a(in $$0, iw<cdg> $$1) {
      this.f(jp.c($$0)).a($$0, $$1);
   }

   public void a(in $$0) {
      this.d(jp.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<iw<cdg>> $$0, in $$1, int $$2, cdd.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(akg<cdg> $$0, in $$1) {
      return this.a($$1, (Predicate<iw<cdg>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cde> b(Predicate<iw<cdg>> $$0, in $$1, int $$2, cdd.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return czk.a(new czk($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         in $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cde> c(Predicate<iw<cdg>> $$0, in $$1, int $$2, cdd.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @azc
   public Stream<cde> a(Predicate<iw<cdg>> $$0, czk $$1, cdd.b $$2) {
      return IntStream.range(this.c.an(), this.c.ao())
         .boxed()
         .map($$1x -> this.d(jp.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cdf)$$2x.get()).a($$0, $$2));
   }

   public Stream<in> a(Predicate<iw<cdg>> $$0, Predicate<in> $$1, in $$2, int $$3, cdd.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cde::f).filter($$1);
   }

   public Stream<Pair<iw<cdg>, in>> b(Predicate<iw<cdg>> $$0, Predicate<in> $$1, in $$2, int $$3, cdd.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<iw<cdg>, in>> c(Predicate<iw<cdg>> $$0, Predicate<in> $$1, in $$2, int $$3, cdd.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((in)$$1x.getSecond()).j($$2)));
   }

   public Optional<in> d(Predicate<iw<cdg>> $$0, Predicate<in> $$1, in $$2, int $$3, cdd.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<in> d(Predicate<iw<cdg>> $$0, in $$1, int $$2, cdd.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cde::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<iw<cdg>, in>> e(Predicate<iw<cdg>> $$0, in $$1, int $$2, cdd.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<in> e(Predicate<iw<cdg>> $$0, Predicate<in> $$1, in $$2, int $$3, cdd.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cde::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<in> a(Predicate<iw<cdg>> $$0, BiPredicate<iw<cdg>, in> $$1, in $$2, int $$3) {
      return this.c($$0, $$2, $$3, cdd.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<in> a(Predicate<iw<cdg>> $$0, Predicate<in> $$1, cdd.b $$2, in $$3, int $$4, ayg $$5) {
      List<cde> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(cde::f);
   }

   public boolean b(in $$0) {
      return this.d(jp.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(in $$0, Predicate<iw<cdg>> $$1) {
      return this.d(jp.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<iw<cdg>> c(in $$0) {
      return this.d(jp.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @azc
   public int d(in $$0) {
      return this.d(jp.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(jp $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cdf> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(awb.b), cdd.b.b).findAny().isPresent()).orElse(false);
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

   public void a(jp $$0, dso $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cdf $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dso $$0) {
      return $$0.a(cdh::b);
   }

   private void a(dso $$0, jp $$1, BiConsumer<in, iw<cdg>> $$2) {
      $$1.t().forEach($$2x -> {
         dqh $$3 = $$0.a(jp.b($$2x.u()), jp.b($$2x.v()), jp.b($$2x.w()));
         cdh.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dag $$0, in $$1, int $$2) {
      jp.a(new czk($$1), Math.floorDiv($$2, 16), this.c.an(), this.c.ao())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cdf::a).orElse(false))
         .map($$0x -> ((jp)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dtc.c));
   }

   final class a extends aqd {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cdd.this.g($$0) ? 0 : 7;
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
      a(cde::d),
      b(cde::e),
      c($$0 -> true);

      private final Predicate<? super cde> d;

      private b(Predicate<? super cde> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cde> a() {
         return this.d;
      }
   }
}
