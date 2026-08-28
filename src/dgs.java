import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dgs {
   Codec<dgs> c = mg.at.q().dispatch(dgs::a, Function.identity());

   static MapCodec<? extends dgs> b(js<MapCodec<? extends dgs>> $$0) {
      js.a($$0, "all_of", dgl.b.a);
      js.a($$0, "apply_mob_effect", dgm.a);
      js.a($$0, "attribute", dgq.a);
      js.a($$0, "change_item_damage", dgn.a);
      js.a($$0, "damage_entity", dgo.a);
      js.a($$0, "explode", dgu.a);
      js.a($$0, "ignite", dgv.a);
      js.a($$0, "play_sound", dgx.a);
      js.a($$0, "replace_block", dgz.a);
      js.a($$0, "replace_disk", dha.a);
      js.a($$0, "run_function", dhb.a);
      js.a($$0, "set_block_properties", dhc.a);
      js.a($$0, "spawn_particles", dhe.a);
      return js.a($$0, "summon_entity", dhf.a);
   }

   void a(arq var1, int var2, dfz var3, bwi var4, ffc var5, boolean var6);

   default void a(dfz $$0, bwi $$1, ffc $$2, int $$3) {
   }

   MapCodec<? extends dgs> a();
}
