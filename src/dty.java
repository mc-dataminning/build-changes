import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dty extends dwo implements dnf {
   public static final MapCodec<dty> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eas.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dty::new)
   );
   public static final ece f = ebu.aX;
   private static final fgk a = dnc.b(12.0, 0.0, 12.0);
   protected final eas g;

   @Override
   public MapCodec<? extends dty> a() {
      return e;
   }

   protected dty(eas $$0, ebd.d $$1) {
      super($$1);
      this.g = $$0;
      this.l(this.C.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return a;
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$1.B($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(ars $$0, iv $$1, ebe $$2, azx $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 260);
      } else {
         this.g.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return true;
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(f);
   }
}
