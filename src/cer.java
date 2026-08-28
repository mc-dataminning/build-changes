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

public class cer extends dvn<cet> {
   public static final int a = 6;
   public static final int b = 1;
   private final cer.a d;
   private final LongSet e = new LongOpenHashSet();

   public cer(dvm $$0, Path $$1, DataFixer $$2, boolean $$3, jw $$4, dby $$5) {
      super(new dvo($$0, $$1, $$2, $$3, bae.q), cet::a, cet::new, $$4, $$5);
      this.d = new cer.a();
   }

   public void a(iz $$0, ji<ceu> $$1) {
      this.f(kb.c($$0)).a($$0, $$1);
   }

   public void a(iz $$0) {
      this.d(kb.c($$0)).ifPresent($$1 -> $$1.a($$0));
   }

   public long a(Predicate<ji<ceu>> $$0, iz $$1, int $$2, cer.b $$3) {
      return this.c($$0, $$1, $$2, $$3).count();
   }

   public boolean a(ald<ceu> $$0, iz $$1) {
      return this.a($$1, (Predicate<ji<ceu>>)($$1x -> $$1x.a($$0)));
   }

   public Stream<ces> b(Predicate<ji<ceu>> $$0, iz $$1, int $$2, cer.b $$3) {
      int $$4 = Math.floorDiv($$2, 16) + 1;
      return dbd.a(new dbd($$1), $$4).flatMap($$2x -> this.a($$0, $$2x, $$3)).filter($$2x -> {
         iz $$3x = $$2x.f();
         return Math.abs($$3x.u() - $$1.u()) <= $$2 && Math.abs($$3x.w() - $$1.w()) <= $$2;
      });
   }

   public Stream<ces> c(Predicate<ji<ceu>> $$0, iz $$1, int $$2, cer.b $$3) {
      int $$4 = $$2 * $$2;
      return this.b($$0, $$1, $$2, $$3).filter($$2x -> $$2x.f().j($$1) <= (double)$$4);
   }

   @bab
   public Stream<ces> a(Predicate<ji<ceu>> $$0, dbd $$1, cer.b $$2) {
      return IntStream.range(this.c.ao(), this.c.ap())
         .boxed()
         .map($$1x -> this.d(kb.a($$1, $$1x).s()))
         .filter(Optional::isPresent)
         .flatMap($$2x -> ((cet)$$2x.get()).a($$0, $$2));
   }

   public Stream<iz> a(Predicate<ji<ceu>> $$0, Predicate<iz> $$1, iz $$2, int $$3, cer.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(ces::f).filter($$1);
   }

