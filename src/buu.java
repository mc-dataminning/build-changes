import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class buu<E extends bso> implements buh<E> {
   private final Map<cbr<?>, cbs> a;
   private final Set<cbr<?>> b;
   private final buu.a c;
   private final buu.b d;
   private final bwp<buh<? super E>> e = new bwp<>();
   private bug.a f = bug.a.a;

   public buu(Map<cbr<?>, cbs> $$0, Set<cbr<?>> $$1, buu.a $$2, buu.b $$3, List<Pair<? extends buh<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((buh<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bug.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cbr<?>, cbs> $$1 : this.a.entrySet()) {
         cbr<?> $$2 = $$1.getKey();
         cbs $$3 = $$1.getValue();
         if (!$$0.dZ().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aqt $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bug.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqt $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bug.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bug.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aqt $$0, E $$1, long $$2) {
      this.f = bug.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bug.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dZ()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends buh<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bug.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bwp::a);

      private final Consumer<bwp<?>> c;

      private a(Consumer<bwp<?>> $$0) {
         this.c = $$0;
      }

      public void a(bwp<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bso> void a(Stream<buh<? super E>> $$0, aqt $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bug.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bso> void a(Stream<buh<? super E>> $$0, aqt $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bug.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bso> void a(Stream<buh<? super E>> var1, aqt var2, E var3, long var4);
   }
}
