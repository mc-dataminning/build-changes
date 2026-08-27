import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bru<E extends bpo> implements brh<E> {
   private final Map<byr<?>, bys> a;
   private final Set<byr<?>> b;
   private final bru.a c;
   private final bru.b d;
   private final btp<brh<? super E>> e = new btp<>();
   private brg.a f = brg.a.a;

   public bru(Map<byr<?>, bys> $$0, Set<byr<?>> $$1, bru.a $$2, bru.b $$3, List<Pair<? extends brh<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((brh<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public brg.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<byr<?>, bys> $$1 : this.a.entrySet()) {
         byr<?> $$2 = $$1.getKey();
         bys $$3 = $$1.getValue();
         if (!$$0.dP().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(apf $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = brg.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(apf $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == brg.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == brg.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(apf $$0, E $$1, long $$2) {
      this.f = brg.a.a;
      this.e.b().filter($$0x -> $$0x.a() == brg.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dP()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends brh<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == brg.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(btp::a);

      private final Consumer<btp<?>> c;

      private a(Consumer<btp<?>> $$0) {
         this.c = $$0;
      }

      public void a(btp<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bpo> void a(Stream<brh<? super E>> $$0, apf $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == brg.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bpo> void a(Stream<brh<? super E>> $$0, apf $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == brg.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bpo> void a(Stream<brh<? super E>> var1, apf var2, E var3, long var4);
   }
}
