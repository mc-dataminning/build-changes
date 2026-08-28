import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bzh<E extends bxc> implements byu<E> {
   private final Map<cge<?>, cgf> a;
   private final Set<cge<?>> b;
   private final bzh.a c;
   private final bzh.b d;
   private final cbc<byu<? super E>> e = new cbc<>();
   private byt.a f = byt.a.a;

   public bzh(Map<cge<?>, cgf> $$0, Set<cge<?>> $$1, bzh.a $$2, bzh.b $$3, List<Pair<? extends byu<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((byu<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public byt.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cge<?>, cgf> $$1 : this.a.entrySet()) {
         cge<?> $$2 = $$1.getKey();
         cgf $$3 = $$1.getValue();
         if (!$$0.eb().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(arq $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = byt.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arq $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == byt.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == byt.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arq $$0, E $$1, long $$2) {
      this.f = byt.a.a;
      this.e.b().filter($$0x -> $$0x.a() == byt.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.eb()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends byu<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == byt.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(cbc::a);

      private final Consumer<cbc<?>> c;

      private a(final Consumer<cbc<?>> $$0) {
         this.c = $$0;
      }

      public void a(cbc<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bxc> void a(Stream<byu<? super E>> $$0, arq $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == byt.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bxc> void a(Stream<byu<? super E>> $$0, arq $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == byt.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bxc> void a(Stream<byu<? super E>> var1, arq var2, E var3, long var4);
   }
}
