import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class czh {
   private static final int d = -1;
   private static final int e = 256;
   public static final czh a = new czh(ka.a());
   public static final Codec<czh> b = czh.a.a.sizeLimitedListOf(256).xmap(czh::b, czh::f);
   public static final ym<vz, czh> c = cwp.g.a(yk.c(256)).a(czh::new, $$0 -> $$0.f);
   private final ka<cwp> f;
   private final int g;

   private czh(ka<cwp> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cwp.a($$0);
      }
   }

   private czh(int $$0) {
      this(ka.a($$0, cwp.j));
   }

   private czh(List<cwp> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static czh b(List<czh.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(czh.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         czh $$2 = new czh($$1.getAsInt() + 1);

         for (czh.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static czh a(List<cwp> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         czh $$2 = new czh($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cwp> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<czh.a> f() {
      List<czh.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cwp $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new czh.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(ka<cwp> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cwp $$2 = $$1 < this.f.size() ? this.f.get($$1) : cwp.j;
         $$0.set($$1, $$2.v());
      }
   }

   public cwp a() {
      return this.f.isEmpty() ? cwp.j : this.f.get(0).v();
   }

   public Stream<cwp> b() {
      return this.f.stream().map(cwp::v);
   }

   public Stream<cwp> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cwp::v);
   }

   public Iterable<cwp> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cwp> e() {
      return Iterables.transform(this.d(), cwp::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof czh $$1 && cwp.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cwp c) {
      public static final Codec<czh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(czh.a::a), cwp.a.fieldOf("item").forGetter(czh.a::b)).apply($$0, czh.a::new)
      );

      public int a() {
         return this.b;
      }

      public cwp b() {
         return this.c;
      }
   }
}
