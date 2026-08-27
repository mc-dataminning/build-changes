import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bio {
   public static final int a = 100;
   public static final int b = 300;
   private static final vf c = vf.a.a(new ug(ug.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new uo(uo.a.a, ui.b("MCPE-28723")));
   private final List<bim> d = Lists.newArrayList();
   private final bkj e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bio(bkj $$0) {
      this.e = $$0;
   }

   public void a(bir $$0, float $$1) {
      this.c();
      biw $$2 = biw.a(this.e);
      bim $$3 = new bim($$0, $$1, $$2, this.e.ab);
      this.d.add($$3);
      this.f = this.e.ah;
      this.j = true;
      if (!this.i && this.e.bv() && a($$0)) {
         this.i = true;
         this.g = this.e.ah;
         this.h = this.g;
         this.e.f_();
      }
   }

   private static boolean a(bir $$0) {
      return $$0.d() instanceof bkj;
   }

   private ui a(bjt $$0, ui $$1, String $$2, String $$3) {
      ckj $$5 = $$0 instanceof bkj $$4 ? $$4.eS() : ckj.b;
      return !$$5.b() && $$5.A() ? ui.a($$2, this.e.O_(), $$1, $$5.J()) : ui.a($$3, this.e.O_(), $$1);
   }

   private ui a(bim $$0, @Nullable bjt $$1) {
      bir $$2 = $$0.a();
      if (!$$2.a(aqu.m) && !$$2.a(aqu.s)) {
         ui $$4 = a($$1);
         bjt $$5 = $$2.d();
         ui $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (ui)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : ui.a("death.fell.killer", this.e.O_()));
         }
      } else {
         biw $$3 = Objects.requireNonNullElse($$0.c(), biw.a);
         return ui.a($$3.a(), this.e.O_());
      }
   }

   @Nullable
   private static ui a(@Nullable bjt $$0) {
      return $$0 == null ? null : $$0.O_();
   }

   public ui a() {
      if (this.d.isEmpty()) {
         return ui.a("death.attack.generic", this.e.O_());
      } else {
         bim $$0 = this.d.get(this.d.size() - 1);
         bir $$1 = $$0.a();
         bim $$2 = this.d();
         biv $$3 = $$1.j().e();
         if ($$3 == biv.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == biv.c) {
            String $$4 = "death.attack." + $$1.e();
            ui $$5 = ul.a((ui)ui.c($$4 + ".link")).c(c);
            return ui.a($$4 + ".message", this.e.O_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bim d() {
      bim $$0 = null;
      bim $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bim $$5 = this.d.get($$4);
         bim $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bir $$7 = $$5.a();
         boolean $$8 = $$7.a(aqu.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(aqu.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
            if ($$4 > 0) {
               $$0 = $$6;
            } else {
               $$0 = $$5;
            }

            $$3 = $$9;
         }

         if ($$5.c() != null && ($$1 == null || $$5.b() > $$2)) {
            $$1 = $$5;
            $$2 = $$5.b();
         }
      }

      if ($$3 > 5.0F && $$0 != null) {
         return $$0;
      } else {
         return $$2 > 5.0F && $$1 != null ? $$1 : null;
      }
   }

   public int b() {
      return this.i ? this.e.ah - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bv() || this.e.ah - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.ah;
         if ($$1) {
            this.e.g_();
         }

         this.d.clear();
      }
   }
}