   public Stream<Pair<ji<ceu>, iz>> b(Predicate<ji<ceu>> $$0, Predicate<iz> $$1, iz $$2, int $$3, cer.b $$4) {
      return this.c($$0, $$2, $$3, $$4).filter($$1x -> $$1.test($$1x.f())).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Stream<Pair<ji<ceu>, iz>> c(Predicate<ji<ceu>> $$0, Predicate<iz> $$1, iz $$2, int $$3, cer.b $$4) {
      return this.b($$0, $$1, $$2, $$3, $$4).sorted(Comparator.comparingDouble($$1x -> ((iz)$$1x.getSecond()).j($$2)));
   }

   public Optional<iz> d(Predicate<ji<ceu>> $$0, Predicate<iz> $$1, iz $$2, int $$3, cer.b $$4) {
      return this.a($$0, $$1, $$2, $$3, $$4).findFirst();
   }

   public Optional<iz> d(Predicate<ji<ceu>> $$0, iz $$1, int $$2, cer.b $$3) {
      return this.c($$0, $$1, $$2, $$3).map(ces::f).min(Comparator.comparingDouble($$1x -> $$1x.j($$1)));
   }

   public Optional<Pair<ji<ceu>, iz>> e(Predicate<ji<ceu>> $$0, iz $$1, int $$2, cer.b $$3) {
      return this.c($$0, $$1, $$2, $$3).min(Comparator.comparingDouble($$1x -> $$1x.f().j($$1))).map($$0x -> Pair.of($$0x.g(), $$0x.f()));
   }

   public Optional<iz> e(Predicate<ji<ceu>> $$0, Predicate<iz> $$1, iz $$2, int $$3, cer.b $$4) {
      return this.c($$0, $$2, $$3, $$4).map(ces::f).filter($$1).min(Comparator.comparingDouble($$1x -> $$1x.j($$2)));
   }

   public Optional<iz> a(Predicate<ji<ceu>> $$0, BiPredicate<ji<ceu>, iz> $$1, iz $$2, int $$3) {
      return this.c($$0, $$2, $$3, cer.b.a).filter($$1x -> $$1.test($$1x.g(), $$1x.f())).findFirst().map($$0x -> {
         $$0x.b();
         return $$0x.f();
      });
   }

   public Optional<iz> a(Predicate<ji<ceu>> $$0, Predicate<iz> $$1, cer.b $$2, iz $$3, int $$4, azf $$5) {
      List<ces> $$6 = ac.a(this.c($$0, $$3, $$4, $$2), $$5);
      return $$6.stream().filter($$1x -> $$1.test($$1x.f())).findFirst().map(ces::f);
   }

   public boolean b(iz $$0) {
      return this.d(kb.c($$0)).map($$1 -> $$1.c($$0)).orElseThrow(() -> ac.b(new IllegalStateException("POI never registered at " + $$0)));
   }

   public boolean a(iz $$0, Predicate<ji<ceu>> $$1) {
      return this.d(kb.c($$0)).map($$2 -> $$2.a($$0, $$1)).orElse(false);
   }

   public Optional<ji<ceu>> c(iz $$0) {
      return this.d(kb.c($$0)).flatMap($$1 -> $$1.d($$0));
   }

   @Deprecated
   @bab
   public int d(iz $$0) {
      return this.d(kb.c($$0)).map($$1 -> $$1.b($$0)).orElse(0);
   }

   public int a(kb $$0) {
      this.d.a();
      return this.d.c($$0.s());
   }

   boolean g(long $$0) {
      Optional<cet> $$1 = this.c($$0);
      return $$1 == null ? false : $$1.<Boolean>map($$0x -> $$0x.a($$0xx -> $$0xx.a(awz.b), cer.b.b).findAny().isPresent()).orElse(false);
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

   public void a(kb $$0, duh $$1) {
      ac.a(this.d($$0.s()), $$2 -> $$2.a($$2x -> {
            if (a($$1)) {
               this.a($$1, $$0, $$2x);
            }
         }), () -> {
         if (a($$1)) {
            cet $$2 = this.f($$0.s());
            this.a($$1, $$0, $$2::a);
         }
      });
   }

   private static boolean a(duh $$0) {
      return $$0.a(cev::b);
   }

   private void a(duh $$0, kb $$1, BiConsumer<iz, ji<ceu>> $$2) {
      $$1.t().forEach($$2x -> {
         dsa $$3 = $$0.a(kb.b($$2x.u()), kb.b($$2x.v()), kb.b($$2x.w()));
         cev.a($$3).ifPresent($$2xx -> $$2.accept($$2x, $$2xx));
      });
   }

   public void a(dbz $$0, iz $$1, int $$2) {
      kb.a(new dbd($$1), Math.floorDiv($$2, 16), this.c.ao(), this.c.ap())
         .map($$0x -> Pair.of($$0x, this.d($$0x.s())))
         .filter($$0x -> !((Optional)$$0x.getSecond()).<Boolean>map(cet::a).orElse(false))
         .map($$0x -> ((kb)$$0x.getFirst()).r())
         .filter($$0x -> this.e.add($$0x.a()))
         .forEach($$1x -> $$0.a($$1x.e, $$1x.f, duv.c));
   }

   final class a extends ara {
      private final Long2ByteMap b = new Long2ByteOpenHashMap();

      protected a() {
         super(7, 16, 256);
         this.b.defaultReturnValue((byte)7);
      }

      @Override
      protected int b(long $$0) {
         return cer.this.g($$0) ? 0 : 7;
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
      a(ces::d),
      b(ces::e),
      c($$0 -> true);

      private final Predicate<? super ces> d;

      private b(final Predicate<? super ces> $$0) {
         this.d = $$0;
      }

      public Predicate<? super ces> a() {
         return this.d;
      }
   }
}
