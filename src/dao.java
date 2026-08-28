import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public record dao(arv<String> k, String l, int m, List<arv<wp>> n, boolean o) implements czi<wp, dao>, dai {
   public static final dao a = new dao(arv.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<wp> g = wr.a(32767);
   public static final Codec<List<arv<wp>>> h = a(g);
   public static final Codec<dao> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arv.a(Codec.string(0, 32)).fieldOf("title").forGetter(dao::d),
               Codec.STRING.fieldOf("author").forGetter(dao::e),
               ayi.a(0, 3).optionalFieldOf("generation", 0).forGetter(dao::f),
               h.optionalFieldOf("pages", List.of()).forGetter(dao::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(dao::g)
            )
            .apply($$0, dao::new)
   );
   public static final yn<wa, dao> j = yn.a(arv.a(yl.b(32)), dao::d, yl.o, dao::e, yl.h, dao::f, arv.a(wr.b).a(yl.a()), dao::a, yl.b, dao::g, dao::new);

   public dao(arv<String> k, String l, int m, List<arv<wp>> n, boolean o) {
      if (m >= 0 && m <= 3) {
         this.k = k;
         this.l = l;
         this.m = m;
         this.n = n;
         this.o = o;
      } else {
         throw new IllegalArgumentException("Generation was " + m + ", but must be between 0 and 3");
      }
   }

   private static Codec<arv<wp>> b(Codec<wp> $$0) {
      return arv.a($$0);
   }

   public static Codec<List<arv<wp>>> a(Codec<wp> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public dao b() {
      return this.m >= 2 ? null : new dao(this.k, this.l, this.m + 1, this.n, this.o);
   }

   public static boolean a(cxh $$0, ex $$1, @Nullable cpr $$2) {
      dao $$3 = $$0.a(kv.V);
      if ($$3 != null && !$$3.g()) {
         dao $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kv.V, $$4);
            return true;
         }

         $$0.b(kv.V, $$3.c());
      }

      return false;
   }

   @Nullable
   public dao a(ex $$0, @Nullable cpr $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<arv<wp>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (arv<wp> $$3 : this.n) {
            Optional<arv<wp>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new dao(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public dao c() {
      return new dao(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<arv<wp>> a(ex $$0, @Nullable cpr $$1, arv<wp> $$2) {
      return $$2.b($$2x -> {
         try {
            wp $$3 = ws.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.u()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(wp $$0, jt.a $$1) {
      DataResult<JsonElement> $$2 = wr.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0);
      return $$2.isSuccess() && ayp.a((JsonElement)$$2.getOrThrow(), 32767);
   }

   public List<wp> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (wp)$$1.a($$0));
   }

   public dao b(List<arv<wp>> $$0) {
      return new dao(this.k, this.l, this.m, $$0, false);
   }

   @Override
   public void a(cxd.b $$0, Consumer<wp> $$1, cyx $$2) {
      if (!azw.h(this.l)) {
         $$1.accept(wp.a("book.byAuthor", this.l).a(n.h));
      }

      $$1.accept(wp.c("book.generation." + this.m).a(n.h));
   }

   public arv<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<arv<wp>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
