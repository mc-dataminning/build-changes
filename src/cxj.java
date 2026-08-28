import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public final class cxj {
   private static final int d = -1;
   private static final int e = 256;
   public static final cxj a = new cxj(jr.a());
   public static final Codec<cxj> b = cxj.a.a.sizeLimitedListOf(256).xmap(cxj::b, cxj::f);
   public static final zm<wz, cxj> c = cun.h.a(zk.c(256)).a(cxj::new, $$0 -> $$0.f);
   private final jr<cun> f;

   private cxj(jr<cun> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
      }
   }

   private cxj(int $$0) {
      this(jr.a($$0, cun.l));
   }

   private cxj(List<cun> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static cxj b(List<cxj.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(cxj.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         cxj $$2 = new cxj($$1.getAsInt() + 1);

         for (cxj.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static cxj a(List<cun> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         cxj $$2 = new cxj($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).s());
         }

         return $$2;
      }
   }

   private static int c(List<cun> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).e()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<cxj.a> f() {
      List<cxj.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cun $$2 = this.f.get($$1);
         if (!$$2.e()) {
            $$0.add(new cxj.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jr<cun> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cun $$2 = $$1 < this.f.size() ? this.f.get($$1) : cun.l;
         $$0.set($$1, $$2.s());
      }
   }

   public cun a() {
      return this.f.isEmpty() ? cun.l : this.f.get(0).s();
   }

   public Stream<cun> b() {
      return this.f.stream().map(cun::s);
   }

   public Stream<cun> c() {
      return this.f.stream().filter($$0 -> !$$0.e()).map(cun::s);
   }

   public Iterable<cun> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.e());
   }

   public Iterable<cun> e() {
      return Iterables.transform(this.d(), cun::s);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxj $$1 && cun.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cun.a(this.f);
   }

   static record a(int b, cun c) {
      public static final Codec<cxj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cxj.a::a), cun.b.fieldOf("item").forGetter(cxj.a::b)).apply($$0, cxj.a::new)
      );

      public int a() {
         return this.b;
      }

      public cun b() {
         return this.c;
      }
   }
}
