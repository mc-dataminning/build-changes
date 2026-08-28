import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdu extends gvu {
   private static final Logger b = LogUtils.getLogger();
   public static final wu a = wu.c("mco.upload.select.world.title");
   private static final wu c = wu.c("selectWorld.unable_to_load");
   static final wu A = wu.c("selectWorld.world");
   private static final wu B = wu.c("mco.upload.hardcore").b(-65536);
   private static final wu C = wu.c("selectWorld.commands");
   private static final DateFormat D = new SimpleDateFormat();
   @Nullable
   private final fex E;
   private final fdt F;
   private final long G;
   private final int H;
   fhu I;
   List<eql> J = Lists.newArrayList();
   int K = -1;
   fdu.b L;

   public fdu(@Nullable fex $$0, long $$1, int $$2, fdt $$3) {
      super(a);
      this.E = $$0;
      this.F = $$3;
      this.G = $$1;
      this.H = $$2;
   }

   private void D() {
      eqk.a $$0 = this.l.m().b();
      this.J = this.l.m().a($$0).join().stream().filter(eql::v).collect(Collectors.toList());

      for (eql $$1 : this.J) {
         this.L.a($$1);
      }
   }

   @Override
   public void aP_() {
      this.L = this.c(new fdu.b());

      try {
         this.D();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.l.a(new fdj(c, wu.a(var2.getMessage()), this.F));
         return;
      }

      this.I = this.c(fhu.a(wu.c("mco.upload.button.name"), $$0 -> this.E()).a(this.m / 2 - 154, this.n - 32, 153, 20).a());
      this.I.j = this.K >= 0 && this.K < this.J.size();
      this.c(fhu.a(wt.k, $$0 -> this.l.a(this.F)).a(this.m / 2 + 6, this.n - 32, 153, 20).a());
      this.a(new gvs(wu.c("mco.upload.select.world.subtitle"), this.m / 2, g(-1), -6250336));
      if (this.J.isEmpty()) {
         this.a(new gvs(wu.c("mco.upload.select.world.none"), this.m / 2, this.n / 2 - 20, -1));
      }
   }

   @Override
   public wu i() {
      return wt.a(this.n(), this.m());
   }

   private void E() {
      if (this.K != -1 && !this.J.get(this.K).i()) {
         eql $$0 = this.J.get(this.K);
         this.l.a(new fea(this.E, this.G, this.H, this.F, $$0));
      }
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
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

   static wu a(eql $$0) {
      return $$0.h().d();
   }

   static String b(eql $$0) {
      return D.format(new Date($$0.f()));
   }

   class a extends fiq.a<fdu.a> {
      private final eql b;
      private final String c;
      private final wu d;
      private final wu e;

      public a(final eql $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = wu.a("mco.upload.entry.id", $$0.a(), fdu.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fdu.this.L.b(fdu.this.J.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fhh $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fdu.A + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fdu.this.o, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fdu.this.o, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fdu.this.o, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public wu a() {
         wu $$0 = wt.b(wu.b(this.b.b()), wu.b(fdu.b(this.b)), fdu.a(this.b));
         return wu.a("narrator.select", $$0);
      }
   }

   class b extends gvt<fdu.a> {
      public b() {
         super(fdu.this.m, fdu.this.n - 40 - fdu.g(0), fdu.g(0), 36);
      }

      public void a(eql $$0) {
         this.a((fdu.a)(fdu.this.new a($$0)));
      }

      @Override
      public int a() {
         return fdu.this.J.size() * 36;
      }

      public void a(@Nullable fdu.a $$0) {
         super.a($$0);
         fdu.this.K = this.aG_().indexOf($$0);
         fdu.this.I.j = fdu.this.K >= 0 && fdu.this.K < this.l() && !fdu.this.J.get(fdu.this.K).i();
      }
   }
}
