import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class cxn {
   private static final int d = -1;
   private static final int e = 256;
   public static final cxn a = new cxn(jr.a());
   public static final Codec<cxn> b = cxn.a.a.sizeLimitedListOf(256).xmap(cxn::b, cxn::f);
   public static final zn<xa, cxn> c = cur.h.a(zl.c(256)).a(cxn::new, $$0 -> $$0.f);
   private final jr<cur> f;
   private final int g;

   private cxn(jr<cur> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cur.a($$0);
      }
   }

   private cxn(int $$0) {
      this(jr.a($$0, cur.l));
   }

   private cxn(List<cur> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static cxn b(List<cxn.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(cxn.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         cxn $$2 = new cxn($$1.getAsInt() + 1);

         for (cxn.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static cxn a(List<cur> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         cxn $$2 = new cxn($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).s());
         }

         return $$2;
      }
   }

   private static int c(List<cur> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).e()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<cxn.a> f() {
      List<cxn.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cur $$2 = this.f.get($$1);
         if (!$$2.e()) {
            $$0.add(new cxn.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jr<cur> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cur $$2 = $$1 < this.f.size() ? this.f.get($$1) : cur.l;
         $$0.set($$1, $$2.s());
      }
   }

   public cur a() {
      return this.f.isEmpty() ? cur.l : this.f.get(0).s();
   }

   public Stream<cur> b() {
      return this.f.stream().map(cur::s);
   }

   public Stream<cur> c() {
      return this.f.stream().filter($$0 -> !$$0.e()).map(cur::s);
   }

   public Iterable<cur> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.e());
   }

   public Iterable<cur> e() {
      return Iterables.transform(this.d(), cur::s);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxn $$1 && cur.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cur c) {
      public static final Codec<cxn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cxn.a::a), cur.b.fieldOf("item").forGetter(cxn.a::b)).apply($$0, cxn.a::new)
      );

      public int a() {
         return this.b;
      }

      public cur b() {
         return this.c;
      }
   }
}
