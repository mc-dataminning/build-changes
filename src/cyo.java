import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class cyo {
   private static final int d = -1;
   private static final int e = 256;
   public static final cyo a = new cyo(jx.a());
   public static final Codec<cyo> b = cyo.a.a.sizeLimitedListOf(256).xmap(cyo::b, cyo::f);
   public static final zc<wp, cyo> c = cvs.h.a(za.c(256)).a(cyo::new, $$0 -> $$0.f);
   private final jx<cvs> f;
   private final int g;

   private cyo(jx<cvs> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cvs.a($$0);
      }
   }

   private cyo(int $$0) {
      this(jx.a($$0, cvs.k));
   }

   private cyo(List<cvs> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static cyo b(List<cyo.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(cyo.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         cyo $$2 = new cyo($$1.getAsInt() + 1);

         for (cyo.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static cyo a(List<cvs> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         cyo $$2 = new cyo($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).u());
         }

         return $$2;
      }
   }

   private static int c(List<cvs> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<cyo.a> f() {
      List<cyo.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cvs $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new cyo.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jx<cvs> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cvs $$2 = $$1 < this.f.size() ? this.f.get($$1) : cvs.k;
         $$0.set($$1, $$2.u());
      }
   }

   public cvs a() {
      return this.f.isEmpty() ? cvs.k : this.f.get(0).u();
   }

   public Stream<cvs> b() {
      return this.f.stream().map(cvs::u);
   }

   public Stream<cvs> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cvs::u);
   }

   public Iterable<cvs> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cvs> e() {
      return Iterables.transform(this.d(), cvs::u);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cyo $$1 && cvs.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cvs c) {
      public static final Codec<cyo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cyo.a::a), cvs.b.fieldOf("item").forGetter(cyo.a::b)).apply($$0, cyo.a::new)
      );

      public int a() {
         return this.b;
      }

      public cvs b() {
         return this.c;
      }
   }
}
