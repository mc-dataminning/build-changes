import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuh(int c, float d, boolean e) implements day {
   public static final Codec<cuh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.l.fieldOf("nutrition").forGetter(cuh::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(cuh::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cuh::c)
            )
            .apply($$0, cuh::new)
   );
   public static final yu<wh, cuh> b = yu.a(ys.h, cuh::a, ys.l, cuh::b, ys.b, cuh::c, cuh::new);

   @Override
   public void a(dip $$0, bwz $$1, cys $$2, dax $$3) {
      azt $$4 = $$1.dY();
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$3.e().a(), awm.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cqs $$5) {
         $$5.gt().a(this);
         $$0.a(null, $$5.dA(), $$5.dC(), $$5.dG(), awl.uT, awm.h, 0.5F, azk.b($$4, 0.9F, 1.0F));
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

      public cuh.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cuh.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cuh.a a() {
         this.c = true;
         return this;
      }

      public cuh b() {
         float $$0 = cuf.a(this.a, this.b);
         return new cuh(this.a, $$0, this.c);
      }
   }
}
