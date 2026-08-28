import com.mojang.serialization.MapCodec;

public class doc extends dqu implements doa {
   public static final MapCodec<doc> c = b(doc::new);

   @Override
   public MapCodec<doc> a() {
      return c;
   }

   public doc(ebd.d $$0) {
      super($$0, jb.a, q_, false);
      this.l(this.C.b().b(r_, Boolean.valueOf(false)));
   }

   @Override
   protected dqv c() {
      return (dqv)dne.td;
   }

   @Override
   protected ebe a(ebe $$0, ebe $$1) {
      return $$1.b(r_, $$0.c(r_));
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return new czy(dac.xH);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      return doa.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(r_);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      $$0.a($$2, $$3.b(r_, Boolean.valueOf(true)), 2);
   }
}
