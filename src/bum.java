import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bum {
   public static final int a = 100;
   public static final int b = 300;
   private static final xt c = xt.a.a(new wu.e(ayf.w)).a(new xc.e(ww.b("MCPE-28723")));
   private final List<buk> d = Lists.newArrayList();
   private final bwz e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bum(bwz $$0) {
      this.e = $$0;
   }

   public void a(bup $$0, float $$1) {
      this.c();
      buu $$2 = buu.a(this.e);
      buk $$3 = new buk($$0, $$1, $$2, (float)this.e.Z);
      this.d.add($$3);
      this.f = this.e.af;
      this.j = true;
      if (!this.i && this.e.bK() && a($$0)) {
         this.i = true;
         this.g = this.e.af;
         this.h = this.g;
         this.e.e_();
      }
   }

   private static boolean a(bup $$0) {
      return $$0.d() instanceof bwz;
   }

   private ww a(bwa $$0, ww $$1, String $$2, String $$3) {
      cys $$5 = $$0 instanceof bwz $$4 ? $$4.fa() : cys.k;
      return !$$5.f() && $$5.c(kj.g) ? ww.a($$2, this.e.m_(), $$1, $$5.K()) : ww.a($$3, this.e.m_(), $$1);
   }

   private ww a(buk $$0, @Nullable bwa $$1) {
      bup $$2 = $$0.a();
      if (!$$2.a(axb.m) && !$$2.a(axb.s)) {
         ww $$4 = a($$1);
         bwa $$5 = $$2.d();
         ww $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (ww)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : ww.a("death.fell.killer", this.e.m_()));
         }
      } else {
         buu $$3 = Objects.requireNonNullElse($$0.c(), buu.a);
         return ww.a($$3.a(), this.e.m_());
      }
   }

   @Nullable
   private static ww a(@Nullable bwa $$0) {
      return $$0 == null ? null : $$0.m_();
   }

   public ww a() {
      if (this.d.isEmpty()) {
         return ww.a("death.attack.generic", this.e.m_());
      } else {
         buk $$0 = this.d.get(this.d.size() - 1);
         bup $$1 = $$0.a();
         buk $$2 = this.d();
         but $$3 = $$1.k().e();
         if ($$3 == but.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == but.c) {
            String $$4 = "death.attack." + $$1.f();
            ww $$5 = wz.a((ww)ww.c($$4 + ".link")).c(c);
            return ww.a($$4 + ".message", this.e.m_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private buk d() {
      buk $$0 = null;
      buk $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         buk $$5 = this.d.get($$4);
         buk $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bup $$7 = $$5.a();
         boolean $$8 = $$7.a(axb.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(axb.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      if (this.j && (!this.e.bK() || this.e.af - this.f > $$0)) {
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
