import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bgg extends bgv {
   public bgg(Schema $$0) {
      super($$0, false, "JukeboxTicksSinceSongStartedFix", bia.s, "minecraft:jukebox");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      long $$1 = $$0.get("TickCount").asLong(0L) - $$0.get("RecordStartTick").asLong(0L);
      Dynamic<?> $$2 = $$0.remove("IsPlaying").remove("TickCount").remove("RecordStartTick");
      return $$1 > 0L ? $$2.set("ticks_since_song_started", $$0.createLong($$1)) : $$2;
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}
