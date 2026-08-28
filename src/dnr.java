import com.mojang.serialization.MapCodec;

public class dnr extends dqj implements dnp {
   public static final MapCodec<dnr> c = b(dnr::new);

   @Override
   public MapCodec<dnr> a() {
      return c;
   }

   public dnr(eas.d $$0) {
      super($$0, jb.a, s_, false);
      this.l(this.C.b().b(t_, Boolean.valueOf(false)));
   }

   @Override
   protected dqk c() {
      return (dqk)dmt.td;
   }

   @Override
   protected eat a(eat $$0, eat $$1) {
      return $$1.b(t_, $$0.c(t_));
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return new czn(czr.xH);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      return dnp.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(t_);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return !$$2.c(t_);
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      $$0.a($$2, $$3.b(t_, Boolean.valueOf(true)), 2);
   }
}
