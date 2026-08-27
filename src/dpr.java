import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpr implements dpv {
   public static final Codec<dpr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfe.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dfe.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bfy.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bfy.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dpr::new)
   );
   private final dfe b;
   private final dfe c;
   private final bfy d;
   private final bfy e;

   public dpr(dfe $$0, dfe $$1, bfy $$2, bfy $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dfe a() {
      return this.b;
   }

   public dfe b() {
      return this.c;
   }

   public bfy c() {
      return this.d;
   }

   public bfy d() {
      return this.e;
   }
}
