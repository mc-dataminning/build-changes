import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejl(eku b, boolean c) implements eit {
   public static final Codec<ejl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eku.a.fieldOf("to_place").forGetter($$0x -> $$0x.b), Codec.BOOL.optionalFieldOf("schedule_tick", false).forGetter($$0x -> $$0x.c))
            .apply($$0, ejl::new)
   );

   public ejl(eku $$0) {
      this($$0, false);
   }

   public eku a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
