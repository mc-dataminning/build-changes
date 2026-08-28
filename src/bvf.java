import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bvf<E extends bsy> implements bus<E> {
   private final Map<ccc<?>, ccd> a;
   private final Set<ccc<?>> b;
   private final bvf.a c;
   private final bvf.b d;
   private final bxa<bus<? super E>> e = new bxa<>();
   private bur.a f = bur.a.a;

   public bvf(Map<ccc<?>, ccd> $$0, Set<ccc<?>> $$1, bvf.a $$2, bvf.b $$3, List<Pair<? extends bus<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bus<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bur.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<ccc<?>, ccd> $$1 : this.a.entrySet()) {
         ccc<?> $$2 = $$1.getKey();
         ccd $$3 = $$1.getValue();
         if (!$$0.dT().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aqk $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bur.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqk $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bur.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bur.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aqk $$0, E $$1, long $$2) {
      this.f = bur.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bur.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dT()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bus<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bur.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bxa::a);

      private final Consumer<bxa<?>> c;

      private a(final Consumer<bxa<?>> $$0) {
         this.c = $$0;
      }

      public void a(bxa<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bsy> void a(Stream<bus<? super E>> $$0, aqk $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bur.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bsy> void a(Stream<bus<? super E>> $$0, aqk $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bur.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bsy> void a(Stream<bus<? super E>> var1, aqk var2, E var3, long var4);
   }
}
