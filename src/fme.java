import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fme extends hol {
   private static final Logger b = LogUtils.getLogger();
   public static final ww a = ww.c("mco.upload.select.world.title");
   private static final ww c = ww.c("selectWorld.unable_to_load");
   static final ww C = ww.c("selectWorld.world");
   private static final DateFormat D = new SimpleDateFormat();
   @Nullable
   private final fnf E;
   private final fmd F;
   private final long G;
   private final int H;
   frq I;
   List<eyc> J = Lists.newArrayList();
   int K = -1;
   fme.b L;

   public fme(@Nullable fnf $$0, long $$1, int $$2, fmd $$3) {
      super(a);
      this.E = $$0;
      this.F = $$3;
      this.G = $$1;
      this.H = $$2;
   }

   private void E() {
      eyb.a $$0 = this.m.m().b();
      this.J = this.m.m().a($$0).join().stream().filter(eyc::v).collect(Collectors.toList());

      for (eyc $$1 : this.J) {
         this.L.a($$1);
      }
   }

   @Override
   public void aN_() {
      this.L = this.c(new fme.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new flu(c, ww.a(var2.getMessage()), this.F));
         return;
      }

      this.I = this.c(frq.a(ww.c("mco.upload.button.name"), $$0 -> this.F()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.I.j = this.K >= 0 && this.K < this.J.size();
      this.c(frq.a(wv.k, $$0 -> this.m.a(this.F)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hok(ww.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.J.isEmpty()) {
         this.a(new hok(ww.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public ww i() {
      return wv.a(this.n(), this.m());
   }

   private void F() {
      if (this.K != -1) {
         eyc $$0 = this.J.get(this.K);
         this.m.a(new fmk(this.E, this.G, this.H, this.F, $$0));
      }
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
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

   static ww a(eyc $$0) {
      return $$0.h().d();
   }

   static String b(eyc $$0) {
      return D.format(new Date($$0.f()));
   }

   class a extends fsm.a<fme.a> {
      private final eyc b;
      private final String c;
      private final ww d;
      private final ww e;

      public a(final eyc $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = ww.a("mco.upload.entry.id", $$0.a(), fme.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fme.this.L.a(fme.this.J.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(frc $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fme.C + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.b(fme.this.p, $$4, $$2 + 2, $$3 + 1, -1);
         $$0.b(fme.this.p, this.d, $$2 + 2, $$3 + 12, -8355712);
         $$0.b(fme.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712);
      }

      @Override
      public ww a() {
         ww $$0 = wv.b(ww.b(this.b.b()), ww.b(fme.b(this.b)), fme.a(this.b));
         return ww.a("narrator.select", $$0);
      }
   }

   class b extends fsm<fme.a> {
      public b() {
         super(fof.Q(), fme.this.n, fme.this.o - 40 - fme.g(0), fme.g(0), 36);
      }

      public void a(eyc $$0) {
         this.b(fme.this.new a($$0));
      }

      public void a(@Nullable fme.a $$0) {
         super.a($$0);
         fme.this.K = this.aD_().indexOf($$0);
         fme.this.I.j = fme.this.K >= 0 && fme.this.K < this.t();
      }

      @Override
      public int a() {
         return (int)((double)this.g * 0.6);
      }
   }
}
