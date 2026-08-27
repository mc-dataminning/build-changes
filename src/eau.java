import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eau implements eay {
   public static final Codec<eau> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dpy.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dpy.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bnv.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bnv.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eau::new)
   );
   private final dpy b;
   private final dpy c;
   private final bnv d;
   private final bnv e;

   public eau(dpy $$0, dpy $$1, bnv $$2, bnv $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dpy a() {
      return this.b;
   }

   public dpy b() {
      return this.c;
   }

   public bnv c() {
      return this.d;
   }

   public bnv d() {
      return this.e;
   }
}
