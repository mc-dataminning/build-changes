import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dce {
   Codec<dce> c = lx.av.q().dispatch(dce::a, Function.identity());

   static MapCodec<? extends dce> b(kc<MapCodec<? extends dce>> $$0) {
      kc.a($$0, "all_of", dbx.b.a);
      kc.a($$0, "apply_mob_effect", dby.a);
      kc.a($$0, "attribute", dcc.a);
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

   void a(arm var1, int var2, dbl var3, btz var4, ezh var5, boolean var6);

   default void a(dbl $$0, btz $$1, ezh $$2, int $$3) {
   }

   MapCodec<? extends dce> a();
}
