import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class czy {
   private static final int d = -1;
   private static final int e = 256;
   public static final czy a = new czy(jz.a());
   public static final Codec<czy> b = czy.a.a.sizeLimitedListOf(256).xmap(czy::b, czy::f);
   public static final zi<wv, czy> c = cxg.g.a(zg.c(256)).a(czy::new, $$0 -> $$0.f);
   private final jz<cxg> f;
   private final int g;

   private czy(jz<cxg> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cxg.a($$0);
      }
   }

   private czy(int $$0) {
      this(jz.a($$0, cxg.j));
   }

   private czy(List<cxg> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static czy b(List<czy.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(czy.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         czy $$2 = new czy($$1.getAsInt() + 1);

         for (czy.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static czy a(List<cxg> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         czy $$2 = new czy($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cxg> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<czy.a> f() {
      List<czy.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cxg $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new czy.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jz<cxg> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cxg $$2 = $$1 < this.f.size() ? this.f.get($$1) : cxg.j;
         $$0.set($$1, $$2.v());
      }
   }

   public cxg a() {
      return this.f.isEmpty() ? cxg.j : this.f.get(0).v();
   }

   public Stream<cxg> b() {
      return this.f.stream().map(cxg::v);
   }

   public Stream<cxg> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cxg::v);
   }

   public Iterable<cxg> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cxg> e() {
      return Iterables.transform(this.d(), cxg::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof czy $$1 && cxg.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cxg c) {
      public static final Codec<czy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(czy.a::a), cxg.a.fieldOf("item").forGetter(czy.a::b)).apply($$0, czy.a::new)
      );

      public int a() {
         return this.b;
      }

      public cxg b() {
         return this.c;
      }
   }
}
