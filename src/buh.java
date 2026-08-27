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

public class buh extends diq<buj> {
   public static final int a = 6;
   public static final int b = 1;
   private final buh.a d;
   private final LongSet e = new LongOpenHashSet();

   public buh(Path $$0, DataFixer $$1, boolean $$2, hu $$3, cpz $$4) {
      super($$0, buj::a, buj::new, $$1, atc.q, $$2, $$3, $$4);
      this.d = new buh.a();
   }

   public void a(gw $$0, hg<buk> $$1) {
      this.f(hz.c($$0)).a($$0, $$1);
   }

   public void a(gw $$0) {
      this.d(hz.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<hg<buk>> $$0, gw $$1, int $$2, buh.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(aex<buk> $$0, gw $$1) {
      return this.a($$1, (Predicate<hg<buk>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<bui> b(Predicate<hg<buk>> $$0, gw $$1, int $$2, buh.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return cpe.a(new cpe($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         gw $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<bui> c(Predicate<hg<buk>> $$0, gw $$1, int $$2, buh.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @ata
   public Stream<bui> a(Predicate<hg<buk>> $$0, cpe $$1, buh.b $$2) {
      return IntStream.range(this.c.al(), this.c.am())
         .boxed()
         .map($$1x -> this.d(hz.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((buj)$$2x.get()).a($$0, $$2));
   }

   public Stream<gw> a(Predicate<hg<buk>> $$0, Predicate<gw> $$1, gw $$2, int $$3, buh.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(bui::f).filter($$1);
   }

   public Stream<Pair<hg<buk>, gw>> b(Predicate<hg<buk>> $$0, Predicate<gw> $$1, gw $$2, int $$3, buh.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<hg<buk>, gw>> c(Predicate<hg<buk>> $$0, Predicate<gw> $$1, gw $$2, int $$3, buh.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((gw)$$1x.getSecond()).j($$2)));
   }

   public Optional<gw> d(Predicate<hg<buk>> $$0, Predicate<gw> $$1, gw $$2, int $$3, buh.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<gw> d(Predicate<hg<buk>> $$0, gw $$1, int $$2, buh.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(bui::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<hg<buk>, gw>> e(Predicate<hg<buk>> $$0, gw $$1, int $$2, buh.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<gw> e(Predicate<hg<buk>> $$0, Predicate<gw> $$1, gw $$2, int $$3, buh.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(bui::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<gw> a(Predicate<hg<buk>> $$0, BiPredicate<hg<buk>, gw> $$1, gw $$2, int $$3) {
      return this.c($$0, $$2, $$3, buh.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<gw> a(Predicate<hg<buk>> $$0, Predicate<gw> $$1, buh.b $$2, gw $$3, int $$4, ase $$5) {
      List<bui> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(bui::f);
   }

   public boolean b(gw $$0) {
      return this.d(hz.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(gw $$0, Predicate<hg<buk>> $$1) {
      return this.d(hz.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<hg<buk>> c(gw $$0) {
      return this.d(hz.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @ata
   public int d(gw $$0) {
      return this.d(hz.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(hz $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<buj> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(aqe.b), buh.b.b).findAny().isPresent()).orElse(false);
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

   public void a(hz $$0, dht $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            buj $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dht $$0) {
      return $$0.a(bul::b);
   }

   private void a(dht $$0, hz $$1, BiConsumer<gw, hg<buk>> $$2) {
      $$1.t().forEach($$2x -> {
         dfl $$3 = $$0.a(hz.b($$2x.u()), hz.b($$2x.v()), hz.b($$2x.w()));
         bul.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(cqa $$0, gw $$1, int $$2) {
      hz.a(new cpe($$1), Math.floorDiv($$2, 16), this.c.al(), this.c.am())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(buj::a).orElse(false))
         .map($$0x -> ((hz)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dhm.c));
   }

   final class a extends ako {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return buh.this.g($$0) ? 0 : 7;
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
      a(bui::d),
      b(bui::e),
      c($$0 -> true);

      private final Predicate<? super bui> d;

      private b(Predicate<? super bui> $$0) {
         this.d = $$0;
      }

      public Predicate<? super bui> a() {
         return this.d;
      }
   }
}
