import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eox extends gfd {
   private static final Logger b = LogUtils.getLogger();
   public static final tn a = tn.c("mco.upload.select.world.title");
   private static final tn c = tn.c("selectWorld.unable_to_load");
   static final tn y = tn.c("selectWorld.world");
   static final tn z = tn.c("mco.upload.hardcore").a($$0 -> $$0.a(-65536));
   static final tn A = tn.c("selectWorld.cheats");
   private static final DateFormat B = new SimpleDateFormat();
   private final eow C;
   private final long D;
   private final int E;
   ess F;
   List<ecj> G = Lists.newArrayList();
   int H = -1;
   eox.b I;

   public eox(long $$0, int $$1, eow $$2) {
      super(a);
      this.C = $$2;
      this.D = $$0;
      this.E = $$1;
   }

   private void D() throws Exception {
      eci.a $$0 = this.f.l().b();
      this.G = this.f.l().a($$0).join().stream().filter($$0x -> !$$0x.d() && !$$0x.p()).collect(Collectors.toList());

      for (ecj $$1 : this.G) {
         this.I.a($$1);
      }
   }

   @Override
   public void aH_() {
      this.I = new eox.b();

      try {
         this.D();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.f.a(new eol(c, tn.a(var2.getMessage()), this.C));
         return;
      }

      this.e(this.I);
      this.F = this.d(ess.a(tn.c("mco.upload.button.name"), $$0 -> this.E()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.F.i = this.H >= 0 && this.H < this.G.size();
      this.d(ess.a(tm.k, $$0 -> this.f.a(this.C)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new gfb(tn.c("mco.upload.select.world.subtitle"), this.g / 2, h(-1), -6250336));
      if (this.G.isEmpty()) {
         this.a(new gfb(tn.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public tn g() {
      return tm.a(this.m(), this.l());
   }

   private void E() {
      if (this.H != -1 && !this.G.get(this.H).i()) {
         ecj $$0 = this.G.get(this.H);
         this.f.a(new epd(this.D, this.E, this.C, $$0));
      }
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
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

   static tn a(ecj $$0) {
      return $$0.h().d();
   }

   static String b(ecj $$0) {
      return B.format(new Date($$0.f()));
   }

   class a extends eto.a<eox.a> {
      private final ecj b;
      private final String c;
      private final tn d;
      private final tn e;

      public a(ecj $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = tn.a("mco.upload.entry.id", $$0.a(), eox.b($$0));
         tn $$1;
         if ($$0.i()) {
            $$1 = eox.z;
         } else {
            $$1 = eox.a($$0);
         }

         if ($$0.j()) {
            $$1 = tn.a("mco.upload.entry.cheats", $$1.getString(), eox.A);
         }

         this.e = $$1;
      }

      @Override
      public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eox.this.I.a(eox.this.G.indexOf(this.b));
         return true;
      }

      protected void a(esh $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = eox.y + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(eox.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(eox.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(eox.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public tn a() {
         tn $$0 = tm.b(tn.b(this.b.b()), tn.b(eox.b(this.b)), eox.a(this.b));
         return tn.a("narrator.select", $$0);
      }
   }

   class b extends gfc<eox.a> {
      public b() {
         super(eox.this.g, eox.this.h, eox.h(0), eox.this.h - 40, 36);
      }

      public void a(ecj $$0) {
         this.a((eox.a)(eox.this.new a($$0)));
      }

      @Override
      public int a() {
         return eox.this.G.size() * 36;
      }

      public void a(@Nullable eox.a $$0) {
         super.a($$0);
         eox.this.H = this.i().indexOf($$0);
         eox.this.F.i = eox.this.H >= 0 && eox.this.H < this.k() && !eox.this.G.get(eox.this.H).i();
      }
   }
}
