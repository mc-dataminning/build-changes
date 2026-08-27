import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eoq extends gew {
   private static final Logger b = LogUtils.getLogger();
   public static final ti a = ti.c("mco.upload.select.world.title");
   private static final ti c = ti.c("selectWorld.unable_to_load");
   static final ti y = ti.c("selectWorld.world");
   static final ti z = ti.c("mco.upload.hardcore").a($$0 -> $$0.a(-65536));
   static final ti A = ti.c("selectWorld.cheats");
   private static final DateFormat B = new SimpleDateFormat();
   private final eop C;
   private final long D;
   private final int E;
   esl F;
   List<ecc> G = Lists.newArrayList();
   int H = -1;
   eoq.b I;

   public eoq(long $$0, int $$1, eop $$2) {
      super(a);
      this.C = $$2;
      this.D = $$0;
      this.E = $$1;
   }

   private void C() throws Exception {
      ecb.a $$0 = this.f.l().b();
      this.G = this.f.l().a($$0).join().stream().filter($$0x -> !$$0x.d() && !$$0x.p()).collect(Collectors.toList());

      for (ecc $$1 : this.G) {
         this.I.a($$1);
      }
   }

   @Override
   public void aD_() {
      this.I = new eoq.b();

      try {
         this.C();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.f.a(new eoe(c, ti.a(var2.getMessage()), this.C));
         return;
      }

      this.e(this.I);
      this.F = this.d(esl.a(ti.c("mco.upload.button.name"), $$0 -> this.D()).a(this.g / 2 - 154, this.h - 32, 153, 20).a());
      this.F.i = this.H >= 0 && this.H < this.G.size();
      this.d(esl.a(th.k, $$0 -> this.f.a(this.C)).a(this.g / 2 + 6, this.h - 32, 153, 20).a());
      this.a(new geu(ti.c("mco.upload.select.world.subtitle"), this.g / 2, h(-1), -6250336));
      if (this.G.isEmpty()) {
         this.a(new geu(ti.c("mco.upload.select.world.none"), this.g / 2, this.h / 2 - 20, -1));
      }
   }

   @Override
   public ti g() {
      return th.a(this.m(), this.l());
   }

   private void D() {
      if (this.H != -1 && !this.G.get(this.H).i()) {
         ecc $$0 = this.G.get(this.H);
         this.f.a(new eow(this.D, this.E, this.C, $$0));
      }
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
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

   static ti a(ecc $$0) {
      return $$0.h().d();
   }

   static String b(ecc $$0) {
      return B.format(new Date($$0.f()));
   }

   class a extends eth.a<eoq.a> {
      private final ecc b;
      private final String c;
      private final ti d;
      private final ti e;

      public a(ecc $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = ti.a("mco.upload.entry.id", $$0.a(), eoq.b($$0));
         ti $$1;
         if ($$0.i()) {
            $$1 = eoq.z;
         } else {
            $$1 = eoq.a($$0);
         }

         if ($$0.j()) {
            $$1 = ti.a("mco.upload.entry.cheats", $$1.getString(), eoq.A);
         }

         this.e = $$1;
      }

      @Override
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         eoq.this.I.a(eoq.this.G.indexOf(this.b));
         return true;
      }

      protected void a(esa $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = eoq.y + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(eoq.this.i, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(eoq.this.i, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(eoq.this.i, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public ti a() {
         ti $$0 = th.b(ti.b(this.b.b()), ti.b(eoq.b(this.b)), eoq.a(this.b));
         return ti.a("narrator.select", $$0);
      }
   }

   class b extends gev<eoq.a> {
      public b() {
         super(eoq.this.g, eoq.this.h, eoq.h(0), eoq.this.h - 40, 36);
      }

      public void a(ecc $$0) {
         this.a((eoq.a)(eoq.this.new a($$0)));
      }

      @Override
      public int a() {
         return eoq.this.G.size() * 36;
      }

      public void a(@Nullable eoq.a $$0) {
         super.a($$0);
         eoq.this.H = this.i().indexOf($$0);
         eoq.this.F.i = eoq.this.H >= 0 && eoq.this.H < this.k() && !eoq.this.G.get(eoq.this.H).i();
      }
   }
}
