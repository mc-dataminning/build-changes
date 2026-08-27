import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epn extends gfx {
   private static final Logger b = LogUtils.getLogger();
   public static final ui a = ui.c("mco.upload.select.world.title");
   private static final ui c = ui.c("selectWorld.unable_to_load");
   static final ui y = ui.c("selectWorld.world");
   static final ui z = ui.c("mco.upload.hardcore").a($$0 -> $$0.a(-65536));
   static final ui A = ui.c("selectWorld.cheats");
   private static final DateFormat B = new SimpleDateFormat();
   private final epm C;
   private final long D;
   private final int E;
   etj F;
   List<ecz> G = Lists.newArrayList();
   int H = -1;
   epn.b I;

   public epn(long $$0, int $$1, epm $$2) {
      super(a);
      this.C = $$2;
      this.D = $$0;
      this.E = $$1;
   }

   private void C() throws Exception {
      ecy.a $$0 = this.f.l().b();
      this.G = this.f.l().a($$0).join().stream().filter($$0x -> !$$0x.d() && !$$0x.p()).collect(Collectors.toList());

      for (ecz $$1 : this.G) {
         this.I.a($$1);
      }
   }

   @Override
   public void aM_() {
      this.I = new epn.b();

      try {
         this.C();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.f.a(new epb(c, ui.a(var2.getMessage()), this.C));
         return;
      }

      this.e(this.I);
      this.F = this.d(etj.a(ui.c("mco.upload.button.name"), $$0 -> this.D()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.F.i = this.H >= 0 && this.H < this.G.size();
      this.d(etj.a(uh.k, $$0 -> this.f.a(this.C)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new gfv(ui.c("mco.upload.select.world.subtitle"), this.g / 2, h(-1), -6250336));
      if (this.G.isEmpty()) {
         this.a(new gfv(ui.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public ui h() {
      return uh.a(this.m(), this.l());
   }

   private void D() {
      if (this.H != -1 && !this.G.get(this.H).i()) {
         ecz $$0 = this.G.get(this.H);
         this.f.a(new ept(this.D, this.E, this.C, $$0));
      }
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.I.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.C);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static ui a(ecz $$0) {
      return $$0.h().d();
   }

   static String b(ecz $$0) {
      return B.format(new Date($$0.f()));
   }

   class a extends euf.a<epn.a> {
      private final ecz b;
      private final String c;
      private final ui d;
      private final ui e;

      public a(ecz $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = ui.a("mco.upload.entry.id", $$0.a(), epn.b($$0));
         ui $$1;
         if ($$0.i()) {
            $$1 = epn.z;
         } else {
            $$1 = epn.a($$0);
         }

         if ($$0.j()) {
            $$1 = ui.a("mco.upload.entry.cheats", $$1.getString(), epn.A);
         }

         this.e = $$1;
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         epn.this.I.a(epn.this.G.indexOf(this.b));
         return true;
      }

      protected void a(esy $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = epn.y + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(epn.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(epn.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(epn.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public ui a() {
         ui $$0 = uh.b(ui.b(this.b.b()), ui.b(epn.b(this.b)), epn.a(this.b));
         return ui.a("narrator.select", $$0);
      }
   }

   class b extends gfw<epn.a> {
      public b() {
         super(epn.this.g, epn.this.h, epn.h(0), epn.this.h - 40, 36);
      }

      public void a(ecz $$0) {
         this.a((epn.a)(epn.this.new a($$0)));
      }

      @Override
      public int a() {
         return epn.this.G.size() * 36;
      }

      public void a(@Nullable epn.a $$0) {
         super.a($$0);
         epn.this.H = this.i().indexOf($$0);
         epn.this.F.i = epn.this.H >= 0 && epn.this.H < this.k() && !epn.this.G.get(epn.this.H).i();
      }
   }
}
