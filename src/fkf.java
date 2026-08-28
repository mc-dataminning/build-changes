import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkf extends hhv {
   private static final Logger b = LogUtils.getLogger();
   public static final xv a = xv.c("mco.upload.select.world.title");
   private static final xv c = xv.c("selectWorld.unable_to_load");
   static final xv C = xv.c("selectWorld.world");
   private static final xv D = xv.c("mco.upload.hardcore").b(-65536);
   private static final xv E = xv.c("selectWorld.commands");
   private static final DateFormat F = new SimpleDateFormat();
   @Nullable
   private final flg G;
   private final fke H;
   private final long I;
   private final int J;
   foe K;
   List<ewd> L = Lists.newArrayList();
   int M = -1;
   fkf.b N;

   public fkf(@Nullable flg $$0, long $$1, int $$2, fke $$3) {
      super(a);
      this.G = $$0;
      this.H = $$3;
      this.I = $$1;
      this.J = $$2;
   }

   private void E() {
      ewc.a $$0 = this.m.m().b();
      this.L = this.m.m().a($$0).join().stream().filter(ewd::v).collect(Collectors.toList());

      for (ewd $$1 : this.L) {
         this.N.a($$1);
      }
   }

   @Override
   public void aT_() {
      this.N = this.c(new fkf.b());

      try {
         this.E();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fjv(c, xv.a(var2.getMessage()), this.H));
         return;
      }

      this.K = this.c(foe.a(xv.c("mco.upload.button.name"), $$0 -> this.F()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.K.j = this.M >= 0 && this.M < this.L.size();
      this.c(foe.a(xu.k, $$0 -> this.m.a(this.H)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hhu(xv.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.L.isEmpty()) {
         this.a(new hhu(xv.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public xv i() {
      return xu.a(this.m(), this.l());
   }

   private void F() {
      if (this.M != -1 && !this.L.get(this.M).i()) {
         ewd $$0 = this.L.get(this.M);
         this.m.a(new fkl(this.G, this.I, this.J, this.H, $$0));
      }
   }

   @Override
   public void a(fnr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.m.a(this.H);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static xv a(ewd $$0) {
      return $$0.h().d();
   }

   static String b(ewd $$0) {
      return F.format(new Date($$0.f()));
   }

   class a extends fpb.a<fkf.a> {
      private final ewd b;
      private final String c;
      private final xv d;
      private final xv e;

      public a(final ewd $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xv.a("mco.upload.entry.id", $$0.a(), fkf.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fnr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fkf.this.N.a(fkf.this.L.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fnr $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fkf.C + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fkf.this.p, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fkf.this.p, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fkf.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public xv a() {
         xv $$0 = xu.b(xv.b(this.b.b()), xv.b(fkf.b(this.b)), fkf.a(this.b));
         return xv.a("narrator.select", $$0);
      }
   }

   class b extends fpb<fkf.a> {
      public b() {
         super(fmf.Q(), fkf.this.n, fkf.this.o - 40 - fkf.g(0), fkf.g(0), 36);
      }

      public void a(ewd $$0) {
         this.b(fkf.this.new a($$0));
      }

      public void a(@Nullable fkf.a $$0) {
         super.a($$0);
         fkf.this.M = this.aI_().indexOf($$0);
         fkf.this.K.j = fkf.this.M >= 0 && fkf.this.M < this.k() && !fkf.this.L.get(fkf.this.M).i();
      }

      @Override
      public int a() {
         return (int)((double)this.g * 0.6);
      }
   }
}
