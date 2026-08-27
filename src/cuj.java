import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public final class cuj implements Iterable<crs> {
   private static final int d = 256;
   public static final cuj a = new cuj(iw.a());
   public static final Codec<cuj> b = awu.a(cuj.a.a.listOf(), 256).xmap(cuj::b, cuj::c);
   public static final yg<vt, cuj> c = crs.e.a(ye.c(256)).a(cuj::new, $$0 -> $$0.e);
   private final iw<crs> e;

   private cuj(iw<crs> $$0) {
      this.e = $$0;
   }

   private cuj(int $$0) {
      this(iw.a($$0, crs.i));
   }

   private cuj(List<crs> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.e.set($$1, $$0.get($$1));
      }
   }

   private static cuj b(List<cuj.a> $$0) {
      int $$1 = $$0.stream().mapToInt(cuj.a::a).max().orElse(-1);
      cuj $$2 = new cuj($$1 + 1);

      for (cuj.a $$3 : $$0) {
         $$2.e.set($$3.a(), $$3.b());
      }

      return $$2;
   }

   public static cuj a(List<crs> $$0) {
      int $$1 = c($$0);
      if ($$1 == 0) {
         return a;
      } else {
         cuj $$2 = new cuj($$1);

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$2.e.set($$3, $$0.get($$3).r());
         }

         return $$2;
      }
   }

   private static int c(List<crs> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).d()) {
            return $$1 + 1;
         }
      }

      return 0;
   }

   private List<cuj.a> c() {
      List<cuj.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         crs $$2 = this.e.get($$1);
         if (!$$2.d()) {
            $$0.add(new cuj.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(iw<crs> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         crs $$2 = $$1 < this.e.size() ? this.e.get($$1) : crs.i;
         $$0.set($$1, $$2.r());
      }
   }

   public crs a() {
      return this.e.isEmpty() ? crs.i : this.e.get(0).r();
   }

   public Stream<crs> b() {
      return this.e.stream().filter($$0 -> !$$0.d()).map(crs::r);
   }

   @Override
   public Iterator<crs> iterator() {
      return Iterators.transform(Iterators.filter(this.e.iterator(), $$0 -> !$$0.d()), crs::r);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cuj $$1 && crs.a(this.e, $$1.e)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return crs.a(this.e);
   }

   static record a(int b, crs c) {
      public static final Codec<cuj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cuj.a::a), crs.a.fieldOf("item").forGetter(cuj.a::b)).apply($$0, cuj.a::new)
      );

      public int a() {
         return this.b;
      }

      public crs b() {
         return this.c;
      }
   }
}
