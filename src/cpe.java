import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record cpe(int c, float d, boolean e, float f, Optional<cuc> g, List<cpe.b> h) {
   private static final float i = 1.6F;
   public static final Codec<cpe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.k.fieldOf("nutrition").forGetter(cpe::b),
               Codec.FLOAT.fieldOf("saturation").forGetter(cpe::c),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cpe::d),
               axo.m.optionalFieldOf("eat_seconds", 1.6F).forGetter(cpe::e),
               cuc.c.optionalFieldOf("using_converts_to").forGetter(cpe::f),
               cpe.b.a.listOf().optionalFieldOf("effects", List.of()).forGetter(cpe::g)
            )
            .apply($$0, cpe::new)
   );
   public static final ys<wf, cpe> b = ys.a(yq.g, cpe::b, yq.i, cpe::c, yq.b, cpe::d, yq.i, cpe::e, cuc.i.a(yq::a), cpe::f, cpe.b.b.a(yq.a()), cpe::g, cpe::new);

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

   public Optional<cuc> f() {
      return this.g;
   }

   public List<cpe.b> g() {
      return this.h;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private Optional<cuc> e = Optional.empty();
      private final Builder<cpe.b> f = ImmutableList.builder();

      public cpe.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cpe.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cpe.a a() {
         this.c = true;
         return this;
      }

      public cpe.a b() {
         this.d = 0.8F;
         return this;
      }

      public cpe.a a(bro $$0, float $$1) {
         this.f.add(new cpe.b($$0, $$1));
         return this;
      }

      public cpe.a a(dce $$0) {
         this.e = Optional.of(new cuc($$0));
         return this;
      }

      public cpe c() {
         float $$0 = cpc.a(this.a, this.b);
         return new cpe(this.a, $$0, this.c, this.d, this.e, this.f.build());
      }
   }

   public static record b(bro c, float d) {
      public static final Codec<cpe.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bro.d.fieldOf("effect").forGetter(cpe.b::a), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(cpe.b::b))
               .apply($$0, cpe.b::new)
      );
      public static final ys<wf, cpe.b> b = ys.a(bro.e, cpe.b::a, yq.i, cpe.b::b, cpe.b::new);

      public bro a() {
         return new bro(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
