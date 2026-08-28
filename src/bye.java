import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bye<E extends bvx> implements bxr<E> {
   private final Map<cfb<?>, cfc> a;
   private final Set<cfb<?>> b;
   private final bye.a c;
   private final bye.b d;
   private final bzz<bxr<? super E>> e = new bzz<>();
   private bxq.a f = bxq.a.a;

   public bye(Map<cfb<?>, cfc> $$0, Set<cfb<?>> $$1, bye.a $$2, bye.b $$3, List<Pair<? extends bxr<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bxr<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bxq.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cfb<?>, cfc> $$1 : this.a.entrySet()) {
         cfb<?> $$2 = $$1.getKey();
         cfc $$3 = $$1.getValue();
         if (!$$0.ec().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(arx $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bxq.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arx $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bxq.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bxq.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arx $$0, E $$1, long $$2) {
      this.f = bxq.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bxq.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.ec()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bxr<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bxq.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bzz::a);

      private final Consumer<bzz<?>> c;

      private a(final Consumer<bzz<?>> $$0) {
         this.c = $$0;
      }

      public void a(bzz<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bvx> void a(Stream<bxr<? super E>> $$0, arx $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bxq.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bvx> void a(Stream<bxr<? super E>> $$0, arx $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bxq.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bvx> void a(Stream<bxr<? super E>> var1, arx var2, E var3, long var4);
   }
}
