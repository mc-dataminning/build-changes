import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bln<E extends bji> implements bla<E> {
   private final Map<bsj<?>, bsk> a;
   private final Set<bsj<?>> b;
   private final bln.a c;
   private final bln.b d;
   private final bnh<bla<? super E>> e = new bnh<>();
   private bkz.a f = bkz.a.a;

   public bln(Map<bsj<?>, bsk> $$0, Set<bsj<?>> $$1, bln.a $$2, bln.b $$3, List<Pair<? extends bla<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bla<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bkz.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bsj<?>, bsk> $$1 : this.a.entrySet()) {
         bsj<?> $$2 = $$1.getKey();
         bsk $$3 = $$1.getValue();
         if (!$$0.dN().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aks $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bkz.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aks $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bkz.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bkz.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aks $$0, E $$1, long $$2) {
      this.f = bkz.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bkz.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dN()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bla<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bkz.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bnh::a);

      private final Consumer<bnh<?>> c;

      private a(Consumer<bnh<?>> $$0) {
         this.c = $$0;
      }

      public void a(bnh<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bji> void a(Stream<bla<? super E>> $$0, aks $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bkz.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bji> void a(Stream<bla<? super E>> $$0, aks $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bkz.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bji> void a(Stream<bla<? super E>> var1, aks var2, E var3, long var4);
   }
}
