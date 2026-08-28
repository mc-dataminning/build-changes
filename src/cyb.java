import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public record cyb(arl<String> k, String l, int m, List<arl<wz>> n, boolean o) implements cxe<wz, cyb> {
   public static final cyb a = new cyb(arl.a(""), "", 0, List.of(), true);
   public static final int b = 32767;
   public static final int c = 16;
   public static final int d = 32;
   public static final int e = 3;
   public static final int f = 2;
   public static final Codec<wz> g = xb.a(32767);
   public static final Codec<List<arl<wz>>> h = a(g);
   public static final Codec<cyb> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arl.a(Codec.string(0, 32)).fieldOf("title").forGetter(cyb::d),
               Codec.STRING.fieldOf("author").forGetter(cyb::e),
               axw.a(0, 3).optionalFieldOf("generation", 0).forGetter(cyb::f),
               h.optionalFieldOf("pages", List.of()).forGetter(cyb::a),
               Codec.BOOL.optionalFieldOf("resolved", false).forGetter(cyb::g)
            )
            .apply($$0, cyb::new)
   );
   public static final yx<wk, cyb> j = yx.a(arl.a(yv.b(32)), cyb::d, yv.l, cyb::e, yv.g, cyb::f, arl.a(xb.b).a(yv.a()), cyb::a, yv.b, cyb::g, cyb::new);

   public cyb(arl<String> k, String l, int m, List<arl<wz>> n, boolean o) {
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

   private static Codec<arl<wz>> b(Codec<wz> $$0) {
      return arl.a($$0);
   }

   public static Codec<List<arl<wz>>> a(Codec<wz> $$0) {
      return b($$0).listOf();
   }

   @Nullable
   public cyb b() {
      return this.m >= 2 ? null : new cyb(this.k, this.l, this.m + 1, this.n, this.o);
   }

   @Nullable
   public cyb a(et $$0, @Nullable cmx $$1) {
      if (this.o) {
         return null;
      } else {
         Builder<arl<wz>> $$2 = ImmutableList.builderWithExpectedSize(this.n.size());

         for (arl<wz> $$3 : this.n) {
            Optional<arl<wz>> $$4 = a($$0, $$1, $$3);
            if ($$4.isEmpty()) {
               return null;
            }

            $$2.add($$4.get());
         }

         return new cyb(this.k, this.l, this.m, $$2.build(), true);
      }
   }

   public cyb c() {
      return new cyb(this.k, this.l, this.m, this.n, true);
   }

   private static Optional<arl<wz>> a(et $$0, @Nullable cmx $$1, arl<wz> $$2) {
      return $$2.b($$2x -> {
         try {
            wz $$3 = xc.a($$0, $$2x, $$1, 0);
            return a($$3, $$0.v()) ? Optional.empty() : Optional.of($$3);
         } catch (Exception var4) {
            return Optional.of($$2x);
         }
      });
   }

   private static boolean a(wz $$0, jo.a $$1) {
      return wz.a.a($$0, $$1).length() > 32767;
   }

   public List<wz> a(boolean $$0) {
      return Lists.transform(this.n, $$1 -> (wz)$$1.a($$0));
   }

   public cyb b(List<arl<wz>> $$0) {
      return new cyb(this.k, this.l, this.m, $$0, false);
   }

   public arl<String> d() {
      return this.k;
   }

   public String e() {
      return this.l;
   }

   public int f() {
      return this.m;
   }

   @Override
   public List<arl<wz>> a() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }
}
