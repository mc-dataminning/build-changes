import com.mojang.serialization.Codec;

public class dsf extends drw {
   public static final Codec<dsf> b = dfe.b.fieldOf("state").xmap(dsf::new, $$0 -> $$0.c).codec();
   private final dfe c;

   protected dsf(dfe $$0) {
      this.c = $$0;
   }

   @Override
   protected drx<?> a() {
      return drx.a;
   }

   @Override
   public dfe a(arx $$0, gw $$1) {
      return this.c;
   }
}
