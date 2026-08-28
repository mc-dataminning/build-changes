import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface daq extends dar {
   Codec<daq> b = lt.aw.r().dispatch(daq::a, Function.identity());

   static MapCodec<? extends daq> a(jz<MapCodec<? extends daq>> $$0) {
      jz.a($$0, "all_of", dak.a.a);
      jz.a($$0, "apply_mob_effect", dal.a);
      jz.a($$0, "damage_entity", dam.a);
      jz.a($$0, "damage_item", dao.a);
      jz.a($$0, "explode", dat.a);
      jz.a($$0, "ignite", dau.a);
      jz.a($$0, "play_sound", daw.a);
      jz.a($$0, "replace_block", day.a);
      jz.a($$0, "replace_disc", daz.a);
      jz.a($$0, "run_function", dba.a);
      jz.a($$0, "set_block_properties", dbb.a);
      jz.a($$0, "spawn_particles", dbd.a);
      return jz.a($$0, "summon_entity", dbe.a);
   }

   void a(aqt var1, int var2, czz var3, bsq var4, eww var5);

   @Override
   default void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   MapCodec<? extends daq> a();
}
