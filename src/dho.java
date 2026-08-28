import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dho extends dhp {
   Codec<dho> b = mh.as.q().dispatch(dho::a, Function.identity());

   static MapCodec<? extends dho> a(jt<MapCodec<? extends dho>> $$0) {
      jt.a($$0, "all_of", dhi.a.a);
      jt.a($$0, "apply_mob_effect", dhj.a);
      jt.a($$0, "change_item_damage", dhk.a);
      jt.a($$0, "damage_entity", dhl.a);
      jt.a($$0, "explode", dhr.a);
      jt.a($$0, "ignite", dhs.a);
      jt.a($$0, "play_sound", dhu.a);
      jt.a($$0, "replace_block", dhw.a);
      jt.a($$0, "replace_disk", dhx.a);
      jt.a($$0, "run_function", dhy.a);
      jt.a($$0, "set_block_properties", dhz.a);
      jt.a($$0, "spawn_particles", dib.a);
      return jt.a($$0, "summon_entity", dic.a);
   }

   void a(asb var1, int var2, dgw var3, bxe var4, fgc var5);

   @Override
   default void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends dho> a();
}
