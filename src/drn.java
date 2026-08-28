import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drn extends dle implements dkx {
   public static final MapCodec<drn> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyb.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, drn::new)
   );
   public static final dzm f = dzc.aX;
   private static final fdo a = dku.b(12.0, 0.0, 12.0);
   protected final dyb g;

   @Override
   public MapCodec<? extends drn> a() {
      return e;
   }

   protected drn(dyb $$0, dyl.d $$1) {
      super($$1);
      this.g = $$0;
      this.l(this.B.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return a;
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$1.A($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arn $$0, jj $$1, dym $$2, azs $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 260);
      } else {
         this.g.a($$0, $$0.m().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return true;
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(f);
   }
}
