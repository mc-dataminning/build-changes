import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bqo<E extends boi> implements bqb<E> {
   private final Map<bxl<?>, bxm> a;
   private final Set<bxl<?>> b;
   private final bqo.a c;
   private final bqo.b d;
   private final bsj<bqb<? super E>> e = new bsj<>();
   private bqa.a f = bqa.a.a;

   public bqo(Map<bxl<?>, bxm> $$0, Set<bxl<?>> $$1, bqo.a $$2, bqo.b $$3, List<Pair<? extends bqb<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bqb<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bqa.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bxl<?>, bxm> $$1 : this.a.entrySet()) {
         bxl<?> $$2 = $$1.getKey();
         bxm $$3 = $$1.getValue();
         if (!$$0.dO().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aow $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bqa.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aow $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bqa.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bqa.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aow $$0, E $$1, long $$2) {
      this.f = bqa.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bqa.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dO()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bqb<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bqa.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bsj::a);

      private final Consumer<bsj<?>> c;

      private a(Consumer<bsj<?>> $$0) {
         this.c = $$0;
      }

      public void a(bsj<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends boi> void a(Stream<bqb<? super E>> $$0, aow $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bqa.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends boi> void a(Stream<bqb<? super E>> $$0, aow $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bqa.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends boi> void a(Stream<bqb<? super E>> var1, aow var2, E var3, long var4);
   }
}
