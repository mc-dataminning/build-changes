import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebn implements eay {
   public static final Codec<ebn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpy.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dpy.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bnv.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ebn::new)
   );
   public final dpy b;
   public final dpy c;
   private final bnv d;

   public ebn(dpy $$0, dpy $$1, bnv $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bnv a() {
      return this.d;
   }
}
