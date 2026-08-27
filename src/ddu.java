import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddu extends dbt implements djh {
   public static final MapCodec<ddu> a = b(ddu::new);
   public static final dpz b = dpy.C;
   private static final int d = 3;
   protected static final etc c = dch.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   public ddu(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dna($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return a($$2, dmq.z, $$0.B ? dna::a : dna::b);
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.b;
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(b) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return c;
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Boolean.valueOf($$1.a(avj.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
