import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;

public class dpz implements dpu {
   public static final Codec<dpz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jb.f.q().fieldOf("block").flatXmap(dpz::a, DataResult::success).orElse((cya)cte.fg).forGetter($$0x -> $$0x.b),
               Codec.intRange(1, 64).fieldOf("search_range").orElse(10).forGetter($$0x -> $$0x.c),
               Codec.BOOL.fieldOf("can_place_on_floor").orElse(false).forGetter($$0x -> $$0x.d),
               Codec.BOOL.fieldOf("can_place_on_ceiling").orElse(false).forGetter($$0x -> $$0x.e),
               Codec.BOOL.fieldOf("can_place_on_wall").orElse(false).forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("chance_of_spreading").orElse(0.5F).forGetter($$0x -> $$0x.g),
               hs.a(jc.e).fieldOf("can_be_placed_on").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dpz::new)
   );
   public final cya b;
   public final int c;
   public final boolean d;
   public final boolean e;
   public final boolean f;
   public final float g;
   public final hi<ctc> h;
   private final ObjectArrayList<ha> i;

   private static DataResult<cya> a(ctc $$0) {
      return $$0 instanceof cya $$1 ? DataResult.success($$1) : DataResult.error(() -> "Growth block should be a multiface block");
   }

   public dpz(cya $$0, int $$1, boolean $$2, boolean $$3, boolean $$4, float $$5, hi<ctc> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = new ObjectArrayList(6);
      if ($$3) {
         this.i.add(ha.b);
      }

      if ($$2) {
         this.i.add(ha.a);
      }

      if ($$4) {
         ha.c.a.forEach(this.i::add);
      }
   }

   public List<ha> a(ash $$0, ha $$1) {
      return ac.a(this.i.stream().filter($$1x -> $$1x != $$1), $$0);
   }

   public List<ha> a(ash $$0) {
      return ac.a(this.i, $$0);
   }
}
