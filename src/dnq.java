import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnq extends dgh implements dnx {
   public static final MapCodec<dnq> a = b(dnq::new);
   public static final dur b = duq.F;
   public static final dur c = duq.C;
   public static final dur d = duq.G;
   protected static final eyx e = dgv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jj.a.b);

   @Override
   public MapCodec<dnq> a() {
      return a;
   }

   public dnq(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, btj $$3) {
      if ($$0 instanceof arg $$4) {
         arh $$5 = dso.a($$3);
         if ($$5 != null) {
            $$4.a($$1, drg.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if ($$1 instanceof arg $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, drg.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, drg.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return e;
   }

   @Override
   protected eyx d_(dua $$0) {
      return e;
   }

   @Override
   protected boolean g_(dua $$0) {
      return true;
   }

   @Nullable
   @Override
   public dre a(je $$0, dua $$1) {
      return new dso($$0, $$1);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      return this.o().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eqc.c));
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(c) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, cvl $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bqm.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return !$$0.B ? dgh.a($$2, drg.L, ($$0x, $$1x, $$2x, $$3) -> dzg.c.a($$0x, $$3.gq(), $$3.gr())) : null;
   }
}
