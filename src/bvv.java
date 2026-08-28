import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bvv<E extends btn> implements bvi<E> {
   private final Map<ccs<?>, cct> a;
   private final Set<ccs<?>> b;
   private final bvv.a c;
   private final bvv.b d;
   private final bxq<bvi<? super E>> e = new bxq<>();
   private bvh.a f = bvh.a.a;

   public bvv(Map<ccs<?>, cct> $$0, Set<ccs<?>> $$1, bvv.a $$2, bvv.b $$3, List<Pair<? extends bvi<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bvi<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bvh.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<ccs<?>, cct> $$1 : this.a.entrySet()) {
         ccs<?> $$2 = $$1.getKey();
         cct $$3 = $$1.getValue();
         if (!$$0.dT().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aqu $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bvh.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqu $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bvh.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bvh.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aqu $$0, E $$1, long $$2) {
      this.f = bvh.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bvh.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dT()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bvi<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bvh.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bxq::a);

      private final Consumer<bxq<?>> c;

      private a(final Consumer<bxq<?>> $$0) {
         this.c = $$0;
      }

      public void a(bxq<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends btn> void a(Stream<bvi<? super E>> $$0, aqu $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bvh.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends btn> void a(Stream<bvi<? super E>> $$0, aqu $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bvh.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends btn> void a(Stream<bvi<? super E>> var1, aqu var2, E var3, long var4);
   }
}
