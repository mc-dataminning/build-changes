import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class cxo {
   private static final int d = -1;
   private static final int e = 256;
   public static final cxo a = new cxo(jv.a());
   public static final Codec<cxo> b = cxo.a.a.sizeLimitedListOf(256).xmap(cxo::b, cxo::f);
   public static final yx<wk, cxo> c = cuq.h.a(yv.c(256)).a(cxo::new, $$0 -> $$0.f);
   private final jv<cuq> f;
   private final int g;

   private cxo(jv<cuq> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cuq.a($$0);
      }
   }

   private cxo(int $$0) {
      this(jv.a($$0, cuq.l));
   }

   private cxo(List<cuq> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static cxo b(List<cxo.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(cxo.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         cxo $$2 = new cxo($$1.getAsInt() + 1);

         for (cxo.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static cxo a(List<cuq> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         cxo $$2 = new cxo($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).s());
         }

         return $$2;
      }
   }

   private static int c(List<cuq> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).e()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<cxo.a> f() {
      List<cxo.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cuq $$2 = this.f.get($$1);
         if (!$$2.e()) {
            $$0.add(new cxo.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jv<cuq> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cuq $$2 = $$1 < this.f.size() ? this.f.get($$1) : cuq.l;
         $$0.set($$1, $$2.s());
      }
   }

   public cuq a() {
      return this.f.isEmpty() ? cuq.l : this.f.get(0).s();
   }

   public Stream<cuq> b() {
      return this.f.stream().map(cuq::s);
   }

   public Stream<cuq> c() {
      return this.f.stream().filter($$0 -> !$$0.e()).map(cuq::s);
   }

   public Iterable<cuq> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.e());
   }

   public Iterable<cuq> e() {
      return Iterables.transform(this.d(), cuq::s);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxo $$1 && cuq.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   static record a(int b, cuq c) {
      public static final Codec<cxo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cxo.a::a), cuq.b.fieldOf("item").forGetter(cxo.a::b)).apply($$0, cxo.a::new)
      );

      public int a() {
         return this.b;
      }

      public cuq b() {
         return this.c;
      }
   }
}
