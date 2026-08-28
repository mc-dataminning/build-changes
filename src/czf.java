import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class czf {
   private static final int d = -1;
   private static final int e = 256;
   public static final czf a = new czf(ka.a());
   public static final Codec<czf> b = czf.a.a.sizeLimitedListOf(256).xmap(czf::b, czf::f);
   public static final ym<vz, czf> c = cwn.g.a(yk.c(256)).a(czf::new, $$0 -> $$0.f);
   private final ka<cwn> f;
   private final int g;

   private czf(ka<cwn> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cwn.a($$0);
      }
   }

   private czf(int $$0) {
      this(ka.a($$0, cwn.j));
   }

   private czf(List<cwn> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static czf b(List<czf.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(czf.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         czf $$2 = new czf($$1.getAsInt() + 1);

         for (czf.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static czf a(List<cwn> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         czf $$2 = new czf($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cwn> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<czf.a> f() {
      List<czf.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cwn $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new czf.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(ka<cwn> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cwn $$2 = $$1 < this.f.size() ? this.f.get($$1) : cwn.j;
         $$0.set($$1, $$2.v());
      }
   }

   public cwn a() {
      return this.f.isEmpty() ? cwn.j : this.f.get(0).v();
   }

   public Stream<cwn> b() {
      return this.f.stream().map(cwn::v);
   }

   public Stream<cwn> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cwn::v);
   }

   public Iterable<cwn> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cwn> e() {
      return Iterables.transform(this.d(), cwn::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof czf $$1 && cwn.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cwn c) {
      public static final Codec<czf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(czf.a::a), cwn.a.fieldOf("item").forGetter(czf.a::b)).apply($$0, czf.a::new)
      );

      public int a() {
         return this.b;
      }

      public cwn b() {
         return this.c;
      }
   }
}
