import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bue {
   public static final int a = 100;
   public static final int b = 300;
   private static final xs c = xs.a.a(new wt.e(ayf.w)).a(new xb.e(wv.b("MCPE-28723")));
   private final List<buc> d = Lists.newArrayList();
   private final bwr e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bue(bwr $$0) {
      this.e = $$0;
   }

   public void a(buh $$0, float $$1) {
      this.c();
      bum $$2 = bum.a(this.e);
      buc $$3 = new buc($$0, $$1, $$2, (float)this.e.Z);
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

   private static boolean a(buh $$0) {
      return $$0.d() instanceof bwr;
   }

   private wv a(bvs $$0, wv $$1, String $$2, String $$3) {
      cxy $$5 = $$0 instanceof bwr $$4 ? $$4.fa() : cxy.k;
      return !$$5.f() && $$5.c(kx.g) ? wv.a($$2, this.e.m_(), $$1, $$5.K()) : wv.a($$3, this.e.m_(), $$1);
   }

   private wv a(buc $$0, @Nullable bvs $$1) {
      buh $$2 = $$0.a();
      if (!$$2.a(axb.m) && !$$2.a(axb.s)) {
         wv $$4 = a($$1);
         bvs $$5 = $$2.d();
         wv $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (wv)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : wv.a("death.fell.killer", this.e.m_()));
         }
      } else {
         bum $$3 = Objects.requireNonNullElse($$0.c(), bum.a);
         return wv.a($$3.a(), this.e.m_());
      }
   }

   @Nullable
   private static wv a(@Nullable bvs $$0) {
      return $$0 == null ? null : $$0.m_();
   }

   public wv a() {
      if (this.d.isEmpty()) {
         return wv.a("death.attack.generic", this.e.m_());
      } else {
         buc $$0 = this.d.get(this.d.size() - 1);
         buh $$1 = $$0.a();
         buc $$2 = this.d();
         bul $$3 = $$1.k().e();
         if ($$3 == bul.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bul.c) {
            String $$4 = "death.attack." + $$1.f();
            wv $$5 = wy.a((wv)wv.c($$4 + ".link")).c(c);
            return wv.a($$4 + ".message", this.e.m_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private buc d() {
      buc $$0 = null;
      buc $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         buc $$5 = this.d.get($$4);
         buc $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         buh $$7 = $$5.a();
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
