import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class byn<E extends bwg> implements bya<E> {
   private final Map<cfk<?>, cfl> a;
   private final Set<cfk<?>> b;
   private final byn.a c;
   private final byn.b d;
   private final cai<bya<? super E>> e = new cai<>();
   private bxz.a f = bxz.a.a;

   public byn(Map<cfk<?>, cfl> $$0, Set<cfk<?>> $$1, byn.a $$2, byn.b $$3, List<Pair<? extends bya<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bya<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bxz.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cfk<?>, cfl> $$1 : this.a.entrySet()) {
         cfk<?> $$2 = $$1.getKey();
         cfl $$3 = $$1.getValue();
         if (!$$0.ec().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(ash $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bxz.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ash $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bxz.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bxz.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ash $$0, E $$1, long $$2) {
      this.f = bxz.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bxz.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.ec()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bya<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bxz.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(cai::a);

      private final Consumer<cai<?>> c;

      private a(final Consumer<cai<?>> $$0) {
         this.c = $$0;
      }

      public void a(cai<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bwg> void a(Stream<bya<? super E>> $$0, ash $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bxz.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bwg> void a(Stream<bya<? super E>> $$0, ash $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bxz.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bwg> void a(Stream<bya<? super E>> var1, ash var2, E var3, long var4);
   }
}
