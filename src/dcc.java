import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dcc {
   Codec<dcc> c = lu.aw.q().dispatch(dcc::a, Function.identity());

   static MapCodec<? extends dcc> b(ka<MapCodec<? extends dcc>> $$0) {
      ka.a($$0, "all_of", dbv.b.a);
      ka.a($$0, "apply_mob_effect", dbw.a);
      ka.a($$0, "attribute", dca.a);
      ka.a($$0, "damage_entity", dbx.a);
      ka.a($$0, "damage_item", dbz.a);
      ka.a($$0, "explode", dce.a);
      ka.a($$0, "ignite", dcf.a);
      ka.a($$0, "play_sound", dch.a);
      ka.a($$0, "replace_block", dcj.a);
      ka.a($$0, "replace_disk", dck.a);
      ka.a($$0, "run_function", dcl.a);
      ka.a($$0, "set_block_properties", dcm.a);
      ka.a($$0, "spawn_particles", dco.a);
      return ka.a($$0, "summon_entity", dcp.a);
   }

   void a(arh var1, int var2, dbj var3, bto var4, eys var5, boolean var6);

   default void a(dbj $$0, bto $$1, eys $$2, int $$3) {
   }

   MapCodec<? extends dcc> a();
}
