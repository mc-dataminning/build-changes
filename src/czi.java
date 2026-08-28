import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class czi {
   private static final int d = -1;
   private static final int e = 256;
   public static final czi a = new czi(ka.a());
   public static final Codec<czi> b = czi.a.a.sizeLimitedListOf(256).xmap(czi::b, czi::f);
   public static final yn<wa, czi> c = cwq.g.a(yl.c(256)).a(czi::new, $$0 -> $$0.f);
   private final ka<cwq> f;
   private final int g;

   private czi(ka<cwq> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cwq.a($$0);
      }
   }

   private czi(int $$0) {
      this(ka.a($$0, cwq.j));
   }

   private czi(List<cwq> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static czi b(List<czi.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(czi.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         czi $$2 = new czi($$1.getAsInt() + 1);

         for (czi.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static czi a(List<cwq> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         czi $$2 = new czi($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cwq> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<czi.a> f() {
      List<czi.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cwq $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new czi.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(ka<cwq> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cwq $$2 = $$1 < this.f.size() ? this.f.get($$1) : cwq.j;
         $$0.set($$1, $$2.v());
      }
   }

   public cwq a() {
      return this.f.isEmpty() ? cwq.j : this.f.get(0).v();
   }

   public Stream<cwq> b() {
      return this.f.stream().map(cwq::v);
   }

   public Stream<cwq> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cwq::v);
   }

   public Iterable<cwq> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cwq> e() {
      return Iterables.transform(this.d(), cwq::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof czi $$1 && cwq.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cwq c) {
      public static final Codec<czi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(czi.a::a), cwq.a.fieldOf("item").forGetter(czi.a::b)).apply($$0, czi.a::new)
      );

      public int a() {
         return this.b;
      }

      public cwq b() {
         return this.c;
      }
   }
}
