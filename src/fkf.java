import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkf extends hmd {
   private static final Logger b = LogUtils.getLogger();
   public static final wp a = wp.c("mco.upload.select.world.title");
   private static final wp c = wp.c("selectWorld.unable_to_load");
   static final wp C = wp.c("selectWorld.world");
   private static final DateFormat D = new SimpleDateFormat();
   @Nullable
   private final flg E;
   private final fke F;
   private final long G;
   private final int H;
   fpq I;
   List<ewd> J = Lists.newArrayList();
   int K = -1;
   fkf.b L;

   public fkf(@Nullable flg $$0, long $$1, int $$2, fke $$3) {
      super(a);
      this.E = $$0;
      this.F = $$3;
      this.G = $$1;
      this.H = $$2;
   }

   private void E() {
      ewc.a $$0 = this.m.m().b();
      this.J = this.m.m().a($$0).join().stream().filter(ewd::v).collect(Collectors.toList());

      for (ewd $$1 : this.J) {
         this.L.a($$1);
      }
   }

   @Override
   public void aR_() {
      this.L = this.c(new fkf.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fjv(c, wp.a(var2.getMessage()), this.F));
         return;
      }

      this.I = this.c(fpq.a(wp.c("mco.upload.button.name"), $$0 -> this.F()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.I.j = this.K >= 0 && this.K < this.J.size();
      this.c(fpq.a(wo.k, $$0 -> this.m.a(this.F)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hmc(wp.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.J.isEmpty()) {
         this.a(new hmc(wp.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public wp i() {
      return wo.a(this.n(), this.m());
   }

   private void F() {
      if (this.K != -1) {
         ewd $$0 = this.J.get(this.K);
         this.m.a(new fkl(this.E, this.G, this.H, this.F, $$0));
      }
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
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

   static wp a(ewd $$0) {
      return $$0.h().d();
   }

   static String b(ewd $$0) {
      return D.format(new Date($$0.f()));
   }

   class a extends fqm.a<fkf.a> {
      private final ewd b;
      private final String c;
      private final wp d;
      private final wp e;

      public a(final ewd $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = wp.a("mco.upload.entry.id", $$0.a(), fkf.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fkf.this.L.a(fkf.this.J.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fpc $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fkf.C + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.b(fkf.this.p, $$4, $$2 + 2, $$3 + 1, -1);
         $$0.b(fkf.this.p, this.d, $$2 + 2, $$3 + 12, -8355712);
         $$0.b(fkf.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712);
      }

      @Override
      public wp a() {
         wp $$0 = wo.b(wp.b(this.b.b()), wp.b(fkf.b(this.b)), fkf.a(this.b));
         return wp.a("narrator.select", $$0);
      }
   }

   class b extends fqm<fkf.a> {
      public b() {
         super(fmg.Q(), fkf.this.n, fkf.this.o - 40 - fkf.g(0), fkf.g(0), 36);
      }

      public void a(ewd $$0) {
         this.b(fkf.this.new a($$0));
      }

      public void a(@Nullable fkf.a $$0) {
         super.a($$0);
         fkf.this.K = this.aH_().indexOf($$0);
         fkf.this.I.j = fkf.this.K >= 0 && fkf.this.K < this.t();
      }

      @Override
      public int a() {
         return (int)((double)this.g * 0.6);
      }
   }
}
