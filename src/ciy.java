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

public class ciy extends eex<cja, cja.a> {
   public static final int a = 6;
   public static final int b = 1;
   private final ciy.a d;
   private final LongSet e = new LongOpenHashSet();

   public ciy(eew $$0, Path $$1, DataFixer $$2, boolean $$3, ju $$4, eel $$5, dkb $$6) {
      super(new eez($$0, $$1, $$2, $$3, bbf.q), cja.a.a, cja::a, cja.a::a, cja::new, $$4, $$5, $$6);
      this.d = new ciy.a();
   }

   public void a(iw $$0, jg<cjb> $$1) {
      this.f(jz.c($$0)).a($$0, $$1);
   }

   public void a(iw $$0) {
      this.d(jz.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<jg<cjb>> $$0, iw $$1, int $$2, ciy.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(alj<cjb> $$0, iw $$1) {
      return this.a($$1, (Predicate<jg<cjb>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<ciz> b(Predicate<jg<cjb>> $$0, iw $$1, int $$2, ciy.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return dje.a(new dje($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         iw $$3x = $$2x.g();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<ciz> c(Predicate<jg<cjb>> $$0, iw $$1, int $$2, ciy.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.g().j($$1) <= (double)$$4);
   }

   @baz
   public Stream<ciz> a(Predicate<jg<cjb>> $$0, dje $$1, ciy.b $$2) {
      return IntStream.rangeClosed(this.c.aq(), this.c.ar())
         .boxed()
         .map($$1x -> this.d(jz.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cja)$$2x.get()).a($$0, $$2));
   }

   public Stream<iw> a(Predicate<jg<cjb>> $$0, Predicate<iw> $$1, iw $$2, int $$3, ciy.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(ciz::g).filter($$1);
   }

   public Stream<Pair<jg<cjb>, iw>> b(Predicate<jg<cjb>> $$0, Predicate<iw> $$1, iw $$2, int $$3, ciy.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.g())).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Stream<Pair<jg<cjb>, iw>> c(Predicate<jg<cjb>> $$0, Predicate<iw> $$1, iw $$2, int $$3, ciy.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((iw)$$1x.getSecond()).j($$2)));
   }

   public Optional<iw> d(Predicate<jg<cjb>> $$0, Predicate<iw> $$1, iw $$2, int $$3, ciy.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<iw> d(Predicate<jg<cjb>> $$0, iw $$1, int $$2, ciy.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(ciz::g).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<jg<cjb>, iw>> e(Predicate<jg<cjb>> $$0, iw $$1, int $$2, ciy.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.g().j($$1))).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Optional<iw> e(Predicate<jg<cjb>> $$0, Predicate<iw> $$1, iw $$2, int $$3, ciy.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(ciz::g).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<iw> a(Predicate<jg<cjb>> $$0, BiPredicate<jg<cjb>, iw> $$1, iw $$2, int $$3) {
      return this.c($$0, $$2, $$3, ciy.b.a).filter($$1x -> $$1.test($$1x.h(), $$1x.g())).findFirst().map($$0x -> {
         $$0x.c();
         return $$0x.g();
      });
   }

   public Optional<iw> a(Predicate<jg<cjb>> $$0, Predicate<iw> $$1, ciy.b $$2, iw $$3, int $$4, azz $$5) {
      List<ciz> $$6 = ag.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.g())).findFirst().map(ciz::g);
   }

   public boolean b(iw $$0) {
      return this.d(jz.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ag.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(iw $$0, Predicate<jg<cjb>> $$1) {
      return this.d(jz.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<jg<cjb>> c(iw $$0) {
      return this.d(jz.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @baz
   public int d(iw $$0) {
      return this.d(jz.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(jz $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cja> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(axq.b), ciy.b.b).findAny().isPresent()).orElse(false);
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

   public void a(jz $$0, edo $$1) {
      ag.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cja $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(edo $$0) {
      return $$0.a(cjc::b);
   }

   private void a(edo $$0, jz $$1, BiConsumer<iw, jg<cjb>> $$2) {
      $$1.t().forEach($$2x -> {
         ebg $$3 = $$0.a(jz.b($$2x.u()), jz.b($$2x.v()), jz.b($$2x.w()));
         cjc.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dkc $$0, iw $$1, int $$2) {
      jz.a(new dje($$1), Math.floorDiv($$2, 16), this.c.aq(), this.c.ar())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cja::b).orElse(false))
         .map($$0x -> ((jz)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.h, $$1x.i, eee.c));
   }

   final class a extends arp {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return ciy.this.g($$0) ? 0 : 7;
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
      a(ciz::e),
      b(ciz::f),
      c($$0 -> true);

      private final Predicate<? super ciz> d;

      private b(final Predicate<? super ciz> $$0) {
         this.d = $$0;
      }

      public Predicate<? super ciz> a() {
         return this.d;
      }
   }
}
