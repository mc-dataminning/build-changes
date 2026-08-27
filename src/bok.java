import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bok<E extends bmf> implements bnx<E> {
   private final Map<bvh<?>, bvi> a;
   private final Set<bvh<?>> b;
   private final bok.a c;
   private final bok.b d;
   private final bqf<bnx<? super E>> e = new bqf<>();
   private bnw.a f = bnw.a.a;

   public bok(Map<bvh<?>, bvi> $$0, Set<bvh<?>> $$1, bok.a $$2, bok.b $$3, List<Pair<? extends bnx<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bnx<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bnw.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bvh<?>, bvi> $$1 : this.a.entrySet()) {
         bvh<?> $$2 = $$1.getKey();
         bvi $$3 = $$1.getValue();
         if (!$$0.dO().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(amz $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bnw.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(amz $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bnw.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bnw.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(amz $$0, E $$1, long $$2) {
      this.f = bnw.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bnw.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dO()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bnx<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bnw.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bqf::a);

      private final Consumer<bqf<?>> c;

      private a(Consumer<bqf<?>> $$0) {
         this.c = $$0;
      }

      public void a(bqf<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bmf> void a(Stream<bnx<? super E>> $$0, amz $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bnw.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bmf> void a(Stream<bnx<? super E>> $$0, amz $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bnw.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bmf> void a(Stream<bnx<? super E>> var1, amz var2, E var3, long var4);
   }
}
