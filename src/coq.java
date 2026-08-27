import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record coq(int c, float d, boolean e, float f, List<coq.b> g) {
   private static final float h = 1.6F;
   public static final Codec<coq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axm.i.fieldOf("nutrition").forGetter(coq::b),
               Codec.FLOAT.fieldOf("saturation_modifier").forGetter(coq::c),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(coq::d),
               axm.k.optionalFieldOf("eat_seconds", 1.6F).forGetter(coq::e),
               coq.b.a.listOf().optionalFieldOf("effects", List.of()).forGetter(coq::f)
            )
            .apply($$0, coq::new)
   );
   public static final yv<wi, coq> b = yv.a(yt.f, coq::b, yt.h, coq::c, yt.b, coq::d, yt.h, coq::e, coq.b.b.a(yt.a()), coq::f, coq::new);

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

   public List<coq.b> f() {
      return this.g;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;
      private float d = 1.6F;
      private final Builder<coq.b> e = ImmutableList.builder();

      public coq.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public coq.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public coq.a a() {
         this.c = true;
         return this;
      }

      public coq.a b() {
         this.d = 0.8F;
         return this;
      }

      public coq.a a(brc $$0, float $$1) {
         this.e.add(new coq.b($$0, $$1));
         return this;
      }

      public coq c() {
         return new coq(this.a, this.b, this.c, this.d, this.e.build());
      }
   }

   public static record b(brc c, float d) {
      public static final Codec<coq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brc.d.fieldOf("effect").forGetter(coq.b::a), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(coq.b::b))
               .apply($$0, coq.b::new)
      );
      public static final yv<wi, coq.b> b = yv.a(brc.e, coq.b::a, yt.h, coq.b::b, coq.b::new);

      public brc a() {
         return new brc(this.c);
      }

      public float b() {
         return this.d;
      }
   }
}
