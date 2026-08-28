import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface ddr {
   Codec<ddr> c = mb.av.q().dispatch(ddr::a, Function.identity());

   static MapCodec<? extends ddr> b(ke<MapCodec<? extends ddr>> $$0) {
      ke.a($$0, "all_of", ddk.b.a);
      ke.a($$0, "apply_mob_effect", ddl.a);
      ke.a($$0, "attribute", ddp.a);
      ke.a($$0, "change_item_damage", ddm.a);
      ke.a($$0, "damage_entity", ddn.a);
      ke.a($$0, "explode", ddt.a);
      ke.a($$0, "ignite", ddu.a);
      ke.a($$0, "play_sound", ddw.a);
      ke.a($$0, "replace_block", ddy.a);
      ke.a($$0, "replace_disk", ddz.a);
      ke.a($$0, "run_function", dea.a);
      ke.a($$0, "set_block_properties", deb.a);
      ke.a($$0, "spawn_particles", ded.a);
      return ke.a($$0, "summon_entity", dee.a);
   }

   void a(arc var1, int var2, dcy var3, buk var4, fba var5, boolean var6);

   default void a(dcy $$0, buk $$1, fba $$2, int $$3) {
   }

   MapCodec<? extends ddr> a();
}
