import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class cxg {
   private static final int d = -1;
   private static final int e = 256;
   public static final cxg a = new cxg(jr.a());
   public static final Codec<cxg> b = cxg.a.a.sizeLimitedListOf(256).xmap(cxg::b, cxg::f);
   public static final zj<ww, cxg> c = cuk.h.a(zh.c(256)).a(cxg::new, $$0 -> $$0.f);
   private final jr<cuk> f;

   private cxg(jr<cuk> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
      }
   }

   private cxg(int $$0) {
      this(jr.a($$0, cuk.l));
   }

   private cxg(List<cuk> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static cxg b(List<cxg.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(cxg.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         cxg $$2 = new cxg($$1.getAsInt() + 1);

         for (cxg.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static cxg a(List<cuk> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         cxg $$2 = new cxg($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).s());
         }

         return $$2;
      }
   }

   private static int c(List<cuk> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).e()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<cxg.a> f() {
      List<cxg.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cuk $$2 = this.f.get($$1);
         if (!$$2.e()) {
            $$0.add(new cxg.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jr<cuk> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cuk $$2 = $$1 < this.f.size() ? this.f.get($$1) : cuk.l;
         $$0.set($$1, $$2.s());
      }
   }

   public cuk a() {
      return this.f.isEmpty() ? cuk.l : this.f.get(0).s();
   }

   public Stream<cuk> b() {
      return this.f.stream().map(cuk::s);
   }

   public Stream<cuk> c() {
      return this.f.stream().filter($$0 -> !$$0.e()).map(cuk::s);
   }

   public Iterable<cuk> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.e());
   }

   public Iterable<cuk> e() {
      return Iterables.transform(this.d(), cuk::s);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxg $$1 && cuk.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cuk.a(this.f);
   }

   static record a(int b, cuk c) {
      public static final Codec<cxg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cxg.a::a), cuk.b.fieldOf("item").forGetter(cxg.a::b)).apply($$0, cxg.a::new)
      );

      public int a() {
         return this.b;
      }

      public cuk b() {
         return this.c;
      }
   }
}
