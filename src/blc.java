import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class blc<E extends biw> implements bkp<E> {
   private final Map<bry<?>, brz> a;
   private final Set<bry<?>> b;
   private final blc.a c;
   private final blc.b d;
   private final bmw<bkp<? super E>> e = new bmw<>();
   private bko.a f = bko.a.a;

   public blc(Map<bry<?>, brz> $$0, Set<bry<?>> $$1, blc.a $$2, blc.b $$3, List<Pair<? extends bkp<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bkp<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bko.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bry<?>, brz> $$1 : this.a.entrySet()) {
         bry<?> $$2 = $$1.getKey();
         brz $$3 = $$1.getValue();
         if (!$$0.dM().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aki $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bko.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aki $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bko.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bko.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aki $$0, E $$1, long $$2) {
      this.f = bko.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bko.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dM()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bkp<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bko.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bmw::a);

      private final Consumer<bmw<?>> c;

      private a(Consumer<bmw<?>> $$0) {
         this.c = $$0;
      }

      public void a(bmw<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends biw> void a(Stream<bkp<? super E>> $$0, aki $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bko.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends biw> void a(Stream<bkp<? super E>> $$0, aki $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bko.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends biw> void a(Stream<bkp<? super E>> var1, aki var2, E var3, long var4);
   }
}
