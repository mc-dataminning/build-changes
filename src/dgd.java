import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dgd {
   Codec<dgd> c = mf.at.q().dispatch(dgd::a, Function.identity());

   static MapCodec<? extends dgd> b(jr<MapCodec<? extends dgd>> $$0) {
      jr.a($$0, "all_of", dfw.b.a);
      jr.a($$0, "apply_mob_effect", dfx.a);
      jr.a($$0, "attribute", dgb.a);
      jr.a($$0, "change_item_damage", dfy.a);
      jr.a($$0, "damage_entity", dfz.a);
      jr.a($$0, "explode", dgf.a);
      jr.a($$0, "ignite", dgg.a);
      jr.a($$0, "play_sound", dgi.a);
      jr.a($$0, "replace_block", dgk.a);
      jr.a($$0, "replace_disk", dgl.a);
      jr.a($$0, "run_function", dgm.a);
      jr.a($$0, "set_block_properties", dgn.a);
      jr.a($$0, "spawn_particles", dgp.a);
      return jr.a($$0, "summon_entity", dgq.a);
   }

   void a(arq var1, int var2, dfk var3, bwd var4, fei var5, boolean var6);

   default void a(dfk $$0, bwd $$1, fei $$2, int $$3) {
   }

   MapCodec<? extends dgd> a();
}
