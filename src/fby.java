import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fby extends gty {
   private static final Logger b = LogUtils.getLogger();
   public static final wx a = wx.c("mco.upload.select.world.title");
   private static final wx c = wx.c("selectWorld.unable_to_load");
   static final wx B = wx.c("selectWorld.world");
   private static final wx C = wx.c("mco.upload.hardcore").b(-65536);
   private static final wx D = wx.c("selectWorld.commands");
   private static final DateFormat E = new SimpleDateFormat();
   @Nullable
   private final fdb F;
   private final fbx G;
   private final long H;
   private final int I;
   ffz J;
   List<eow> K = Lists.newArrayList();
   int L = -1;
   fby.b M;

   public fby(@Nullable fdb $$0, long $$1, int $$2, fbx $$3) {
      super(a);
      this.F = $$0;
      this.G = $$3;
      this.H = $$1;
      this.I = $$2;
   }

   private void C() {
      eov.a $$0 = this.m.m().b();
      this.K = this.m.m().a($$0).join().stream().filter(eow::v).collect(Collectors.toList());

      for (eow $$1 : this.K) {
         this.M.a($$1);
      }
   }

   @Override
   public void aM_() {
      this.M = this.c(new fby.b());

      try {
         this.C();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fbm(c, wx.a(var2.getMessage()), this.G));
         return;
      }

      this.J = this.c(ffz.a(wx.c("mco.upload.button.name"), $$0 -> this.D()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.J.j = this.L >= 0 && this.L < this.K.size();
      this.c(ffz.a(ww.k, $$0 -> this.m.a(this.G)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new gtw(wx.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.K.isEmpty()) {
         this.a(new gtw(wx.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public wx i() {
      return ww.a(this.n(), this.m());
   }

   private void D() {
      if (this.L != -1 && !this.K.get(this.L).i()) {
         eow $$0 = this.K.get(this.L);
         this.m.a(new fce(this.F, this.H, this.I, this.G, $$0));
      }
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
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

   static wx a(eow $$0) {
      return $$0.h().d();
   }

   static String b(eow $$0) {
      return E.format(new Date($$0.f()));
   }

   class a extends fgv.a<fby.a> {
      private final eow b;
      private final String c;
      private final wx d;
      private final wx e;

      public a(eow $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = wx.a("mco.upload.entry.id", $$0.a(), fby.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(ffm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fby.this.M.b(fby.this.K.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(ffm $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fby.B + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fby.this.p, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fby.this.p, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fby.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public wx a() {
         wx $$0 = ww.b(wx.b(this.b.b()), wx.b(fby.b(this.b)), fby.a(this.b));
         return wx.a("narrator.select", $$0);
      }
   }

   class b extends gtx<fby.a> {
      public b() {
         super(fby.this.n, fby.this.o - 40 - fby.g(0), fby.g(0), 36);
      }

      public void a(eow $$0) {
         this.a((fby.a)(fby.this.new a($$0)));
      }

      @Override
      public int a() {
         return fby.this.K.size() * 36;
      }

      public void a(@Nullable fby.a $$0) {
         super.a($$0);
         fby.this.L = this.aE_().indexOf($$0);
         fby.this.J.j = fby.this.L >= 0 && fby.this.L < this.l() && !fby.this.K.get(fby.this.L).i();
      }
   }
}
