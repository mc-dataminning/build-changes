import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class cwy {
   private static final int d = -1;
   private static final int e = 256;
   public static final cwy a = new cwy(js.a());
   public static final Codec<cwy> b = cwy.a.a.sizeLimitedListOf(256).xmap(cwy::b, cwy::f);
   public static final ys<wf, cwy> c = cud.h.a(yq.c(256)).a(cwy::new, $$0 -> $$0.f);
   private final js<cud> f;
   private final int g;

   private cwy(js<cud> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cud.a($$0);
      }
   }

   private cwy(int $$0) {
      this(js.a($$0, cud.l));
   }

   private cwy(List<cud> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static cwy b(List<cwy.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(cwy.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         cwy $$2 = new cwy($$1.getAsInt() + 1);

         for (cwy.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static cwy a(List<cud> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         cwy $$2 = new cwy($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).s());
         }

         return $$2;
      }
   }

   private static int c(List<cud> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).e()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<cwy.a> f() {
      List<cwy.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cud $$2 = this.f.get($$1);
         if (!$$2.e()) {
            $$0.add(new cwy.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(js<cud> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cud $$2 = $$1 < this.f.size() ? this.f.get($$1) : cud.l;
         $$0.set($$1, $$2.s());
      }
   }

   public cud a() {
      return this.f.isEmpty() ? cud.l : this.f.get(0).s();
   }

   public Stream<cud> b() {
      return this.f.stream().map(cud::s);
   }

   public Stream<cud> c() {
      return this.f.stream().filter($$0 -> !$$0.e()).map(cud::s);
   }

   public Iterable<cud> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.e());
   }

   public Iterable<cud> e() {
      return Iterables.transform(this.d(), cud::s);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cwy $$1 && cud.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cud c) {
      public static final Codec<cwy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cwy.a::a), cud.b.fieldOf("item").forGetter(cwy.a::b)).apply($$0, cwy.a::new)
      );

      public int a() {
         return this.b;
      }

      public cud b() {
         return this.c;
      }
   }
}
