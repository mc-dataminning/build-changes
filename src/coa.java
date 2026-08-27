import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record coa(int c, float d, boolean e, float f, List<coa.b> g) {
   private static final float h = 1.6F;
   public static final Codec<coa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axh.i.fieldOf("nutrition").forGetter(coa::b),
               Codec.FLOAT.fieldOf("saturation_modifier").forGetter(coa::c),
               axh.a(Codec.BOOL, "can_always_eat", false).forGetter(coa::d),
               axh.a(axh.k, "eat_seconds", 1.6F).forGetter(coa::e),
               axh.a(coa.b.a.listOf(), "effects", List.of()).forGetter(coa::f)
            )
            .apply($$0, coa::new)
   );
   public static final ys<wf, coa> b = ys.a(yq.f, coa::b, yq.h, coa::c, yq.b, coa::d, yq.h, coa::e, coa.b.b.a(yq.a()), coa::f, coa::new);

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

   public List<coa.b> f() {
      return this.g;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private final Builder<coa.b> e = ImmutableList.builder();

      public coa.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public coa.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public coa.a a() {
         this.c = true;
         return this;
      }

      public coa.a b() {
         this.d = 0.8F;
         return this;
      }

      public coa.a a(bqt $$0, float $$1) {
         this.e.add(new coa.b($$0, $$1));
         return this;
      }

      public coa c() {
         return new coa(this.a, this.b, this.c, this.d, this.e.build());
      }
   }

   public static record b(bqt c, float d) {
      public static final Codec<coa.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bqt.d.fieldOf("effect").forGetter(coa.b::a), axh.a(Codec.floatRange(0.0F, 1.0F), "probability", 1.0F).forGetter(coa.b::b))
               .apply($$0, coa.b::new)
      );
      public static final ys<wf, coa.b> b = ys.a(bqt.e, coa.b::a, yq.h, coa.b::b, coa.b::new);

      public bqt a() {
         return new bqt(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
