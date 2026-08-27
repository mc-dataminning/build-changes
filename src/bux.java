import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bux<E extends bsq> implements buk<E> {
   private final Map<cbu<?>, cbv> a;
   private final Set<cbu<?>> b;
   private final bux.a c;
   private final bux.b d;
   private final bws<buk<? super E>> e = new bws<>();
   private buj.a f = buj.a.a;

   public bux(Map<cbu<?>, cbv> $$0, Set<cbu<?>> $$1, bux.a $$2, bux.b $$3, List<Pair<? extends buk<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((buk<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public buj.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cbu<?>, cbv> $$1 : this.a.entrySet()) {
         cbu<?> $$2 = $$1.getKey();
         cbv $$3 = $$1.getValue();
         if (!$$0.dS().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aqn $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = buj.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqn $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == buj.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == buj.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aqn $$0, E $$1, long $$2) {
      this.f = buj.a.a;
      this.e.b().filter($$0x -> $$0x.a() == buj.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dS()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends buk<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == buj.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bws::a);

      private final Consumer<bws<?>> c;

      private a(Consumer<bws<?>> $$0) {
         this.c = $$0;
      }

      public void a(bws<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bsq> void a(Stream<buk<? super E>> $$0, aqn $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == buj.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bsq> void a(Stream<buk<? super E>> $$0, aqn $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == buj.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bsq> void a(Stream<buk<? super E>> var1, aqn var2, E var3, long var4);
   }
}
