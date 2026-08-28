import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Stream;

public final class dcc implements dcp {
   private static final int d = -1;
   private static final int e = 256;
   public static final dcc a = new dcc(jo.a());
   public static final Codec<dcc> b = dcc.a.a.sizeLimitedListOf(256).xmap(dcc::b, dcc::f);
   public static final yw<wj, dcc> c = czk.h.a(yu.c(256)).a(dcc::new, $$0 -> $$0.f);
   private final jo<czk> f;
   private final int g;

   private dcc(jo<czk> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = czk.a($$0);
      }
   }

   private dcc(int $$0) {
      this(jo.a($$0, czk.k));
   }

   private dcc(List<czk> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static dcc b(List<dcc.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(dcc.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         dcc $$2 = new dcc($$1.getAsInt() + 1);

         for (dcc.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static dcc a(List<czk> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         dcc $$2 = new dcc($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<czk> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<dcc.a> f() {
      List<dcc.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         czk $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new dcc.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jo<czk> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         czk $$2 = $$1 < this.f.size() ? this.f.get($$1) : czk.k;
         $$0.set($$1, $$2.v());
      }
   }

   public czk a() {
      return this.f.isEmpty() ? czk.k : this.f.get(0).v();
   }

   public Stream<czk> b() {
      return this.f.stream().map(czk::v);
   }

   public Stream<czk> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(czk::v);
   }

   public Iterable<czk> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<czk> e() {
      return Iterables.transform(this.d(), czk::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dcc $$1 && czk.a(this.f, $$1.f)) {
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
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      int $$4 = 0;
      int $$5 = 0;

      for (czk $$6 : this.d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$1.accept(wy.a("item.container.item_count", $$6.y(), $$6.M()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$1.accept(wy.a("item.container.more_items", $$5 - $$4).a(o.u));
      }
   }

   static record a(int b, czk c) {
      public static final Codec<dcc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(dcc.a::a), czk.b.fieldOf("item").forGetter(dcc.a::b)).apply($$0, dcc.a::new)
      );

      public int a() {
         return this.b;
      }

      public czk b() {
         return this.c;
      }
   }
}
