import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdm extends gvm {
   private static final Logger b = LogUtils.getLogger();
   public static final wu a = wu.c("mco.upload.select.world.title");
   private static final wu c = wu.c("selectWorld.unable_to_load");
   static final wu A = wu.c("selectWorld.world");
   private static final wu B = wu.c("mco.upload.hardcore").b(-65536);
   private static final wu C = wu.c("selectWorld.commands");
   private static final DateFormat D = new SimpleDateFormat();
   @Nullable
   private final fep E;
   private final fdl F;
   private final long G;
   private final int H;
   fhm I;
   List<eqd> J = Lists.newArrayList();
   int K = -1;
   fdm.b L;

   public fdm(@Nullable fep $$0, long $$1, int $$2, fdl $$3) {
      super(a);
      this.E = $$0;
      this.F = $$3;
      this.G = $$1;
      this.H = $$2;
   }

   private void E() {
      eqc.a $$0 = this.l.m().b();
      this.J = this.l.m().a($$0).join().stream().filter(eqd::v).collect(Collectors.toList());

      for (eqd $$1 : this.J) {
         this.L.a($$1);
      }
   }

   @Override
   public void aO_() {
      this.L = this.c(new fdm.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.l.a(new fdb(c, wu.a(var2.getMessage()), this.F));
         return;
      }

      this.I = this.c(fhm.a(wu.c("mco.upload.button.name"), $$0 -> this.F()).a(this.m / 2 - 154, this.n - 32, 153, 20).a());
      this.I.j = this.K >= 0 && this.K < this.J.size();
      this.c(fhm.a(wt.k, $$0 -> this.l.a(this.F)).a(this.m / 2 + 6, this.n - 32, 153, 20).a());
      this.a(new gvk(wu.c("mco.upload.select.world.subtitle"), this.m / 2, g(-1), -6250336));
      if (this.J.isEmpty()) {
         this.a(new gvk(wu.c("mco.upload.select.world.none"), this.m / 2, this.n / 2 - 20, -1));
      }
   }

   @Override
   public wu i() {
      return wt.a(this.n(), this.m());
   }

   private void F() {
      if (this.K != -1 && !this.J.get(this.K).i()) {
         eqd $$0 = this.J.get(this.K);
         this.l.a(new fds(this.E, this.G, this.H, this.F, $$0));
      }
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.l.a(this.F);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static wu a(eqd $$0) {
      return $$0.h().d();
   }

   static String b(eqd $$0) {
      return D.format(new Date($$0.f()));
   }

   class a extends fii.a<fdm.a> {
      private final eqd b;
      private final String c;
      private final wu d;
      private final wu e;

      public a(final eqd $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = wu.a("mco.upload.entry.id", $$0.a(), fdm.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fdm.this.L.b(fdm.this.J.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fgz $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fdm.A + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fdm.this.o, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fdm.this.o, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fdm.this.o, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public wu a() {
         wu $$0 = wt.b(wu.b(this.b.b()), wu.b(fdm.b(this.b)), fdm.a(this.b));
         return wu.a("narrator.select", $$0);
      }
   }

   class b extends gvl<fdm.a> {
      public b() {
         super(fdm.this.m, fdm.this.n - 40 - fdm.g(0), fdm.g(0), 36);
      }

      public void a(eqd $$0) {
         this.a((fdm.a)(fdm.this.new a($$0)));
      }

      @Override
      public int a() {
         return fdm.this.J.size() * 36;
      }

      public void a(@Nullable fdm.a $$0) {
         super.a($$0);
         fdm.this.K = this.aF_().indexOf($$0);
         fdm.this.I.j = fdm.this.K >= 0 && fdm.this.K < this.l() && !fdm.this.J.get(fdm.this.K).i();
      }
   }
}
