import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csz(int c, float d, boolean e) implements czw {
   public static final Codec<csz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.l.fieldOf("nutrition").forGetter(csz::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(csz::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(csz::c)
            )
            .apply($$0, csz::new)
   );
   public static final zt<xg, csz> b = zt.a(zr.h, csz::a, zr.l, csz::b, zr.b, csz::c, csz::new);

   @Override
   public void a(dhi $$0, bwg $$1, cxp $$2, czv $$3) {
      bam $$4 = $$1.dZ();
      $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), $$3.e().a(), axg.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cpx $$5) {
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

      public csz.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public csz.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public csz.a a() {
         this.c = true;
         return this;
      }

      public csz b() {
         float $$0 = csx.a(this.a, this.b);
         return new csz(this.a, $$0, this.c);
      }
   }
}
