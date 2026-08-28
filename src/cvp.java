import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cvp(int c, float d, boolean e) implements dcg {
   public static final Codec<cvp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayy.l.fieldOf("nutrition").forGetter(cvp::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(cvp::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cvp::c)
            )
            .apply($$0, cvp::new)
   );
   public static final za<wn, cvp> b = za.a(yy.h, cvp::a, yy.l, cvp::b, yy.b, cvp::c, cvp::new);

   @Override
   public void a(djz $$0, bxw $$1, daa $$2, dcf $$3) {
      azz $$4 = $$1.dY();
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$3.e().a(), aws.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof crz $$5) {
         $$5.gu().a(this);
         $$0.a(null, $$5.dA(), $$5.dC(), $$5.dG(), awr.uX, aws.h, 0.5F, azq.b($$4, 0.9F, 1.0F));
      }
   }

   public int a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }

   public static class a {
      private int a;
      private float b;
      private boolean c;

      public cvp.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cvp.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cvp.a a() {
         this.c = true;
         return this;
      }

      public cvp b() {
         float $$0 = cvn.a(this.a, this.b);
         return new cvp(this.a, $$0, this.c);
      }
   }
}
