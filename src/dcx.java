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

public record dcx(asi<String> k, String l, int m, List<asi<wy>> n, boolean o) implements dbp<wy, dcx>, dcs {
   public static final dcx a = new dcx(asi.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<wy> g = xa.a(32767);
   public static final Codec<List<asi<wy>>> h = a(g);
   public static final Codec<dcx> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asi.a(Codec.string(0, 32)).fieldOf("title").forGetter(dcx::d),
               Codec.STRING.fieldOf("author").forGetter(dcx::e),
               ayu.a(0, 3).optionalFieldOf("generation", 0).forGetter(dcx::f),
               h.optionalFieldOf("pages", List.of()).forGetter(dcx::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(dcx::g)
            )
            .apply($$0, dcx::new)
   );
   public static final yw<wj, dcx> j = yw.a(asi.a(yu.b(32)), dcx::d, yu.p, dcx::e, yu.h, dcx::f, asi.a(xa.b).a(yu.a()), dcx::a, yu.b, dcx::g, dcx::new);

   public dcx(asi<String> k, String l, int m, List<asi<wy>> n, boolean o) {
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

   private static Codec<asi<wy>> b(Codec<wy> $$0) {
      return asi.a($$0);
   }

   public static Codec<List<asi<wy>>> a(Codec<wy> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public dcx b() {
      return this.m >= 2 ? null : new dcx(this.k, this.l, this.m + 1, this.n, this.o);
   }

   public static boolean a(czn $$0, ej $$1, @Nullable crm $$2) {
      dcx $$3 = $$0.a(kk.V);
      if ($$3 != null && !$$3.g()) {
         dcx $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kk.V, $$4);
            return true;
         }

         $$0.b(kk.V, $$3.c());
      }

      return false;
   }

   @Nullable
   public dcx a(ej $$0, @Nullable crm $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<asi<wy>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (asi<wy> $$3 : this.n) {
            Optional<asi<wy>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new dcx(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public dcx c() {
      return new dcx(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<asi<wy>> a(ej $$0, @Nullable crm $$1, asi<wy> $$2) {
      return $$2.b($$2x -> {
         try {
            wy $$3 = xb.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.u()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(wy $$0, jh.a $$1) {
      DataResult<JsonElement> $$2 = xa.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0);
      return $$2.isSuccess() && azc.a((JsonElement)$$2.getOrThrow(), 32767);
   }

   public List<wy> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (wy)$$1.a($$0));
   }

   public dcx b(List<asi<wy>> $$0) {
      return new dcx(this.k, this.l, this.m, $$0, false);
   }

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      if (!bal.h(this.l)) {
         $$1.accept(wy.a("book.byAuthor", this.l).a(o.h));
      }

      $$1.accept(wy.c("book.generation." + this.m).a(o.h));
   }

   public asi<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<asi<wy>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
