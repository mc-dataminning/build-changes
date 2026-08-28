import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crw(int c, float d, boolean e) implements cyt {
   public static final Codec<crw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayv.l.fieldOf("nutrition").forGetter(crw::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(crw::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(crw::c)
            )
            .apply($$0, crw::new)
   );
   public static final zh<wu, crw> b = zh.a(zf.h, crw::a, zf.k, crw::b, zf.b, crw::c, crw::new);

   @Override
   public void a(dfm $$0, bvh $$1, cwm $$2, cys $$3) {
      azu $$4 = $$1.dY();
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$3.e().a(), awo.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cou $$5) {
         $$5.gr().a(this);
         $$0.a(null, $$5.dA(), $$5.dC(), $$5.dG(), awn.ui, awo.h, 0.5F, azm.b($$4, 0.9F, 1.0F));
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

      public crw.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public crw.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public crw.a a() {
         this.c = true;
         return this;
      }

      public crw b() {
         float $$0 = cru.a(this.a, this.b);
         return new crw(this.a, $$0, this.c);
      }
   }
}
