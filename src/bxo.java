import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bxo<E extends bvh> implements bxb<E> {
   private final Map<cel<?>, cem> a;
   private final Set<cel<?>> b;
   private final bxo.a c;
   private final bxo.b d;
   private final bzj<bxb<? super E>> e = new bzj<>();
   private bxa.a f = bxa.a.a;

   public bxo(Map<cel<?>, cem> $$0, Set<cel<?>> $$1, bxo.a $$2, bxo.b $$3, List<Pair<? extends bxb<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bxb<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bxa.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cel<?>, cem> $$1 : this.a.entrySet()) {
         cel<?> $$2 = $$1.getKey();
         cem $$3 = $$1.getValue();
         if (!$$0.eb().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(ard $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bxa.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ard $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bxa.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bxa.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ard $$0, E $$1, long $$2) {
      this.f = bxa.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bxa.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.eb()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bxb<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bxa.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bzj::a);

      private final Consumer<bzj<?>> c;

      private a(final Consumer<bzj<?>> $$0) {
         this.c = $$0;
      }

      public void a(bzj<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bvh> void a(Stream<bxb<? super E>> $$0, ard $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bxa.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bvh> void a(Stream<bxb<? super E>> $$0, ard $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bxa.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bvh> void a(Stream<bxb<? super E>> var1, ard var2, E var3, long var4);
   }
}
