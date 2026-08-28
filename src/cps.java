import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cps(int c, float d, boolean e, float f, List<cps.b> g) {
   private static final float h = 1.6F;
   public static final Codec<cps> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.k.fieldOf("nutrition").forGetter(cps::b),
               Codec.FLOAT.fieldOf("saturation").forGetter(cps::c),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cps::d),
               ayh.m.optionalFieldOf("eat_seconds", 1.6F).forGetter(cps::e),
               cps.b.a.listOf().optionalFieldOf("effects", List.of()).forGetter(cps::f)
            )
            .apply($$0, cps::new)
   );
   public static final zn<xa, cps> b = zn.a(zl.g, cps::b, zl.i, cps::c, zl.b, cps::d, zl.i, cps::e, cps.b.b.a(zl.a()), cps::f, cps::new);

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

   public List<cps.b> f() {
      return this.g;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private final Builder<cps.b> e = ImmutableList.builder();

      public cps.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cps.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cps.a a() {
         this.c = true;
         return this;
      }

      public cps.a b() {
         this.d = 0.8F;
         return this;
      }

      public cps.a a(bsd $$0, float $$1) {
         this.e.add(new cps.b($$0, $$1));
         return this;
      }

      public cps c() {
         float $$0 = cpq.a(this.a, this.b);
         return new cps(this.a, $$0, this.c, this.d, this.e.build());
      }
   }

   public static record b(bsd c, float d) {
      public static final Codec<cps.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bsd.d.fieldOf("effect").forGetter(cps.b::a), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(cps.b::b))
               .apply($$0, cps.b::new)
      );
      public static final zn<xa, cps.b> b = zn.a(bsd.e, cps.b::a, zl.i, cps.b::b, cps.b::new);

      public bsd a() {
         return new bsd(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
