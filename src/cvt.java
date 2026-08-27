import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public final class cvt implements Iterable<csz> {
   private static final int d = 256;
   public static final cvt a = new cvt(jf.a());
   public static final Codec<cvt> b = axh.a(cvt.a.a.listOf(), 256).xmap(cvt::b, cvt::c);
   public static final ys<wf, cvt> c = csz.e.a(yq.c(256)).a(cvt::new, $$0 -> $$0.e);
   private final jf<csz> e;

   private cvt(jf<csz> $$0) {
      this.e = $$0;
   }

   private cvt(int $$0) {
      this(jf.a($$0, csz.i));
   }

   private cvt(List<csz> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.e.set($$1, $$0.get($$1));
      }
   }

   private static cvt b(List<cvt.a> $$0) {
      int $$1 = $$0.stream().mapToInt(cvt.a::a).max().orElse(-1);
      cvt $$2 = new cvt($$1 + 1);

      for (cvt.a $$3 : $$0) {
         $$2.e.set($$3.a(), $$3.b());
      }

      return $$2;
   }

   public static cvt a(List<csz> $$0) {
      int $$1 = c($$0);
      if ($$1 == 0) {
         return a;
      } else {
         cvt $$2 = new cvt($$1);

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$2.e.set($$3, $$0.get($$3).r());
         }

         return $$2;
      }
   }

   private static int c(List<csz> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).d()) {
            return $$1 + 1;
         }
      }

      return 0;
   }

   private List<cvt.a> c() {
      List<cvt.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         csz $$2 = this.e.get($$1);
         if (!$$2.d()) {
            $$0.add(new cvt.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jf<csz> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         csz $$2 = $$1 < this.e.size() ? this.e.get($$1) : csz.i;
         $$0.set($$1, $$2.r());
      }
   }

   public csz a() {
      return this.e.isEmpty() ? csz.i : this.e.get(0).r();
   }

   public Stream<csz> b() {
      return this.e.stream().filter($$0 -> !$$0.d()).map(csz::r);
   }

   @Override
   public Iterator<csz> iterator() {
      return Iterators.transform(Iterators.filter(this.e.iterator(), $$0 -> !$$0.d()), csz::r);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cvt $$1 && csz.a(this.e, $$1.e)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return csz.a(this.e);
   }

   static record a(int b, csz c) {
      public static final Codec<cvt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cvt.a::a), csz.a.fieldOf("item").forGetter(cvt.a::b)).apply($$0, cvt.a::new)
      );

      public int a() {
         return this.b;
      }

      public csz b() {
         return this.c;
      }
   }
}
