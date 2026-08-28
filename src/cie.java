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

public class cie extends edq<cig, cig.a> {
   public static final int a = 6;
   public static final int b = 1;
   private final cie.a d;
   private final LongSet e = new LongOpenHashSet();

   public cie(edp $$0, Path $$1, DataFixer $$2, boolean $$3, js $$4, ede $$5, dix $$6) {
      super(new eds($$0, $$1, $$2, $$3, bbb.q), cig.a.a, cig::a, cig.a::a, cig::new, $$4, $$5, $$6);
      this.d = new cie.a();
   }

   public void a(iu $$0, je<cih> $$1) {
      this.f(jx.c($$0)).a($$0, $$1);
   }

   public void a(iu $$0) {
      this.d(jx.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<je<cih>> $$0, iu $$1, int $$2, cie.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(alf<cih> $$0, iu $$1) {
      return this.a($$1, (Predicate<je<cih>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cif> b(Predicate<je<cih>> $$0, iu $$1, int $$2, cie.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return dic.a(new dic($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         iu $$3x = $$2x.g();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cif> c(Predicate<je<cih>> $$0, iu $$1, int $$2, cie.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.g().j($$1) <= (double)$$4);
   }

   @bav
   public Stream<cif> a(Predicate<je<cih>> $$0, dic $$1, cie.b $$2) {
      return IntStream.rangeClosed(this.c.aq(), this.c.ar())
         .boxed()
         .map($$1x -> this.d(jx.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cig)$$2x.get()).a($$0, $$2));
   }

   public Stream<iu> a(Predicate<je<cih>> $$0, Predicate<iu> $$1, iu $$2, int $$3, cie.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cif::g).filter($$1);
   }

   public Stream<Pair<je<cih>, iu>> b(Predicate<je<cih>> $$0, Predicate<iu> $$1, iu $$2, int $$3, cie.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.g())).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Stream<Pair<je<cih>, iu>> c(Predicate<je<cih>> $$0, Predicate<iu> $$1, iu $$2, int $$3, cie.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((iu)$$1x.getSecond()).j($$2)));
   }

   public Optional<iu> d(Predicate<je<cih>> $$0, Predicate<iu> $$1, iu $$2, int $$3, cie.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<iu> d(Predicate<je<cih>> $$0, iu $$1, int $$2, cie.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cif::g).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<je<cih>, iu>> e(Predicate<je<cih>> $$0, iu $$1, int $$2, cie.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.g().j($$1))).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Optional<iu> e(Predicate<je<cih>> $$0, Predicate<iu> $$1, iu $$2, int $$3, cie.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cif::g).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<iu> a(Predicate<je<cih>> $$0, BiPredicate<je<cih>, iu> $$1, iu $$2, int $$3) {
      return this.c($$0, $$2, $$3, cie.b.a).filter($$1x -> $$1.test($$1x.h(), $$1x.g())).findFirst().map($$0x -> {
         $$0x.c();
         return $$0x.g();
      });
   }

   public Optional<iu> a(Predicate<je<cih>> $$0, Predicate<iu> $$1, cie.b $$2, iu $$3, int $$4, azv $$5) {
      List<cif> $$6 = af.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.g())).findFirst().map(cif::g);
   }

   public boolean b(iu $$0) {
      return this.d(jx.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> af.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(iu $$0, Predicate<je<cih>> $$1) {
      return this.d(jx.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<je<cih>> c(iu $$0) {
      return this.d(jx.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @bav
   public int d(iu $$0) {
      return this.d(jx.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(jx $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cig> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(axm.b), cie.b.b).findAny().isPresent()).orElse(false);
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

   public void a(jx $$0, ech $$1) {
      af.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cig $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(ech $$0) {
      return $$0.a(cii::b);
   }

   private void a(ech $$0, jx $$1, BiConsumer<iu, je<cih>> $$2) {
      $$1.t().forEach($$2x -> {
         dzz $$3 = $$0.a(jx.b($$2x.u()), jx.b($$2x.v()), jx.b($$2x.w()));
         cii.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(diy $$0, iu $$1, int $$2) {
      jx.a(new dic($$1), Math.floorDiv($$2, 16), this.c.aq(), this.c.ar())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cig::b).orElse(false))
         .map($$0x -> ((jx)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.h, $$1x.i, ecx.c));
   }

   final class a extends arl {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cie.this.g($$0) ? 0 : 7;
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
      a(cif::e),
      b(cif::f),
      c($$0 -> true);

      private final Predicate<? super cif> d;

      private b(final Predicate<? super cif> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cif> a() {
         return this.d;
      }
   }
}
