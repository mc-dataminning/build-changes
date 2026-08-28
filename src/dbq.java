import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Stream;

public final class dbq implements dcd {
   private static final int d = -1;
   private static final int e = 256;
   public static final dbq a = new dbq(jn.a());
   public static final Codec<dbq> b = dbq.a.a.sizeLimitedListOf(256).xmap(dbq::b, dbq::f);
   public static final yw<wj, dbq> c = cyy.h.a(yu.c(256)).a(dbq::new, $$0 -> $$0.f);
   private final jn<cyy> f;
   private final int g;

   private dbq(jn<cyy> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cyy.a($$0);
      }
   }

   private dbq(int $$0) {
      this(jn.a($$0, cyy.k));
   }

   private dbq(List<cyy> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static dbq b(List<dbq.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(dbq.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         dbq $$2 = new dbq($$1.getAsInt() + 1);

         for (dbq.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static dbq a(List<cyy> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         dbq $$2 = new dbq($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cyy> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<dbq.a> f() {
      List<dbq.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cyy $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new dbq.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jn<cyy> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cyy $$2 = $$1 < this.f.size() ? this.f.get($$1) : cyy.k;
         $$0.set($$1, $$2.v());
      }
   }

   public cyy a() {
      return this.f.isEmpty() ? cyy.k : this.f.get(0).v();
   }

   public Stream<cyy> b() {
      return this.f.stream().map(cyy::v);
   }

   public Stream<cyy> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cyy::v);
   }

   public Iterable<cyy> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cyy> e() {
      return Iterables.transform(this.d(), cyy::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dbq $$1 && cyy.a(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.g;
   }

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      int $$4 = 0;
      int $$5 = 0;

      for (cyy $$6 : this.d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$1.accept(wy.a("item.container.item_count", $$6.y(), $$6.M()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$1.accept(wy.a("item.container.more_items", $$5 - $$4).a(n.u));
      }
   }

   static record a(int b, cyy c) {
      public static final Codec<dbq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(dbq.a::a), cyy.b.fieldOf("item").forGetter(dbq.a::b)).apply($$0, dbq.a::new)
      );

      public int a() {
         return this.b;
      }

      public cyy b() {
         return this.c;
      }
   }
}
