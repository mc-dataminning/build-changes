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

public record ddk(asm<String> k, String l, int m, List<asm<xc>> n, boolean o) implements dcc<xc, ddk>, ddf {
   public static final ddk a = new ddk(asm.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<xc> g = xe.a(32767);
   public static final Codec<List<asm<xc>>> h = a(g);
   public static final Codec<ddk> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asm.a(Codec.string(0, 32)).fieldOf("title").forGetter(ddk::d),
               Codec.STRING.fieldOf("author").forGetter(ddk::e),
               ayy.a(0, 3).optionalFieldOf("generation", 0).forGetter(ddk::f),
               h.optionalFieldOf("pages", List.of()).forGetter(ddk::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(ddk::g)
            )
            .apply($$0, ddk::new)
   );
   public static final za<wn, ddk> j = za.a(asm.a(yy.b(32)), ddk::d, yy.p, ddk::e, yy.h, ddk::f, asm.a(xe.b).a(yy.a()), ddk::a, yy.b, ddk::g, ddk::new);

   public ddk(asm<String> k, String l, int m, List<asm<xc>> n, boolean o) {
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

   private static Codec<asm<xc>> b(Codec<xc> $$0) {
      return asm.a($$0);
   }

   public static Codec<List<asm<xc>>> a(Codec<xc> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public ddk b() {
      return this.m >= 2 ? null : new ddk(this.k, this.l, this.m + 1, this.n, this.o);
   }

   public static boolean a(daa $$0, ek $$1, @Nullable crz $$2) {
      ddk $$3 = $$0.a(kl.V);
      if ($$3 != null && !$$3.g()) {
         ddk $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kl.V, $$4);
            return true;
         }

         $$0.b(kl.V, $$3.c());
      }

      return false;
   }

   @Nullable
   public ddk a(ek $$0, @Nullable crz $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<asm<xc>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (asm<xc> $$3 : this.n) {
            Optional<asm<xc>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new ddk(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public ddk c() {
      return new ddk(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<asm<xc>> a(ek $$0, @Nullable crz $$1, asm<xc> $$2) {
      return $$2.b($$2x -> {
         try {
            xc $$3 = xf.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.u()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xc $$0, ji.a $$1) {
      DataResult<JsonElement> $$2 = xe.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0);
      return $$2.isSuccess() && azg.a((JsonElement)$$2.getOrThrow(), 32767);
   }

   public List<xc> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (xc)$$1.a($$0));
   }

   public ddk b(List<asm<xc>> $$0) {
      return new ddk(this.k, this.l, this.m, $$0, false);
   }

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      if (!bap.h(this.l)) {
         $$1.accept(xc.a("book.byAuthor", this.l).a(o.h));
      }

      $$1.accept(xc.c("book.generation." + this.m).a(o.h));
   }

   public asm<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<asm<xc>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
