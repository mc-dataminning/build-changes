import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class cyn {
   private static final int d = -1;
   private static final int e = 256;
   public static final cyn a = new cyn(jy.a());
   public static final Codec<cyn> b = cyn.a.a.sizeLimitedListOf(256).xmap(cyn::b, cyn::f);
   public static final zf<ws, cyn> c = cvx.h.a(zd.c(256)).a(cyn::new, $$0 -> $$0.f);
   private final jy<cvx> f;
   private final int g;

   private cyn(jy<cvx> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cvx.a($$0);
      }
   }

   private cyn(int $$0) {
      this(jy.a($$0, cvx.k));
   }

   private cyn(List<cvx> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static cyn b(List<cyn.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(cyn.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         cyn $$2 = new cyn($$1.getAsInt() + 1);

         for (cyn.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static cyn a(List<cvx> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         cyn $$2 = new cyn($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cvx> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<cyn.a> f() {
      List<cyn.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cvx $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new cyn.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jy<cvx> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cvx $$2 = $$1 < this.f.size() ? this.f.get($$1) : cvx.k;
         $$0.set($$1, $$2.v());
      }
   }

   public cvx a() {
      return this.f.isEmpty() ? cvx.k : this.f.get(0).v();
   }

   public Stream<cvx> b() {
      return this.f.stream().map(cvx::v);
   }

   public Stream<cvx> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cvx::v);
   }

   public Iterable<cvx> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cvx> e() {
      return Iterables.transform(this.d(), cvx::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyn $$1 && cvx.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cvx c) {
      public static final Codec<cyn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cyn.a::a), cvx.b.fieldOf("item").forGetter(cyn.a::b)).apply($$0, cyn.a::new)
      );

      public int a() {
         return this.b;
      }

      public cvx b() {
         return this.c;
      }
   }
}
