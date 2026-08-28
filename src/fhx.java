import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhx extends hff {
   private static final Logger b = LogUtils.getLogger();
   public static final xl a = xl.c("mco.upload.select.world.title");
   private static final xl c = xl.c("selectWorld.unable_to_load");
   static final xl B = xl.c("selectWorld.world");
   private static final xl C = xl.c("mco.upload.hardcore").b(-65536);
   private static final xl D = xl.c("selectWorld.commands");
   private static final DateFormat E = new SimpleDateFormat();
   @Nullable
   private final fiy F;
   private final fhw G;
   private final long H;
   private final int I;
   flw J;
   List<etv> K = Lists.newArrayList();
   int L = -1;
   fhx.b M;

   public fhx(@Nullable fiy $$0, long $$1, int $$2, fhw $$3) {
      super(a);
      this.F = $$0;
      this.G = $$3;
      this.H = $$1;
      this.I = $$2;
   }

   private void D() {
      etu.a $$0 = this.m.m().b();
      this.K = this.m.m().a($$0).join().stream().filter(etv::v).collect(Collectors.toList());

      for (etv $$1 : this.K) {
         this.M.a($$1);
      }
   }

   @Override
   public void aS_() {
      this.M = this.c(new fhx.b());

      try {
         this.D();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fhn(c, xl.a(var2.getMessage()), this.G));
         return;
      }

      this.J = this.c(flw.a(xl.c("mco.upload.button.name"), $$0 -> this.E()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.J.j = this.L >= 0 && this.L < this.K.size();
      this.c(flw.a(xk.k, $$0 -> this.m.a(this.G)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hfd(xl.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.K.isEmpty()) {
         this.a(new hfd(xl.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public xl i() {
      return xk.a(this.n(), this.m());
   }

   private void E() {
      if (this.L != -1 && !this.K.get(this.L).i()) {
         etv $$0 = this.K.get(this.L);
         this.m.a(new fid(this.F, this.H, this.I, this.G, $$0));
      }
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.m.a(this.G);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static xl a(etv $$0) {
      return $$0.h().d();
   }

   static String b(etv $$0) {
      return E.format(new Date($$0.f()));
   }

   class a extends fms.a<fhx.a> {
      private final etv b;
      private final String c;
      private final xl d;
      private final xl e;

      public a(final etv $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xl.a("mco.upload.entry.id", $$0.a(), fhx.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fhx.this.M.b(fhx.this.K.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(flj $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fhx.B + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fhx.this.p, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fhx.this.p, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fhx.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public xl a() {
         xl $$0 = xk.b(xl.b(this.b.b()), xl.b(fhx.b(this.b)), fhx.a(this.b));
         return xl.a("narrator.select", $$0);
      }
   }

   class b extends hfe<fhx.a> {
      public b() {
         super(fhx.this.n, fhx.this.o - 40 - fhx.g(0), fhx.g(0), 36);
      }

      public void a(etv $$0) {
         this.a((fhx.a)(fhx.this.new a($$0)));
      }

      @Override
      public int a() {
         return fhx.this.K.size() * 36;
      }

      public void a(@Nullable fhx.a $$0) {
         super.a($$0);
         fhx.this.L = this.aI_().indexOf($$0);
         fhx.this.J.j = fhx.this.L >= 0 && fhx.this.L < this.l() && !fhx.this.K.get(fhx.this.L).i();
      }
   }
}
