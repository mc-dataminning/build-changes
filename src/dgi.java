import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dgi {
   Codec<dgi> c = mf.at.q().dispatch(dgi::a, Function.identity());

   static MapCodec<? extends dgi> b(jr<MapCodec<? extends dgi>> $$0) {
      jr.a($$0, "all_of", dgb.b.a);
      jr.a($$0, "apply_mob_effect", dgc.a);
      jr.a($$0, "attribute", dgg.a);
      jr.a($$0, "change_item_damage", dgd.a);
      jr.a($$0, "damage_entity", dge.a);
      jr.a($$0, "explode", dgk.a);
      jr.a($$0, "ignite", dgl.a);
      jr.a($$0, "play_sound", dgn.a);
      jr.a($$0, "replace_block", dgp.a);
      jr.a($$0, "replace_disk", dgq.a);
      jr.a($$0, "run_function", dgr.a);
      jr.a($$0, "set_block_properties", dgs.a);
      jr.a($$0, "spawn_particles", dgu.a);
      return jr.a($$0, "summon_entity", dgv.a);
   }

   void a(arq var1, int var2, dfp var3, bwf var4, feq var5, boolean var6);

   default void a(dfp $$0, bwf $$1, feq $$2, int $$3) {
   }

   MapCodec<? extends dgi> a();
}
