import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bks {
   public static final int a = 100;
   public static final int b = 300;
   private static final wd c = wd.a.a(new ve(ve.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new vm(vm.a.a, vg.b("MCPE-28723")));
   private final List<bkq> d = Lists.newArrayList();
   private final bmo e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bks(bmo $$0) {
      this.e = $$0;
   }

   public void a(bkv $$0, float $$1) {
      this.c();
      bla $$2 = bla.a(this.e);
      bkq $$3 = new bkq($$0, $$1, $$2, this.e.ab);
      this.d.add($$3);
      this.f = this.e.ah;
      this.j = true;
      if (!this.i && this.e.bx() && a($$0)) {
         this.i = true;
         this.g = this.e.ah;
         this.h = this.g;
         this.e.g_();
      }
   }

   private static boolean a(bkv $$0) {
      return $$0.d() instanceof bmo;
   }

   private vg a(blw $$0, vg $$1, String $$2, String $$3) {
      cng $$5 = $$0 instanceof bmo $$4 ? $$4.eT() : cng.f;
      return !$$5.b() && $$5.A() ? vg.a($$2, this.e.Q_(), $$1, $$5.J()) : vg.a($$3, this.e.Q_(), $$1);
   }

   private vg a(bkq $$0, @Nullable blw $$1) {
      bkv $$2 = $$0.a();
      if (!$$2.a(ask.n) && !$$2.a(ask.t)) {
         vg $$4 = a($$1);
         blw $$5 = $$2.d();
         vg $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (vg)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : vg.a("death.fell.killer", this.e.Q_()));
         }
      } else {
         bla $$3 = Objects.requireNonNullElse($$0.c(), bla.a);
         return vg.a($$3.a(), this.e.Q_());
      }
   }

   @Nullable
   private static vg a(@Nullable blw $$0) {
      return $$0 == null ? null : $$0.Q_();
   }

   public vg a() {
      if (this.d.isEmpty()) {
         return vg.a("death.attack.generic", this.e.Q_());
      } else {
         bkq $$0 = this.d.get(this.d.size() - 1);
         bkv $$1 = $$0.a();
         bkq $$2 = this.d();
         bkz $$3 = $$1.j().e();
         if ($$3 == bkz.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bkz.c) {
            String $$4 = "death.attack." + $$1.e();
            vg $$5 = vj.a((vg)vg.c($$4 + ".link")).c(c);
            return vg.a($$4 + ".message", this.e.Q_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bkq d() {
      bkq $$0 = null;
      bkq $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bkq $$5 = this.d.get($$4);
         bkq $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bkv $$7 = $$5.a();
         boolean $$8 = $$7.a(ask.t);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(ask.n) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      if (this.j && (!this.e.bx() || this.e.ah - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.ah;
         if ($$1) {
            this.e.h_();
         }

         this.d.clear();
      }
   }
}
