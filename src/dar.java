import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface dar {
   Codec<dar> c = lt.ax.r().dispatch(dar::a, Function.identity());

   static MapCodec<? extends dar> b(jz<MapCodec<? extends dar>> $$0) {
      jz.a($$0, "all_of", dak.b.a);
      jz.a($$0, "apply_mob_effect", dal.a);
      jz.a($$0, "attribute", dap.a);
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

   void a(aqt var1, int var2, czz var3, bsq var4, eww var5, boolean var6);

   default void a(czz $$0, bsq $$1, eww $$2, int $$3) {
   }

   MapCodec<? extends dar> a();
}
