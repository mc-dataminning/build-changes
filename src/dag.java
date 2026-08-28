import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class dag {
   private static final int d = -1;
   private static final int e = 256;
   public static final dag a = new dag(jz.a());
   public static final Codec<dag> b = dag.a.a.sizeLimitedListOf(256).xmap(dag::b, dag::f);
   public static final zt<xg, dag> c = cxo.g.a(zr.c(256)).a(dag::new, $$0 -> $$0.f);
   private final jz<cxo> f;
   private final int g;

   private dag(jz<cxo> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cxo.a($$0);
      }
   }

   private dag(int $$0) {
      this(jz.a($$0, cxo.j));
   }

   private dag(List<cxo> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static dag b(List<dag.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(dag.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         dag $$2 = new dag($$1.getAsInt() + 1);

         for (dag.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static dag a(List<cxo> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         dag $$2 = new dag($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cxo> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<dag.a> f() {
      List<dag.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cxo $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new dag.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jz<cxo> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cxo $$2 = $$1 < this.f.size() ? this.f.get($$1) : cxo.j;
         $$0.set($$1, $$2.v());
      }
   }

   public cxo a() {
      return this.f.isEmpty() ? cxo.j : this.f.get(0).v();
   }

   public Stream<cxo> b() {
      return this.f.stream().map(cxo::v);
   }

   public Stream<cxo> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cxo::v);
   }

   public Iterable<cxo> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cxo> e() {
      return Iterables.transform(this.d(), cxo::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dag $$1 && cxo.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cxo c) {
      public static final Codec<dag.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(dag.a::a), cxo.a.fieldOf("item").forGetter(dag.a::b)).apply($$0, dag.a::new)
      );

      public int a() {
         return this.b;
      }

      public cxo b() {
         return this.c;
      }
   }
}
