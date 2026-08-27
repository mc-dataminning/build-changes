import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public final class cwm implements Iterable<ctq> {
   private static final int d = 256;
   public static final cwm a = new cwm(jg.a());
   public static final Codec<cwm> b = cwm.a.a.sizeLimitedListOf(256).xmap(cwm::b, cwm::c);
   public static final yv<wi, cwm> c = ctq.e.a(yt.c(256)).a(cwm::new, $$0 -> $$0.e);
   private final jg<ctq> e;

   private cwm(jg<ctq> $$0) {
      this.e = $$0;
   }

   private cwm(int $$0) {
      this(jg.a($$0, ctq.i));
   }

   private cwm(List<ctq> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.e.set($$1, $$0.get($$1));
      }
   }

   private static cwm b(List<cwm.a> $$0) {
      int $$1 = $$0.stream().mapToInt(cwm.a::a).max().orElse(-1);
      cwm $$2 = new cwm($$1 + 1);

      for (cwm.a $$3 : $$0) {
         $$2.e.set($$3.a(), $$3.b());
      }

      return $$2;
   }

   public static cwm a(List<ctq> $$0) {
      int $$1 = c($$0);
      if ($$1 == 0) {
         return a;
      } else {
         cwm $$2 = new cwm($$1);

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$2.e.set($$3, $$0.get($$3).s());
         }

         return $$2;
      }
   }

   private static int c(List<ctq> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).e()) {
            return $$1 + 1;
         }
      }

      return 0;
   }

   private List<cwm.a> c() {
      List<cwm.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         ctq $$2 = this.e.get($$1);
         if (!$$2.e()) {
            $$0.add(new cwm.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jg<ctq> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ctq $$2 = $$1 < this.e.size() ? this.e.get($$1) : ctq.i;
         $$0.set($$1, $$2.s());
      }
   }

   public ctq a() {
      return this.e.isEmpty() ? ctq.i : this.e.get(0).s();
   }

   public Stream<ctq> b() {
      return this.e.stream().filter($$0 -> !$$0.e()).map(ctq::s);
   }

   @Override
   public Iterator<ctq> iterator() {
      return Iterators.transform(Iterators.filter(this.e.iterator(), $$0 -> !$$0.e()), ctq::s);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cwm $$1 && ctq.a(this.e, $$1.e)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return ctq.a(this.e);
   }

   static record a(int b, ctq c) {
      public static final Codec<cwm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cwm.a::a), ctq.a.fieldOf("item").forGetter(cwm.a::b)).apply($$0, cwm.a::new)
      );

      public int a() {
         return this.b;
      }

      public ctq b() {
         return this.c;
      }
   }
}
