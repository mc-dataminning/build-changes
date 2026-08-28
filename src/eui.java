import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eui extends eux {
   public static final MapCodec<eui> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.FLOAT.fieldOf("min_chance").orElse(0.0F).forGetter($$0x -> $$0x.b),
               Codec.FLOAT.fieldOf("max_chance").orElse(0.0F).forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("min_dist").orElse(0).forGetter($$0x -> $$0x.e),
               Codec.INT.fieldOf("max_dist").orElse(0).forGetter($$0x -> $$0x.f),
               jb.a.e.fieldOf("axis").orElse(jb.a.b).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, eui::new)
   );
   private final float b;
   private final float d;
   private final int e;
   private final int f;
   private final jb.a g;

   public eui(float $$0, float $$1, int $$2, int $$3, jb.a $$4) {
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
   public boolean a(iv $$0, iv $$1, iv $$2, azv $$3) {
      jb $$4 = jb.a(jb.b.a, this.g);
      float $$5 = (float)Math.abs(($$1.u() - $$2.u()) * $$4.j());
      float $$6 = (float)Math.abs(($$1.v() - $$2.v()) * $$4.k());
      float $$7 = (float)Math.abs(($$1.w() - $$2.w()) * $$4.l());
      int $$8 = (int)($$5 + $$6 + $$7);
      float $$9 = $$3.i();
      return $$9 <= azm.b(this.b, this.d, azm.f((float)$$8, (float)this.e, (float)this.f));
   }

   @Override
   protected euy<?> a() {
      return euy.c;
   }
}
