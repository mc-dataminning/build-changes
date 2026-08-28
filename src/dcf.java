import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Stream;

public final class dcf implements dcs {
   private static final int d = -1;
   private static final int e = 256;
   public static final dcf a = new dcf(jo.a());
   public static final Codec<dcf> b = dcf.a.a.sizeLimitedListOf(256).xmap(dcf::b, dcf::f);
   public static final yw<wj, dcf> c = czn.h.a(yu.c(256)).a(dcf::new, $$0 -> $$0.f);
   private final jo<czn> f;
   private final int g;

   private dcf(jo<czn> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = czn.a($$0);
      }
   }

   private dcf(int $$0) {
      this(jo.a($$0, czn.k));
   }

   private dcf(List<czn> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static dcf b(List<dcf.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(dcf.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         dcf $$2 = new dcf($$1.getAsInt() + 1);

         for (dcf.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static dcf a(List<czn> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         dcf $$2 = new dcf($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<czn> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<dcf.a> f() {
      List<dcf.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         czn $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new dcf.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jo<czn> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         czn $$2 = $$1 < this.f.size() ? this.f.get($$1) : czn.k;
         $$0.set($$1, $$2.v());
      }
   }

   public czn a() {
      return this.f.isEmpty() ? czn.k : this.f.get(0).v();
   }

   public Stream<czn> b() {
      return this.f.stream().map(czn::v);
   }

   public Stream<czn> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(czn::v);
   }

   public Iterable<czn> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<czn> e() {
      return Iterables.transform(this.d(), czn::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dcf $$1 && czn.a(this.f, $$1.f)) {
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
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      int $$4 = 0;
      int $$5 = 0;

      for (czn $$6 : this.d()) {
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

   static record a(int b, czn c) {
      public static final Codec<dcf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(dcf.a::a), czn.b.fieldOf("item").forGetter(dcf.a::b)).apply($$0, dcf.a::new)
      );

      public int a() {
         return this.b;
      }

      public czn b() {
         return this.c;
      }
   }
}
