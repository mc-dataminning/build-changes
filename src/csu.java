import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csu(int c, float d, boolean e) implements czr {
   public static final Codec<csu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.l.fieldOf("nutrition").forGetter(csu::a),
               Codec.FLOAT.fieldOf("saturation").forGetter(csu::b),
               Codec.BOOL.optionalFieldOf("can_always_eat", false).forGetter(csu::c)
            )
            .apply($$0, csu::new)
   );
   public static final zt<xg, csu> b = zt.a(zr.h, csu::a, zr.l, csu::b, zr.b, csu::c, csu::new);

   @Override
   public void a(dha $$0, bwb $$1, cxk $$2, czq $$3) {
      bam $$4 = $$1.dY();
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), $$3.e().a(), axg.g, 1.0F, $$4.a(1.0F, 0.4F));
      if ($$1 instanceof cps $$5) {
         $$5.gr().a(this);
         $$0.a(null, $$5.dA(), $$5.dC(), $$5.dG(), axf.uC, axg.h, 0.5F, bae.b($$4, 0.9F, 1.0F));
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

      public csu.a a(int $$0) {
         this.a = $$0;
         return this;
      }

      public csu.a a(float $$0) {
         this.b = $$0;
         return this;
      }

      public csu.a a() {
         this.c = true;
         return this;
      }

      public csu b() {
         float $$0 = css.a(this.a, this.b);
         return new csu(this.a, $$0, this.c);
      }
   }
}
