import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eon extends ged {
   private static final Logger a = LogUtils.getLogger();
   private static final te b = te.c("selectWorld.unable_to_load");
   static final te c = te.c("selectWorld.world");
   static final te y = te.c("mco.upload.hardcore").a($$0 -> $$0.a(-65536));
   static final te z = te.c("selectWorld.cheats");
   private static final DateFormat A = new SimpleDateFormat();
   private final eom B;
   private final long C;
   private final int D;
   esi E;
   List<ebw> F = Lists.newArrayList();
   int G = -1;
   eon.b H;
   private final Runnable I;

   public eon(long $$0, int $$1, eom $$2, Runnable $$3) {
      super(te.c("mco.upload.select.world.title"));
      this.B = $$2;
      this.C = $$0;
      this.D = $$1;
      this.I = $$3;
   }

   private void B() throws Exception {
      ebv.a $$0 = this.f.k().b();
      this.F = this.f.k().a($$0).join().stream().filter($$0x -> !$$0x.d() && !$$0x.p()).collect(Collectors.toList());

      for (ebw $$1 : this.F) {
         this.H.a($$1);
      }
   }

   @Override
   public void aE_() {
      this.H = new eon.b();

      try {
         this.B();
      } catch (Exception var2) {
         a.error("Couldn't load level list", var2);
         this.f.a(new eoc(b, te.a(var2.getMessage()), this.B));
         return;
      }

      this.e(this.H);
      this.E = this.d(esi.a(te.c("mco.upload.button.name"), $$0 -> this.C()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.E.i = this.G >= 0 && this.G < this.F.size();
      this.d(esi.a(td.k, $$0 -> this.f.a(this.B)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new geb(te.c("mco.upload.select.world.subtitle"), this.g / 2, h(-1), -6250336));
      if (this.F.isEmpty()) {
         this.a(new geb(te.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public te e() {
      return td.a(this.m(), this.l());
   }

   private void C() {
      if (this.G != -1 && !this.F.get(this.G).i()) {
         ebw $$0 = this.F.get(this.G);
         this.f.a(new eot(this.C, this.D, this.B, $$0, this.I));
      }
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.H.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.B);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static te a(ebw $$0) {
      return $$0.h().d();
   }

   static String b(ebw $$0) {
      return A.format(new Date($$0.f()));
   }

   class a extends ete.a<eon.a> {
      private final ebw b;
      private final String c;
      private final te d;
      private final te e;

      public a(ebw $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = te.a("mco.upload.entry.id", $$0.a(), eon.b($$0));
         te $$1;
         if ($$0.i()) {
            $$1 = eon.y;
         } else {
            $$1 = eon.a($$0);
         }

         if ($$0.j()) {
            $$1 = te.a("mco.upload.entry.cheats", $$1.getString(), eon.z);
         }

         this.e = $$1;
      }

      @Override
      public void a(erx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eon.this.H.a(eon.this.F.indexOf(this.b));
         return true;
      }

      protected void a(erx $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = eon.c + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(eon.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(eon.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(eon.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public te a() {
         te $$0 = td.b(te.b(this.b.b()), te.b(eon.b(this.b)), eon.a(this.b));
         return te.a("narrator.select", $$0);
      }
   }

   class b extends gec<eon.a> {
      public b() {
         super(eon.this.g, eon.this.h, eon.h(0), eon.this.h - 40, 36);
      }

      public void a(ebw $$0) {
         this.a((eon.a)(eon.this.new a($$0)));
      }

      @Override
      public int a() {
         return eon.this.F.size() * 36;
      }

      public void a(@Nullable eon.a $$0) {
         super.a($$0);
         eon.this.G = this.i().indexOf($$0);
         eon.this.E.i = eon.this.G >= 0 && eon.this.G < this.k() && !eon.this.F.get(eon.this.G).i();
      }
   }
}
