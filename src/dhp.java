import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dhp {
   Codec<dhp> c = mh.at.q().dispatch(dhp::a, Function.identity());

   static MapCodec<? extends dhp> b(jt<MapCodec<? extends dhp>> $$0) {
      jt.a($$0, "all_of", dhi.b.a);
      jt.a($$0, "apply_mob_effect", dhj.a);
      jt.a($$0, "attribute", dhn.a);
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

   void a(asb var1, int var2, dgw var3, bxe var4, fgc var5, boolean var6);

   default void a(dgw $$0, bxe $$1, fgc $$2, int $$3) {
   }

   MapCodec<? extends dhp> a();
}
