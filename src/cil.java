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

public class cil extends eek<cin, cin.a> {
   public static final int a = 6;
   public static final int b = 1;
   private final cil.a d;
   private final LongSet e = new LongOpenHashSet();

   public cil(eej $$0, Path $$1, DataFixer $$2, boolean $$3, jt $$4, edy $$5, djo $$6) {
      super(new eem($$0, $$1, $$2, $$3, bbb.q), cin.a.a, cin::a, cin.a::a, cin::new, $$4, $$5, $$6);
      this.d = new cil.a();
   }

   public void a(iv $$0, jf<cio> $$1) {
      this.f(jy.c($$0)).a($$0, $$1);
   }

   public void a(iv $$0) {
      this.d(jy.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<jf<cio>> $$0, iv $$1, int $$2, cil.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(alf<cio> $$0, iv $$1) {
      return this.a($$1, (Predicate<jf<cio>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cim> b(Predicate<jf<cio>> $$0, iv $$1, int $$2, cil.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return dir.a(new dir($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         iv $$3x = $$2x.g();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cim> c(Predicate<jf<cio>> $$0, iv $$1, int $$2, cil.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.g().j($$1) <= (double)$$4);
   }

   @bav
   public Stream<cim> a(Predicate<jf<cio>> $$0, dir $$1, cil.b $$2) {
      return IntStream.rangeClosed(this.c.aq(), this.c.ar())
         .boxed()
         .map($$1x -> this.d(jy.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cin)$$2x.get()).a($$0, $$2));
   }

   public Stream<iv> a(Predicate<jf<cio>> $$0, Predicate<iv> $$1, iv $$2, int $$3, cil.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cim::g).filter($$1);
   }

   public Stream<Pair<jf<cio>, iv>> b(Predicate<jf<cio>> $$0, Predicate<iv> $$1, iv $$2, int $$3, cil.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.g())).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Stream<Pair<jf<cio>, iv>> c(Predicate<jf<cio>> $$0, Predicate<iv> $$1, iv $$2, int $$3, cil.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((iv)$$1x.getSecond()).j($$2)));
   }

   public Optional<iv> d(Predicate<jf<cio>> $$0, Predicate<iv> $$1, iv $$2, int $$3, cil.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<iv> d(Predicate<jf<cio>> $$0, iv $$1, int $$2, cil.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cim::g).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<jf<cio>, iv>> e(Predicate<jf<cio>> $$0, iv $$1, int $$2, cil.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.g().j($$1))).map($$0x -> Pair.of($$0x.h(), $$0x.g()));
   }

   public Optional<iv> e(Predicate<jf<cio>> $$0, Predicate<iv> $$1, iv $$2, int $$3, cil.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cim::g).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<iv> a(Predicate<jf<cio>> $$0, BiPredicate<jf<cio>, iv> $$1, iv $$2, int $$3) {
      return this.c($$0, $$2, $$3, cil.b.a).filter($$1x -> $$1.test($$1x.h(), $$1x.g())).findFirst().map($$0x -> {
         $$0x.c();
         return $$0x.g();
      });
   }

   public Optional<iv> a(Predicate<jf<cio>> $$0, Predicate<iv> $$1, cil.b $$2, iv $$3, int $$4, azv $$5) {
      List<cim> $$6 = ag.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.g())).findFirst().map(cim::g);
   }

   public boolean b(iv $$0) {
      return this.d(jy.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ag.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(iv $$0, Predicate<jf<cio>> $$1) {
      return this.d(jy.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<jf<cio>> c(iv $$0) {
      return this.d(jy.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @bav
   public int d(iv $$0) {
      return this.d(jy.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(jy $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cin> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(axm.b), cil.b.b).findAny().isPresent()).orElse(false);
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

   public void a(jy $$0, edb $$1) {
      ag.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cin $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(edb $$0) {
      return $$0.a(cip::b);
   }

   private void a(edb $$0, jy $$1, BiConsumer<iv, jf<cio>> $$2) {
      $$1.t().forEach($$2x -> {
         eat $$3 = $$0.a(jy.b($$2x.u()), jy.b($$2x.v()), jy.b($$2x.w()));
         cip.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(djp $$0, iv $$1, int $$2) {
      jy.a(new dir($$1), Math.floorDiv($$2, 16), this.c.aq(), this.c.ar())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cin::b).orElse(false))
         .map($$0x -> ((jy)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.h, $$1x.i, edr.c));
   }

   final class a extends arl {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cil.this.g($$0) ? 0 : 7;
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
      a(cim::e),
      b(cim::f),
      c($$0 -> true);

      private final Predicate<? super cim> d;

      private b(final Predicate<? super cim> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cim> a() {
         return this.d;
      }
   }
}
