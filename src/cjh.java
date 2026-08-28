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

public class cjh extends efh<cjj, cjj.a> {
   public static final int a = 6;
   public static final int b = 1;
   private final cjh.a d;
   private final LongSet e = new LongOpenHashSet();

   public cjh(efg $$0, Path $$1, DataFixer $$2, boolean $$3, ju $$4, eev $$5, dkl $$6) {
      super(new efj($$0, $$1, $$2, $$3, bbo.q), cjj.a.a, cjj::a, cjj.a::a, cjj::new, $$4, $$5, $$6);
      this.d = new cjh.a();
   }

   public void a(iw $$0, jg<cjk> $$1) {
      this.f(jz.c($$0)).a($$0, $$1);
   }

   public void a(iw $$0) {
      this.d(jz.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<jg<cjk>> $$0, iw $$1, int $$2, cjh.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(alq<cjk> $$0, iw $$1) {
      return this.a($$1, (Predicate<jg<cjk>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cji> b(Predicate<jg<cjk>> $$0, iw $$1, int $$2, cjh.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return djo.a(new djo($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         iw $$3x = $$2x.g();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cji> c(Predicate<jg<cjk>> $$0, iw $$1, int $$2, cjh.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.g().j($$1) <= (double)$$4);
   }

   @bbi
   public Stream<cji> a(Predicate<jg<cjk>> $$0, djo $$1, cjh.b $$2) {
      return IntStream.rangeClosed(this.c.aq(), this.c.ar())
         .boxed()
         .map($$1x -> this.d(jz.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cjj)$$2x.get()).a($$0, $$2));
   }

   public Stream<iw> a(Predicate<jg<cjk>> $$0, Predicate<iw> $$1, iw $$2, int $$3, cjh.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cji::g).filter($$1);
   }

   public Stream<Pair<jg<cjk>, iw>> b(Predicate<jg<cjk>> $$0, Predicate<iw> $$1, iw $$2, int $$3, cjh.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.g())).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Stream<Pair<jg<cjk>, iw>> c(Predicate<jg<cjk>> $$0, Predicate<iw> $$1, iw $$2, int $$3, cjh.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((iw)$$1x.getSecond()).j($$2)));
   }

   public Optional<iw> d(Predicate<jg<cjk>> $$0, Predicate<iw> $$1, iw $$2, int $$3, cjh.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<iw> d(Predicate<jg<cjk>> $$0, iw $$1, int $$2, cjh.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cji::g).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<jg<cjk>, iw>> e(Predicate<jg<cjk>> $$0, iw $$1, int $$2, cjh.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.g().j($$1))).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Optional<iw> e(Predicate<jg<cjk>> $$0, Predicate<iw> $$1, iw $$2, int $$3, cjh.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cji::g).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<iw> a(Predicate<jg<cjk>> $$0, BiPredicate<jg<cjk>, iw> $$1, iw $$2, int $$3) {
      return this.c($$0, $$2, $$3, cjh.b.a).filter($$1x -> $$1.test($$1x.h(), $$1x.g())).findFirst().map($$0x -> {
         $$0x.c();
         return $$0x.g();
      });
   }

   public Optional<iw> a(Predicate<jg<cjk>> $$0, Predicate<iw> $$1, cjh.b $$2, iw $$3, int $$4, bai $$5) {
      List<cji> $$6 = ag.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.g())).findFirst().map(cji::g);
   }

   public boolean b(iw $$0) {
      return this.d(jz.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ag.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(iw $$0, Predicate<jg<cjk>> $$1) {
      return this.d(jz.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<jg<cjk>> c(iw $$0) {
      return this.d(jz.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @bbi
   public int d(iw $$0) {
      return this.d(jz.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(jz $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cjj> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(axx.b), cjh.b.b).findAny().isPresent()).orElse(false);
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

   public void a(jz $$0, edy $$1) {
      ag.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cjj $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(edy $$0) {
      return $$0.a(cjl::b);
   }

   private void a(edy $$0, jz $$1, BiConsumer<iw, jg<cjk>> $$2) {
      $$1.t().forEach($$2x -> {
         ebq $$3 = $$0.a(jz.b($$2x.u()), jz.b($$2x.v()), jz.b($$2x.w()));
         cjl.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dkm $$0, iw $$1, int $$2) {
      jz.a(new djo($$1), Math.floorDiv($$2, 16), this.c.aq(), this.c.ar())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cjj::b).orElse(false))
         .map($$0x -> ((jz)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.h, $$1x.i, eeo.c));
   }

   final class a extends arw {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cjh.this.g($$0) ? 0 : 7;
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
      a(cji::e),
      b(cji::f),
      c($$0 -> true);

      private final Predicate<? super cji> d;

      private b(final Predicate<? super cji> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cji> a() {
         return this.d;
      }
   }
}
