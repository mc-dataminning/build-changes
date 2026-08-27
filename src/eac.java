import com.mojang.serialization.Codec;

public class eac extends dzv {
   public static final Codec<eac> b = dmz.b.fieldOf("state").xmap(dmy.a::b, daa::o).xmap(eac::new, $$0 -> $$0.c).codec();
   private final daa c;

   public eac(daa $$0) {
      this.c = $$0;
   }

   @Override
   protected dzw<?> a() {
      return dzw.f;
   }

   @Override
   public dmz a(axd $$0, ib $$1) {
      ih.a $$2 = ih.a.a($$0);
      return this.c.o().a(dgl.i, $$2);
   }
}
