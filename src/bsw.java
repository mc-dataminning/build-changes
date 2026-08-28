import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bsw {
   public static final int a = 100;
   public static final int b = 300;
   private static final xl c = xl.a.a(new wm(wm.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new wu(wu.a.a, wo.b("MCPE-28723")));
   private final List<bsu> d = Lists.newArrayList();
   private final bvf e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bsw(bvf $$0) {
      this.e = $$0;
   }

   public void a(bsz $$0, float $$1) {
      this.c();
      bte $$2 = bte.a(this.e);
      bsu $$3 = new bsu($$0, $$1, $$2, this.e.Z);
      this.d.add($$3);
      this.f = this.e.af;
      this.j = true;
      if (!this.i && this.e.bL() && a($$0)) {
         this.i = true;
         this.g = this.e.af;
         this.h = this.g;
         this.e.i_();
      }
   }

   private static boolean a(bsz $$0) {
      return $$0.d() instanceof bvf;
   }

   private wo a(buj $$0, wo $$1, String $$2, String $$3) {
      cwn $$5 = $$0 instanceof bvf $$4 ? $$4.eZ() : cwn.j;
      return !$$5.f() && $$5.b(kv.g) ? wo.a($$2, this.e.p_(), $$1, $$5.K()) : wo.a($$3, this.e.p_(), $$1);
   }

   private wo a(bsu $$0, @Nullable buj $$1) {
      bsz $$2 = $$0.a();
      if (!$$2.a(awq.m) && !$$2.a(awq.s)) {
         wo $$4 = a($$1);
         buj $$5 = $$2.d();
         wo $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (wo)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : wo.a("death.fell.killer", this.e.p_()));
         }
      } else {
         bte $$3 = Objects.requireNonNullElse($$0.c(), bte.a);
         return wo.a($$3.a(), this.e.p_());
      }
   }

   @Nullable
   private static wo a(@Nullable buj $$0) {
      return $$0 == null ? null : $$0.p_();
   }

   public wo a() {
      if (this.d.isEmpty()) {
         return wo.a("death.attack.generic", this.e.p_());
      } else {
         bsu $$0 = this.d.get(this.d.size() - 1);
         bsz $$1 = $$0.a();
         bsu $$2 = this.d();
         btd $$3 = $$1.k().e();
         if ($$3 == btd.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == btd.c) {
            String $$4 = "death.attack." + $$1.f();
            wo $$5 = wr.a((wo)wo.c($$4 + ".link")).c(c);
            return wo.a($$4 + ".message", this.e.p_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bsu d() {
      bsu $$0 = null;
      bsu $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bsu $$5 = this.d.get($$4);
         bsu $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bsz $$7 = $$5.a();
         boolean $$8 = $$7.a(awq.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(awq.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      if (this.j && (!this.e.bL() || this.e.af - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.af;
         if ($$1) {
            this.e.j_();
         }

         this.d.clear();
      }
   }
}
