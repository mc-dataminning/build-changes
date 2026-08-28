import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Stream;

public final class dbk implements dbx {
   private static final int d = -1;
   private static final int e = 256;
   public static final dbk a = new dbk(jn.a());
   public static final Codec<dbk> b = dbk.a.a.sizeLimitedListOf(256).xmap(dbk::b, dbk::f);
   public static final yu<wh, dbk> c = cys.h.a(ys.c(256)).a(dbk::new, $$0 -> $$0.f);
   private final jn<cys> f;
   private final int g;

   private dbk(jn<cys> $$0) {
      if ($$0.size() > 256) {
         throw new IllegalArgumentException("Got " + $$0.size() + " items, but maximum is 256");
      } else {
         this.f = $$0;
         this.g = cys.a($$0);
      }
   }

   private dbk(int $$0) {
      this(jn.a($$0, cys.k));
   }

   private dbk(List<cys> $$0) {
      this($$0.size());

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         this.f.set($$1, $$0.get($$1));
      }
   }

   private static dbk b(List<dbk.a> $$0) {
      OptionalInt $$1 = $$0.stream().mapToInt(dbk.a::a).max();
      if ($$1.isEmpty()) {
         return a;
      } else {
         dbk $$2 = new dbk($$1.getAsInt() + 1);

         for (dbk.a $$3 : $$0) {
            $$2.f.set($$3.a(), $$3.b());
         }

         return $$2;
      }
   }

   public static dbk a(List<cys> $$0) {
      int $$1 = c($$0);
      if ($$1 == -1) {
         return a;
      } else {
         dbk $$2 = new dbk($$1 + 1);

         for (int $$3 = 0; $$3 <= $$1; $$3++) {
            $$2.f.set($$3, $$0.get($$3).v());
         }

         return $$2;
      }
   }

   private static int c(List<cys> $$0) {
      for (int $$1 = $$0.size() - 1; $$1 >= 0; $$1--) {
         if (!$$0.get($$1).f()) {
            return $$1;
         }
      }

      return -1;
   }

   private List<dbk.a> f() {
      List<dbk.a> $$0 = new ArrayList<>();

      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         cys $$2 = this.f.get($$1);
         if (!$$2.f()) {
            $$0.add(new dbk.a($$1, $$2));
         }
      }

      return $$0;
   }

   public void a(jn<cys> $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         cys $$2 = $$1 < this.f.size() ? this.f.get($$1) : cys.k;
         $$0.set($$1, $$2.v());
      }
   }

   public cys a() {
      return this.f.isEmpty() ? cys.k : this.f.get(0).v();
   }

   public Stream<cys> b() {
      return this.f.stream().map(cys::v);
   }

   public Stream<cys> c() {
      return this.f.stream().filter($$0 -> !$$0.f()).map(cys::v);
   }

   public Iterable<cys> d() {
      return Iterables.filter(this.f, $$0 -> !$$0.f());
   }

   public Iterable<cys> e() {
      return Iterables.transform(this.d(), cys::v);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dbk $$1 && cys.a(this.f, $$1.f)) {
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
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      int $$4 = 0;
      int $$5 = 0;

      for (cys $$6 : this.d()) {
         $$5++;
         if ($$4 <= 4) {
            $$4++;
            $$1.accept(ww.a("item.container.item_count", $$6.y(), $$6.M()));
         }
      }

      if ($$5 - $$4 > 0) {
         $$1.accept(ww.a("item.container.more_items", $$5 - $$4).a(n.u));
      }
   }

   static record a(int b, cys c) {
      public static final Codec<dbk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(dbk.a::a), cys.b.fieldOf("item").forGetter(dbk.a::b)).apply($$0, dbk.a::new)
      );

      public int a() {
         return this.b;
      }

      public cys b() {
         return this.c;
      }
   }
}
