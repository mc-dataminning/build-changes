import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dcu extends dcv {
   Codec<dcu> b = lz.au.q().dispatch(dcu::a, Function.identity());

   static MapCodec<? extends dcu> a(kd<MapCodec<? extends dcu>> $$0) {
      kd.a($$0, "all_of", dco.a.a);
      kd.a($$0, "apply_mob_effect", dcp.a);
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

   void a(arp var1, int var2, dcc var3, bul var4, ezy var5);

   @Override
   default void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dcu> a();
}
