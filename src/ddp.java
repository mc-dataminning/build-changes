import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface ddp extends ddq {
   Codec<ddp> b = mb.au.q().dispatch(ddp::a, Function.identity());

   static MapCodec<? extends ddp> a(ke<MapCodec<? extends ddp>> $$0) {
      ke.a($$0, "all_of", ddj.a.a);
      ke.a($$0, "apply_mob_effect", ddk.a);
      ke.a($$0, "change_item_damage", ddl.a);
      ke.a($$0, "damage_entity", ddm.a);
      ke.a($$0, "explode", dds.a);
      ke.a($$0, "ignite", ddt.a);
      ke.a($$0, "play_sound", ddv.a);
      ke.a($$0, "replace_block", ddx.a);
      ke.a($$0, "replace_disk", ddy.a);
      ke.a($$0, "run_function", ddz.a);
      ke.a($$0, "set_block_properties", dea.a);
      ke.a($$0, "spawn_particles", dec.a);
      return ke.a($$0, "summon_entity", ded.a);
   }

   void a(ard var1, int var2, dcx var3, buk var4, faz var5);

   @Override
   default void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends ddp> a();
}
