import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class byf<E extends bvy> implements bxs<E> {
   private final Map<cfc<?>, cfd> a;
   private final Set<cfc<?>> b;
   private final byf.a c;
   private final byf.b d;
   private final caa<bxs<? super E>> e = new caa<>();
   private bxr.a f = bxr.a.a;

   public byf(Map<cfc<?>, cfd> $$0, Set<cfc<?>> $$1, byf.a $$2, byf.b $$3, List<Pair<? extends bxs<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bxs<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bxr.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cfc<?>, cfd> $$1 : this.a.entrySet()) {
         cfc<?> $$2 = $$1.getKey();
         cfd $$3 = $$1.getValue();
         if (!$$0.ea().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(ard $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bxr.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ard $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bxr.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bxr.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ard $$0, E $$1, long $$2) {
      this.f = bxr.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bxr.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.ea()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bxs<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bxr.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(caa::a);

      private final Consumer<caa<?>> c;

      private a(final Consumer<caa<?>> $$0) {
         this.c = $$0;
      }

      public void a(caa<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bvy> void a(Stream<bxs<? super E>> $$0, ard $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bxr.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bvy> void a(Stream<bxs<? super E>> $$0, ard $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bxr.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bvy> void a(Stream<bxs<? super E>> var1, ard var2, E var3, long var4);
   }
}
