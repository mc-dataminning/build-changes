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

public class ceo extends dvk<ceq> {
   public static final int a = 6;
   public static final int b = 1;
   private final ceo.a d;
   private final LongSet e = new LongOpenHashSet();

   public ceo(dvj $$0, Path $$1, DataFixer $$2, boolean $$3, jw $$4, dbv $$5) {
      super(new dvl($$0, $$1, $$2, $$3, bab.q), ceq::a, ceq::new, $$4, $$5);
      this.d = new ceo.a();
   }

   public void a(iz $$0, ji<cer> $$1) {
      this.f(kb.c($$0)).a($$0, $$1);
   }

   public void a(iz $$0) {
      this.d(kb.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<ji<cer>> $$0, iz $$1, int $$2, ceo.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(ala<cer> $$0, iz $$1) {
      return this.a($$1, (Predicate<ji<cer>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<cep> b(Predicate<ji<cer>> $$0, iz $$1, int $$2, ceo.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return dba.a(new dba($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         iz $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<cep> c(Predicate<ji<cer>> $$0, iz $$1, int $$2, ceo.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @azy
   public Stream<cep> a(Predicate<ji<cer>> $$0, dba $$1, ceo.b $$2) {
      return IntStream.range(this.c.ao(), this.c.ap())
         .boxed()
         .map($$1x -> this.d(kb.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((ceq)$$2x.get()).a($$0, $$2));
   }

   public Stream<iz> a(Predicate<ji<cer>> $$0, Predicate<iz> $$1, iz $$2, int $$3, ceo.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cep::f).filter($$1);
   }

   public Stream<Pair<ji<cer>, iz>> b(Predicate<ji<cer>> $$0, Predicate<iz> $$1, iz $$2, int $$3, ceo.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<ji<cer>, iz>> c(Predicate<ji<cer>> $$0, Predicate<iz> $$1, iz $$2, int $$3, ceo.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((iz)$$1x.getSecond()).j($$2)));
   }

   public Optional<iz> d(Predicate<ji<cer>> $$0, Predicate<iz> $$1, iz $$2, int $$3, ceo.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<iz> d(Predicate<ji<cer>> $$0, iz $$1, int $$2, ceo.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(cep::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<ji<cer>, iz>> e(Predicate<ji<cer>> $$0, iz $$1, int $$2, ceo.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<iz> e(Predicate<ji<cer>> $$0, Predicate<iz> $$1, iz $$2, int $$3, ceo.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(cep::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<iz> a(Predicate<ji<cer>> $$0, BiPredicate<ji<cer>, iz> $$1, iz $$2, int $$3) {
      return this.c($$0, $$2, $$3, ceo.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<iz> a(Predicate<ji<cer>> $$0, Predicate<iz> $$1, ceo.b $$2, iz $$3, int $$4, azc $$5) {
      List<cep> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(cep::f);
   }

   public boolean b(iz $$0) {
      return this.d(kb.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(iz $$0, Predicate<ji<cer>> $$1) {
      return this.d(kb.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<ji<cer>> c(iz $$0) {
      return this.d(kb.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @azy
   public int d(iz $$0) {
      return this.d(kb.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(kb $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<ceq> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(aww.b), ceo.b.b).findAny().isPresent()).orElse(false);
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

   public void a(kb $$0, due $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            ceq $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(due $$0) {
      return $$0.a(ces::b);
   }

   private void a(due $$0, kb $$1, BiConsumer<iz, ji<cer>> $$2) {
      $$1.t().forEach($$2x -> {
         drx $$3 = $$0.a(kb.b($$2x.u()), kb.b($$2x.v()), kb.b($$2x.w()));
         ces.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dbw $$0, iz $$1, int $$2) {
      kb.a(new dba($$1), Math.floorDiv($$2, 16), this.c.ao(), this.c.ap())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(ceq::a).orElse(false))
         .map($$0x -> ((kb)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, dus.c));
   }

   final class a extends aqx {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return ceo.this.g($$0) ? 0 : 7;
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
      a(cep::d),
      b(cep::e),
      c($$0 -> true);

      private final Predicate<? super cep> d;

      private b(final Predicate<? super cep> $$0) {
         this.d = $$0;
      }

      public Predicate<? super cep> a() {
         return this.d;
      }
   }
}
