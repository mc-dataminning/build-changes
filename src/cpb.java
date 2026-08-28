import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cpb(int c, float d, boolean e, float f, List<cpb.b> g) {
   private static final float h = 1.6F;
   public static final Codec<cpb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axm.k.fieldOf("nutrition").forGetter(cpb::b),
               Codec.FLOAT.fieldOf("saturation").forGetter(cpb::c),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cpb::d),
               axm.m.optionalFieldOf("eat_seconds", 1.6F).forGetter(cpb::e),
               cpb.b.a.listOf().optionalFieldOf("effects", List.of()).forGetter(cpb::f)
            )
            .apply($$0, cpb::new)
   );
   public static final ys<wf, cpb> b = ys.a(yq.g, cpb::b, yq.i, cpb::c, yq.b, cpb::d, yq.i, cpb::e, cpb.b.b.a(yq.a()), cpb::f, cpb::new);

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

   public List<cpb.b> f() {
      return this.g;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private final Builder<cpb.b> e = ImmutableList.builder();

      public cpb.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cpb.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cpb.a a() {
         this.c = true;
         return this;
      }

      public cpb.a b() {
         this.d = 0.8F;
         return this;
      }

      public cpb.a a(brl $$0, float $$1) {
         this.e.add(new cpb.b($$0, $$1));
         return this;
      }

      public cpb c() {
         float $$0 = coz.a(this.a, this.b);
         return new cpb(this.a, $$0, this.c, this.d, this.e.build());
      }
   }

   public static record b(brl c, float d) {
      public static final Codec<cpb.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brl.d.fieldOf("effect").forGetter(cpb.b::a), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(cpb.b::b))
               .apply($$0, cpb.b::new)
      );
      public static final ys<wf, cpb.b> b = ys.a(brl.e, cpb.b::a, yq.i, cpb.b::b, cpb.b::new);

      public brl a() {
         return new brl(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
