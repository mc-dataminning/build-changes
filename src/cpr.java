import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record cpr(int c, float d, boolean e, float f, Optional<cuq> g, List<cpr.b> h) {
   private static final float i = 1.6F;
   public static final Codec<cpr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axw.k.fieldOf("nutrition").forGetter(cpr::b),
               Codec.FLOAT.fieldOf("saturation").forGetter(cpr::c),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cpr::d),
               axw.m.optionalFieldOf("eat_seconds", 1.6F).forGetter(cpr::e),
               cuq.c.optionalFieldOf("using_converts_to").forGetter(cpr::f),
               cpr.b.a.listOf().optionalFieldOf("effects", List.of()).forGetter(cpr::g)
            )
            .apply($$0, cpr::new)
   );
   public static final yx<wk, cpr> b = yx.a(yv.g, cpr::b, yv.i, cpr::c, yv.b, cpr::d, yv.i, cpr::e, cuq.i.a(yv::a), cpr::f, cpr.b.b.a(yv.a()), cpr::g, cpr::new);

   public int a() {
      return (int)(this.f * 20.0F);
   }

   public int b() {
      return this.c;
   }

   public float c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public float e() {
      return this.f;
   }

   public Optional<cuq> f() {
      return this.g;
   }

   public List<cpr.b> g() {
      return this.h;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private Optional<cuq> e = Optional.empty();
      private final Builder<cpr.b> f = ImmutableList.builder();

      public cpr.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cpr.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cpr.a a() {
         this.c = true;
         return this;
      }

      public cpr.a b() {
         this.d = 0.8F;
         return this;
      }

      public cpr.a a(brz $$0, float $$1) {
         this.f.add(new cpr.b($$0, $$1));
         return this;
      }

      public cpr.a a(dcv $$0) {
         this.e = Optional.of(new cuq($$0));
         return this;
      }

      public cpr c() {
         float $$0 = cpp.a(this.a, this.b);
         return new cpr(this.a, $$0, this.c, this.d, this.e, this.f.build());
      }
   }

   public static record b(brz c, float d) {
      public static final Codec<cpr.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brz.d.fieldOf("effect").forGetter(cpr.b::a), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(cpr.b::b))
               .apply($$0, cpr.b::new)
      );
      public static final yx<wk, cpr.b> b = yx.a(brz.e, cpr.b::a, yv.i, cpr.b::b, cpr.b::new);

      public brz a() {
         return new brz(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
