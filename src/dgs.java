import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgs extends dgy {
   public static final MapCodec<dgs> a = b(dgs::new);
   public static final dvm b = dvi.P;
   public static final dvj c = dvi.u;

   @Override
   public MapCodec<dgs> a() {
      return a;
   }

   public dgs(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jk.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B && $$1.c_($$2) instanceof dro $$5) {
         $$3.a($$5);
         $$3.a(awq.ar);
         cmo.a($$3, true);
      }

      return brs.a;
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      bro.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      drv $$4 = $$1.c_($$2);
      if ($$4 instanceof dro) {
         ((dro)$$4).k();
      }
   }

   @Nullable
   @Override
   public drv a(jf $$0, dus $$1) {
      return new dro($$0, $$1);
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return cqz.a($$1.c_($$2));
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(b, $$0.d().g());
   }
}
