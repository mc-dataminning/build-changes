import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public final class cua implements Iterable<crj> {
   private static final int d = 256;
   public static final cua a = new cua(iu.a());
   public static final Codec<cua> b = aws.a(cua.a.a.listOf(), 256).xmap(cua::b, cua::b);
   public static final ye<vr, cua> c = crj.e.a(yc.c(256)).a(cua::new, $$0 -> $$0.e);
   private final iu<crj> e;

   private cua(iu<crj> $$0) {
      this.e = $$0;
   }

   private cua(int $$0) {
      this(iu.a($$0, crj.i));
   }

   private cua(List<crj> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.e.set($$1, $$0.get($$1));
      }
   }

   private static cua b(List<cua.a> $$0) {
      int $$1 = $$0.stream().mapToInt(cua.a::a).max().orElse(-1);
      cua $$2 = new cua($$1 + 1);

      for (cua.a $$3 : $$0) {
         $$2.e.set($$3.a(), $$3.b());
      }

      return $$2;
   }

   public static cua a(List<crj> $$0) {
      int $$1 = c($$0);
      if ($$1 == 0) {
         return a;
      } else {
         cua $$2 = new cua($$1);

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            $$2.e.set($$3, $$0.get($$3).r());
         }

         return $$2;
      }
   }

   private static int c(List<crj> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).d()) {
            return $$1 + 1;
         }
      }

      return 0;
   }

   private List<cua.a> b() {
      List<cua.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.e.size(); $$1++) {
         crj $$2 = this.e.get($$1);
         if (!$$2.d()) {
            $$0.add(new cua.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(iu<crj> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         crj $$2 = $$1 < this.e.size() ? this.e.get($$1) : crj.i;
         $$0.set($$1, $$2.r());
      }
   }

   public Stream<crj> a() {
      return this.e.stream().filter($$0 -> !$$0.d()).map(crj::r);
   }

   @Override
   public Iterator<crj> iterator() {
      return Iterators.transform(Iterators.filter(this.e.iterator(), $$0 -> !$$0.d()), crj::r);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cua $$1 && crj.a(this.e, $$1.e)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return crj.a(this.e);
   }

   static record a(int b, crj c) {
      public static final Codec<cua.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(cua.a::a), crj.a.fieldOf("item").forGetter(cua.a::b)).apply($$0, cua.a::new)
      );

      public int a() {
         return this.b;
      }

      public crj b() {
         return this.c;
      }
   }
}
