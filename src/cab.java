import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class cab<E extends bxw> implements bzo<E> {
   private final Map<cgy<?>, cgz> a;
   private final Set<cgy<?>> b;
   private final cab.a c;
   private final cab.b d;
   private final cbw<bzo<? super E>> e = new cbw<>();
   private bzn.a f = bzn.a.a;

   public cab(Map<cgy<?>, cgz> $$0, Set<cgy<?>> $$1, cab.a $$2, cab.b $$3, List<Pair<? extends bzo<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bzo<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bzn.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cgy<?>, cgz> $$1 : this.a.entrySet()) {
         cgy<?> $$2 = $$1.getKey();
         cgz $$3 = $$1.getValue();
         if (!$$0.ec().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aru $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bzn.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aru $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bzn.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bzn.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aru $$0, E $$1, long $$2) {
      this.f = bzn.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bzn.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.ec()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bzo<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bzn.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(cbw::a);

      private final Consumer<cbw<?>> c;

      private a(final Consumer<cbw<?>> $$0) {
         this.c = $$0;
      }

      public void a(cbw<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bxw> void a(Stream<bzo<? super E>> $$0, aru $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bzn.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bxw> void a(Stream<bzo<? super E>> $$0, aru $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bzn.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bxw> void a(Stream<bzo<? super E>> var1, aru var2, E var3, long var4);
   }
}
