import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dck {
   Codec<dck> c = ly.av.q().dispatch(dck::a, Function.identity());

   static MapCodec<? extends dck> b(kd<MapCodec<? extends dck>> $$0) {
      kd.a($$0, "all_of", dcd.b.a);
      kd.a($$0, "apply_mob_effect", dce.a);
      kd.a($$0, "attribute", dci.a);
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

   void a(arn var1, int var2, dbr var3, bue var4, ezn var5, boolean var6);

   default void a(dbr $$0, bue $$1, ezn $$2, int $$3) {
   }

   MapCodec<? extends dck> a();
}
