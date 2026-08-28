import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class byw<E extends bwr> implements byj<E> {
   private final Map<cft<?>, cfu> a;
   private final Set<cft<?>> b;
   private final byw.a c;
   private final byw.b d;
   private final car<byj<? super E>> e = new car<>();
   private byi.a f = byi.a.a;

   public byw(Map<cft<?>, cfu> $$0, Set<cft<?>> $$1, byw.a $$2, byw.b $$3, List<Pair<? extends byj<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((byj<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public byi.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cft<?>, cfu> $$1 : this.a.entrySet()) {
         cft<?> $$2 = $$1.getKey();
         cfu $$3 = $$1.getValue();
         if (!$$0.eb().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(arn $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = byi.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arn $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == byi.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == byi.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arn $$0, E $$1, long $$2) {
      this.f = byi.a.a;
      this.e.b().filter($$0x -> $$0x.a() == byi.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.eb()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends byj<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == byi.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(car::a);

      private final Consumer<car<?>> c;

      private a(final Consumer<car<?>> $$0) {
         this.c = $$0;
      }

      public void a(car<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bwr> void a(Stream<byj<? super E>> $$0, arn $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == byi.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bwr> void a(Stream<byj<? super E>> $$0, arn $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == byi.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bwr> void a(Stream<byj<? super E>> var1, arn var2, E var3, long var4);
   }
}
