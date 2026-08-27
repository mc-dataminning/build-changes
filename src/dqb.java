import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dqb implements dqc {
   public static final Codec<dqb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(gw.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, dqb::new)
   );
   private final Optional<gw> b;
   private final boolean c;

   private dqb(Optional<gw> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static dqb a(gw $$0, boolean $$1) {
      return new dqb(Optional.of($$0), $$1);
   }

   public static dqb a() {
      return new dqb(Optional.empty(), false);
   }

   public Optional<gw> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
