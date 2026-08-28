import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dgc extends dgd {
   Codec<dgc> b = mf.as.q().dispatch(dgc::a, Function.identity());

   static MapCodec<? extends dgc> a(jr<MapCodec<? extends dgc>> $$0) {
      jr.a($$0, "all_of", dfw.a.a);
      jr.a($$0, "apply_mob_effect", dfx.a);
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

   void a(arq var1, int var2, dfk var3, bwd var4, fei var5);

   @Override
   default void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dgc> a();
}
