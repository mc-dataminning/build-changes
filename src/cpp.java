import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cpp(int c, float d, boolean e, float f, List<cpp.b> g) {
   private static final float h = 1.6F;
   public static final Codec<cpp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayf.k.fieldOf("nutrition").forGetter(cpp::b),
               Codec.FLOAT.fieldOf("saturation").forGetter(cpp::c),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cpp::d),
               ayf.m.optionalFieldOf("eat_seconds", 1.6F).forGetter(cpp::e),
               cpp.b.a.listOf().optionalFieldOf("effects", List.of()).forGetter(cpp::f)
            )
            .apply($$0, cpp::new)
   );
   public static final zm<wz, cpp> b = zm.a(zk.g, cpp::b, zk.i, cpp::c, zk.b, cpp::d, zk.i, cpp::e, cpp.b.b.a(zk.a()), cpp::f, cpp::new);

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

   public List<cpp.b> f() {
      return this.g;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private final Builder<cpp.b> e = ImmutableList.builder();

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

      public cpp.a a(bsa $$0, float $$1) {
         this.e.add(new cpp.b($$0, $$1));
         return this;
      }

      public cpp c() {
         float $$0 = cpn.a(this.a, this.b);
         return new cpp(this.a, $$0, this.c, this.d, this.e.build());
      }
   }

   public static record b(bsa c, float d) {
      public static final Codec<cpp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bsa.d.fieldOf("effect").forGetter(cpp.b::a), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(cpp.b::b))
               .apply($$0, cpp.b::new)
      );
      public static final zm<wz, cpp.b> b = zm.a(bsa.e, cpp.b::a, zk.i, cpp.b::b, cpp.b::new);

      public bsa a() {
         return new bsa(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
