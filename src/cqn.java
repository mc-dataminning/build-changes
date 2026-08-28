import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record cqn(int c, float d, boolean e, float f, Optional<cvl> g, List<cqn.b> h) {
   private static final float i = 1.6F;
   public static final Codec<cqn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayl.k.fieldOf("nutrition").forGetter(cqn::b),
               Codec.FLOAT.fieldOf("saturation").forGetter(cqn::c),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cqn::d),
               ayl.m.optionalFieldOf("eat_seconds", 1.6F).forGetter(cqn::e),
               cvl.c.optionalFieldOf("using_converts_to").forGetter(cqn::f),
               cqn.b.a.listOf().optionalFieldOf("effects", List.of()).forGetter(cqn::g)
            )
            .apply($$0, cqn::new)
   );
   public static final zb<wo, cqn> b = zb.a(yz.g, cqn::b, yz.i, cqn::c, yz.b, cqn::d, yz.i, cqn::e, cvl.i.a(yz::a), cqn::f, cqn.b.b.a(yz.a()), cqn::g, cqn::new);

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

   public Optional<cvl> f() {
      return this.g;
   }

   public List<cqn.b> g() {
      return this.h;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private Optional<cvl> e = Optional.empty();
      private final Builder<cqn.b> f = ImmutableList.builder();

      public cqn.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cqn.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cqn.a a() {
         this.c = true;
         return this;
      }

      public cqn.a b() {
         this.d = 0.8F;
         return this;
      }

      public cqn.a a(bsq $$0, float $$1) {
         this.f.add(new cqn.b($$0, $$1));
         return this;
      }

      public cqn.a a(ddr $$0) {
         this.e = Optional.of(new cvl($$0));
         return this;
      }

      public cqn c() {
         float $$0 = cql.a(this.a, this.b);
         return new cqn(this.a, $$0, this.c, this.d, this.e, this.f.build());
      }
   }

   public static record b(bsq c, float d) {
      public static final Codec<cqn.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bsq.d.fieldOf("effect").forGetter(cqn.b::a), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(cqn.b::b))
               .apply($$0, cqn.b::new)
      );
      public static final zb<wo, cqn.b> b = zb.a(bsq.e, cqn.b::a, yz.i, cqn.b::b, cqn.b::new);

      public bsq a() {
         return new bsq(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
