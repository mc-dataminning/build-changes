import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyr extends cws {
   public static final MapCodec<cyr> a = b(cyr::new);
   public static final djy<djw> b = djq.ae;

   @Override
   public MapCodec<? extends cyr> a() {
      return a;
   }

   public cyr(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, djw.b));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      djw $$6 = $$0.c(b);
      if ($$1.o() != ic.a.b || $$6 == djw.b != ($$1 == ic.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == djw.b && $$1 == ic.a && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return cwl.a.o();
      }
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      hx $$1 = $$0.a();
      cti $$2 = $$0.q();
      return $$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
      hx $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, djw.a)), 3);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      if ($$0.c(b) != djw.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dja $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == djw.b;
      }
   }

   public static void a(ctj $$0, dja $$1, hx $$2, int $$3) {
      hx $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, djw.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, djw.a)), $$3);
   }

   public static dja c(ctl $$0, hx $$1, dja $$2) {
      return $$2.b(djq.C) ? $$2.a(djq.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dja a(cti $$0, hx $$1, dja $$2, cfb $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eT());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cti $$0, cfb $$1, hx $$2, dja $$3, @Nullable dgo $$4, cmr $$5) {
      super.a($$0, $$1, $$2, cwl.a.o(), $$4, $$5);
   }

   protected static void b(cti $$0, hx $$1, dja $$2, cfb $$3) {
      djw $$4 = $$2.c(b);
      if ($$4 == djw.a) {
         hx $$5 = $$1.d();
         dja $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == djw.b) {
            dja $$7 = $$6.u().b(eel.c) ? cwl.G.o() : cwl.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, cwj.i($$6));
         }
      }
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public long a(dja $$0, hx $$1) {
      return aui.b($$1.u(), $$1.c($$0.c(b) == djw.b ? 0 : 1).v(), $$1.w());
   }
}
