import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezx extends gru {
   private static final Logger b = LogUtils.getLogger();
   public static final wi a = wi.c("mco.upload.select.world.title");
   private static final wi c = wi.c("selectWorld.unable_to_load");
   static final wi y = wi.c("selectWorld.world");
   private static final wi z = wi.c("mco.upload.hardcore").b(-65536);
   private static final wi A = wi.c("selectWorld.commands");
   private static final DateFormat B = new SimpleDateFormat();
   @Nullable
   private final fba C;
   private final ezw D;
   private final long E;
   private final int F;
   fdy G;
   List<enb> H = Lists.newArrayList();
   int I = -1;
   ezx.b J;

   public ezx(@Nullable fba $$0, long $$1, int $$2, ezw $$3) {
      super(a);
      this.C = $$0;
      this.D = $$3;
      this.E = $$1;
      this.F = $$2;
   }

   private void C() {
      ena.a $$0 = this.j.m().b();
      this.H = this.j.m().a($$0).join().stream().filter(enb::v).collect(Collectors.toList());

      for (enb $$1 : this.H) {
         this.J.a($$1);
      }
   }

   @Override
   public void aM_() {
      this.J = this.c(new ezx.b());

      try {
         this.C();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.j.a(new ezl(c, wi.a(var2.getMessage()), this.D));
         return;
      }

      this.G = this.c(fdy.a(wi.c("mco.upload.button.name"), $$0 -> this.D()).a(this.k / 2 - 154, this.l - 32, 153, 20).a());
      this.G.j = this.I >= 0 && this.I < this.H.size();
      this.c(fdy.a(wh.k, $$0 -> this.j.a(this.D)).a(this.k / 2 + 6, this.l - 32, 153, 20).a());
      this.a(new grs(wi.c("mco.upload.select.world.subtitle"), this.k / 2, g(-1), -6250336));
      if (this.H.isEmpty()) {
         this.a(new grs(wi.c("mco.upload.select.world.none"), this.k / 2, this.l / 2 - 20, -1));
      }
   }

   @Override
   public wi i() {
      return wh.a(this.n(), this.m());
   }

   private void D() {
      if (this.I != -1 && !this.H.get(this.I).i()) {
         enb $$0 = this.H.get(this.I);
         this.j.a(new fad(this.C, this.E, this.F, this.D, $$0));
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.j.a(this.D);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static wi a(enb $$0) {
      return $$0.h().d();
   }

   static String b(enb $$0) {
      return B.format(new Date($$0.f()));
   }

   class a extends feu.a<ezx.a> {
      private final enb b;
      private final String c;
      private final wi d;
      private final wi e;

      public a(enb $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = wi.a("mco.upload.entry.id", $$0.a(), ezx.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         ezx.this.J.b(ezx.this.H.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fdl $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = ezx.y + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(ezx.this.m, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(ezx.this.m, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(ezx.this.m, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public wi a() {
         wi $$0 = wh.b(wi.b(this.b.b()), wi.b(ezx.b(this.b)), ezx.a(this.b));
         return wi.a("narrator.select", $$0);
      }
   }

   class b extends grt<ezx.a> {
      public b() {
         super(ezx.this.k, ezx.this.l - 40 - ezx.g(0), ezx.g(0), 36);
      }

      public void a(enb $$0) {
         this.a((ezx.a)(ezx.this.new a($$0)));
      }

      @Override
      public int a() {
         return ezx.this.H.size() * 36;
      }

      public void a(@Nullable ezx.a $$0) {
         super.a($$0);
         ezx.this.I = this.aE_().indexOf($$0);
         ezx.this.G.j = ezx.this.I >= 0 && ezx.this.I < this.l() && !ezx.this.H.get(ezx.this.I).i();
      }
   }
}
