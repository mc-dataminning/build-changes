import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cur extends csi implements czw {
   public static final aew a = new aew("sherds");
   private static final eig b = csv.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dgd c = dfz.R;
   private static final dga d = dfz.bw;
   private static final dga e = dfz.C;

   protected cur(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, ha.c).a(e, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfj a(cln $$0) {
      eam $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, $$0.g()).a(e, Boolean.valueOf($$1.a() == ean.c)).a(d, Boolean.valueOf(false));
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, @Nullable bjg $$3, cjf $$4) {
      if ($$0.B) {
         $$0.a($$1, dcx.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return b;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(c, e, d);
   }

   @Nullable
   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ddk($$0, $$1);
   }

   @Override
   public List<cjf> a(dfj $$0, ecw.a $$1) {
      dcv $$2 = $$1.b(efb.h);
      if ($$2 instanceof ddk $$3) {
         $$1.a(a, $$1x -> $$3.f().a().map(cja::ai_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, cbu $$3) {
      cjf $$4 = $$3.eS();
      dfj $$5 = $$2;
      if ($$4.a(aqa.aT) && !cnq.f($$4)) {
         $$5 = $$2.a(d, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(e) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public dai m(dfj $$0) {
      return $$0.c(d) ? dai.aY : dai.aX;
   }

   @Override
   public void a(cjf $$0, @Nullable cpb $$1, List<tl> $$2, ckw $$3) {
      super.a($$0, $$1, $$2, $$3);
      ddk.a $$4 = ddk.a.b(cgy.a($$0));
      if (!$$4.equals(ddk.a.a)) {
         $$2.add(tk.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cjf($$1x, 1).y().d().a(n.h)));
      }
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return $$0.c_($$1) instanceof ddk $$3 ? $$3.g() : super.a($$0, $$1, $$2);
   }
}
