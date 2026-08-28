import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dgp {
   Codec<dgp> c = mg.at.q().dispatch(dgp::a, Function.identity());

   static MapCodec<? extends dgp> b(js<MapCodec<? extends dgp>> $$0) {
      js.a($$0, "all_of", dgi.b.a);
      js.a($$0, "apply_mob_effect", dgj.a);
      js.a($$0, "attribute", dgn.a);
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

   void a(arq var1, int var2, dfw var3, bwi var4, fex var5, boolean var6);

   default void a(dfw $$0, bwi $$1, fex $$2, int $$3) {
   }

   MapCodec<? extends dgp> a();
}
