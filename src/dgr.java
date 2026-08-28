import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dgr extends dgs {
   Codec<dgr> b = mg.as.q().dispatch(dgr::a, Function.identity());

   static MapCodec<? extends dgr> a(js<MapCodec<? extends dgr>> $$0) {
      js.a($$0, "all_of", dgl.a.a);
      js.a($$0, "apply_mob_effect", dgm.a);
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

   void a(arq var1, int var2, dfz var3, bwi var4, ffc var5);

   @Override
   default void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dgr> a();
}
