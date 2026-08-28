import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctk(int c, float d, boolean e) implements dac {
   public static final Codec<ctk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.l.fieldOf("nutrition").forGetter(ctk::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(ctk::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(ctk::c)
            )
            .apply($$0, ctk::new)
   );
   public static final yt<wg, ctk> b = yt.a(yr.h, ctk::a, yr.l, ctk::b, yr.b, ctk::c, ctk::new);

   @Override
   public void a(dhp $$0, bwr $$1, cxy $$2, dab $$3) {
      azs $$4 = $$1.dY();
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$3.e().a(), awl.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cqi $$5) {
         $$5.gt().a(this);
         $$0.a(null, $$5.dA(), $$5.dC(), $$5.dG(), awk.uT, awl.h, 0.5F, azk.b($$4, 0.9F, 1.0F));
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

      public ctk.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public ctk.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public ctk.a a() {
         this.c = true;
         return this;
      }

      public ctk b() {
         float $$0 = cti.a(this.a, this.b);
         return new ctk(this.a, $$0, this.c);
      }
   }
}
