import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejp implements eja {
   public static final Codec<ejp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxv.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dxv.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               bso.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ejp::new)
   );
   public final dxv b;
   public final dxv c;
   private final bso d;

   public ejp(dxv $$0, dxv $$1, bso $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bso a() {
      return this.d;
   }
}
