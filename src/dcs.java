import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Stream;

public final class dcs implements ddf {
   private static final int d = -1;
   private static final int e = 256;
   public static final dcs a = new dcs(jp.a());
   public static final Codec<dcs> b = dcs.a.a.sizeLimitedListOf(256).xmap(dcs::b, dcs::f);
   public static final za<wn, dcs> c = daa.h.a(yy.c(256)).a(dcs::new, $$0 -> $$0.f);
   private final jp<daa> f;
   private final int g;

   private dcs(jp<daa> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = daa.a($$0);
      }
   }

   private dcs(int $$0) {
      this(jp.a($$0, daa.k));
   }

   private dcs(List<daa> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static dcs b(List<dcs.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(dcs.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         dcs $$2 = new dcs($$1.getAsInt() + 1);

         for (dcs.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static dcs a(List<daa> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         dcs $$2 = new dcs($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<daa> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<dcs.a> f() {
      List<dcs.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         daa $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new dcs.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jp<daa> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         daa $$2 = $$1 < this.f.size() ? this.f.get($$1) : daa.k;
         $$0.set($$1, $$2.v());
      }
   }

   public daa a() {
      return this.f.isEmpty() ? daa.k : this.f.get(0).v();
   }

   public Stream<daa> b() {
      return this.f.stream().map(daa::v);
   }

   public Stream<daa> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(daa::v);
   }

   public Iterable<daa> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<daa> e() {
      return Iterables.transform(this.d(), daa::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dcs $$1 && daa.a(this.f, $$1.f)) {
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
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      int $$4 = 0;
      int $$5 = 0;

      for (daa $$6 : this.d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$1.accept(xc.a("item.container.item_count", $$6.y(), $$6.M()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$1.accept(xc.a("item.container.more_items", $$5 - $$4).a(o.u));
      }
   }

   static record a(int b, daa c) {
      public static final Codec<dcs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(dcs.a::a), daa.b.fieldOf("item").forGetter(dcs.a::b)).apply($$0, dcs.a::new)
      );

      public int a() {
         return this.b;
      }

      public daa b() {
         return this.c;
      }
   }
}
