import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface daa {
   Codec<daa> c = lq.ax.r().dispatch(daa::a, Function.identity());

   static MapCodec<? extends daa> b(jw<MapCodec<? extends daa>> $$0) {
      jw.a($$0, "all_of", czt.b.a);
      jw.a($$0, "apply_mob_effect", czu.a);
      jw.a($$0, "attribute", czy.a);
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

   void a(aqk var1, int var2, czi var3, bsd var4, evz var5, boolean var6);

   default void a(czi $$0, bsd $$1, evz $$2, int $$3) {
   }

   MapCodec<? extends daa> a();
}
