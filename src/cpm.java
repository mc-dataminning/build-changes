import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cpm(int c, float d, boolean e, float f, List<cpm.b> g) {
   private static final float h = 1.6F;
   public static final Codec<cpm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayc.k.fieldOf("nutrition").forGetter(cpm::b),
               Codec.FLOAT.fieldOf("saturation").forGetter(cpm::c),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cpm::d),
               ayc.m.optionalFieldOf("eat_seconds", 1.6F).forGetter(cpm::e),
               cpm.b.a.listOf().optionalFieldOf("effects", List.of()).forGetter(cpm::f)
            )
            .apply($$0, cpm::new)
   );
   public static final zj<ww, cpm> b = zj.a(zh.g, cpm::b, zh.i, cpm::c, zh.b, cpm::d, zh.i, cpm::e, cpm.b.b.a(zh.a()), cpm::f, cpm::new);

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

   public List<cpm.b> f() {
      return this.g;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private final Builder<cpm.b> e = ImmutableList.builder();

      public cpm.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cpm.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cpm.a a() {
         this.c = true;
         return this;
      }

      public cpm.a b() {
         this.d = 0.8F;
         return this;
      }

      public cpm.a a(brx $$0, float $$1) {
         this.e.add(new cpm.b($$0, $$1));
         return this;
      }

      public cpm c() {
         float $$0 = cpk.a(this.a, this.b);
         return new cpm(this.a, $$0, this.c, this.d, this.e.build());
      }
   }

   public static record b(brx c, float d) {
      public static final Codec<cpm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brx.d.fieldOf("effect").forGetter(cpm.b::a), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(cpm.b::b))
               .apply($$0, cpm.b::new)
      );
      public static final zj<ww, cpm.b> b = zj.a(brx.e, cpm.b::a, zh.i, cpm.b::b, cpm.b::new);

      public brx a() {
         return new brx(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
