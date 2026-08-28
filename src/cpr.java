import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cpr(int c, float d, boolean e, float f, List<cpr.b> g) {
   private static final float h = 1.6F;
   public static final Codec<cpr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.k.fieldOf("nutrition").forGetter(cpr::b),
               Codec.FLOAT.fieldOf("saturation").forGetter(cpr::c),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cpr::d),
               ayh.m.optionalFieldOf("eat_seconds", 1.6F).forGetter(cpr::e),
               cpr.b.a.listOf().optionalFieldOf("effects", List.of()).forGetter(cpr::f)
            )
            .apply($$0, cpr::new)
   );
   public static final zn<xa, cpr> b = zn.a(zl.g, cpr::b, zl.i, cpr::c, zl.b, cpr::d, zl.i, cpr::e, cpr.b.b.a(zl.a()), cpr::f, cpr::new);

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

   public List<cpr.b> f() {
      return this.g;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private final Builder<cpr.b> e = ImmutableList.builder();

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

      public cpr.a a(bsc $$0, float $$1) {
         this.e.add(new cpr.b($$0, $$1));
         return this;
      }

      public cpr c() {
         float $$0 = cpp.a(this.a, this.b);
         return new cpr(this.a, $$0, this.c, this.d, this.e.build());
      }
   }

   public static record b(bsc c, float d) {
      public static final Codec<cpr.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bsc.d.fieldOf("effect").forGetter(cpr.b::a), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(cpr.b::b))
               .apply($$0, cpr.b::new)
      );
      public static final zn<xa, cpr.b> b = zn.a(bsc.e, cpr.b::a, zl.i, cpr.b::b, cpr.b::new);

      public bsc a() {
         return new bsc(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
