import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmq extends hpb {
   private static final Logger b = LogUtils.getLogger();
   public static final wy a = wy.c("mco.upload.select.world.title");
   private static final wy c = wy.c("selectWorld.unable_to_load");
   static final wy C = wy.c("selectWorld.world");
   private static final DateFormat D = new SimpleDateFormat();
   @Nullable
   private final fnr E;
   private final fmp F;
   private final long G;
   private final int H;
   fsc I;
   List<eyo> J = Lists.newArrayList();
   int K = -1;
   fmq.b L;

   public fmq(@Nullable fnr $$0, long $$1, int $$2, fmp $$3) {
      super(a);
      this.E = $$0;
      this.F = $$3;
      this.G = $$1;
      this.H = $$2;
   }

   private void E() {
      eyn.a $$0 = this.m.m().b();
      this.J = this.m.m().a($$0).join().stream().filter(eyo::v).collect(Collectors.toList());

      for (eyo $$1 : this.J) {
         this.L.a($$1);
      }
   }

   @Override
   public void aN_() {
      this.L = this.c(new fmq.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fmg(c, wy.a(var2.getMessage()), this.F));
         return;
      }

      this.I = this.c(fsc.a(wy.c("mco.upload.button.name"), $$0 -> this.F()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.I.j = this.K >= 0 && this.K < this.J.size();
      this.c(fsc.a(wx.k, $$0 -> this.m.a(this.F)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hpa(wy.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.J.isEmpty()) {
         this.a(new hpa(wy.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public wy i() {
      return wx.a(this.n(), this.m());
   }

   private void F() {
      if (this.K != -1) {
         eyo $$0 = this.J.get(this.K);
         this.m.a(new fmw(this.E, this.G, this.H, this.F, $$0));
      }
   }

   @Override
   public void a(fro $$0, int $$1, int $$2, float $$3) {
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

   static wy a(eyo $$0) {
      return $$0.h().d();
   }

   static String b(eyo $$0) {
      return D.format(new Date($$0.f()));
   }

   class a extends fsy.a<fmq.a> {
      private final eyo b;
      private final String c;
      private final wy d;
      private final wy e;

      public a(final eyo $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = wy.a("mco.upload.entry.id", $$0.a(), fmq.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fmq.this.L.a(fmq.this.J.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fro $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fmq.C + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.b(fmq.this.p, $$4, $$2 + 2, $$3 + 1, -1);
         $$0.b(fmq.this.p, this.d, $$2 + 2, $$3 + 12, -8355712);
         $$0.b(fmq.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712);
      }

      @Override
      public wy a() {
         wy $$0 = wx.b(wy.b(this.b.b()), wy.b(fmq.b(this.b)), fmq.a(this.b));
         return wy.a("narrator.select", $$0);
      }
   }

   class b extends fsy<fmq.a> {
      public b() {
         super(fos.Q(), fmq.this.n, fmq.this.o - 40 - fmq.g(0), fmq.g(0), 36);
      }

      public void a(eyo $$0) {
         this.b(fmq.this.new a($$0));
      }

      public void a(@Nullable fmq.a $$0) {
         super.a($$0);
         fmq.this.K = this.aD_().indexOf($$0);
         fmq.this.I.j = fmq.this.K >= 0 && fmq.this.K < this.t();
      }

      @Override
      public int a() {
         return (int)((double)this.g * 0.6);
      }
   }
}
