import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dua extends dwq implements dnh {
   public static final MapCodec<dua> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eau.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dua::new)
   );
   public static final ecg f = ebw.aX;
   private static final fgm a = dne.b(12.0, 0.0, 12.0);
   protected final eau g;

   @Override
   public MapCodec<? extends dua> a() {
      return e;
   }

   protected dua(eau $$0, ebf.d $$1) {
      super($$1);
      this.g = $$0;
      this.l(this.C.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return a;
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$1.B($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aru $$0, iw $$1, ebg $$2, azz $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 260);
      } else {
         this.g.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return true;
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(f);
   }
}
