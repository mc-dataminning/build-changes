import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bxc<E extends buv> implements bwp<E> {
   private final Map<cdz<?>, cea> a;
   private final Set<cdz<?>> b;
   private final bxc.a c;
   private final bxc.b d;
   private final byx<bwp<? super E>> e = new byx<>();
   private bwo.a f = bwo.a.a;

   public bxc(Map<cdz<?>, cea> $$0, Set<cdz<?>> $$1, bxc.a $$2, bxc.b $$3, List<Pair<? extends bwp<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bwp<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bwo.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cdz<?>, cea> $$1 : this.a.entrySet()) {
         cdz<?> $$2 = $$1.getKey();
         cea $$3 = $$1.getValue();
         if (!$$0.ed().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(arm $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bwo.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arm $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bwo.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bwo.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arm $$0, E $$1, long $$2) {
      this.f = bwo.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bwo.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.ed()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bwp<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bwo.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(byx::a);

      private final Consumer<byx<?>> c;

      private a(final Consumer<byx<?>> $$0) {
         this.c = $$0;
      }

      public void a(byx<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends buv> void a(Stream<bwp<? super E>> $$0, arm $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bwo.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends buv> void a(Stream<bwp<? super E>> $$0, arm $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bwo.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends buv> void a(Stream<bwp<? super E>> var1, arm var2, E var3, long var4);
   }
}
