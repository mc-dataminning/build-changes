import com.mojang.serialization.MapCodec;

public class cua extends cwp implements ctf, cty {
   public static final MapCodec<cua> c = b(cua::new);

   @Override
   public MapCodec<cua> a() {
      return c;
   }

   public cua(dfc.d $$0) {
      super($$0, ha.a, r_, false);
      this.k(this.E.b().a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected cwq c() {
      return (cwq)cte.ru;
   }

   @Override
   protected dfd a(dfd $$0, dfd $$1) {
      return $$1.a(s_, $$0.c(s_));
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return new cjl(cjo.vw);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      return cty.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(s_);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return !$$2.c(s_);
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      $$0.a($$2, $$3.a(s_, Boolean.valueOf(true)), 2);
   }
}
