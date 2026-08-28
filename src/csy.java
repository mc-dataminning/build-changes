import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csy(int c, float d, boolean e) implements czv {
   public static final Codec<csy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.l.fieldOf("nutrition").forGetter(csy::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(csy::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(csy::c)
            )
            .apply($$0, csy::new)
   );
   public static final zt<xg, csy> b = zt.a(zr.h, csy::a, zr.l, csy::b, zr.b, csy::c, csy::new);

   @Override
   public void a(dhh $$0, bwf $$1, cxo $$2, czu $$3) {
      bam $$4 = $$1.dZ();
      $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), $$3.e().a(), axg.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cpw $$5) {
         $$5.gt().a(this);
         $$0.a(null, $$5.dB(), $$5.dD(), $$5.dH(), axf.uD, axg.h, 0.5F, bae.b($$4, 0.9F, 1.0F));
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

      public csy.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public csy.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public csy.a a() {
         this.c = true;
         return this;
      }

      public csy b() {
         float $$0 = csw.a(this.a, this.b);
         return new csy(this.a, $$0, this.c);
      }
   }
}
