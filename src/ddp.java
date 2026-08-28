import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface ddp {
   Codec<ddp> c = mb.av.q().dispatch(ddp::a, Function.identity());

   static MapCodec<? extends ddp> b(ke<MapCodec<? extends ddp>> $$0) {
      ke.a($$0, "all_of", ddi.b.a);
      ke.a($$0, "apply_mob_effect", ddj.a);
      ke.a($$0, "attribute", ddn.a);
      ke.a($$0, "change_item_damage", ddk.a);
      ke.a($$0, "damage_entity", ddl.a);
      ke.a($$0, "explode", ddr.a);
      ke.a($$0, "ignite", dds.a);
      ke.a($$0, "play_sound", ddu.a);
      ke.a($$0, "replace_block", ddw.a);
      ke.a($$0, "replace_disk", ddx.a);
      ke.a($$0, "run_function", ddy.a);
      ke.a($$0, "set_block_properties", ddz.a);
      ke.a($$0, "spawn_particles", deb.a);
      return ke.a($$0, "summon_entity", dec.a);
   }

   void a(arc var1, int var2, dcw var3, buj var4, fay var5, boolean var6);

   default void a(dcw $$0, buj $$1, fay $$2, int $$3) {
   }

   MapCodec<? extends ddp> a();
}
