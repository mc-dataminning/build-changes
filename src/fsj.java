import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fsj {
   public final fsr a = new fsr();
   public final fsj.a b;
   public final fsj.a c;
   public final fsj.a d;
   public final fsj.a e;
   public final fsj.a f;
   public final fsj.a g;
   public final fsu h;
   public final fsj.a i;
   public final fsj.a j;
   public final fsj.a k;
   public final fsj.a l;
   public final fsf m;
   public final fsw n;
   public final fse o;
   public final fss p;
   public final fsm q;
   public final fsl r;
   public final fsk s;
   public final fsp t;
   private boolean u;

   public fsj(ero $$0) {
      this.b = new fsx($$0);
      this.c = new fsg($$0);
      this.d = new fsn($$0);
      this.e = new fsi($$0);
      this.f = new fsv($$0);
      this.g = new fsq($$0);
      this.h = new fsu($$0);
      this.i = new fso($$0);
      this.j = new fsy();
      this.k = new fst($$0);
      this.l = new fsh($$0);
      this.m = new fsf($$0);
      this.n = new fsw();
      this.o = new fse($$0);
      this.p = new fss($$0);
      this.q = new fsm($$0);
      this.r = new fsl();
      this.s = new fsk($$0);
      this.t = new fsp($$0, cri.a);
   }

   public void a() {
      this.a.a();
      this.b.a();
      this.c.a();
      this.d.a();
      this.e.a();
      this.f.a();
      this.g.a();
      this.h.a();
      this.i.a();
      this.j.a();
      this.k.a();
      this.l.a();
      this.m.a();
      this.n.a();
      this.o.a();
      this.p.a();
      this.q.a();
      this.r.a();
      this.s.a();
      this.t.a();
   }

   public boolean b() {
      this.u = !this.u;
      return this.u;
   }

   public void a(emh $$0, fpb.a $$1, double $$2, double $$3, double $$4) {
      if (this.u && !ero.O().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bjt> a(@Nullable bjt $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         eif $$2 = $$0.bp();
         eif $$3 = $$0.f(1.0F).a((double)$$1);
         eif $$4 = $$2.e($$3);
         eia $$5 = $$0.cG().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bjt> $$7 = $$0x -> !$$0x.N_() && $$0x.br();
         eic $$8 = cdq.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(emh $$0, fpb $$1, ht $$2, ht $$3, float $$4, float $$5, float $$6, float $$7) {
      eqz $$8 = ero.O().j.m();
      if ($$8.h()) {
         eif $$9 = $$8.b().e();
         eia $$10 = new eia($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(emh $$0, fpb $$1, ht $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      eqz $$8 = ero.O().j.m();
      if ($$8.h()) {
         eif $$9 = $$8.b().e();
         eia $$10 = new eia($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(emh $$0, fpb $$1, eia $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(emh $$0, fpb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      eml $$12 = $$1.getBuffer(fpj.z());
      foz.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(emh $$0, fpb $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(emh $$0, fpb $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(emh $$0, fpb $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(emh $$0, fpb $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      ero $$11 = ero.O();
      eqz $$12 = $$11.j.m();
      if ($$12.h() && $$11.ao().d != null) {
         esw $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? esw.a.b : esw.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(emh var1, fpb var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
