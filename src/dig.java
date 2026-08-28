import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dig extends dgh {
   public static final MapCodec<dig> a = b(dig::new);
   public static final dua<dty> b = dts.ae;

   @Override
   public MapCodec<? extends dig> a() {
      return a;
   }

   public dig(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dty.b));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      dty $$6 = $$0.c(b);
      if ($$1.o() != ji.a.b || $$6 == dty.b != ($$1 == ji.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dty.b && $$1 == ji.a && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dga.a.o();
      }
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      jd $$1 = $$0.a();
      dcw $$2 = $$0.q();
      return $$1.v() < $$2.am() - 1 && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, btn $$3, cuq $$4) {
      jd $$5 = $$1.d();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dty.a)), 3);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      if ($$0.c(b) != dty.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dtc $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dty.b;
      }
   }

   public static void a(dcx $$0, dtc $$1, jd $$2, int $$3) {
      jd $$4 = $$2.d();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dty.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dty.a)), $$3);
   }

   public static dtc c(dcz $$0, jd $$1, dtc $$2) {
      return $$2.b(dts.C) ? $$2.a(dts.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dtc a(dcw $$0, jd $$1, dtc $$2, cmx $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eU());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcw $$0, cmx $$1, jd $$2, dtc $$3, @Nullable dqh $$4, cuq $$5) {
      super.a($$0, $$1, $$2, dga.a.o(), $$4, $$5);
   }

   protected static void b(dcw $$0, jd $$1, dtc $$2, cmx $$3) {
      dty $$4 = $$2.c(b);
      if ($$4 == dty.a) {
         jd $$5 = $$1.e();
         dtc $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dty.b) {
            dtc $$7 = $$6.u().b(epd.c) ? dga.G.o() : dga.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dfy.i($$6));
         }
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dtc $$0, jd $$1) {
      return ayo.b($$1.u(), $$1.c($$0.c(b) == dty.b ? 0 : 1).v(), $$1.w());
   }
}
