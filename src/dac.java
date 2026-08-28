import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class dac {
   private static final int d = -1;
   private static final int e = 256;
   public static final dac a = new dac(jz.a());
   public static final Codec<dac> b = dac.a.a.sizeLimitedListOf(256).xmap(dac::b, dac::f);
   public static final zt<xg, dac> c = cxk.h.a(zr.c(256)).a(dac::new, $$0 -> $$0.f);
   private final jz<cxk> f;
   private final int g;

   private dac(jz<cxk> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cxk.a($$0);
      }
   }

   private dac(int $$0) {
      this(jz.a($$0, cxk.k));
   }

   private dac(List<cxk> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static dac b(List<dac.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(dac.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         dac $$2 = new dac($$1.getAsInt() + 1);

         for (dac.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static dac a(List<cxk> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         dac $$2 = new dac($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cxk> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<dac.a> f() {
      List<dac.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cxk $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new dac.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jz<cxk> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cxk $$2 = $$1 < this.f.size() ? this.f.get($$1) : cxk.k;
         $$0.set($$1, $$2.v());
      }
   }

   public cxk a() {
      return this.f.isEmpty() ? cxk.k : this.f.get(0).v();
   }

   public Stream<cxk> b() {
      return this.f.stream().map(cxk::v);
   }

   public Stream<cxk> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cxk::v);
   }

   public Iterable<cxk> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cxk> e() {
      return Iterables.transform(this.d(), cxk::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dac $$1 && cxk.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cxk c) {
      public static final Codec<dac.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(dac.a::a), cxk.b.fieldOf("item").forGetter(dac.a::b)).apply($$0, dac.a::new)
      );

      public int a() {
         return this.b;
      }

      public cxk b() {
         return this.c;
      }
   }
}
