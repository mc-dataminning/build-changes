import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwg extends cuj {
   public static final MapCodec<cwg> a = b(cwg::new);
   public static final dgz<dgx> b = dgr.ae;

   @Override
   public MapCodec<? extends cwg> a() {
      return a;
   }

   public cwg(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dgx.b));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      dgx $$6 = $$0.c(b);
      if ($$1.o() != hx.a.b || $$6 == dgx.b != ($$1 == hx.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dgx.b && $$1 == hx.a && !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return cuc.a.o();
      }
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      ht $$1 = $$0.a();
      cqz $$2 = $$0.q();
      return $$1.v() < $$2.aj() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bkj $$3, ckj $$4) {
      ht $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.o().a(b, dgx.a)), 3);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      if ($$0.c(b) != dgx.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dgb $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dgx.b;
      }
   }

   public static void a(cra $$0, dgb $$1, ht $$2, int $$3) {
      ht $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dgx.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dgx.a)), $$3);
   }

   public static dgb c(crc $$0, ht $$1, dgb $$2) {
      return $$2.b(dgr.C) ? $$2.a(dgr.C, Boolean.valueOf($$0.y($$1))) : $$2;
   }

   @Override
   public dgb a(cqz $$0, ht $$1, dgb $$2, ccx $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eS());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cqz $$0, ccx $$1, ht $$2, dgb $$3, @Nullable ddx $$4, ckj $$5) {
      super.a($$0, $$1, $$2, cuc.a.o(), $$4, $$5);
   }

   protected static void b(cqz $$0, ht $$1, dgb $$2, ccx $$3) {
      dgx $$4 = $$2.c(b);
      if ($$4 == dgx.a) {
         ht $$5 = $$1.d();
         dgb $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dgx.b) {
            dgb $$7 = $$6.u().b(ebf.c) ? cuc.G.o() : cuc.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, cua.i($$6));
         }
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Override
   public long a(dgb $$0, ht $$1) {
      return asy.b($$1.u(), $$1.c($$0.c(b) == dgx.b ? 0 : 1).v(), $$1.w());
   }
}
