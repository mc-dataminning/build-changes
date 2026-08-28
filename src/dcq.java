import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Stream;

public final class dcq implements ddd {
   private static final int d = -1;
   private static final int e = 256;
   public static final dcq a = new dcq(jo.a());
   public static final Codec<dcq> b = dcq.a.a.sizeLimitedListOf(256).xmap(dcq::b, dcq::f);
   public static final yy<wl, dcq> c = czy.h.a(yw.c(256)).a(dcq::new, $$0 -> $$0.f);
   private final jo<czy> f;
   private final int g;

   private dcq(jo<czy> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = czy.a($$0);
      }
   }

   private dcq(int $$0) {
      this(jo.a($$0, czy.k));
   }

   private dcq(List<czy> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static dcq b(List<dcq.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(dcq.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         dcq $$2 = new dcq($$1.getAsInt() + 1);

         for (dcq.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static dcq a(List<czy> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         dcq $$2 = new dcq($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<czy> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<dcq.a> f() {
      List<dcq.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         czy $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new dcq.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jo<czy> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         czy $$2 = $$1 < this.f.size() ? this.f.get($$1) : czy.k;
         $$0.set($$1, $$2.v());
      }
   }

   public czy a() {
      return this.f.isEmpty() ? czy.k : this.f.get(0).v();
   }

   public Stream<czy> b() {
      return this.f.stream().map(czy::v);
   }

   public Stream<czy> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(czy::v);
   }

   public Iterable<czy> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<czy> e() {
      return Iterables.transform(this.d(), czy::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dcq $$1 && czy.a(this.f, $$1.f)) {
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
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      int $$4 = 0;
      int $$5 = 0;

      for (czy $$6 : this.d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$1.accept(xa.a("item.container.item_count", $$6.y(), $$6.M()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$1.accept(xa.a("item.container.more_items", $$5 - $$4).a(o.u));
      }
   }

   static record a(int b, czy c) {
      public static final Codec<dcq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(dcq.a::a), czy.b.fieldOf("item").forGetter(dcq.a::b)).apply($$0, dcq.a::new)
      );

      public int a() {
         return this.b;
      }

      public czy b() {
         return this.c;
      }
   }
}
