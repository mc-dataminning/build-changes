import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bqk<E extends bog> implements bpx<E> {
   private final Map<bxh<?>, bxi> a;
   private final Set<bxh<?>> b;
   private final bqk.a c;
   private final bqk.b d;
   private final bsf<bpx<? super E>> e = new bsf<>();
   private bpw.a f = bpw.a.a;

   public bqk(Map<bxh<?>, bxi> $$0, Set<bxh<?>> $$1, bqk.a $$2, bqk.b $$3, List<Pair<? extends bpx<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bpx<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bpw.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bxh<?>, bxi> $$1 : this.a.entrySet()) {
         bxh<?> $$2 = $$1.getKey();
         bxi $$3 = $$1.getValue();
         if (!$$0.dO().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aov $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bpw.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aov $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bpw.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bpw.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aov $$0, E $$1, long $$2) {
      this.f = bpw.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bpw.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dO()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bpx<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bpw.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bsf::a);

      private final Consumer<bsf<?>> c;

      private a(Consumer<bsf<?>> $$0) {
         this.c = $$0;
      }

      public void a(bsf<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bog> void a(Stream<bpx<? super E>> $$0, aov $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bpw.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bog> void a(Stream<bpx<? super E>> $$0, aov $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bpw.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bog> void a(Stream<bpx<? super E>> var1, aov var2, E var3, long var4);
   }
}
