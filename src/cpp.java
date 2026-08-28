import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record cpp(int c, float d, boolean e, float f, Optional<cuo> g, List<cpp.b> h) {
   private static final float i = 1.6F;
   public static final Codec<cpp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axv.k.fieldOf("nutrition").forGetter(cpp::b),
               Codec.FLOAT.fieldOf("saturation").forGetter(cpp::c),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cpp::d),
               axv.m.optionalFieldOf("eat_seconds", 1.6F).forGetter(cpp::e),
               cuo.c.optionalFieldOf("using_converts_to").forGetter(cpp::f),
               cpp.b.a.listOf().optionalFieldOf("effects", List.of()).forGetter(cpp::g)
            )
            .apply($$0, cpp::new)
   );
   public static final yw<wj, cpp> b = yw.a(yu.g, cpp::b, yu.i, cpp::c, yu.b, cpp::d, yu.i, cpp::e, cuo.i.a(yu::a), cpp::f, cpp.b.b.a(yu.a()), cpp::g, cpp::new);

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

   public Optional<cuo> f() {
      return this.g;
   }

   public List<cpp.b> g() {
      return this.h;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private Optional<cuo> e = Optional.empty();
      private final Builder<cpp.b> f = ImmutableList.builder();

      public cpp.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cpp.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cpp.a a() {
         this.c = true;
         return this;
      }

      public cpp.a b() {
         this.d = 0.8F;
         return this;
      }

      public cpp.a a(bry $$0, float $$1) {
         this.f.add(new cpp.b($$0, $$1));
         return this;
      }

      public cpp.a a(dct $$0) {
         this.e = Optional.of(new cuo($$0));
         return this;
      }

      public cpp c() {
         float $$0 = cpn.a(this.a, this.b);
         return new cpp(this.a, $$0, this.c, this.d, this.e, this.f.build());
      }
   }

   public static record b(bry c, float d) {
      public static final Codec<cpp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bry.d.fieldOf("effect").forGetter(cpp.b::a), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(cpp.b::b))
               .apply($$0, cpp.b::new)
      );
      public static final yw<wj, cpp.b> b = yw.a(bry.e, cpp.b::a, yu.i, cpp.b::b, cpp.b::new);

      public bry a() {
         return new bry(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
