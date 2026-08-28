import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class cze {
   private static final int d = -1;
   private static final int e = 256;
   public static final cze a = new cze(jz.a());
   public static final Codec<cze> b = cze.a.a.sizeLimitedListOf(256).xmap(cze::b, cze::f);
   public static final zh<wu, cze> c = cwm.h.a(zf.c(256)).a(cze::new, $$0 -> $$0.f);
   private final jz<cwm> f;
   private final int g;

   private cze(jz<cwm> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cwm.a($$0);
      }
   }

   private cze(int $$0) {
      this(jz.a($$0, cwm.k));
   }

   private cze(List<cwm> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static cze b(List<cze.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(cze.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         cze $$2 = new cze($$1.getAsInt() + 1);

         for (cze.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static cze a(List<cwm> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         cze $$2 = new cze($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cwm> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<cze.a> f() {
      List<cze.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cwm $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new cze.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jz<cwm> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cwm $$2 = $$1 < this.f.size() ? this.f.get($$1) : cwm.k;
         $$0.set($$1, $$2.v());
      }
   }

   public cwm a() {
      return this.f.isEmpty() ? cwm.k : this.f.get(0).v();
   }

   public Stream<cwm> b() {
      return this.f.stream().map(cwm::v);
   }

   public Stream<cwm> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cwm::v);
   }

   public Iterable<cwm> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cwm> e() {
      return Iterables.transform(this.d(), cwm::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cze $$1 && cwm.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cwm c) {
      public static final Codec<cze.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cze.a::a), cwm.b.fieldOf("item").forGetter(cze.a::b)).apply($$0, cze.a::new)
      );

      public int a() {
         return this.b;
      }

      public cwm b() {
         return this.c;
      }
   }
}
