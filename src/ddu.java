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

public record ddu(ast<String> k, String l, int m, List<ast<xg>> n, boolean o) implements dcm<xg, ddu>, ddp {
   public static final ddu a = new ddu(ast.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xg> g = xi.a(32767);
   public static final Codec<List<ast<xg>>> h = a(g);
   public static final Codec<ddu> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ast.a(Codec.string(0, 32)).fieldOf("title").forGetter(ddu::d),
               Codec.STRING.fieldOf("author").forGetter(ddu::e),
               azg.a(0, 3).optionalFieldOf("generation", 0).forGetter(ddu::f),
               h.optionalFieldOf("pages", List.of()).forGetter(ddu::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(ddu::g)
            )
            .apply($$0, ddu::new)
   );
   public static final ze<wp, ddu> j = ze.a(ast.a(zc.b(32)), ddu::d, zc.p, ddu::e, zc.h, ddu::f, ast.a(xi.b).a(zc.a()), ddu::a, zc.b, ddu::g, ddu::new);

   public ddu(ast<String> k, String l, int m, List<ast<xg>> n, boolean o) {
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

   private static Codec<ast<xg>> b(Codec<xg> $$0) {
      return ast.a($$0);
   }

   public static Codec<List<ast<xg>>> a(Codec<xg> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public ddu b() {
      return this.m >= 2 ? null : new ddu(this.k, this.l, this.m + 1, this.n, this.o);
   }

   public static boolean a(dak $$0, ek $$1, @Nullable csi $$2) {
      ddu $$3 = $$0.a(kl.V);
      if ($$3 != null && !$$3.g()) {
         ddu $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kl.V, $$4);
            return true;
         }

         $$0.b(kl.V, $$3.c());
      }

      return false;
   }

   @Nullable
   public ddu a(ek $$0, @Nullable csi $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<ast<xg>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (ast<xg> $$3 : this.n) {
            Optional<ast<xg>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new ddu(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public ddu c() {
      return new ddu(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<ast<xg>> a(ek $$0, @Nullable csi $$1, ast<xg> $$2) {
      return $$2.b($$2x -> {
         try {
            xg $$3 = xj.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.u()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xg $$0, ji.a $$1) {
      DataResult<JsonElement> $$2 = xi.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0);
      return $$2.isSuccess() && azo.a((JsonElement)$$2.getOrThrow(), 32767);
   }

   public List<xg> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xg)$$1.a($$0));
   }

   public ddu b(List<ast<xg>> $$0) {
      return new ddu(this.k, this.l, this.m, $$0, false);
   }

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      if (!bay.h(this.l)) {
         $$1.accept(xg.a("book.byAuthor", this.l).a(o.h));
      }

      $$1.accept(xg.c("book.generation." + this.m).a(o.h));
   }

   public ast<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<ast<xg>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
