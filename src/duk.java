import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duk extends dxa implements dnr {
   public static final MapCodec<duk> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebe.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, duk::new)
   );
   public static final ecq f = ecg.aX;
   private static final fgw a = dno.b(12.0, 0.0, 12.0);
   protected final ebe g;

   @Override
   public MapCodec<? extends duk> a() {
      return e;
   }

   protected duk(ebe $$0, ebp.d $$1) {
      super($$1);
      this.g = $$0;
      this.l(this.C.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return a;
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$1.B($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(asb $$0, iw $$1, ebq $$2, bai $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 260);
      } else {
         this.g.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return true;
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(f);
   }
}
