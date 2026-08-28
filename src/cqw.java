import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqw(int c, float d, boolean e) implements cyf {
   public static final Codec<cqw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayo.k.fieldOf("nutrition").forGetter(cqw::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(cqw::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(cqw::c)
            )
            .apply($$0, cqw::new)
   );
   public static final zc<wp, cqw> b = zc.a(za.h, cqw::a, za.j, cqw::b, za.b, cqw::c, cqw::new);

   @Override
   public void a(dej $$0, bun $$1, cvs $$2, cye $$3) {
      azn $$4 = $$1.dV();
      $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), $$3.e().a(), awh.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cnx $$5) {
         $$5.gn().a(this);
         $$0.a(null, $$5.dx(), $$5.dz(), $$5.dD(), awg.uk, awh.h, 0.5F, azf.b($$4, 0.9F, 1.0F));
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

      public cqw.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public cqw.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public cqw.a a() {
         this.c = true;
         return this;
      }

      public cqw b() {
         float $$0 = cqu.a(this.a, this.b);
         return new cqw(this.a, $$0, this.c);
      }
   }
}
