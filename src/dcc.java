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

public record dcc(asg<String> k, String l, int m, List<asg<ww>> n, boolean o) implements dau<ww, dcc>, dbx {
   public static final dcc a = new dcc(asg.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<ww> g = wy.a(32767);
   public static final Codec<List<asg<ww>>> h = a(g);
   public static final Codec<dcc> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asg.a(Codec.string(0, 32)).fieldOf("title").forGetter(dcc::d),
               Codec.STRING.fieldOf("author").forGetter(dcc::e),
               ays.a(0, 3).optionalFieldOf("generation", 0).forGetter(dcc::f),
               h.optionalFieldOf("pages", List.of()).forGetter(dcc::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(dcc::g)
            )
            .apply($$0, dcc::new)
   );
   public static final yu<wh, dcc> j = yu.a(asg.a(ys.b(32)), dcc::d, ys.o, dcc::e, ys.h, dcc::f, asg.a(wy.b).a(ys.a()), dcc::a, ys.b, dcc::g, dcc::new);

   public dcc(asg<String> k, String l, int m, List<asg<ww>> n, boolean o) {
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

   private static Codec<asg<ww>> b(Codec<ww> $$0) {
      return asg.a($$0);
   }

   public static Codec<List<asg<ww>>> a(Codec<ww> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public dcc b() {
      return this.m >= 2 ? null : new dcc(this.k, this.l, this.m + 1, this.n, this.o);
   }

   public static boolean a(cys $$0, ei $$1, @Nullable cqs $$2) {
      dcc $$3 = $$0.a(kj.V);
      if ($$3 != null && !$$3.g()) {
         dcc $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kj.V, $$4);
            return true;
         }

         $$0.b(kj.V, $$3.c());
      }

      return false;
   }

   @Nullable
   public dcc a(ei $$0, @Nullable cqs $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<asg<ww>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (asg<ww> $$3 : this.n) {
            Optional<asg<ww>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new dcc(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public dcc c() {
      return new dcc(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<asg<ww>> a(ei $$0, @Nullable cqs $$1, asg<ww> $$2) {
      return $$2.b($$2x -> {
         try {
            ww $$3 = wz.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.u()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(ww $$0, jg.a $$1) {
      DataResult<JsonElement> $$2 = wy.a.encodeStart($$1.a(JsonOps.INSTANCE), $$0);
      return $$2.isSuccess() && aza.a((JsonElement)$$2.getOrThrow(), 32767);
   }

   public List<ww> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (ww)$$1.a($$0));
   }

   public dcc b(List<asg<ww>> $$0) {
      return new dcc(this.k, this.l, this.m, $$0, false);
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      if (!baj.h(this.l)) {
         $$1.accept(ww.a("book.byAuthor", this.l).a(n.h));
      }

      $$1.accept(ww.c("book.generation." + this.m).a(n.h));
   }

   public asg<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<asg<ww>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
