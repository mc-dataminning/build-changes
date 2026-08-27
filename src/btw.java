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

public class btw extends did<bty> {
   public static final int a = 6;
   public static final int b = 1;
   private final btw.a d;
   private final LongSet e = new LongOpenHashSet();

   public btw(Path $$0, DataFixer $$1, boolean $$2, ht $$3, cpm $$4) {
      super($$0, bty::a, bty::new, $$1, asq.q, $$2, $$3, $$4);
      this.d = new btw.a();
   }

   public void a(gv $$0, hf<btz> $$1) {
      this.f(hy.c($$0)).a($$0, $$1);
   }

   public void a(gv $$0) {
      this.d(hy.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<hf<btz>> $$0, gv $$1, int $$2, btw.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(aeo<btz> $$0, gv $$1) {
      return this.a($$1, (Predicate<hf<btz>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<btx> b(Predicate<hf<btz>> $$0, gv $$1, int $$2, btw.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return cor.a(new cor($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         gv $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<btx> c(Predicate<hf<btz>> $$0, gv $$1, int $$2, btw.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @aso
   public Stream<btx> a(Predicate<hf<btz>> $$0, cor $$1, btw.b $$2) {
      return IntStream.range(this.c.al(), this.c.am())
         .boxed()
         .map($$1x -> this.d(hy.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((bty)$$2x.get()).a($$0, $$2));
   }

   public Stream<gv> a(Predicate<hf<btz>> $$0, Predicate<gv> $$1, gv $$2, int $$3, btw.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(btx::f).filter($$1);
   }

   public Stream<Pair<hf<btz>, gv>> b(Predicate<hf<btz>> $$0, Predicate<gv> $$1, gv $$2, int $$3, btw.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<hf<btz>, gv>> c(Predicate<hf<btz>> $$0, Predicate<gv> $$1, gv $$2, int $$3, btw.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((gv)$$1x.getSecond()).j($$2)));
   }

   public Optional<gv> d(Predicate<hf<btz>> $$0, Predicate<gv> $$1, gv $$2, int $$3, btw.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<gv> d(Predicate<hf<btz>> $$0, gv $$1, int $$2, btw.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(btx::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<hf<btz>, gv>> e(Predicate<hf<btz>> $$0, gv $$1, int $$2, btw.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<gv> e(Predicate<hf<btz>> $$0, Predicate<gv> $$1, gv $$2, int $$3, btw.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(btx::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<gv> a(Predicate<hf<btz>> $$0, BiPredicate<hf<btz>, gv> $$1, gv $$2, int $$3) {
      return this.c($$0, $$2, $$3, btw.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<gv> a(Predicate<hf<btz>> $$0, Predicate<gv> $$1, btw.b $$2, gv $$3, int $$4, art $$5) {
      List<btx> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(btx::f);
   }

   public boolean b(gv $$0) {
      return this.d(hy.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(gv $$0, Predicate<hf<btz>> $$1) {
      return this.d(hy.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<hf<btz>> c(gv $$0) {
      return this.d(hy.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @aso
   public int d(gv $$0) {
      return this.d(hy.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(hy $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<bty> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(apt.b), btw.b.b).findAny().isPresent()).orElse(false);
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

   public void a(hy $$0, dhg $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            bty $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dhg $$0) {
      return $$0.a(bua::b);
   }

   private void a(dhg $$0, hy $$1, BiConsumer<gv, hf<btz>> $$2) {
      $$1.t().forEach($$2x -> {
         dey $$3 = $$0.a(hy.b($$2x.u()), hy.b($$2x.v()), hy.b($$2x.w()));
         bua.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(cpn $$0, gv $$1, int $$2) {
      hy.a(new cor($$1), Math.floorDiv($$2, 16), this.c.al(), this.c.am())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(bty::a).orElse(false))
         .map($$0x -> ((hy)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dgz.c));
   }

   final class a extends ake {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return btw.this.g($$0) ? 0 : 7;
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
      a(btx::d),
      b(btx::e),
      c($$0 -> true);

      private final Predicate<? super btx> d;

      private b(Predicate<? super btx> $$0) {
         this.d = $$0;
      }

      public Predicate<? super btx> a() {
         return this.d;
      }
   }
}
