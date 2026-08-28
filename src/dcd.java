import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dcd extends dce {
   Codec<dcd> b = lx.au.q().dispatch(dcd::a, Function.identity());

   static MapCodec<? extends dcd> a(kc<MapCodec<? extends dcd>> $$0) {
      kc.a($$0, "all_of", dbx.a.a);
      kc.a($$0, "apply_mob_effect", dby.a);
      kc.a($$0, "damage_entity", dbz.a);
      kc.a($$0, "damage_item", dcb.a);
      kc.a($$0, "explode", dcg.a);
      kc.a($$0, "ignite", dch.a);
      kc.a($$0, "play_sound", dcj.a);
      kc.a($$0, "replace_block", dcl.a);
      kc.a($$0, "replace_disk", dcm.a);
      kc.a($$0, "run_function", dcn.a);
      kc.a($$0, "set_block_properties", dco.a);
      kc.a($$0, "spawn_particles", dcq.a);
      return kc.a($$0, "summon_entity", dcr.a);
   }

   void a(arm var1, int var2, dbl var3, btz var4, ezh var5);

   @Override
   default void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dcd> a();
}
