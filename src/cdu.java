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

public class cdu extends duq<cdw> {
   public static final int a = 6;
   public static final int b = 1;
   private final cdu.a d;
   private final LongSet e = new LongOpenHashSet();

   public cdu(dup $$0, Path $$1, DataFixer $$2, boolean $$3, jl $$4, dbb $$5) {
      super(new dur($$0, $$1, $$2, $$3, azl.q), cdw::a, cdw::new, $$4, $$5);
      this.d = new cdu.a();
   }

   public void a(io $$0, ix<cdx> $$1) {
      this.f(jq.c($$0)).a($$0, $$1);
   }

   public void a(io $$0) {
      this.d(jq.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<ix<cdx>> $$0, io $$1, int $$2, cdu.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(akm<cdx> $$0, io $$1) {
      return this.a($$1, (Predicate<ix<cdx>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cdv> b(Predicate<ix<cdx>> $$0, io $$1, int $$2, cdu.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return dag.a(new dag($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         io $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cdv> c(Predicate<ix<cdx>> $$0, io $$1, int $$2, cdu.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @azi
   public Stream<cdv> a(Predicate<ix<cdx>> $$0, dag $$1, cdu.b $$2) {
      return IntStream.range(this.c.an(), this.c.ao())
         .boxed()
         .map($$1x -> this.d(jq.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cdw)$$2x.get()).a($$0, $$2));
   }

   public Stream<io> a(Predicate<ix<cdx>> $$0, Predicate<io> $$1, io $$2, int $$3, cdu.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cdv::f).filter($$1);
   }

   public Stream<Pair<ix<cdx>, io>> b(Predicate<ix<cdx>> $$0, Predicate<io> $$1, io $$2, int $$3, cdu.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<ix<cdx>, io>> c(Predicate<ix<cdx>> $$0, Predicate<io> $$1, io $$2, int $$3, cdu.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((io)$$1x.getSecond()).j($$2)));
   }

   public Optional<io> d(Predicate<ix<cdx>> $$0, Predicate<io> $$1, io $$2, int $$3, cdu.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<io> d(Predicate<ix<cdx>> $$0, io $$1, int $$2, cdu.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cdv::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<ix<cdx>, io>> e(Predicate<ix<cdx>> $$0, io $$1, int $$2, cdu.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<io> e(Predicate<ix<cdx>> $$0, Predicate<io> $$1, io $$2, int $$3, cdu.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cdv::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<io> a(Predicate<ix<cdx>> $$0, BiPredicate<ix<cdx>, io> $$1, io $$2, int $$3) {
      return this.c($$0, $$2, $$3, cdu.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<io> a(Predicate<ix<cdx>> $$0, Predicate<io> $$1, cdu.b $$2, io $$3, int $$4, aym $$5) {
      List<cdv> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(cdv::f);
   }

   public boolean b(io $$0) {
      return this.d(jq.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(io $$0, Predicate<ix<cdx>> $$1) {
      return this.d(jq.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<ix<cdx>> c(io $$0) {
      return this.d(jq.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @azi
   public int d(io $$0) {
      return this.d(jq.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(jq $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cdw> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(awh.b), cdu.b.b).findAny().isPresent()).orElse(false);
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

   public void a(jq $$0, dtk $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cdw $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dtk $$0) {
      return $$0.a(cdy::b);
   }

   private void a(dtk $$0, jq $$1, BiConsumer<io, ix<cdx>> $$2) {
      $$1.t().forEach($$2x -> {
         drd $$3 = $$0.a(jq.b($$2x.u()), jq.b($$2x.v()), jq.b($$2x.w()));
         cdy.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dbc $$0, io $$1, int $$2) {
      jq.a(new dag($$1), Math.floorDiv($$2, 16), this.c.an(), this.c.ao())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cdw::a).orElse(false))
         .map($$0x -> ((jq)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dty.c));
   }

   final class a extends aqj {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cdu.this.g($$0) ? 0 : 7;
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
      a(cdv::d),
      b(cdv::e),
      c($$0 -> true);

      private final Predicate<? super cdv> d;

      private b(Predicate<? super cdv> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cdv> a() {
         return this.d;
      }
   }
}
