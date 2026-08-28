import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class dah {
   private static final int d = -1;
   private static final int e = 256;
   public static final dah a = new dah(jz.a());
   public static final Codec<dah> b = dah.a.a.sizeLimitedListOf(256).xmap(dah::b, dah::f);
   public static final zt<xg, dah> c = cxp.g.a(zr.c(256)).a(dah::new, $$0 -> $$0.f);
   private final jz<cxp> f;
   private final int g;

   private dah(jz<cxp> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cxp.a($$0);
      }
   }

   private dah(int $$0) {
      this(jz.a($$0, cxp.j));
   }

   private dah(List<cxp> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static dah b(List<dah.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(dah.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         dah $$2 = new dah($$1.getAsInt() + 1);

         for (dah.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static dah a(List<cxp> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         dah $$2 = new dah($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cxp> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<dah.a> f() {
      List<dah.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cxp $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new dah.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jz<cxp> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cxp $$2 = $$1 < this.f.size() ? this.f.get($$1) : cxp.j;
         $$0.set($$1, $$2.v());
      }
   }

   public cxp a() {
      return this.f.isEmpty() ? cxp.j : this.f.get(0).v();
   }

   public Stream<cxp> b() {
      return this.f.stream().map(cxp::v);
   }

   public Stream<cxp> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cxp::v);
   }

   public Iterable<cxp> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cxp> e() {
      return Iterables.transform(this.d(), cxp::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dah $$1 && cxp.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cxp c) {
      public static final Codec<dah.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(dah.a::a), cxp.a.fieldOf("item").forGetter(dah.a::b)).apply($$0, dah.a::new)
      );

      public int a() {
         return this.b;
      }

      public cxp b() {
         return this.c;
      }
   }
}
