import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhf extends hep {
   private static final Logger b = LogUtils.getLogger();
   public static final xi a = xi.c("mco.upload.select.world.title");
   private static final xi c = xi.c("selectWorld.unable_to_load");
   static final xi B = xi.c("selectWorld.world");
   private static final xi C = xi.c("mco.upload.hardcore").b(-65536);
   private static final xi D = xi.c("selectWorld.commands");
   private static final DateFormat E = new SimpleDateFormat();
   @Nullable
   private final fii F;
   private final fhe G;
   private final long H;
   private final int I;
   flh J;
   List<etr> K = Lists.newArrayList();
   int L = -1;
   fhf.b M;

   public fhf(@Nullable fii $$0, long $$1, int $$2, fhe $$3) {
      super(a);
      this.F = $$0;
      this.G = $$3;
      this.H = $$1;
      this.I = $$2;
   }

   private void D() {
      etq.a $$0 = this.m.m().b();
      this.K = this.m.m().a($$0).join().stream().filter(etr::v).collect(Collectors.toList());

      for (etr $$1 : this.K) {
         this.M.a($$1);
      }
   }

   @Override
   public void aR_() {
      this.M = this.c(new fhf.b());

      try {
         this.D();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fgu(c, xi.a(var2.getMessage()), this.G));
         return;
      }

      this.J = this.c(flh.a(xi.c("mco.upload.button.name"), $$0 -> this.E()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.J.j = this.L >= 0 && this.L < this.K.size();
      this.c(flh.a(xh.k, $$0 -> this.m.a(this.G)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hen(xi.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.K.isEmpty()) {
         this.a(new hen(xi.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public xi i() {
      return xh.a(this.n(), this.m());
   }

   private void E() {
      if (this.L != -1 && !this.K.get(this.L).i()) {
         etr $$0 = this.K.get(this.L);
         this.m.a(new fhl(this.F, this.H, this.I, this.G, $$0));
      }
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
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

   static xi a(etr $$0) {
      return $$0.h().d();
   }

   static String b(etr $$0) {
      return E.format(new Date($$0.f()));
   }

   class a extends fmd.a<fhf.a> {
      private final etr b;
      private final String c;
      private final xi d;
      private final xi e;

      public a(final etr $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xi.a("mco.upload.entry.id", $$0.a(), fhf.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fhf.this.M.b(fhf.this.K.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fku $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fhf.B + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fhf.this.p, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fhf.this.p, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fhf.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public xi a() {
         xi $$0 = xh.b(xi.b(this.b.b()), xi.b(fhf.b(this.b)), fhf.a(this.b));
         return xi.a("narrator.select", $$0);
      }
   }

   class b extends heo<fhf.a> {
      public b() {
         super(fhf.this.n, fhf.this.o - 40 - fhf.g(0), fhf.g(0), 36);
      }

      public void a(etr $$0) {
         this.a((fhf.a)(fhf.this.new a($$0)));
      }

      @Override
      public int a() {
         return fhf.this.K.size() * 36;
      }

      public void a(@Nullable fhf.a $$0) {
         super.a($$0);
         fhf.this.L = this.aI_().indexOf($$0);
         fhf.this.J.j = fhf.this.L >= 0 && fhf.this.L < this.l() && !fhf.this.K.get(fhf.this.L).i();
      }
   }
}
