import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bzo<E extends bxj> implements bzb<E> {
   private final Map<cgl<?>, cgm> a;
   private final Set<cgl<?>> b;
   private final bzo.a c;
   private final bzo.b d;
   private final cbj<bzb<? super E>> e = new cbj<>();
   private bza.a f = bza.a.a;

   public bzo(Map<cgl<?>, cgm> $$0, Set<cgl<?>> $$1, bzo.a $$2, bzo.b $$3, List<Pair<? extends bzb<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bzb<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bza.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cgl<?>, cgm> $$1 : this.a.entrySet()) {
         cgl<?> $$2 = $$1.getKey();
         cgm $$3 = $$1.getValue();
         if (!$$0.eb().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(arq $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bza.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arq $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bza.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bza.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arq $$0, E $$1, long $$2) {
      this.f = bza.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bza.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.eb()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bzb<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bza.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(cbj::a);

      private final Consumer<cbj<?>> c;

      private a(final Consumer<cbj<?>> $$0) {
         this.c = $$0;
      }

      public void a(cbj<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bxj> void a(Stream<bzb<? super E>> $$0, arq $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bza.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bxj> void a(Stream<bzb<? super E>> $$0, arq $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bza.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bxj> void a(Stream<bzb<? super E>> var1, arq var2, E var3, long var4);
   }
}
