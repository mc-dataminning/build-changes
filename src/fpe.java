import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpe extends hro {
   private static final Logger b = LogUtils.getLogger();
   public static final xc a = xc.c("mco.upload.select.world.title");
   private static final xc c = xc.c("selectWorld.unable_to_load");
   static final xc C = xc.c("selectWorld.world");
   private static final DateFormat D = new SimpleDateFormat();
   @Nullable
   private final fqf E;
   private final fpd F;
   private final long G;
   private final int H;
   fun I;
   List<ezy> J = Lists.newArrayList();
   int K = -1;
   fpe.b L;

   public fpe(@Nullable fqf $$0, long $$1, int $$2, fpd $$3) {
      super(a);
      this.E = $$0;
      this.F = $$3;
      this.G = $$1;
      this.H = $$2;
   }

   private void E() {
      ezx.a $$0 = this.m.m().b();
      this.J = this.m.m().a($$0).join().stream().filter(ezy::v).collect(Collectors.toList());

      for (ezy $$1 : this.J) {
         this.L.a($$1);
      }
   }

   @Override
   public void aS_() {
      this.L = this.c(new fpe.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fou(c, xc.a(var2.getMessage()), this.F));
         return;
      }

      this.I = this.c(fun.a(xc.c("mco.upload.button.name"), $$0 -> this.F()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.I.j = this.K >= 0 && this.K < this.J.size();
      this.c(fun.a(xb.k, $$0 -> this.m.a(this.F)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hrn(xc.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.J.isEmpty()) {
         this.a(new hrn(xc.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public xc i() {
      return xb.a(this.n(), this.m());
   }

   private void F() {
      if (this.K != -1) {
         ezy $$0 = this.J.get(this.K);
         this.m.a(new fpk(this.E, this.G, this.H, this.F, $$0));
      }
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.m.a(this.F);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static xc a(ezy $$0) {
      return $$0.h().d();
   }

   static String b(ezy $$0) {
      return D.format(new Date($$0.f()));
   }

   class a extends fvj.a<fpe.a> {
      private final ezy b;
      private final String c;
      private final xc d;
      private final xc e;

      public a(final ezy $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xc.a("mco.upload.entry.id", $$0.a(), fpe.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fpe.this.L.a(fpe.this.J.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(ftz $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fpe.C + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.b(fpe.this.p, $$4, $$2 + 2, $$3 + 1, -1);
         $$0.b(fpe.this.p, this.d, $$2 + 2, $$3 + 12, -8355712);
         $$0.b(fpe.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712);
      }

      @Override
      public xc a() {
         xc $$0 = xb.b(xc.b(this.b.b()), xc.b(fpe.b(this.b)), fpe.a(this.b));
         return xc.a("narrator.select", $$0);
      }
   }

   class b extends fvj<fpe.a> {
      public b() {
         super(frf.Q(), fpe.this.n, fpe.this.o - 40 - fpe.g(0), fpe.g(0), 36);
      }

      public void a(ezy $$0) {
         this.b(fpe.this.new a($$0));
      }

      public void a(@Nullable fpe.a $$0) {
         super.a($$0);
         fpe.this.K = this.aI_().indexOf($$0);
         fpe.this.I.j = fpe.this.K >= 0 && fpe.this.K < this.t();
      }

      @Override
      public int a() {
         return (int)((double)this.g * 0.6);
      }
   }
}
