import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dhe extends dhf {
   Codec<dhe> b = mh.as.q().dispatch(dhe::a, Function.identity());

   static MapCodec<? extends dhe> a(jt<MapCodec<? extends dhe>> $$0) {
      jt.a($$0, "all_of", dgy.a.a);
      jt.a($$0, "apply_mob_effect", dgz.a);
      jt.a($$0, "change_item_damage", dha.a);
      jt.a($$0, "damage_entity", dhb.a);
      jt.a($$0, "explode", dhh.a);
      jt.a($$0, "ignite", dhi.a);
      jt.a($$0, "play_sound", dhk.a);
      jt.a($$0, "replace_block", dhm.a);
      jt.a($$0, "replace_disk", dhn.a);
      jt.a($$0, "run_function", dho.a);
      jt.a($$0, "set_block_properties", dhp.a);
      jt.a($$0, "spawn_particles", dhr.a);
      return jt.a($$0, "summon_entity", dhs.a);
   }

   void a(aru var1, int var2, dgm var3, bwv var4, ffs var5);

   @Override
   default void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dhe> a();
}
