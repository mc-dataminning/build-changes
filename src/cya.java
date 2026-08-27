import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cya(ark<String> l, String m, int n, List<ark<xe>> o, boolean p) implements cxc<xe, cya> {
   public static final cya a = new cya(ark.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 100;
   public static final int d = 16;
   public static final int e = 32;
   public static final int f = 3;
   public static final int g = 2;
   public static final Codec<xe> h = xg.a(32767);
   public static final Codec<List<ark<xe>>> i = a(h);
   public static final Codec<cya> j = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ark.a(axu.b(0, 32)).fieldOf("title").forGetter(cya::d),
               Codec.STRING.fieldOf("author").forGetter(cya::e),
               axu.a(axu.a(0, 3), "generation", Integer.valueOf(0)).forGetter(cya::f),
               axu.a(i, "pages", List.of()).forGetter(cya::a),
               axu.a(Codec.BOOL, "resolved", false).forGetter(cya::g)
            )
            .apply($$0, cya::new)
   );
   public static final zc<wp, cya> k = zc.a(ark.a(za.b(32)), cya::d, za.l, cya::e, za.g, cya::f, ark.a(xg.b).a(za.c(100)), cya::a, za.b, cya::g, cya::new);

   private static Codec<ark<xe>> b(Codec<xe> $$0) {
      return ark.a($$0);
   }

   public static Codec<List<ark<xe>>> a(Codec<xe> $$0) {
      return axu.a(b($$0).listOf(), 100);
   }

   @Nullable
   public cya b() {
      return this.n >= 2 ? null : new cya(this.l, this.m, this.n + 1, this.o, this.p);
   }

   @Nullable
   public cya a(eh $$0, @Nullable cly $$1) {
      if (this.p) {
         return null;
      } else {
         Builder<ark<xe>> $$2 = ImmutableList.builderWithExpectedSize(this.o.size());

         for (ark<xe> $$3 : this.o) {
            Optional<ark<xe>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cya(this.l, this.m, this.n, $$2.build(), true);
      }
   }

   public cya c() {
      return new cya(this.l, this.m, this.n, this.o, true);
   }

   private static Optional<ark<xe>> a(eh $$0, @Nullable cly $$1, ark<xe> $$2) {
      return $$2.b($$2x -> {
         try {
            xe $$3 = xh.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(xe $$0, jc.a $$1) {
      return xe.a.a($$0, $$1).length() > 32767;
   }

   public List<xe> a(boolean $$0) {
      return Lists.transform(this.o, $$1 -> (xe)$$1.a($$0));
   }

   public cya b(List<ark<xe>> $$0) {
      return new cya(this.l, this.m, this.n, $$0, false);
   }

   public ark<String> d() {
      return this.l;
   }

   public String e() {
      return this.m;
   }

   public int f() {
      return this.n;
   }

   @Override
   public List<ark<xe>> a() {
      return this.o;
   }

   public boolean g() {
      return this.p;
   }
}
