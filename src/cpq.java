import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cpq(int c, float d, boolean e, float f, List<cpq.b> g) {
   private static final float h = 1.6F;
   public static final Codec<cpq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayg.k.fieldOf("nutrition").forGetter(cpq::b),
               Codec.FLOAT.fieldOf("saturation").forGetter(cpq::c),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cpq::d),
               ayg.m.optionalFieldOf("eat_seconds", 1.6F).forGetter(cpq::e),
               cpq.b.a.listOf().optionalFieldOf("effects", List.of()).forGetter(cpq::f)
            )
            .apply($$0, cpq::new)
   );
   public static final zm<wz, cpq> b = zm.a(zk.g, cpq::b, zk.i, cpq::c, zk.b, cpq::d, zk.i, cpq::e, cpq.b.b.a(zk.a()), cpq::f, cpq::new);

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

   public List<cpq.b> f() {
      return this.g;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private final Builder<cpq.b> e = ImmutableList.builder();

      public cpq.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cpq.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cpq.a a() {
         this.c = true;
         return this;
      }

      public cpq.a b() {
         this.d = 0.8F;
         return this;
      }

      public cpq.a a(bsb $$0, float $$1) {
         this.e.add(new cpq.b($$0, $$1));
         return this;
      }

      public cpq c() {
         float $$0 = cpo.a(this.a, this.b);
         return new cpq(this.a, $$0, this.c, this.d, this.e.build());
      }
   }

   public static record b(bsb c, float d) {
      public static final Codec<cpq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bsb.d.fieldOf("effect").forGetter(cpq.b::a), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(cpq.b::b))
               .apply($$0, cpq.b::new)
      );
      public static final zm<wz, cpq.b> b = zm.a(bsb.e, cpq.b::a, zk.i, cpq.b::b, cpq.b::new);

      public bsb a() {
         return new bsb(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
