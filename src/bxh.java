import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bxh<E extends bva> implements bwu<E> {
   private final Map<cee<?>, cef> a;
   private final Set<cee<?>> b;
   private final bxh.a c;
   private final bxh.b d;
   private final bzc<bwu<? super E>> e = new bzc<>();
   private bwt.a f = bwt.a.a;

   public bxh(Map<cee<?>, cef> $$0, Set<cee<?>> $$1, bxh.a $$2, bxh.b $$3, List<Pair<? extends bwu<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bwu<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bwt.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cee<?>, cef> $$1 : this.a.entrySet()) {
         cee<?> $$2 = $$1.getKey();
         cef $$3 = $$1.getValue();
         if (!$$0.ed().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(arn $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bwt.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arn $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bwt.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bwt.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arn $$0, E $$1, long $$2) {
      this.f = bwt.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bwt.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.ed()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bwu<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bwt.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bzc::a);

      private final Consumer<bzc<?>> c;

      private a(final Consumer<bzc<?>> $$0) {
         this.c = $$0;
      }

      public void a(bzc<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bva> void a(Stream<bwu<? super E>> $$0, arn $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bwt.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bva> void a(Stream<bwu<? super E>> $$0, arn $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bwt.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bva> void a(Stream<bwu<? super E>> var1, arn var2, E var3, long var4);
   }
}
