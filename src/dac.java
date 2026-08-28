import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dac extends dad {
   Codec<dac> b = lq.aw.r().dispatch(dac::a, Function.identity());

   static MapCodec<? extends dac> a(jw<MapCodec<? extends dac>> $$0) {
      jw.a($$0, "all_of", czw.a.a);
      jw.a($$0, "apply_mob_effect", czx.a);
      jw.a($$0, "damage_entity", czy.a);
      jw.a($$0, "damage_item", daa.a);
      jw.a($$0, "explode", daf.a);
      jw.a($$0, "ignite", dag.a);
      jw.a($$0, "play_sound", dai.a);
      jw.a($$0, "replace_block", dak.a);
      jw.a($$0, "replace_disc", dal.a);
      jw.a($$0, "run_function", dam.a);
      jw.a($$0, "set_block_properties", dan.a);
      jw.a($$0, "spawn_particles", dap.a);
      return jw.a($$0, "summon_entity", daq.a);
   }

   void a(aqm var1, int var2, czl var3, bsh var4, ewh var5);

   @Override
   default void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dac> a();
}
