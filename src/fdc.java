import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdc extends gve {
   private static final Logger b = LogUtils.getLogger();
   public static final xo a = xo.c("mco.upload.select.world.title");
   private static final xo c = xo.c("selectWorld.unable_to_load");
   static final xo B = xo.c("selectWorld.world");
   private static final xo C = xo.c("mco.upload.hardcore").b(-65536);
   private static final xo D = xo.c("selectWorld.commands");
   private static final DateFormat E = new SimpleDateFormat();
   @Nullable
   private final fef F;
   private final fdb G;
   private final long H;
   private final int I;
   fhc J;
   List<epv> K = Lists.newArrayList();
   int L = -1;
   fdc.b M;

   public fdc(@Nullable fef $$0, long $$1, int $$2, fdb $$3) {
      super(a);
      this.F = $$0;
      this.G = $$3;
      this.H = $$1;
      this.I = $$2;
   }

   private void D() {
      epu.a $$0 = this.m.m().b();
      this.K = this.m.m().a($$0).join().stream().filter(epv::v).collect(Collectors.toList());

      for (epv $$1 : this.K) {
         this.M.a($$1);
      }
   }

   @Override
   public void aM_() {
      this.M = this.c(new fdc.b());

      try {
         this.D();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fcq(c, xo.a(var2.getMessage()), this.G));
         return;
      }

      this.J = this.c(fhc.a(xo.c("mco.upload.button.name"), $$0 -> this.E()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.J.j = this.L >= 0 && this.L < this.K.size();
      this.c(fhc.a(xn.k, $$0 -> this.m.a(this.G)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new gvc(xo.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.K.isEmpty()) {
         this.a(new gvc(xo.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public xo i() {
      return xn.a(this.n(), this.m());
   }

   private void E() {
      if (this.L != -1 && !this.K.get(this.L).i()) {
         epv $$0 = this.K.get(this.L);
         this.m.a(new fdi(this.F, this.H, this.I, this.G, $$0));
      }
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
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

   static xo a(epv $$0) {
      return $$0.h().d();
   }

   static String b(epv $$0) {
      return E.format(new Date($$0.f()));
   }

   class a extends fhy.a<fdc.a> {
      private final epv b;
      private final String c;
      private final xo d;
      private final xo e;

      public a(final epv $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xo.a("mco.upload.entry.id", $$0.a(), fdc.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fdc.this.M.b(fdc.this.K.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fgp $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fdc.B + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fdc.this.p, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fdc.this.p, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fdc.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public xo a() {
         xo $$0 = xn.b(xo.b(this.b.b()), xo.b(fdc.b(this.b)), fdc.a(this.b));
         return xo.a("narrator.select", $$0);
      }
   }

   class b extends gvd<fdc.a> {
      public b() {
         super(fdc.this.n, fdc.this.o - 40 - fdc.g(0), fdc.g(0), 36);
      }

      public void a(epv $$0) {
         this.a((fdc.a)(fdc.this.new a($$0)));
      }

      @Override
      public int a() {
         return fdc.this.K.size() * 36;
      }

      public void a(@Nullable fdc.a $$0) {
         super.a($$0);
         fdc.this.L = this.aE_().indexOf($$0);
         fdc.this.J.j = fdc.this.L >= 0 && fdc.this.L < this.l() && !fdc.this.K.get(fdc.this.L).i();
      }
   }
}
