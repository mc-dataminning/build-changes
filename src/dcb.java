import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dcb extends dcc {
   Codec<dcb> b = lu.av.q().dispatch(dcb::a, Function.identity());

   static MapCodec<? extends dcb> a(ka<MapCodec<? extends dcb>> $$0) {
      ka.a($$0, "all_of", dbv.a.a);
      ka.a($$0, "apply_mob_effect", dbw.a);
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

   void a(arh var1, int var2, dbj var3, bto var4, eys var5);

   @Override
   default void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dcb> a();
}
