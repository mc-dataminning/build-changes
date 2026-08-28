import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejh implements eis {
   public static final Codec<ejh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxn.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dxn.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               bsj.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ejh::new)
   );
   public final dxn b;
   public final dxn c;
   private final bsj d;

   public ejh(dxn $$0, dxn $$1, bsj $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bsj a() {
      return this.d;
   }
}
