import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dad {
   Codec<dad> c = lq.ax.r().dispatch(dad::a, Function.identity());

   static MapCodec<? extends dad> b(jw<MapCodec<? extends dad>> $$0) {
      jw.a($$0, "all_of", czw.b.a);
      jw.a($$0, "apply_mob_effect", czx.a);
      jw.a($$0, "attribute", dab.a);
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

   void a(aqm var1, int var2, czl var3, bsh var4, ewh var5, boolean var6);

   default void a(czl $$0, bsh $$1, ewh $$2, int $$3) {
   }

   MapCodec<? extends dad> a();
}
