import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class cwx {
   private static final int d = -1;
   private static final int e = 256;
   public static final cwx a = new cwx(js.a());
   public static final Codec<cwx> b = cwx.a.a.sizeLimitedListOf(256).xmap(cwx::b, cwx::f);
   public static final ys<wf, cwx> c = cuc.h.a(yq.c(256)).a(cwx::new, $$0 -> $$0.f);
   private final js<cuc> f;
   private final int g;

   private cwx(js<cuc> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cuc.a($$0);
      }
   }

   private cwx(int $$0) {
      this(js.a($$0, cuc.l));
   }

   private cwx(List<cuc> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static cwx b(List<cwx.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(cwx.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         cwx $$2 = new cwx($$1.getAsInt() + 1);

         for (cwx.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static cwx a(List<cuc> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         cwx $$2 = new cwx($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).s());
         }

         return $$2;
      }
   }

   private static int c(List<cuc> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).e()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<cwx.a> f() {
      List<cwx.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cuc $$2 = this.f.get($$1);
         if (!$$2.e()) {
            $$0.add(new cwx.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(js<cuc> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cuc $$2 = $$1 < this.f.size() ? this.f.get($$1) : cuc.l;
         $$0.set($$1, $$2.s());
      }
   }

   public cuc a() {
      return this.f.isEmpty() ? cuc.l : this.f.get(0).s();
   }

   public Stream<cuc> b() {
      return this.f.stream().map(cuc::s);
   }

   public Stream<cuc> c() {
      return this.f.stream().filter($$0 -> !$$0.e()).map(cuc::s);
   }

   public Iterable<cuc> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.e());
   }

   public Iterable<cuc> e() {
      return Iterables.transform(this.d(), cuc::s);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cwx $$1 && cuc.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cuc c) {
      public static final Codec<cwx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cwx.a::a), cuc.b.fieldOf("item").forGetter(cwx.a::b)).apply($$0, cwx.a::new)
      );

      public int a() {
         return this.b;
      }

      public cuc b() {
         return this.c;
      }
   }
}
