import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class cyl {
   private static final int d = -1;
   private static final int e = 256;
   public static final cyl a = new cyl(jw.a());
   public static final Codec<cyl> b = cyl.a.a.sizeLimitedListOf(256).xmap(cyl::b, cyl::f);
   public static final zb<wo, cyl> c = cvp.h.a(yz.c(256)).a(cyl::new, $$0 -> $$0.f);
   private final jw<cvp> f;
   private final int g;

   private cyl(jw<cvp> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cvp.a($$0);
      }
   }

   private cyl(int $$0) {
      this(jw.a($$0, cvp.k));
   }

   private cyl(List<cvp> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static cyl b(List<cyl.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(cyl.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         cyl $$2 = new cyl($$1.getAsInt() + 1);

         for (cyl.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static cyl a(List<cvp> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         cyl $$2 = new cyl($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).u());
         }

         return $$2;
      }
   }

   private static int c(List<cvp> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<cyl.a> f() {
      List<cyl.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cvp $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new cyl.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jw<cvp> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cvp $$2 = $$1 < this.f.size() ? this.f.get($$1) : cvp.k;
         $$0.set($$1, $$2.u());
      }
   }

   public cvp a() {
      return this.f.isEmpty() ? cvp.k : this.f.get(0).u();
   }

   public Stream<cvp> b() {
      return this.f.stream().map(cvp::u);
   }

   public Stream<cvp> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cvp::u);
   }

   public Iterable<cvp> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cvp> e() {
      return Iterables.transform(this.d(), cvp::u);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyl $$1 && cvp.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cvp c) {
      public static final Codec<cyl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cyl.a::a), cvp.b.fieldOf("item").forGetter(cyl.a::b)).apply($$0, cyl.a::new)
      );

      public int a() {
         return this.b;
      }

      public cvp b() {
         return this.c;
      }
   }
}
