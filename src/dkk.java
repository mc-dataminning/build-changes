import com.mojang.serialization.MapCodec;

public class dkk extends dna implements dki {
   public static final MapCodec<dkk> c = b(dkk::new);

   @Override
   public MapCodec<dkk> a() {
      return c;
   }

   public dkk(dwv.d $$0) {
      super($$0, jn.a, s_, false);
      this.l(this.F.b().b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected dnb c() {
      return (dnb)djn.sX;
   }

   @Override
   protected dww a(dww $$0, dww $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return new cwo(cws.xw);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      return dki.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(t_);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
