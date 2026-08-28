import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dcv {
   Codec<dcv> c = lz.av.q().dispatch(dcv::a, Function.identity());

   static MapCodec<? extends dcv> b(kd<MapCodec<? extends dcv>> $$0) {
      kd.a($$0, "all_of", dco.b.a);
      kd.a($$0, "apply_mob_effect", dcp.a);
      kd.a($$0, "attribute", dct.a);
      kd.a($$0, "damage_entity", dcq.a);
      kd.a($$0, "damage_item", dcs.a);
      kd.a($$0, "explode", dcx.a);
      kd.a($$0, "ignite", dcy.a);
      kd.a($$0, "play_sound", dda.a);
      kd.a($$0, "replace_block", ddc.a);
      kd.a($$0, "replace_disk", ddd.a);
      kd.a($$0, "run_function", dde.a);
      kd.a($$0, "set_block_properties", ddf.a);
      kd.a($$0, "spawn_particles", ddh.a);
      return kd.a($$0, "summon_entity", ddi.a);
   }

   void a(arp var1, int var2, dcc var3, bul var4, ezy var5, boolean var6);

   default void a(dcc $$0, bul $$1, ezy $$2, int $$3) {
   }

   MapCodec<? extends dcv> a();
}
