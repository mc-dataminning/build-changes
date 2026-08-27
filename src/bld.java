import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bld<E extends biy> implements bkq<E> {
   private final Map<brz<?>, bsa> a;
   private final Set<brz<?>> b;
   private final bld.a c;
   private final bld.b d;
   private final bmx<bkq<? super E>> e = new bmx<>();
   private bkp.a f = bkp.a.a;

   public bld(Map<brz<?>, bsa> $$0, Set<brz<?>> $$1, bld.a $$2, bld.b $$3, List<Pair<? extends bkq<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bkq<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bkp.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<brz<?>, bsa> $$1 : this.a.entrySet()) {
         brz<?> $$2 = $$1.getKey();
         bsa $$3 = $$1.getValue();
         if (!$$0.dM().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(akk $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bkp.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(akk $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bkp.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bkp.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(akk $$0, E $$1, long $$2) {
      this.f = bkp.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bkp.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dM()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bkq<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bkp.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bmx::a);

      private final Consumer<bmx<?>> c;

      private a(Consumer<bmx<?>> $$0) {
         this.c = $$0;
      }

      public void a(bmx<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends biy> void a(Stream<bkq<? super E>> $$0, akk $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bkp.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends biy> void a(Stream<bkq<? super E>> $$0, akk $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bkp.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends biy> void a(Stream<bkq<? super E>> var1, akk var2, E var3, long var4);
   }
}
