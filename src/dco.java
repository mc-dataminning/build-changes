import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dco {
   Codec<dco> c = lz.av.q().dispatch(dco::a, Function.identity());

   static MapCodec<? extends dco> b(kd<MapCodec<? extends dco>> $$0) {
      kd.a($$0, "all_of", dch.b.a);
      kd.a($$0, "apply_mob_effect", dci.a);
      kd.a($$0, "attribute", dcm.a);
      kd.a($$0, "damage_entity", dcj.a);
      kd.a($$0, "damage_item", dcl.a);
      kd.a($$0, "explode", dcq.a);
      kd.a($$0, "ignite", dcr.a);
      kd.a($$0, "play_sound", dct.a);
      kd.a($$0, "replace_block", dcv.a);
      kd.a($$0, "replace_disk", dcw.a);
      kd.a($$0, "run_function", dcx.a);
      kd.a($$0, "set_block_properties", dcy.a);
      kd.a($$0, "spawn_particles", dda.a);
      return kd.a($$0, "summon_entity", ddb.a);
   }

   void a(arq var1, int var2, dbv var3, bui var4, ezr var5, boolean var6);

   default void a(dbv $$0, bui $$1, ezr $$2, int $$3) {
   }

   MapCodec<? extends dco> a();
}
