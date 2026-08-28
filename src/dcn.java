import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dcn extends dco {
   Codec<dcn> b = lz.au.q().dispatch(dcn::a, Function.identity());

   static MapCodec<? extends dcn> a(kd<MapCodec<? extends dcn>> $$0) {
      kd.a($$0, "all_of", dch.a.a);
      kd.a($$0, "apply_mob_effect", dci.a);
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

   void a(arq var1, int var2, dbv var3, bui var4, ezr var5);

   @Override
   default void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dcn> a();
}
