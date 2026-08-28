import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class cyh {
   private static final int d = -1;
   private static final int e = 256;
   public static final cyh a = new cyh(jw.a());
   public static final Codec<cyh> b = cyh.a.a.sizeLimitedListOf(256).xmap(cyh::b, cyh::f);
   public static final zb<wo, cyh> c = cvl.h.a(yz.c(256)).a(cyh::new, $$0 -> $$0.f);
   private final jw<cvl> f;
   private final int g;

   private cyh(jw<cvl> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cvl.a($$0);
      }
   }

   private cyh(int $$0) {
      this(jw.a($$0, cvl.k));
   }

   private cyh(List<cvl> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static cyh b(List<cyh.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(cyh.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         cyh $$2 = new cyh($$1.getAsInt() + 1);

         for (cyh.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static cyh a(List<cvl> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         cyh $$2 = new cyh($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).u());
         }

         return $$2;
      }
   }

   private static int c(List<cvl> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<cyh.a> f() {
      List<cyh.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cvl $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new cyh.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jw<cvl> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cvl $$2 = $$1 < this.f.size() ? this.f.get($$1) : cvl.k;
         $$0.set($$1, $$2.u());
      }
   }

   public cvl a() {
      return this.f.isEmpty() ? cvl.k : this.f.get(0).u();
   }

   public Stream<cvl> b() {
      return this.f.stream().map(cvl::u);
   }

   public Stream<cvl> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cvl::u);
   }

   public Iterable<cvl> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cvl> e() {
      return Iterables.transform(this.d(), cvl::u);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyh $$1 && cvl.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cvl c) {
      public static final Codec<cyh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cyh.a::a), cvl.b.fieldOf("item").forGetter(cyh.a::b)).apply($$0, cyh.a::new)
      );

      public int a() {
         return this.b;
      }

      public cvl b() {
         return this.c;
      }
   }
}
