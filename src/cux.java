import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public final class cux implements Iterable<csd> {
   private static final int d = 256;
   public static final cux a = new cux(je.a());
   public static final Codec<cux> b = axe.a(cux.a.a.listOf(), 256).xmap(cux::b, cux::c);
   public static final yq<wd, cux> c = csd.e.a(yo.c(256)).a(cux::new, $$0 -> $$0.e);
   private final je<csd> e;

   private cux(je<csd> $$0) {
      this.e = $$0;
   }

   private cux(int $$0) {
      this(je.a($$0, csd.i));
   }

   private cux(List<csd> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.e.set($$1, $$0.get($$1));
      }
   }

   private static cux b(List<cux.a> $$0) {
      int $$1 = $$0.stream().mapToInt(cux.a::a).max().orElse(-1);
      cux $$2 = new cux($$1 + 1);

      for (cux.a $$3 : $$0) {
         $$2.e.set($$3.a(), $$3.b());
      }

      return $$2;
   }

   public static cux a(List<csd> $$0) {
      int $$1 = c($$0);
      if ($$1 == 0) {
         return a;
      } else {
         cux $$2 = new cux($$1);

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$2.e.set($$3, $$0.get($$3).r());
         }

         return $$2;
      }
   }

   private static int c(List<csd> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).d()) {
            return $$1 + 1;
         }
      }

      return 0;
   }

   private List<cux.a> c() {
      List<cux.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         csd $$2 = this.e.get($$1);
         if (!$$2.d()) {
            $$0.add(new cux.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(je<csd> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         csd $$2 = $$1 < this.e.size() ? this.e.get($$1) : csd.i;
         $$0.set($$1, $$2.r());
      }
   }

   public csd a() {
      return this.e.isEmpty() ? csd.i : this.e.get(0).r();
   }

   public Stream<csd> b() {
      return this.e.stream().filter($$0 -> !$$0.d()).map(csd::r);
   }

   @Override
   public Iterator<csd> iterator() {
      return Iterators.transform(Iterators.filter(this.e.iterator(), $$0 -> !$$0.d()), csd::r);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cux $$1 && csd.a(this.e, $$1.e)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return csd.a(this.e);
   }

   static record a(int b, csd c) {
      public static final Codec<cux.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cux.a::a), csd.a.fieldOf("item").forGetter(cux.a::b)).apply($$0, cux.a::new)
      );

      public int a() {
         return this.b;
      }

      public csd b() {
         return this.c;
      }
   }
}
