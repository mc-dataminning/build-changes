import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dgo extends dgp {
   Codec<dgo> b = mg.as.q().dispatch(dgo::a, Function.identity());

   static MapCodec<? extends dgo> a(js<MapCodec<? extends dgo>> $$0) {
      js.a($$0, "all_of", dgi.a.a);
      js.a($$0, "apply_mob_effect", dgj.a);
      js.a($$0, "change_item_damage", dgk.a);
      js.a($$0, "damage_entity", dgl.a);
      js.a($$0, "explode", dgr.a);
      js.a($$0, "ignite", dgs.a);
      js.a($$0, "play_sound", dgu.a);
      js.a($$0, "replace_block", dgw.a);
      js.a($$0, "replace_disk", dgx.a);
      js.a($$0, "run_function", dgy.a);
      js.a($$0, "set_block_properties", dgz.a);
      js.a($$0, "spawn_particles", dhb.a);
      return js.a($$0, "summon_entity", dhc.a);
   }

   void a(arq var1, int var2, dfw var3, bwi var4, fex var5);

   @Override
   default void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dgo> a();
}
