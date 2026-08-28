import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgi extends hdk {
   private static final Logger b = LogUtils.getLogger();
   public static final xd a = xd.c("mco.upload.select.world.title");
   private static final xd c = xd.c("selectWorld.unable_to_load");
   static final xd B = xd.c("selectWorld.world");
   private static final xd C = xd.c("mco.upload.hardcore").b(-65536);
   private static final xd D = xd.c("selectWorld.commands");
   private static final DateFormat E = new SimpleDateFormat();
   @Nullable
   private final fhl F;
   private final fgh G;
   private final long H;
   private final int I;
   fkk J;
   List<esw> K = Lists.newArrayList();
   int L = -1;
   fgi.b M;

   public fgi(@Nullable fhl $$0, long $$1, int $$2, fgh $$3) {
      super(a);
      this.F = $$0;
      this.G = $$3;
      this.H = $$1;
      this.I = $$2;
   }

   private void D() {
      esv.a $$0 = this.m.m().b();
      this.K = this.m.m().a($$0).join().stream().filter(esw::v).collect(Collectors.toList());

      for (esw $$1 : this.K) {
         this.M.a($$1);
      }
   }

   @Override
   public void aR_() {
      this.M = this.c(new fgi.b());

      try {
         this.D();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new ffx(c, xd.a(var2.getMessage()), this.G));
         return;
      }

      this.J = this.c(fkk.a(xd.c("mco.upload.button.name"), $$0 -> this.E()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.J.j = this.L >= 0 && this.L < this.K.size();
      this.c(fkk.a(xc.k, $$0 -> this.m.a(this.G)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hdi(xd.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.K.isEmpty()) {
         this.a(new hdi(xd.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public xd i() {
      return xc.a(this.n(), this.m());
   }

   private void E() {
      if (this.L != -1 && !this.K.get(this.L).i()) {
         esw $$0 = this.K.get(this.L);
         this.m.a(new fgo(this.F, this.H, this.I, this.G, $$0));
      }
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
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

   static xd a(esw $$0) {
      return $$0.h().d();
   }

   static String b(esw $$0) {
      return E.format(new Date($$0.f()));
   }

   class a extends flg.a<fgi.a> {
      private final esw b;
      private final String c;
      private final xd d;
      private final xd e;

      public a(final esw $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xd.a("mco.upload.entry.id", $$0.a(), fgi.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fgi.this.M.b(fgi.this.K.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fjx $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fgi.B + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fgi.this.p, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fgi.this.p, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fgi.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public xd a() {
         xd $$0 = xc.b(xd.b(this.b.b()), xd.b(fgi.b(this.b)), fgi.a(this.b));
         return xd.a("narrator.select", $$0);
      }
   }

   class b extends hdj<fgi.a> {
      public b() {
         super(fgi.this.n, fgi.this.o - 40 - fgi.g(0), fgi.g(0), 36);
      }

      public void a(esw $$0) {
         this.a((fgi.a)(fgi.this.new a($$0)));
      }

      @Override
      public int a() {
         return fgi.this.K.size() * 36;
      }

      public void a(@Nullable fgi.a $$0) {
         super.a($$0);
         fgi.this.L = this.aI_().indexOf($$0);
         fgi.this.J.j = fgi.this.L >= 0 && fgi.this.L < this.l() && !fgi.this.K.get(fgi.this.L).i();
      }
   }
}
