import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class cxk {
   private static final int d = -1;
   private static final int e = 256;
   public static final cxk a = new cxk(jr.a());
   public static final Codec<cxk> b = cxk.a.a.sizeLimitedListOf(256).xmap(cxk::b, cxk::f);
   public static final zm<wz, cxk> c = cuo.h.a(zk.c(256)).a(cxk::new, $$0 -> $$0.f);
   private final jr<cuo> f;
   private final int g;

   private cxk(jr<cuo> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cuo.a($$0);
      }
   }

   private cxk(int $$0) {
      this(jr.a($$0, cuo.l));
   }

   private cxk(List<cuo> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static cxk b(List<cxk.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(cxk.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         cxk $$2 = new cxk($$1.getAsInt() + 1);

         for (cxk.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static cxk a(List<cuo> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         cxk $$2 = new cxk($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).s());
         }

         return $$2;
      }
   }

   private static int c(List<cuo> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).e()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<cxk.a> f() {
      List<cxk.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cuo $$2 = this.f.get($$1);
         if (!$$2.e()) {
            $$0.add(new cxk.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jr<cuo> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cuo $$2 = $$1 < this.f.size() ? this.f.get($$1) : cuo.l;
         $$0.set($$1, $$2.s());
      }
   }

   public cuo a() {
      return this.f.isEmpty() ? cuo.l : this.f.get(0).s();
   }

   public Stream<cuo> b() {
      return this.f.stream().map(cuo::s);
   }

   public Stream<cuo> c() {
      return this.f.stream().filter($$0 -> !$$0.e()).map(cuo::s);
   }

   public Iterable<cuo> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.e());
   }

   public Iterable<cuo> e() {
      return Iterables.transform(this.d(), cuo::s);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxk $$1 && cuo.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cuo c) {
      public static final Codec<cxk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cxk.a::a), cuo.b.fieldOf("item").forGetter(cxk.a::b)).apply($$0, cxk.a::new)
      );

      public int a() {
         return this.b;
      }

      public cuo b() {
         return this.c;
      }
   }
}
