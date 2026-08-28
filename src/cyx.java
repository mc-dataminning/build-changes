import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class cyx {
   private static final int d = -1;
   private static final int e = 256;
   public static final cyx a = new cyx(jz.a());
   public static final Codec<cyx> b = cyx.a.a.sizeLimitedListOf(256).xmap(cyx::b, cyx::f);
   public static final zj<ww, cyx> c = cwf.h.a(zh.c(256)).a(cyx::new, $$0 -> $$0.f);
   private final jz<cwf> f;
   private final int g;

   private cyx(jz<cwf> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cwf.a($$0);
      }
   }

   private cyx(int $$0) {
      this(jz.a($$0, cwf.k));
   }

   private cyx(List<cwf> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static cyx b(List<cyx.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(cyx.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         cyx $$2 = new cyx($$1.getAsInt() + 1);

         for (cyx.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static cyx a(List<cwf> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         cyx $$2 = new cyx($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cwf> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<cyx.a> f() {
      List<cyx.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cwf $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new cyx.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jz<cwf> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cwf $$2 = $$1 < this.f.size() ? this.f.get($$1) : cwf.k;
         $$0.set($$1, $$2.v());
      }
   }

   public cwf a() {
      return this.f.isEmpty() ? cwf.k : this.f.get(0).v();
   }

   public Stream<cwf> b() {
      return this.f.stream().map(cwf::v);
   }

   public Stream<cwf> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cwf::v);
   }

   public Iterable<cwf> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cwf> e() {
      return Iterables.transform(this.d(), cwf::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyx $$1 && cwf.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cwf c) {
      public static final Codec<cyx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cyx.a::a), cwf.b.fieldOf("item").forGetter(cyx.a::b)).apply($$0, cyx.a::new)
      );

      public int a() {
         return this.b;
      }

      public cwf b() {
         return this.c;
      }
   }
}
