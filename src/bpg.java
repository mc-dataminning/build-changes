import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bpg {
   public static final int a = 100;
   public static final int b = 300;
   private static final xp c = xp.a.a(new wq(wq.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new wy(wy.a.a, ws.b("MCPE-28723")));
   private final List<bpe> d = Lists.newArrayList();
   private final bre e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bpg(bre $$0) {
      this.e = $$0;
   }

   public void a(bpj $$0, float $$1) {
      this.c();
      bpo $$2 = bpo.a(this.e);
      bpe $$3 = new bpe($$0, $$1, $$2, this.e.ac);
      this.d.add($$3);
      this.f = this.e.ai;
      this.j = true;
      if (!this.i && this.e.bB() && a($$0)) {
         this.i = true;
         this.g = this.e.ai;
         this.h = this.g;
         this.e.f_();
      }
   }

   private static boolean a(bpj $$0) {
      return $$0.d() instanceof bre;
   }

   private ws a(bql $$0, ws $$1, String $$2, String $$3) {
      csd $$5 = $$0 instanceof bre $$4 ? $$4.eV() : csd.i;
      return !$$5.d() && $$5.b(jz.d) ? ws.a($$2, this.e.O_(), $$1, $$5.E()) : ws.a($$3, this.e.O_(), $$1);
   }

   private ws a(bpe $$0, @Nullable bql $$1) {
      bpj $$2 = $$0.a();
      if (!$$2.a(avq.n) && !$$2.a(avq.t)) {
         ws $$4 = a($$1);
         bql $$5 = $$2.d();
         ws $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (ws)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : ws.a("death.fell.killer", this.e.O_()));
         }
      } else {
         bpo $$3 = Objects.requireNonNullElse($$0.c(), bpo.a);
         return ws.a($$3.a(), this.e.O_());
      }
   }

   @Nullable
   private static ws a(@Nullable bql $$0) {
      return $$0 == null ? null : $$0.O_();
   }

   public ws a() {
      if (this.d.isEmpty()) {
         return ws.a("death.attack.generic", this.e.O_());
      } else {
         bpe $$0 = this.d.get(this.d.size() - 1);
         bpj $$1 = $$0.a();
         bpe $$2 = this.d();
         bpn $$3 = $$1.j().e();
         if ($$3 == bpn.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bpn.c) {
            String $$4 = "death.attack." + $$1.e();
            ws $$5 = wv.a((ws)ws.c($$4 + ".link")).c(c);
            return ws.a($$4 + ".message", this.e.O_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bpe d() {
      bpe $$0 = null;
      bpe $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bpe $$5 = this.d.get($$4);
         bpe $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bpj $$7 = $$5.a();
         boolean $$8 = $$7.a(avq.t);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(avq.n) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      return this.i ? this.e.ai - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bB() || this.e.ai - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.ai;
         if ($$1) {
            this.e.g_();
         }

         this.d.clear();
      }
   }
}
