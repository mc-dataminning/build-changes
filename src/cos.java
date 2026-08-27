import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cos(int c, float d, boolean e, float f, List<cos.b> g) {
   private static final float h = 1.6F;
   public static final Codec<cos> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axn.i.fieldOf("nutrition").forGetter(cos::b),
               Codec.FLOAT.fieldOf("saturation_modifier").forGetter(cos::c),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cos::d),
               axn.k.optionalFieldOf("eat_seconds", 1.6F).forGetter(cos::e),
               cos.b.a.listOf().optionalFieldOf("effects", List.of()).forGetter(cos::f)
            )
            .apply($$0, cos::new)
   );
   public static final yv<wi, cos> b = yv.a(yt.f, cos::b, yt.h, cos::c, yt.b, cos::d, yt.h, cos::e, cos.b.b.a(yt.a()), cos::f, cos::new);

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

   public List<cos.b> f() {
      return this.g;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private final Builder<cos.b> e = ImmutableList.builder();

      public cos.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cos.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cos.a a() {
         this.c = true;
         return this;
      }

      public cos.a b() {
         this.d = 0.8F;
         return this;
      }

      public cos.a a(bre $$0, float $$1) {
         this.e.add(new cos.b($$0, $$1));
         return this;
      }

      public cos c() {
         return new cos(this.a, this.b, this.c, this.d, this.e.build());
      }
   }

   public static record b(bre c, float d) {
      public static final Codec<cos.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bre.d.fieldOf("effect").forGetter(cos.b::a), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(cos.b::b))
               .apply($$0, cos.b::new)
      );
      public static final yv<wi, cos.b> b = yv.a(bre.e, cos.b::a, yt.h, cos.b::b, cos.b::new);

      public bre a() {
         return new bre(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
