import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dom extends dih implements dib {
   public static final MapCodec<dom> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dus.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dom::new)
   );
   public static final dwd f = dvt.aU;
   protected static final float g = 6.0F;
   protected static final fab h = dhy.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dus i;

   @Override
   public MapCodec<? extends dom> a() {
      return e;
   }

   protected dom(dus $$0, dvc.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(this.F.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return h;
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$1.A($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arm $$0, jg $$1, dvd $$2, azr $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return true;
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(f);
   }
}
