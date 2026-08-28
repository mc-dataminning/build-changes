import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dhc extends dhd {
   Codec<dhc> b = mg.as.q().dispatch(dhc::a, Function.identity());

   static MapCodec<? extends dhc> a(js<MapCodec<? extends dhc>> $$0) {
      js.a($$0, "all_of", dgw.a.a);
      js.a($$0, "apply_mob_effect", dgx.a);
      js.a($$0, "change_item_damage", dgy.a);
      js.a($$0, "damage_entity", dgz.a);
      js.a($$0, "explode", dhf.a);
      js.a($$0, "ignite", dhg.a);
      js.a($$0, "play_sound", dhi.a);
      js.a($$0, "replace_block", dhk.a);
      js.a($$0, "replace_disk", dhl.a);
      js.a($$0, "run_function", dhm.a);
      js.a($$0, "set_block_properties", dhn.a);
      js.a($$0, "spawn_particles", dhp.a);
      return js.a($$0, "summon_entity", dhq.a);
   }

   void a(ars var1, int var2, dgk var3, bwt var4, ffq var5);

   @Override
   default void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dhc> a();
}
