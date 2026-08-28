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

public class cfz extends dyt<cgb, cgb.a> {
   public static final int a = 6;
   public static final int b = 1;
   private final cfz.a d;
   private final LongSet e = new LongOpenHashSet();

   public cfz(dys $$0, Path $$1, DataFixer $$2, boolean $$3, kd $$4, dyh $$5, dex $$6) {
      super(new dyv($$0, $$1, $$2, $$3, bas.q), cgb.a.a, cgb::a, cgb.a::a, cgb::new, $$4, $$5, $$6);
      this.d = new cfz.a();
   }

   public void a(jg $$0, jp<cgc> $$1) {
      this.f(ki.c($$0)).a($$0, $$1);
   }

   public void a(jg $$0) {
      this.d(ki.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<jp<cgc>> $$0, jg $$1, int $$2, cfz.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(alg<cgc> $$0, jg $$1) {
      return this.a($$1, (Predicate<jp<cgc>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cga> b(Predicate<jp<cgc>> $$0, jg $$1, int $$2, cfz.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return deb.a(new deb($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         jg $$3x = $$2x.g();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cga> c(Predicate<jp<cgc>> $$0, jg $$1, int $$2, cfz.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.g().j($$1) <= (double)$$4);
   }

   @bap
   public Stream<cga> a(Predicate<jp<cgc>> $$0, deb $$1, cfz.b $$2) {
      return IntStream.rangeClosed(this.c.ap(), this.c.aq())
         .boxed()
         .map($$1x -> this.d(ki.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cgb)$$2x.get()).a($$0, $$2));
   }

   public Stream<jg> a(Predicate<jp<cgc>> $$0, Predicate<jg> $$1, jg $$2, int $$3, cfz.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cga::g).filter($$1);
   }

   public Stream<Pair<jp<cgc>, jg>> b(Predicate<jp<cgc>> $$0, Predicate<jg> $$1, jg $$2, int $$3, cfz.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.g())).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Stream<Pair<jp<cgc>, jg>> c(Predicate<jp<cgc>> $$0, Predicate<jg> $$1, jg $$2, int $$3, cfz.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((jg)$$1x.getSecond()).j($$2)));
   }

   public Optional<jg> d(Predicate<jp<cgc>> $$0, Predicate<jg> $$1, jg $$2, int $$3, cfz.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<jg> d(Predicate<jp<cgc>> $$0, jg $$1, int $$2, cfz.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cga::g).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<jp<cgc>, jg>> e(Predicate<jp<cgc>> $$0, jg $$1, int $$2, cfz.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.g().j($$1))).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Optional<jg> e(Predicate<jp<cgc>> $$0, Predicate<jg> $$1, jg $$2, int $$3, cfz.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cga::g).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<jg> a(Predicate<jp<cgc>> $$0, BiPredicate<jp<cgc>, jg> $$1, jg $$2, int $$3) {
      return this.c($$0, $$2, $$3, cfz.b.a).filter($$1x -> $$1.test($$1x.h(), $$1x.g())).findFirst().map($$0x -> {
         $$0x.c();
         return $$0x.g();
      });
   }

   public Optional<jg> a(Predicate<jp<cgc>> $$0, Predicate<jg> $$1, cfz.b $$2, jg $$3, int $$4, azr $$5) {
      List<cga> $$6 = ad.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.g())).findFirst().map(cga::g);
   }

   public boolean b(jg $$0) {
      return this.d(ki.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ad.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(jg $$0, Predicate<jp<cgc>> $$1) {
      return this.d(ki.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<jp<cgc>> c(jg $$0) {
      return this.d(ki.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @bap
   public int d(jg $$0) {
      return this.d(ki.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(ki $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cgb> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(axk.b), cfz.b.b).findAny().isPresent()).orElse(false);
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

   public void a(ki $$0, dxk $$1) {
      ad.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cgb $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dxk $$0) {
      return $$0.a(cgd::b);
   }

   private void a(dxk $$0, ki $$1, BiConsumer<jg, jp<cgc>> $$2) {
      $$1.t().forEach($$2x -> {
         dvd $$3 = $$0.a(ki.b($$2x.u()), ki.b($$2x.v()), ki.b($$2x.w()));
         cgd.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dey $$0, jg $$1, int $$2) {
      ki.a(new deb($$1), Math.floorDiv($$2, 16), this.c.ap(), this.c.aq())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cgb::b).orElse(false))
         .map($$0x -> ((ki)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dya.c));
   }

   final class a extends ari {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cfz.this.g($$0) ? 0 : 7;
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
      a(cga::e),
      b(cga::f),
      c($$0 -> true);

      private final Predicate<? super cga> d;

      private b(final Predicate<? super cga> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cga> a() {
         return this.d;
      }
   }
}
