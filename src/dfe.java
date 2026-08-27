import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfe extends dch {
   public static final MapCodec<dfe> a = b(dfe::new);
   public static final dqi b = dpy.aQ;
   protected static final etc c = dch.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   protected dfe(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$1 == ij.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      dpi $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dfg || $$3.b() instanceof dpa;
   }

   @Override
   public dpi a(cux $$0) {
      return !this.n().a((czj)$$0.q(), $$0.a()) ? dcj.j.n() : super.a($$0);
   }

   @Override
   protected boolean g_(dpi $$0) {
      return true;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return c;
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      int $$4 = $$0.c(b);
      if (!a((czj)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cym)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(czg $$0, dpi $$1, id $$2, bqa $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bqt && ($$3 instanceof cka || $$0.aa().b(czc.c)) && $$3.dg() * $$3.dg() * $$3.dh() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bqa $$0, dpi $$1, czg $$2, id $$3) {
      dpi $$4 = a($$1, dcj.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dub.c, $$3, dub.a.a($$0, $$4));
   }

   private static boolean a(cym $$0, id $$1) {
      return $$0.a_($$1.c()).a(ave.cr);
   }

   private static boolean a(czj $$0, id $$1) {
      for (id $$2 : id.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(avj.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
