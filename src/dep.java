import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dep extends dcq {
   public static final MapCodec<dep> a = b(dep::new);
   public static final dqg<dqe> b = dpy.ae;

   @Override
   public MapCodec<? extends dep> a() {
      return a;
   }

   public dep(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dqe.b));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      dqe $$6 = $$0.c(b);
      if ($$1.o() != ij.a.b || $$6 == dqe.b != ($$1 == ij.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dqe.b && $$1 == ij.a && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dcj.a.n();
      }
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      id $$1 = $$0.a();
      czg $$2 = $$0.q();
      return $$1.v() < $$2.al() - 1 && $$2.a_($$1.c()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, bqt $$3, crs $$4) {
      id $$5 = $$1.c();
      $$0.a($$5, c($$0, $$5, this.n().a(b, dqe.a)), 3);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      if ($$0.c(b) != dqe.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dpi $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dqe.b;
      }
   }

   public static void a(czh $$0, dpi $$1, id $$2, int $$3) {
      id $$4 = $$2.c();
      $$0.a($$2, c($$0, $$2, $$1.a(b, dqe.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.a(b, dqe.a)), $$3);
   }

   public static dpi c(czj $$0, id $$1, dpi $$2) {
      return $$2.b(dpy.C) ? $$2.a(dpy.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dpi a(czg $$0, id $$1, dpi $$2, cka $$3) {
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
   public void a(czg $$0, cka $$1, id $$2, dpi $$3, @Nullable dmo $$4, crs $$5) {
      super.a($$0, $$1, $$2, dcj.a.n(), $$4, $$5);
   }

   protected static void b(czg $$0, id $$1, dpi $$2, cka $$3) {
      dqe $$4 = $$2.c(b);
      if ($$4 == dqe.a) {
         id $$5 = $$1.d();
         dpi $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dqe.b) {
            dpi $$7 = $$6.u().b(elc.c) ? dcj.G.n() : dcj.a.n();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dch.i($$6));
         }
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dpi $$0, id $$1) {
      return axm.b($$1.u(), $$1.c($$0.c(b) == dqe.b ? 0 : 1).v(), $$1.w());
   }
}
