import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dob extends dhv implements dhp {
   public static final MapCodec<dob> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(duh.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dob::new)
   );
   public static final dvs f = dvi.aU;
   protected static final float g = 6.0F;
   protected static final ezq h = dhm.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final duh i;

   @Override
   public MapCodec<? extends dob> a() {
      return e;
   }

   protected dob(duh $$0, dur.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(this.F.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return h;
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$1.A($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arj $$0, jf $$1, dus $$2, azn $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return true;
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(f);
   }
}
