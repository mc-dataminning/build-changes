import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzd implements eay {
   public static final Codec<dzd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpy.b.fieldOf("valid_base_block").forGetter($$0x -> $$0x.b),
               dpy.b.fieldOf("stem_state").forGetter($$0x -> $$0x.c),
               dpy.b.fieldOf("hat_state").forGetter($$0x -> $$0x.d),
               dpy.b.fieldOf("decor_state").forGetter($$0x -> $$0x.e),
               dwx.b.fieldOf("replaceable_blocks").forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("planted").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dzd::new)
   );
   public final dpy b;
   public final dpy c;
   public final dpy d;
   public final dpy e;
   public final dwx f;
   public final boolean g;

   public dzd(dpy $$0, dpy $$1, dpy $$2, dpy $$3, dwx $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }
}
