import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;

public class dwb implements dvw {
   public static final Codec<dwb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kf.e.q().fieldOf("block").flatXmap(dwb::a, DataResult::success).orElse((ddn)cyq.fg).forGetter($$0x -> $$0x.b),
               Codec.intRange(1, 64).fieldOf("search_range").orElse(10).forGetter($$0x -> $$0x.c),
               Codec.BOOL.fieldOf("can_place_on_floor").orElse(false).forGetter($$0x -> $$0x.d),
               Codec.BOOL.fieldOf("can_place_on_ceiling").orElse(false).forGetter($$0x -> $$0x.e),
               Codec.BOOL.fieldOf("can_place_on_wall").orElse(false).forGetter($$0x -> $$0x.f),
               Codec.floatRange(0.0F, 1.0F).fieldOf("chance_of_spreading").orElse(0.5F).forGetter($$0x -> $$0x.g),
               ix.a(kg.f).fieldOf("can_be_placed_on").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, dwb::new)
   );
   public final ddn b;
   public final int c;
   public final boolean d;
   public final boolean e;
   public final boolean f;
   public final float g;
   public final in<cyo> h;
   private final ObjectArrayList<ie> i;

   private static DataResult<ddn> a(cyo $$0) {
      return $$0 instanceof ddn $$1 ? DataResult.success($$1) : DataResult.error(() -> "Growth block should be a multiface block");
   }

   public dwb(ddn $$0, int $$1, boolean $$2, boolean $$3, boolean $$4, float $$5, in<cyo> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = new ObjectArrayList(6);
      if ($$3) {
         this.i.add(ie.b);
      }

      if ($$2) {
         this.i.add(ie.a);
      }

      if ($$4) {
         ie.c.a.forEach(this.i::add);
      }
   }

   public List<ie> a(awo $$0, ie $$1) {
      return ac.a(this.i.stream().filter($$1x -> $$1x != $$1), $$0);
   }

   public List<ie> a(awo $$0) {
      return ac.a(this.i, $$0);
   }
}
