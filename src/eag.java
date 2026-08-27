import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eag extends eau {
   public static final Codec<eag> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.FLOAT.fieldOf("min_chance").orElse(0.0F).forGetter($$0x -> $$0x.b),
               Codec.FLOAT.fieldOf("max_chance").orElse(0.0F).forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("min_dist").orElse(0).forGetter($$0x -> $$0x.e),
               Codec.INT.fieldOf("max_dist").orElse(0).forGetter($$0x -> $$0x.f),
               hx.a.e.fieldOf("axis").orElse(hx.a.b).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eag::new)
   );
   private final float b;
   private final float d;
   private final int e;
   private final int f;
   private final hx.a g;

   public eag(float $$0, float $$1, int $$2, int $$3, hx.a $$4) {
      if ($$2 >= $$3) {
         throw new IllegalArgumentException("Invalid range: [" + $$2 + "," + $$3 + "]");
      } else {
         this.b = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
      }
   }

   @Override
   public boolean a(ht $$0, ht $$1, ht $$2, ats $$3) {
      hx $$4 = hx.a(hx.b.a, this.g);
      float $$5 = (float)Math.abs(($$1.u() - $$2.u()) * $$4.j());
      float $$6 = (float)Math.abs(($$1.v() - $$2.v()) * $$4.k());
      float $$7 = (float)Math.abs(($$1.w() - $$2.w()) * $$4.l());
      int $$8 = (int)($$5 + $$6 + $$7);
      float $$9 = $$3.i();
      return $$9 <= atm.b(this.b, this.d, atm.g((float)$$8, (float)this.e, (float)this.f));
   }

   @Override
   protected eav<?> a() {
      return eav.c;
   }
}
