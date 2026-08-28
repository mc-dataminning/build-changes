import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cvy(int c, float d, boolean e) implements dcq {
   public static final Codec<cvy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azg.l.fieldOf("nutrition").forGetter(cvy::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(cvy::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cvy::c)
            )
            .apply($$0, cvy::new)
   );
   public static final ze<wp, cvy> b = ze.a(zc.h, cvy::a, zc.l, cvy::b, zc.b, cvy::c, cvy::new);

   @Override
   public void a(dkj $$0, byf $$1, dak $$2, dcp $$3) {
      bai $$4 = $$1.dY();
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$3.e().a(), awz.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof csi $$5) {
         $$5.gu().a(this);
         $$0.a(null, $$5.dA(), $$5.dC(), $$5.dG(), awy.uX, awz.h, 0.5F, azz.b($$4, 0.9F, 1.0F));
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

      public cvy.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cvy.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cvy.a a() {
         this.c = true;
         return this;
      }

      public cvy b() {
         float $$0 = cvw.a(this.a, this.b);
         return new cvy(this.a, $$0, this.c);
      }
   }
}
