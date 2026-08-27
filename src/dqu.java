import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqu implements dpv {
   public static final Codec<dqu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqd.b(je.e).fieldOf("replaceable").forGetter($$0x -> $$0x.b),
               drw.a.fieldOf("ground_state").forGetter($$0x -> $$0x.c),
               duh.b.fieldOf("vegetation_feature").forGetter($$0x -> $$0x.d),
               dty.c.fieldOf("surface").forGetter($$0x -> $$0x.e),
               bfy.b(1, 128).fieldOf("depth").forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_bottom_block_chance").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 256).fieldOf("vertical_range").forGetter($$0x -> $$0x.h),
               Codec.floatRange(0.0F, 1.0F).fieldOf("vegetation_chance").forGetter($$0x -> $$0x.i),
               bfy.c.fieldOf("xz_radius").forGetter($$0x -> $$0x.j),
               Codec.floatRange(0.0F, 1.0F).fieldOf("extra_edge_column_chance").forGetter($$0x -> $$0x.k)
            )
            .apply($$0, dqu::new)
   );
   public final aqd<csq> b;
   public final drw c;
   public final hg<duh> d;
   public final dty e;
   public final bfy f;
   public final float g;
   public final int h;
   public final float i;
   public final bfy j;
   public final float k;

   public dqu(aqd<csq> $$0, drw $$1, hg<duh> $$2, dty $$3, bfy $$4, float $$5, int $$6, float $$7, bfy $$8, float $$9) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
   }
}
