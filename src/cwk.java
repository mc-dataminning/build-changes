import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public final class cwk implements Iterable<cto> {
   private static final int d = 256;
   public static final cwk a = new cwk(jg.a());
   public static final Codec<cwk> b = cwk.a.a.sizeLimitedListOf(256).xmap(cwk::b, cwk::c);
   public static final yv<wi, cwk> c = cto.e.a(yt.c(256)).a(cwk::new, $$0 -> $$0.e);
   private final jg<cto> e;

   private cwk(jg<cto> $$0) {
      this.e = $$0;
   }

   private cwk(int $$0) {
      this(jg.a($$0, cto.i));
   }

   private cwk(List<cto> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.e.set($$1, $$0.get($$1));
      }
   }

   private static cwk b(List<cwk.a> $$0) {
      int $$1 = $$0.stream().mapToInt(cwk.a::a).max().orElse(-1);
      cwk $$2 = new cwk($$1 + 1);

      for (cwk.a $$3 : $$0) {
         $$2.e.set($$3.a(), $$3.b());
      }

      return $$2;
   }

   public static cwk a(List<cto> $$0) {
      int $$1 = c($$0);
      if ($$1 == 0) {
         return a;
      } else {
         cwk $$2 = new cwk($$1);

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$2.e.set($$3, $$0.get($$3).s());
         }

         return $$2;
      }
   }

   private static int c(List<cto> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).e()) {
            return $$1 + 1;
         }
      }

      return 0;
   }

   private List<cwk.a> c() {
      List<cwk.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         cto $$2 = this.e.get($$1);
         if (!$$2.e()) {
            $$0.add(new cwk.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jg<cto> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cto $$2 = $$1 < this.e.size() ? this.e.get($$1) : cto.i;
         $$0.set($$1, $$2.s());
      }
   }

   public cto a() {
      return this.e.isEmpty() ? cto.i : this.e.get(0).s();
   }

   public Stream<cto> b() {
      return this.e.stream().filter($$0 -> !$$0.e()).map(cto::s);
   }

   @Override
   public Iterator<cto> iterator() {
      return Iterators.transform(Iterators.filter(this.e.iterator(), $$0 -> !$$0.e()), cto::s);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cwk $$1 && cto.a(this.e, $$1.e)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cto.a(this.e);
   }

   static record a(int b, cto c) {
      public static final Codec<cwk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cwk.a::a), cto.a.fieldOf("item").forGetter(cwk.a::b)).apply($$0, cwk.a::new)
      );

      public int a() {
         return this.b;
      }

      public cto b() {
         return this.c;
      }
   }
}
