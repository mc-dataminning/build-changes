import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record cpf(int c, float d, boolean e, float f, Optional<cud> g, List<cpf.b> h) {
   private static final float i = 1.6F;
   public static final Codec<cpf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.k.fieldOf("nutrition").forGetter(cpf::b),
               Codec.FLOAT.fieldOf("saturation").forGetter(cpf::c),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cpf::d),
               axo.m.optionalFieldOf("eat_seconds", 1.6F).forGetter(cpf::e),
               cud.c.optionalFieldOf("using_converts_to").forGetter(cpf::f),
               cpf.b.a.listOf().optionalFieldOf("effects", List.of()).forGetter(cpf::g)
            )
            .apply($$0, cpf::new)
   );
   public static final ys<wf, cpf> b = ys.a(yq.g, cpf::b, yq.i, cpf::c, yq.b, cpf::d, yq.i, cpf::e, cud.i.a(yq::a), cpf::f, cpf.b.b.a(yq.a()), cpf::g, cpf::new);

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

   public Optional<cud> f() {
      return this.g;
   }

   public List<cpf.b> g() {
      return this.h;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private Optional<cud> e = Optional.empty();
      private final Builder<cpf.b> f = ImmutableList.builder();

      public cpf.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cpf.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cpf.a a() {
         this.c = true;
         return this;
      }

      public cpf.a b() {
         this.d = 0.8F;
         return this;
      }

      public cpf.a a(brp $$0, float $$1) {
         this.f.add(new cpf.b($$0, $$1));
         return this;
      }

      public cpf.a a(dcf $$0) {
         this.e = Optional.of(new cud($$0));
         return this;
      }

      public cpf c() {
         float $$0 = cpd.a(this.a, this.b);
         return new cpf(this.a, $$0, this.c, this.d, this.e, this.f.build());
      }
   }

   public static record b(brp c, float d) {
      public static final Codec<cpf.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brp.d.fieldOf("effect").forGetter(cpf.b::a), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(cpf.b::b))
               .apply($$0, cpf.b::new)
      );
      public static final ys<wf, cpf.b> b = ys.a(brp.e, cpf.b::a, yq.i, cpf.b::b, cpf.b::new);

      public brp a() {
         return new brp(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
