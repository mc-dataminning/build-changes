import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dhf {
   Codec<dhf> c = mh.at.q().dispatch(dhf::a, Function.identity());

   static MapCodec<? extends dhf> b(jt<MapCodec<? extends dhf>> $$0) {
      jt.a($$0, "all_of", dgy.b.a);
      jt.a($$0, "apply_mob_effect", dgz.a);
      jt.a($$0, "attribute", dhd.a);
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

   void a(aru var1, int var2, dgm var3, bwv var4, ffs var5, boolean var6);

   default void a(dgm $$0, bwv $$1, ffs $$2, int $$3) {
   }

   MapCodec<? extends dhf> a();
}
