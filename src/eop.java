import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eop extends gex {
   private static final Logger b = LogUtils.getLogger();
   public static final tl a = tl.c("mco.upload.select.world.title");
   private static final tl c = tl.c("selectWorld.unable_to_load");
   static final tl y = tl.c("selectWorld.world");
   static final tl z = tl.c("mco.upload.hardcore").a($$0 -> $$0.a(-65536));
   static final tl A = tl.c("selectWorld.cheats");
   private static final DateFormat B = new SimpleDateFormat();
   private final eoo C;
   private final long D;
   private final int E;
   esk F;
   List<ecb> G = Lists.newArrayList();
   int H = -1;
   eop.b I;

   public eop(long $$0, int $$1, eoo $$2) {
      super(a);
      this.C = $$2;
      this.D = $$0;
      this.E = $$1;
   }

   private void D() throws Exception {
      eca.a $$0 = this.f.l().b();
      this.G = this.f.l().a($$0).join().stream().filter($$0x -> !$$0x.d() && !$$0x.p()).collect(Collectors.toList());

      for (ecb $$1 : this.G) {
         this.I.a($$1);
      }
   }

   @Override
   public void aH_() {
      this.I = new eop.b();

      try {
         this.D();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.f.a(new eod(c, tl.a(var2.getMessage()), this.C));
         return;
      }

      this.e(this.I);
      this.F = this.d(esk.a(tl.c("mco.upload.button.name"), $$0 -> this.E()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.F.i = this.H >= 0 && this.H < this.G.size();
      this.d(esk.a(tk.k, $$0 -> this.f.a(this.C)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new gev(tl.c("mco.upload.select.world.subtitle"), this.g / 2, h(-1), -6250336));
      if (this.G.isEmpty()) {
         this.a(new gev(tl.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public tl g() {
      return tk.a(this.m(), this.l());
   }

   private void E() {
      if (this.H != -1 && !this.G.get(this.H).i()) {
         ecb $$0 = this.G.get(this.H);
         this.f.a(new eov(this.D, this.E, this.C, $$0));
      }
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
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

   static tl a(ecb $$0) {
      return $$0.h().d();
   }

   static String b(ecb $$0) {
      return B.format(new Date($$0.f()));
   }

   class a extends etg.a<eop.a> {
      private final ecb b;
      private final String c;
      private final tl d;
      private final tl e;

      public a(ecb $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = tl.a("mco.upload.entry.id", $$0.a(), eop.b($$0));
         tl $$1;
         if ($$0.i()) {
            $$1 = eop.z;
         } else {
            $$1 = eop.a($$0);
         }

         if ($$0.j()) {
            $$1 = tl.a("mco.upload.entry.cheats", $$1.getString(), eop.A);
         }

         this.e = $$1;
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eop.this.I.a(eop.this.G.indexOf(this.b));
         return true;
      }

      protected void a(erz $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = eop.y + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(eop.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(eop.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(eop.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public tl a() {
         tl $$0 = tk.b(tl.b(this.b.b()), tl.b(eop.b(this.b)), eop.a(this.b));
         return tl.a("narrator.select", $$0);
      }
   }

   class b extends gew<eop.a> {
      public b() {
         super(eop.this.g, eop.this.h, eop.h(0), eop.this.h - 40, 36);
      }

      public void a(ecb $$0) {
         this.a((eop.a)(eop.this.new a($$0)));
      }

      @Override
      public int a() {
         return eop.this.G.size() * 36;
      }

      public void a(@Nullable eop.a $$0) {
         super.a($$0);
         eop.this.H = this.i().indexOf($$0);
         eop.this.F.i = eop.this.H >= 0 && eop.this.H < this.k() && !eop.this.G.get(eop.this.H).i();
      }
   }
}
