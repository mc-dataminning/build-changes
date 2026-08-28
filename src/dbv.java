import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Stream;

public final class dbv implements dci {
   private static final int d = -1;
   private static final int e = 256;
   public static final dbv a = new dbv(jn.a());
   public static final Codec<dbv> b = dbv.a.a.sizeLimitedListOf(256).xmap(dbv::b, dbv::f);
   public static final yw<wj, dbv> c = czd.h.a(yu.c(256)).a(dbv::new, $$0 -> $$0.f);
   private final jn<czd> f;
   private final int g;

   private dbv(jn<czd> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = czd.a($$0);
      }
   }

   private dbv(int $$0) {
      this(jn.a($$0, czd.k));
   }

   private dbv(List<czd> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static dbv b(List<dbv.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(dbv.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         dbv $$2 = new dbv($$1.getAsInt() + 1);

         for (dbv.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static dbv a(List<czd> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         dbv $$2 = new dbv($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<czd> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<dbv.a> f() {
      List<dbv.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         czd $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new dbv.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jn<czd> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         czd $$2 = $$1 < this.f.size() ? this.f.get($$1) : czd.k;
         $$0.set($$1, $$2.v());
      }
   }

   public czd a() {
      return this.f.isEmpty() ? czd.k : this.f.get(0).v();
   }

   public Stream<czd> b() {
      return this.f.stream().map(czd::v);
   }

   public Stream<czd> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(czd::v);
   }

   public Iterable<czd> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<czd> e() {
      return Iterables.transform(this.d(), czd::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dbv $$1 && czd.a(this.f, $$1.f)) {
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
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      int $$4 = 0;
      int $$5 = 0;

      for (czd $$6 : this.d()) {
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

   static record a(int b, czd c) {
      public static final Codec<dbv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(dbv.a::a), czd.b.fieldOf("item").forGetter(dbv.a::b)).apply($$0, dbv.a::new)
      );

      public int a() {
         return this.b;
      }

      public czd b() {
         return this.c;
      }
   }
}
