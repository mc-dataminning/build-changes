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

public class cbw extends dsv<cby> {
   public static final int a = 6;
   public static final int b = 1;
   private final cbw.a d;
   private final LongSet e = new LongOpenHashSet();

   public cbw(dsu $$0, Path $$1, DataFixer $$2, boolean $$3, jb $$4, czi $$5) {
      super(new dsw($$0, $$1, $$2, $$3, ays.q), cby::a, cby::new, $$4, $$5);
      this.d = new cbw.a();
   }

   public void a(id $$0, in<cbz> $$1) {
      this.f(jg.c($$0)).a($$0, $$1);
   }

   public void a(id $$0) {
      this.d(jg.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<in<cbz>> $$0, id $$1, int $$2, cbw.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(aju<cbz> $$0, id $$1) {
      return this.a($$1, (Predicate<in<cbz>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cbx> b(Predicate<in<cbz>> $$0, id $$1, int $$2, cbw.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return cyn.a(new cyn($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         id $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cbx> c(Predicate<in<cbz>> $$0, id $$1, int $$2, cbw.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @ayp
   public Stream<cbx> a(Predicate<in<cbz>> $$0, cyn $$1, cbw.b $$2) {
      return IntStream.range(this.c.an(), this.c.ao())
         .boxed()
         .map($$1x -> this.d(jg.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cby)$$2x.get()).a($$0, $$2));
   }

   public Stream<id> a(Predicate<in<cbz>> $$0, Predicate<id> $$1, id $$2, int $$3, cbw.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cbx::f).filter($$1);
   }

   public Stream<Pair<in<cbz>, id>> b(Predicate<in<cbz>> $$0, Predicate<id> $$1, id $$2, int $$3, cbw.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<in<cbz>, id>> c(Predicate<in<cbz>> $$0, Predicate<id> $$1, id $$2, int $$3, cbw.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((id)$$1x.getSecond()).j($$2)));
   }

   public Optional<id> d(Predicate<in<cbz>> $$0, Predicate<id> $$1, id $$2, int $$3, cbw.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<id> d(Predicate<in<cbz>> $$0, id $$1, int $$2, cbw.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cbx::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<in<cbz>, id>> e(Predicate<in<cbz>> $$0, id $$1, int $$2, cbw.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<id> e(Predicate<in<cbz>> $$0, Predicate<id> $$1, id $$2, int $$3, cbw.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cbx::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<id> a(Predicate<in<cbz>> $$0, BiPredicate<in<cbz>, id> $$1, id $$2, int $$3) {
      return this.c($$0, $$2, $$3, cbw.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<id> a(Predicate<in<cbz>> $$0, Predicate<id> $$1, cbw.b $$2, id $$3, int $$4, axt $$5) {
      List<cbx> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(cbx::f);
   }

   public boolean b(id $$0) {
      return this.d(jg.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(id $$0, Predicate<in<cbz>> $$1) {
      return this.d(jg.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<in<cbz>> c(id $$0) {
      return this.d(jg.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @ayp
   public int d(id $$0) {
      return this.d(jg.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(jg $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cby> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(avo.b), cbw.b.b).findAny().isPresent()).orElse(false);
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

   public void a(jg $$0, drp $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cby $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(drp $$0) {
      return $$0.a(cca::b);
   }

   private void a(drp $$0, jg $$1, BiConsumer<id, in<cbz>> $$2) {
      $$1.t().forEach($$2x -> {
         dpi $$3 = $$0.a(jg.b($$2x.u()), jg.b($$2x.v()), jg.b($$2x.w()));
         cca.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(czj $$0, id $$1, int $$2) {
      jg.a(new cyn($$1), Math.floorDiv($$2, 16), this.c.an(), this.c.ao())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cby::a).orElse(false))
         .map($$0x -> ((jg)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dsd.c));
   }

   final class a extends apq {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cbw.this.g($$0) ? 0 : 7;
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
      a(cbx::d),
      b(cbx::e),
      c($$0 -> true);

      private final Predicate<? super cbx> d;

      private b(Predicate<? super cbx> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cbx> a() {
         return this.d;
      }
   }
}
