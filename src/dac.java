import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dac {
   Codec<dac> c = lq.ax.r().dispatch(dac::a, Function.identity());

   static MapCodec<? extends dac> b(jw<MapCodec<? extends dac>> $$0) {
      jw.a($$0, "all_of", czv.b.a);
      jw.a($$0, "apply_mob_effect", czw.a);
      jw.a($$0, "attribute", daa.a);
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

   void a(aqm var1, int var2, czk var3, bsg var4, ewf var5, boolean var6);

   default void a(czk $$0, bsg $$1, ewf $$2, int $$3) {
   }

   MapCodec<? extends dac> a();
}
