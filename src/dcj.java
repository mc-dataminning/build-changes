import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dcj extends dck {
   Codec<dcj> b = ly.au.q().dispatch(dcj::a, Function.identity());

   static MapCodec<? extends dcj> a(kd<MapCodec<? extends dcj>> $$0) {
      kd.a($$0, "all_of", dcd.a.a);
      kd.a($$0, "apply_mob_effect", dce.a);
      kd.a($$0, "damage_entity", dcf.a);
      kd.a($$0, "damage_item", dch.a);
      kd.a($$0, "explode", dcm.a);
      kd.a($$0, "ignite", dcn.a);
      kd.a($$0, "play_sound", dcp.a);
      kd.a($$0, "replace_block", dcr.a);
      kd.a($$0, "replace_disk", dcs.a);
      kd.a($$0, "run_function", dct.a);
      kd.a($$0, "set_block_properties", dcu.a);
      kd.a($$0, "spawn_particles", dcw.a);
      return kd.a($$0, "summon_entity", dcx.a);
   }

   void a(arn var1, int var2, dbr var3, bue var4, ezn var5);

   @Override
   default void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dcj> a();
}
