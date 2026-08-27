import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpy implements dqc {
   public static final Codec<dpy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfl.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dfl.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bgf.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bgf.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dpy::new)
   );
   private final dfl b;
   private final dfl c;
   private final bgf d;
   private final bgf e;

   public dpy(dfl $$0, dfl $$1, bgf $$2, bgf $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dfl a() {
      return this.b;
   }

   public dfl b() {
      return this.c;
   }

   public bgf c() {
      return this.d;
   }

   public bgf d() {
      return this.e;
   }
}
