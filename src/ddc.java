import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Stream;

public final class ddc implements ddp {
   private static final int d = -1;
   private static final int e = 256;
   public static final ddc a = new ddc(jp.a());
   public static final Codec<ddc> b = ddc.a.a.sizeLimitedListOf(256).xmap(ddc::b, ddc::f);
   public static final ze<wp, ddc> c = dak.h.a(zc.c(256)).a(ddc::new, $$0 -> $$0.f);
   private final jp<dak> f;
   private final int g;

   private ddc(jp<dak> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = dak.a($$0);
      }
   }

   private ddc(int $$0) {
      this(jp.a($$0, dak.l));
   }

   private ddc(List<dak> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static ddc b(List<ddc.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(ddc.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         ddc $$2 = new ddc($$1.getAsInt() + 1);

         for (ddc.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static ddc a(List<dak> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         ddc $$2 = new ddc($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<dak> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<ddc.a> f() {
      List<ddc.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         dak $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new ddc.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jp<dak> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         dak $$2 = $$1 < this.f.size() ? this.f.get($$1) : dak.l;
         $$0.set($$1, $$2.v());
      }
   }

   public dak a() {
      return this.f.isEmpty() ? dak.l : this.f.get(0).v();
   }

   public Stream<dak> b() {
      return this.f.stream().map(dak::v);
   }

   public Stream<dak> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(dak::v);
   }

   public Iterable<dak> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<dak> e() {
      return Iterables.transform(this.d(), dak::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ddc $$1 && dak.a(this.f, $$1.f)) {
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
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      int $$4 = 0;
      int $$5 = 0;

      for (dak $$6 : this.d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$1.accept(xg.a("item.container.item_count", $$6.y(), $$6.M()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$1.accept(xg.a("item.container.more_items", $$5 - $$4).a(o.u));
      }
   }

   static record a(int b, dak c) {
      public static final Codec<ddc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(ddc.a::a), dak.b.fieldOf("item").forGetter(ddc.a::b)).apply($$0, ddc.a::new)
      );

      public int a() {
         return this.b;
      }

      public dak b() {
         return this.c;
      }
   }
}
