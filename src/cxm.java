import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public final class cxm implements Iterable<cuh> {
   private static final int d = 256;
   public static final cxm a = new cxm(jj.a());
   public static final Codec<cxm> b = axu.a(cxm.a.a.listOf(), 256).xmap(cxm::b, cxm::c);
   public static final zc<wp, cxm> c = cuh.e.a(za.c(256)).a(cxm::new, $$0 -> $$0.e);
   private final jj<cuh> e;

   private cxm(jj<cuh> $$0) {
      this.e = $$0;
   }

   private cxm(int $$0) {
      this(jj.a($$0, cuh.i));
   }

   private cxm(List<cuh> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.e.set($$1, $$0.get($$1));
      }
   }

   private static cxm b(List<cxm.a> $$0) {
      int $$1 = $$0.stream().mapToInt(cxm.a::a).max().orElse(-1);
      cxm $$2 = new cxm($$1 + 1);

      for (cxm.a $$3 : $$0) {
         $$2.e.set($$3.a(), $$3.b());
      }

      return $$2;
   }

   public static cxm a(List<cuh> $$0) {
      int $$1 = c($$0);
      if ($$1 == 0) {
         return a;
      } else {
         cxm $$2 = new cxm($$1);

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$2.e.set($$3, $$0.get($$3).r());
         }

         return $$2;
      }
   }

   private static int c(List<cuh> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).d()) {
            return $$1 + 1;
         }
      }

      return 0;
   }

   private List<cxm.a> c() {
      List<cxm.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         cuh $$2 = this.e.get($$1);
         if (!$$2.d()) {
            $$0.add(new cxm.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jj<cuh> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cuh $$2 = $$1 < this.e.size() ? this.e.get($$1) : cuh.i;
         $$0.set($$1, $$2.r());
      }
   }

   public cuh a() {
      return this.e.isEmpty() ? cuh.i : this.e.get(0).r();
   }

   public Stream<cuh> b() {
      return this.e.stream().filter($$0 -> !$$0.d()).map(cuh::r);
   }

   @Override
   public Iterator<cuh> iterator() {
      return Iterators.transform(Iterators.filter(this.e.iterator(), $$0 -> !$$0.d()), cuh::r);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cxm $$1 && cuh.a(this.e, $$1.e)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return cuh.a(this.e);
   }

   static record a(int b, cuh c) {
      public static final Codec<cxm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cxm.a::a), cuh.a.fieldOf("item").forGetter(cxm.a::b)).apply($$0, cxm.a::new)
      );

      public int a() {
         return this.b;
      }

      public cuh b() {
         return this.c;
      }
   }
}
