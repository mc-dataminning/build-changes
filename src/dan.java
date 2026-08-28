import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class dan {
   private static final int d = -1;
   private static final int e = 256;
   public static final dan a = new dan(kb.a());
   public static final Codec<dan> b = dan.a.a.sizeLimitedListOf(256).xmap(dan::b, dan::f);
   public static final yt<wg, dan> c = cxy.h.a(yr.c(256)).a(dan::new, $$0 -> $$0.f);
   private final kb<cxy> f;
   private final int g;

   private dan(kb<cxy> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cxy.a($$0);
      }
   }

   private dan(int $$0) {
      this(kb.a($$0, cxy.k));
   }

   private dan(List<cxy> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static dan b(List<dan.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(dan.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         dan $$2 = new dan($$1.getAsInt() + 1);

         for (dan.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static dan a(List<cxy> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         dan $$2 = new dan($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cxy> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<dan.a> f() {
      List<dan.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cxy $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new dan.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(kb<cxy> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cxy $$2 = $$1 < this.f.size() ? this.f.get($$1) : cxy.k;
         $$0.set($$1, $$2.v());
      }
   }

   public cxy a() {
      return this.f.isEmpty() ? cxy.k : this.f.get(0).v();
   }

   public Stream<cxy> b() {
      return this.f.stream().map(cxy::v);
   }

   public Stream<cxy> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cxy::v);
   }

   public Iterable<cxy> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cxy> e() {
      return Iterables.transform(this.d(), cxy::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dan $$1 && cxy.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cxy c) {
      public static final Codec<dan.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(dan.a::a), cxy.b.fieldOf("item").forGetter(dan.a::b)).apply($$0, dan.a::new)
      );

      public int a() {
         return this.b;
      }

      public cxy b() {
         return this.c;
      }
   }
}
