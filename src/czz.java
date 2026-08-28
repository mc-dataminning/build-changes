import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface czz extends daa {
   Codec<czz> b = lq.aw.r().dispatch(czz::a, Function.identity());

   static MapCodec<? extends czz> a(jw<MapCodec<? extends czz>> $$0) {
      jw.a($$0, "all_of", czt.a.a);
      jw.a($$0, "apply_mob_effect", czu.a);
      jw.a($$0, "damage_entity", czv.a);
      jw.a($$0, "damage_item", czx.a);
      jw.a($$0, "explode", dac.a);
      jw.a($$0, "ignite", dad.a);
      jw.a($$0, "play_sound", daf.a);
      jw.a($$0, "replace_block", dah.a);
      jw.a($$0, "replace_disc", dai.a);
      jw.a($$0, "run_function", daj.a);
      jw.a($$0, "set_block_properties", dak.a);
      jw.a($$0, "spawn_particles", dam.a);
      return jw.a($$0, "summon_entity", dan.a);
   }

   void a(aqk var1, int var2, czi var3, bsd var4, evz var5);

   @Override
   default void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends czz> a();
}
