import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpf extends dgv {
   public static final MapCodec<dpf> a = b(dpf::new);
   public static final dur b = duq.B;

   @Override
   public MapCodec<dpf> a() {
      return a;
   }

   public dpf(dtz.d $$0) {
      super($$0);
      this.l(this.o().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dua a(dds $$0, je $$1, dua $$2, cnp $$3) {
      if (!$$0.w_() && !$$3.f() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arg $$0, je $$1, ddk $$2) {
      cka $$3 = new cka($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.b());
      int $$4 = $$3.o();
      $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dds $$0, je $$1) {
      a($$0, $$1, null);
   }

   private static void a(dds $$0, je $$1, @Nullable buf $$2) {
      if (!$$0.B) {
         cka $$3 = new cka($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dx(), $$3.dz(), $$3.dD(), awd.zE, awe.e, 1.0F, 1.0F);
         $$0.a($$2, dyx.I, $$1);
      }
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if (!$$0.a(cvo.ot) && !$$0.a(cvo.tY)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dgx.a.o(), 11);
         cvg $$7 = $$0.h();
         if ($$0.a(cvo.ot)) {
            $$0.a(1, $$4, buf.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awn.c.b($$7));
         return brk.a;
      }
   }

   @Override
   protected void a(dds $$0, dua $$1, eya $$2, coi $$3) {
      if (!$$0.B) {
         je $$4 = $$2.a();
         btj $$5 = $$3.s();
         if ($$3.bV() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof buf ? (buf)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(ddk $$0) {
      return false;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }
}
