import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface ddr extends dds {
   Codec<ddr> b = mb.au.q().dispatch(ddr::a, Function.identity());

   static MapCodec<? extends ddr> a(ke<MapCodec<? extends ddr>> $$0) {
      ke.a($$0, "all_of", ddl.a.a);
      ke.a($$0, "apply_mob_effect", ddm.a);
      ke.a($$0, "change_item_damage", ddn.a);
      ke.a($$0, "damage_entity", ddo.a);
      ke.a($$0, "explode", ddu.a);
      ke.a($$0, "ignite", ddv.a);
      ke.a($$0, "play_sound", ddx.a);
      ke.a($$0, "replace_block", ddz.a);
      ke.a($$0, "replace_disk", dea.a);
      ke.a($$0, "run_function", deb.a);
      ke.a($$0, "set_block_properties", dec.a);
      ke.a($$0, "spawn_particles", dee.a);
      return ke.a($$0, "summon_entity", def.a);
   }

   void a(ard var1, int var2, dcz var3, bum var4, fbb var5);

   @Override
   default void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends ddr> a();
}
