import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dab extends dac {
   Codec<dab> b = lq.aw.r().dispatch(dab::a, Function.identity());

   static MapCodec<? extends dab> a(jw<MapCodec<? extends dab>> $$0) {
      jw.a($$0, "all_of", czv.a.a);
      jw.a($$0, "apply_mob_effect", czw.a);
      jw.a($$0, "damage_entity", czx.a);
      jw.a($$0, "damage_item", czz.a);
      jw.a($$0, "explode", dae.a);
      jw.a($$0, "ignite", daf.a);
      jw.a($$0, "play_sound", dah.a);
      jw.a($$0, "replace_block", daj.a);
      jw.a($$0, "replace_disc", dak.a);
      jw.a($$0, "run_function", dal.a);
      jw.a($$0, "set_block_properties", dam.a);
      jw.a($$0, "spawn_particles", dao.a);
      return jw.a($$0, "summon_entity", dap.a);
   }

   void a(aqm var1, int var2, czk var3, bsg var4, ewf var5);

   @Override
   default void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dab> a();
}
