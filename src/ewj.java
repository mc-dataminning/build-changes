import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ewj extends gob {
   private static final Logger b = LogUtils.getLogger();
   public static final vs a = vs.c("mco.upload.select.world.title");
   private static final vs c = vs.c("selectWorld.unable_to_load");
   static final vs v = vs.c("selectWorld.world");
   static final vs w = vs.c("mco.upload.hardcore").b(-65536);
   static final vs x = vs.c("selectWorld.commands");
   private static final DateFormat y = new SimpleDateFormat();
   @Nullable
   private final exm z;
   private final ewi A;
   private final long B;
   private final int C;
   fak D;
   List<ejp> E = Lists.newArrayList();
   int F = -1;
   ewj.b G;

   public ewj(@Nullable exm $$0, long $$1, int $$2, ewi $$3) {
      super(a);
      this.z = $$0;
      this.A = $$3;
      this.B = $$1;
      this.C = $$2;
   }

   private void E() {
      ejo.a $$0 = this.f.l().b();
      this.E = this.f.l().a($$0).join().stream().filter(ejp::v).collect(Collectors.toList());

      for (ejp $$1 : this.E) {
         this.G.a($$1);
      }
   }

   @Override
   public void aP_() {
      this.G = this.c(new ewj.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.f.a(new evx(c, vs.a(var2.getMessage()), this.A));
         return;
      }

      this.D = this.c(fak.a(vs.c("mco.upload.button.name"), $$0 -> this.H()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.D.j = this.F >= 0 && this.F < this.E.size();
      this.c(fak.a(vr.k, $$0 -> this.f.a(this.A)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new gnz(vs.c("mco.upload.select.world.subtitle"), this.g / 2, g(-1), -6250336));
      if (this.E.isEmpty()) {
         this.a(new gnz(vs.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public vs i() {
      return vr.a(this.p(), this.o());
   }

   private void H() {
      if (this.F != -1 && !this.E.get(this.F).i()) {
         ejp $$0 = this.E.get(this.F);
         this.f.a(new ewp(this.z, this.B, this.C, this.A, $$0));
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.A);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static vs a(ejp $$0) {
      return $$0.h().d();
   }

   static String b(ejp $$0) {
      return y.format(new Date($$0.f()));
   }

   class a extends fbg.a<ewj.a> {
      private final ejp b;
      private final String c;
      private final vs d;
      private final vs e;

      public a(ejp $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = vs.a("mco.upload.entry.id", $$0.a(), ewj.b($$0));
         vs $$1;
         if ($$0.i()) {
            $$1 = ewj.w;
         } else {
            $$1 = ewj.a($$0);
         }

         if ($$0.j()) {
            $$1 = vs.a("mco.upload.entry.commands", $$1.getString(), ewj.x);
         }

         this.e = $$1;
      }

      @Override
      public void a(ezx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         ewj.this.G.a(ewj.this.E.indexOf(this.b));
         return true;
      }

      protected void a(ezx $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = ewj.v + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(ewj.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(ewj.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(ewj.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public vs a() {
         vs $$0 = vr.b(vs.b(this.b.b()), vs.b(ewj.b(this.b)), ewj.a(this.b));
         return vs.a("narrator.select", $$0);
      }
   }

   class b extends goa<ewj.a> {
      public b() {
         super(ewj.this.g, ewj.this.h - 40 - ewj.g(0), ewj.g(0), 36);
      }

      public void a(ejp $$0) {
         this.a((ewj.a)(ewj.this.new a($$0)));
      }

      @Override
      public int a() {
         return ewj.this.E.size() * 36;
      }

      public void a(@Nullable ewj.a $$0) {
         super.a($$0);
         ewj.this.F = this.l().indexOf($$0);
         ewj.this.D.j = ewj.this.F >= 0 && ewj.this.F < this.n() && !ewj.this.E.get(ewj.this.F).i();
      }
   }
}
