import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dce extends dcf {
   Codec<dce> b = lv.av.q().dispatch(dce::a, Function.identity());

   static MapCodec<? extends dce> a(kb<MapCodec<? extends dce>> $$0) {
      kb.a($$0, "all_of", dby.a.a);
      kb.a($$0, "apply_mob_effect", dbz.a);
      kb.a($$0, "damage_entity", dca.a);
      kb.a($$0, "damage_item", dcc.a);
      kb.a($$0, "explode", dch.a);
      kb.a($$0, "ignite", dci.a);
      kb.a($$0, "play_sound", dck.a);
      kb.a($$0, "replace_block", dcm.a);
      kb.a($$0, "replace_disk", dcn.a);
      kb.a($$0, "run_function", dco.a);
      kb.a($$0, "set_block_properties", dcp.a);
      kb.a($$0, "spawn_particles", dcr.a);
      return kb.a($$0, "summon_entity", dcs.a);
   }

   void a(arj var1, int var2, dbm var3, btr var4, eyw var5);

   @Override
   default void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dce> a();
}
