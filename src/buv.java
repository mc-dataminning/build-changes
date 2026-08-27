import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class buv<E extends bso> implements bui<E> {
   private final Map<cbs<?>, cbt> a;
   private final Set<cbs<?>> b;
   private final buv.a c;
   private final buv.b d;
   private final bwq<bui<? super E>> e = new bwq<>();
   private buh.a f = buh.a.a;

   public buv(Map<cbs<?>, cbt> $$0, Set<cbs<?>> $$1, buv.a $$2, buv.b $$3, List<Pair<? extends bui<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bui<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public buh.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cbs<?>, cbt> $$1 : this.a.entrySet()) {
         cbs<?> $$2 = $$1.getKey();
         cbt $$3 = $$1.getValue();
         if (!$$0.dS().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aqm $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = buh.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqm $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == buh.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == buh.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aqm $$0, E $$1, long $$2) {
      this.f = buh.a.a;
      this.e.b().filter($$0x -> $$0x.a() == buh.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dS()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bui<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == buh.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bwq::a);

      private final Consumer<bwq<?>> c;

      private a(Consumer<bwq<?>> $$0) {
         this.c = $$0;
      }

      public void a(bwq<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bso> void a(Stream<bui<? super E>> $$0, aqm $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == buh.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bso> void a(Stream<bui<? super E>> $$0, aqm $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == buh.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bso> void a(Stream<bui<? super E>> var1, aqm var2, E var3, long var4);
   }
}
