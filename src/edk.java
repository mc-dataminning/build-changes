import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edk implements edo {
   public static final Codec<edk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsk.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dsk.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bpl.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bpl.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, edk::new)
   );
   private final dsk b;
   private final dsk c;
   private final bpl d;
   private final bpl e;

   public edk(dsk $$0, dsk $$1, bpl $$2, bpl $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dsk a() {
      return this.b;
   }

   public dsk b() {
      return this.c;
   }

   public bpl c() {
      return this.d;
   }

   public bpl d() {
      return this.e;
   }
}
