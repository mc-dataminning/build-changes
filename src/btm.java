import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class btm {
   public static final int a = 100;
   public static final int b = 300;
   private static final xm c = xm.a.a(new wn.e(axv.w)).a(new wv.e(wp.b("MCPE-28723")));
   private final List<btk> d = Lists.newArrayList();
   private final bvy e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public btm(bvy $$0) {
      this.e = $$0;
   }

   public void a(btp $$0, float $$1) {
      this.c();
      btu $$2 = btu.a(this.e);
      btk $$3 = new btk($$0, $$1, $$2, this.e.Z);
      this.d.add($$3);
      this.f = this.e.af;
      this.j = true;
      if (!this.i && this.e.bJ() && a($$0)) {
         this.i = true;
         this.g = this.e.af;
         this.h = this.g;
         this.e.e_();
      }
   }

   private static boolean a(btp $$0) {
      return $$0.d() instanceof bvy;
   }

   private wp a(bva $$0, wp $$1, String $$2, String $$3) {
      cxh $$5 = $$0 instanceof bvy $$4 ? $$4.eZ() : cxh.k;
      return !$$5.f() && $$5.b(kv.g) ? wp.a($$2, this.e.m_(), $$1, $$5.K()) : wp.a($$3, this.e.m_(), $$1);
   }

   private wp a(btk $$0, @Nullable bva $$1) {
      btp $$2 = $$0.a();
      if (!$$2.a(awr.m) && !$$2.a(awr.s)) {
         wp $$4 = a($$1);
         bva $$5 = $$2.d();
         wp $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (wp)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : wp.a("death.fell.killer", this.e.m_()));
         }
      } else {
         btu $$3 = Objects.requireNonNullElse($$0.c(), btu.a);
         return wp.a($$3.a(), this.e.m_());
      }
   }

   @Nullable
   private static wp a(@Nullable bva $$0) {
      return $$0 == null ? null : $$0.m_();
   }

   public wp a() {
      if (this.d.isEmpty()) {
         return wp.a("death.attack.generic", this.e.m_());
      } else {
         btk $$0 = this.d.get(this.d.size() - 1);
         btp $$1 = $$0.a();
         btk $$2 = this.d();
         btt $$3 = $$1.k().e();
         if ($$3 == btt.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == btt.c) {
            String $$4 = "death.attack." + $$1.f();
            wp $$5 = ws.a((wp)wp.c($$4 + ".link")).c(c);
            return wp.a($$4 + ".message", this.e.m_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private btk d() {
      btk $$0 = null;
      btk $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         btk $$5 = this.d.get($$4);
         btk $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         btp $$7 = $$5.a();
         boolean $$8 = $$7.a(awr.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(awr.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      return this.i ? this.e.af - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bJ() || this.e.af - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.af;
         if ($$1) {
            this.e.J_();
         }

         this.d.clear();
      }
   }
}
