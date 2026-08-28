import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class czg {
   private static final int d = -1;
   private static final int e = 256;
   public static final czg a = new czg(ka.a());
   public static final Codec<czg> b = czg.a.a.sizeLimitedListOf(256).xmap(czg::b, czg::f);
   public static final yn<wa, czg> c = cwo.g.a(yl.c(256)).a(czg::new, $$0 -> $$0.f);
   private final ka<cwo> f;
   private final int g;

   private czg(ka<cwo> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cwo.a($$0);
      }
   }

   private czg(int $$0) {
      this(ka.a($$0, cwo.j));
   }

   private czg(List<cwo> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static czg b(List<czg.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(czg.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         czg $$2 = new czg($$1.getAsInt() + 1);

         for (czg.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static czg a(List<cwo> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         czg $$2 = new czg($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cwo> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<czg.a> f() {
      List<czg.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cwo $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new czg.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(ka<cwo> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cwo $$2 = $$1 < this.f.size() ? this.f.get($$1) : cwo.j;
         $$0.set($$1, $$2.v());
      }
   }

   public cwo a() {
      return this.f.isEmpty() ? cwo.j : this.f.get(0).v();
   }

   public Stream<cwo> b() {
      return this.f.stream().map(cwo::v);
   }

   public Stream<cwo> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cwo::v);
   }

   public Iterable<cwo> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cwo> e() {
      return Iterables.transform(this.d(), cwo::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof czg $$1 && cwo.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cwo c) {
      public static final Codec<czg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(czg.a::a), cwo.a.fieldOf("item").forGetter(czg.a::b)).apply($$0, czg.a::new)
      );

      public int a() {
         return this.b;
      }

      public cwo b() {
         return this.c;
      }
   }
}
