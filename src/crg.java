import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crg(int c, float d, boolean e) implements cye {
   public static final Codec<crg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.l.fieldOf("nutrition").forGetter(crg::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(crg::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(crg::c)
            )
            .apply($$0, crg::new)
   );
   public static final zf<ws, crg> b = zf.a(zd.h, crg::a, zd.j, crg::b, zd.b, crg::c, crg::new);

   @Override
   public void a(dev $$0, buv $$1, cvx $$2, cyd $$3) {
      azr $$4 = $$1.ea();
      $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), $$3.e().a(), awl.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof coh $$5) {
         $$5.gu().a(this);
         $$0.a(null, $$5.dC(), $$5.dE(), $$5.dI(), awk.ui, awl.h, 0.5F, azj.b($$4, 0.9F, 1.0F));
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

      public crg.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public crg.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public crg.a a() {
         this.c = true;
         return this;
      }

      public crg b() {
         float $$0 = cre.a(this.a, this.b);
         return new crg(this.a, $$0, this.c);
      }
   }
}
