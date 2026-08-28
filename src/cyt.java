import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class cyt {
   private static final int d = -1;
   private static final int e = 256;
   public static final cyt a = new cyt(jz.a());
   public static final Codec<cyt> b = cyt.a.a.sizeLimitedListOf(256).xmap(cyt::b, cyt::f);
   public static final zg<wt, cyt> c = cwb.h.a(ze.c(256)).a(cyt::new, $$0 -> $$0.f);
   private final jz<cwb> f;
   private final int g;

   private cyt(jz<cwb> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cwb.a($$0);
      }
   }

   private cyt(int $$0) {
      this(jz.a($$0, cwb.k));
   }

   private cyt(List<cwb> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static cyt b(List<cyt.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(cyt.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         cyt $$2 = new cyt($$1.getAsInt() + 1);

         for (cyt.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static cyt a(List<cwb> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         cyt $$2 = new cyt($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cwb> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<cyt.a> f() {
      List<cyt.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cwb $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new cyt.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jz<cwb> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cwb $$2 = $$1 < this.f.size() ? this.f.get($$1) : cwb.k;
         $$0.set($$1, $$2.v());
      }
   }

   public cwb a() {
      return this.f.isEmpty() ? cwb.k : this.f.get(0).v();
   }

   public Stream<cwb> b() {
      return this.f.stream().map(cwb::v);
   }

   public Stream<cwb> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cwb::v);
   }

   public Iterable<cwb> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cwb> e() {
      return Iterables.transform(this.d(), cwb::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyt $$1 && cwb.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cwb c) {
      public static final Codec<cyt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cyt.a::a), cwb.b.fieldOf("item").forGetter(cyt.a::b)).apply($$0, cyt.a::new)
      );

      public int a() {
         return this.b;
      }

      public cwb b() {
         return this.c;
      }
   }
}
