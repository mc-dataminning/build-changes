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

public class cdr extends dwp<cdt> {
   public static final int a = 6;
   public static final int b = 1;
   private final cdr.a d;
   private final LongSet e = new LongOpenHashSet();

   public cdr(dwo $$0, Path $$1, DataFixer $$2, boolean $$3, jo $$4, dcc $$5) {
      super(new dwq($$0, $$1, $$2, $$3, azs.q), cdt::a, cdt::new, $$4, $$5);
      this.d = new cdr.a();
   }

   public void a(ir $$0, ja<cdu> $$1) {
      this.f(jt.c($$0)).a($$0, $$1);
   }

   public void a(ir $$0) {
      this.d(jt.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<ja<cdu>> $$0, ir $$1, int $$2, cdr.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(aks<cdu> $$0, ir $$1) {
      return this.a($$1, (Predicate<ja<cdu>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cds> b(Predicate<ja<cdu>> $$0, ir $$1, int $$2, cdr.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return dbh.a(new dbh($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         ir $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cds> c(Predicate<ja<cdu>> $$0, ir $$1, int $$2, cdr.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @azp
   public Stream<cds> a(Predicate<ja<cdu>> $$0, dbh $$1, cdr.b $$2) {
      return IntStream.range(this.c.ao(), this.c.ap())
         .boxed()
         .map($$1x -> this.d(jt.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cdt)$$2x.get()).a($$0, $$2));
   }

   public Stream<ir> a(Predicate<ja<cdu>> $$0, Predicate<ir> $$1, ir $$2, int $$3, cdr.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cds::f).filter($$1);
   }

   public Stream<Pair<ja<cdu>, ir>> b(Predicate<ja<cdu>> $$0, Predicate<ir> $$1, ir $$2, int $$3, cdr.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<ja<cdu>, ir>> c(Predicate<ja<cdu>> $$0, Predicate<ir> $$1, ir $$2, int $$3, cdr.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((ir)$$1x.getSecond()).j($$2)));
   }

   public Optional<ir> d(Predicate<ja<cdu>> $$0, Predicate<ir> $$1, ir $$2, int $$3, cdr.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<ir> d(Predicate<ja<cdu>> $$0, ir $$1, int $$2, cdr.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cds::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<ja<cdu>, ir>> e(Predicate<ja<cdu>> $$0, ir $$1, int $$2, cdr.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<ir> e(Predicate<ja<cdu>> $$0, Predicate<ir> $$1, ir $$2, int $$3, cdr.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cds::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<ir> a(Predicate<ja<cdu>> $$0, BiPredicate<ja<cdu>, ir> $$1, ir $$2, int $$3) {
      return this.c($$0, $$2, $$3, cdr.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<ir> a(Predicate<ja<cdu>> $$0, Predicate<ir> $$1, cdr.b $$2, ir $$3, int $$4, ayt $$5) {
      List<cds> $$6 = ad.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(cds::f);
   }

   public boolean b(ir $$0) {
      return this.d(jt.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ad.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(ir $$0, Predicate<ja<cdu>> $$1) {
      return this.d(jt.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<ja<cdu>> c(ir $$0) {
      return this.d(jt.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @azp
   public int d(ir $$0) {
      return this.d(jt.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(jt $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cdt> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(awo.b), cdr.b.b).findAny().isPresent()).orElse(false);
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

   public void a(jt $$0, dvj $$1) {
      ad.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cdt $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(dvj $$0) {
      return $$0.a(cdv::b);
   }

   private void a(dvj $$0, jt $$1, BiConsumer<ir, ja<cdu>> $$2) {
      $$1.t().forEach($$2x -> {
         dtc $$3 = $$0.a(jt.b($$2x.u()), jt.b($$2x.v()), jt.b($$2x.w()));
         cdv.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dcd $$0, ir $$1, int $$2, dvx $$3) {
      jt.a(new dbh($$1), Math.floorDiv($$2, 16), this.c.ao(), this.c.ap())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cdt::a).orElse(false))
         .map($$0x -> ((jt)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$2x -> $$0.a($$2x.e, $$2x.f, $$3));
   }

   final class a extends aqp {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cdr.this.g($$0) ? 0 : 7;
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
      a(cds::d),
      b(cds::e),
      c($$0 -> true);

      private final Predicate<? super cds> d;

      private b(Predicate<? super cds> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cds> a() {
         return this.d;
      }
   }
}
