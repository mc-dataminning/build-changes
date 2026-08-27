import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bsz<E extends bqt> implements bsm<E> {
   private final Map<bzw<?>, bzx> a;
   private final Set<bzw<?>> b;
   private final bsz.a c;
   private final bsz.b d;
   private final buu<bsm<? super E>> e = new buu<>();
   private bsl.a f = bsl.a.a;

   public bsz(Map<bzw<?>, bzx> $$0, Set<bzw<?>> $$1, bsz.a $$2, bsz.b $$3, List<Pair<? extends bsm<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bsm<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bsl.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bzw<?>, bzx> $$1 : this.a.entrySet()) {
         bzw<?> $$2 = $$1.getKey();
         bzx $$3 = $$1.getValue();
         if (!$$0.dP().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(apu $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bsl.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(apu $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bsl.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bsl.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(apu $$0, E $$1, long $$2) {
      this.f = bsl.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bsl.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dP()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bsm<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bsl.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(buu::a);

      private final Consumer<buu<?>> c;

      private a(Consumer<buu<?>> $$0) {
         this.c = $$0;
      }

      public void a(buu<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bqt> void a(Stream<bsm<? super E>> $$0, apu $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bsl.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bqt> void a(Stream<bsm<? super E>> $$0, apu $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bsl.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bqt> void a(Stream<bsm<? super E>> var1, apu var2, E var3, long var4);
   }
}
