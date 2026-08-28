import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bym<E extends bwf> implements bxz<E> {
   private final Map<cfj<?>, cfk> a;
   private final Set<cfj<?>> b;
   private final bym.a c;
   private final bym.b d;
   private final cah<bxz<? super E>> e = new cah<>();
   private bxy.a f = bxy.a.a;

   public bym(Map<cfj<?>, cfk> $$0, Set<cfj<?>> $$1, bym.a $$2, bym.b $$3, List<Pair<? extends bxz<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bxz<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bxy.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cfj<?>, cfk> $$1 : this.a.entrySet()) {
         cfj<?> $$2 = $$1.getKey();
         cfk $$3 = $$1.getValue();
         if (!$$0.eb().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(ash $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bxy.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ash $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bxy.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bxy.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ash $$0, E $$1, long $$2) {
      this.f = bxy.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bxy.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.eb()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bxz<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bxy.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(cah::a);

      private final Consumer<cah<?>> c;

      private a(final Consumer<cah<?>> $$0) {
         this.c = $$0;
      }

      public void a(cah<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bwf> void a(Stream<bxz<? super E>> $$0, ash $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bxy.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bwf> void a(Stream<bxz<? super E>> $$0, ash $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bxy.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bwf> void a(Stream<bxz<? super E>> var1, ash var2, E var3, long var4);
   }
}
