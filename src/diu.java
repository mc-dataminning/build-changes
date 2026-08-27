import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class diu extends dcq implements dck {
   public static final MapCodec<diu> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dox.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, diu::new)
   );
   public static final dqi f = dpy.aU;
   protected static final float g = 6.0F;
   protected static final etc h = dch.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dox i;

   @Override
   public MapCodec<? extends diu> a() {
      return e;
   }

   protected diu(dox $$0, dph.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return h;
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(apu $$0, id $$1, dpi $$2, axt $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return true;
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(f);
   }
}
