import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bmo<E extends bkj> implements bmb<E> {
   private final Map<btk<?>, btl> a;
   private final Set<btk<?>> b;
   private final bmo.a c;
   private final bmo.b d;
   private final boi<bmb<? super E>> e = new boi<>();
   private bma.a f = bma.a.a;

   public bmo(Map<btk<?>, btl> $$0, Set<btk<?>> $$1, bmo.a $$2, bmo.b $$3, List<Pair<? extends bmb<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bmb<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bma.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<btk<?>, btl> $$1 : this.a.entrySet()) {
         btk<?> $$2 = $$1.getKey();
         btl $$3 = $$1.getValue();
         if (!$$0.dN().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(alq $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bma.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(alq $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bma.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bma.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(alq $$0, E $$1, long $$2) {
      this.f = bma.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bma.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dN()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bmb<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bma.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(boi::a);

      private final Consumer<boi<?>> c;

      private a(Consumer<boi<?>> $$0) {
         this.c = $$0;
      }

      public void a(boi<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bkj> void a(Stream<bmb<? super E>> $$0, alq $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bma.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bkj> void a(Stream<bmb<? super E>> $$0, alq $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bma.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bkj> void a(Stream<bmb<? super E>> var1, alq var2, E var3, long var4);
   }
}
