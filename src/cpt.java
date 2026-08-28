import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cpt(int c, float d, boolean e, float f, List<cpt.b> g) {
   private static final float h = 1.6F;
   public static final Codec<cpt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.k.fieldOf("nutrition").forGetter(cpt::b),
               Codec.FLOAT.fieldOf("saturation").forGetter(cpt::c),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cpt::d),
               ayh.m.optionalFieldOf("eat_seconds", 1.6F).forGetter(cpt::e),
               cpt.b.a.listOf().optionalFieldOf("effects", List.of()).forGetter(cpt::f)
            )
            .apply($$0, cpt::new)
   );
   public static final zn<xa, cpt> b = zn.a(zl.g, cpt::b, zl.i, cpt::c, zl.b, cpt::d, zl.i, cpt::e, cpt.b.b.a(zl.a()), cpt::f, cpt::new);

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

   public List<cpt.b> f() {
      return this.g;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private final Builder<cpt.b> e = ImmutableList.builder();

      public cpt.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cpt.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cpt.a a() {
         this.c = true;
         return this;
      }

      public cpt.a b() {
         this.d = 0.8F;
         return this;
      }

      public cpt.a a(bse $$0, float $$1) {
         this.e.add(new cpt.b($$0, $$1));
         return this;
      }

      public cpt c() {
         float $$0 = cpr.a(this.a, this.b);
         return new cpt(this.a, $$0, this.c, this.d, this.e.build());
      }
   }

   public static record b(bse c, float d) {
      public static final Codec<cpt.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bse.d.fieldOf("effect").forGetter(cpt.b::a), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(cpt.b::b))
               .apply($$0, cpt.b::new)
      );
      public static final zn<xa, cpt.b> b = zn.a(bse.e, cpt.b::a, zl.i, cpt.b::b, cpt.b::new);

      public bse a() {
         return new bse(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
