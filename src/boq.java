import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class boq<E extends bml> implements bod<E> {
   private final Map<bvn<?>, bvo> a;
   private final Set<bvn<?>> b;
   private final boq.a c;
   private final boq.b d;
   private final bql<bod<? super E>> e = new bql<>();
   private boc.a f = boc.a.a;

   public boq(Map<bvn<?>, bvo> $$0, Set<bvn<?>> $$1, boq.a $$2, boq.b $$3, List<Pair<? extends bod<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bod<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public boc.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bvn<?>, bvo> $$1 : this.a.entrySet()) {
         bvn<?> $$2 = $$1.getKey();
         bvo $$3 = $$1.getValue();
         if (!$$0.dO().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(and $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = boc.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(and $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == boc.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == boc.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(and $$0, E $$1, long $$2) {
      this.f = boc.a.a;
      this.e.b().filter($$0x -> $$0x.a() == boc.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dO()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bod<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == boc.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bql::a);

      private final Consumer<bql<?>> c;

      private a(Consumer<bql<?>> $$0) {
         this.c = $$0;
      }

      public void a(bql<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bml> void a(Stream<bod<? super E>> $$0, and $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == boc.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bml> void a(Stream<bod<? super E>> $$0, and $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == boc.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bml> void a(Stream<bod<? super E>> var1, and var2, E var3, long var4);
   }
}
