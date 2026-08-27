import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class btk<E extends bre> implements bsx<E> {
   private final Map<cah<?>, cai> a;
   private final Set<cah<?>> b;
   private final btk.a c;
   private final btk.b d;
   private final bvf<bsx<? super E>> e = new bvf<>();
   private bsw.a f = bsw.a.a;

   public btk(Map<cah<?>, cai> $$0, Set<cah<?>> $$1, btk.a $$2, btk.b $$3, List<Pair<? extends bsx<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bsx<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bsw.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cah<?>, cai> $$1 : this.a.entrySet()) {
         cah<?> $$2 = $$1.getKey();
         cai $$3 = $$1.getValue();
         if (!$$0.dQ().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aqe $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bsw.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqe $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bsw.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bsw.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aqe $$0, E $$1, long $$2) {
      this.f = bsw.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bsw.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dQ()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bsx<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bsw.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bvf::a);

      private final Consumer<bvf<?>> c;

      private a(Consumer<bvf<?>> $$0) {
         this.c = $$0;
      }

      public void a(bvf<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bre> void a(Stream<bsx<? super E>> $$0, aqe $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bsw.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bre> void a(Stream<bsx<? super E>> $$0, aqe $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bsw.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bre> void a(Stream<bsx<? super E>> var1, aqe var2, E var3, long var4);
   }
}
