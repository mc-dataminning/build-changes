import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bvw<E extends btp> implements bvj<E> {
   private final Map<cct<?>, ccu> a;
   private final Set<cct<?>> b;
   private final bvw.a c;
   private final bvw.b d;
   private final bxr<bvj<? super E>> e = new bxr<>();
   private bvi.a f = bvi.a.a;

   public bvw(Map<cct<?>, ccu> $$0, Set<cct<?>> $$1, bvw.a $$2, bvw.b $$3, List<Pair<? extends bvj<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bvj<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bvi.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cct<?>, ccu> $$1 : this.a.entrySet()) {
         cct<?> $$2 = $$1.getKey();
         ccu $$3 = $$1.getValue();
         if (!$$0.dS().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(arf $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bvi.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arf $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bvi.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bvi.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arf $$0, E $$1, long $$2) {
      this.f = bvi.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bvi.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dS()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bvj<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bvi.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bxr::a);

      private final Consumer<bxr<?>> c;

      private a(final Consumer<bxr<?>> $$0) {
         this.c = $$0;
      }

      public void a(bxr<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends btp> void a(Stream<bvj<? super E>> $$0, arf $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bvi.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends btp> void a(Stream<bvj<? super E>> $$0, arf $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bvi.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends btp> void a(Stream<bvj<? super E>> var1, arf var2, E var3, long var4);
   }
}
