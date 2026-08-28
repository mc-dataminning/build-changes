import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dcf {
   Codec<dcf> c = lv.aw.q().dispatch(dcf::a, Function.identity());

   static MapCodec<? extends dcf> b(kb<MapCodec<? extends dcf>> $$0) {
      kb.a($$0, "all_of", dby.b.a);
      kb.a($$0, "apply_mob_effect", dbz.a);
      kb.a($$0, "attribute", dcd.a);
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

   void a(arj var1, int var2, dbm var3, btr var4, eyw var5, boolean var6);

   default void a(dbm $$0, btr $$1, eyw $$2, int $$3) {
   }

   MapCodec<? extends dcf> a();
}
