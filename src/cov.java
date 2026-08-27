import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cov(int c, float d, boolean e, float f, ja<avn> g, List<cov.b> h) {
   private static final float i = 1.6F;
   public static final Codec<cov> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.i.fieldOf("nutrition").forGetter(cov::b),
               Codec.FLOAT.fieldOf("saturation_modifier").forGetter(cov::c),
               axu.a(Codec.BOOL, "can_always_eat", false).forGetter(cov::d),
               axu.a(axu.k, "eat_seconds", 1.6F).forGetter(cov::e),
               avn.b.fieldOf("eat_sound").forGetter(cov::f),
               axu.a(cov.b.a.listOf(), "effects", List.of()).forGetter(cov::g)
            )
            .apply($$0, cov::new)
   );
   public static final zc<wp, cov> b = zc.a(za.g, cov::b, za.i, cov::c, za.b, cov::d, za.i, cov::e, avn.d, cov::f, cov.b.b.a(za.a()), cov::g, cov::new);

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

   public ja<avn> f() {
      return this.g;
   }

   public List<cov.b> g() {
      return this.h;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private ja<avn> e = avo.kq;
      private final Builder<cov.b> f = ImmutableList.builder();

      public cov.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cov.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cov.a a() {
         this.c = true;
         return this;
      }

      public cov.a b() {
         this.d = 0.8F;
         return this;
      }

      public cov.a a(brh $$0, float $$1) {
         this.f.add(new cov.b($$0, $$1));
         return this;
      }

      public cov.a a(ja<avn> $$0) {
         this.e = $$0;
         return this;
      }

      public cov c() {
         return new cov(this.a, this.b, this.c, this.d, this.e, this.f.build());
      }
   }

   public static record b(brh c, float d) {
      public static final Codec<cov.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brh.d.fieldOf("effect").forGetter(cov.b::a), axu.a(Codec.floatRange(0.0F, 1.0F), "probability", 1.0F).forGetter(cov.b::b))
               .apply($$0, cov.b::new)
      );
      public static final zc<wp, cov.b> b = zc.a(brh.e, cov.b::a, za.i, cov.b::b, cov.b::new);

      public brh a() {
         return new brh(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
