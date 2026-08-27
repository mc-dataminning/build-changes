import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ffa {
   private static final Logger a = LogUtils.getLogger();
   private final enn b;
   private final fex c;
   private gu d = new gu(-1, -1, -1);
   private cfz e = cfz.b;
   private float f;
   private float g;
   private int h;
   private boolean i;
   private cmj j = cmj.e;
   @Nullable
   private cmj k;
   private int l;

   public ffa(enn $$0, fex $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(byo $$0) {
      this.j.a($$0.fO());
   }

   public void a(cmj $$0, @Nullable cmj $$1) {
      this.j = $$0;
      this.k = $$1;
      this.j.a(this.b.t.fO());
   }

   public void a(cmj $$0) {
      if ($$0 != this.j) {
         this.k = this.j;
      }

      this.j = $$0;
      this.j.a(this.b.t.fO());
   }

   public boolean a() {
      return this.j.h();
   }

   public boolean a(gu $$0) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else {
         cmm $$1 = this.b.s;
         dcb $$2 = $$1.a_($$0);
         if (!this.b.t.eO().d().a($$2, $$1, $$0, this.b.t)) {
            return false;
         } else {
            cpn $$3 = $$2.b();
            if ($$3 instanceof csr && !this.b.t.gk()) {
               return false;
            } else if ($$2.i()) {
               return false;
            } else {
               $$3.a($$1, $$0, $$2, (byo)this.b.t);
               dxe $$4 = $$1.b_($$0);
               boolean $$5 = $$1.a($$0, $$4.g(), 11);
               if ($$5) {
                  $$3.a((cmn)$$1, $$0, $$2);
               }

               return $$5;
            }
         }
      }
   }

   public boolean a(gu $$0, ha $$1) {
      if (this.b.t.a(this.b.s, $$0, this.j)) {
         return false;
      } else if (!this.b.s.w_().a($$0)) {
         return false;
      } else {
         if (this.j.g()) {
            dcb $$2 = this.b.s.a_($$0);
            this.b.aA().a(this.b.s, $$0, $$2, 1.0F);
            this.a(this.b.s, $$2x -> {
               this.a($$0);
               return new aad(aad.a.a, $$0, $$1, $$2x);
            });
            this.h = 5;
         } else if (!this.i || !this.b($$0)) {
            if (this.i) {
               this.c.a(new aad(aad.a.b, this.d, $$1));
            }

            dcb $$3 = this.b.s.a_($$0);
            this.b.aA().a(this.b.s, $$0, $$3, 0.0F);
            this.a(this.b.s, $$3x -> {
               boolean $$4 = !$$3.i();
               if ($$4 && this.f == 0.0F) {
                  $$3.a(this.b.s, $$0, this.b.t);
               }

               if ($$4 && $$3.a(this.b.t, this.b.t.dI(), $$0) >= 1.0F) {
                  this.a($$0);
               } else {
                  this.i = true;
                  this.d = $$0;
                  this.e = this.b.t.eO();
                  this.f = 0.0F;
                  this.g = 0.0F;
                  this.b.s.a(this.b.t.af(), this.d, this.n());
               }

               return new aad(aad.a.a, $$0, $$1, $$3x);
            });
         }

         return true;
      }
   }

   public void b() {
      if (this.i) {
         dcb $$0 = this.b.s.a_(this.d);
         this.b.aA().a(this.b.s, this.d, $$0, -1.0F);
         this.c.a(new aad(aad.a.b, this.d, ha.a));
         this.i = false;
         this.f = 0.0F;
         this.b.s.a(this.b.t.af(), this.d, -1);
         this.b.t.gh();
      }
   }

   public boolean b(gu $$0, ha $$1) {
      this.o();
      if (this.h > 0) {
         this.h--;
         return true;
      } else if (this.j.g() && this.b.s.w_().a($$0)) {
         this.h = 5;
         dcb $$2 = this.b.s.a_($$0);
         this.b.aA().a(this.b.s, $$0, $$2, 1.0F);
         this.a(this.b.s, $$2x -> {
            this.a($$0);
            return new aad(aad.a.a, $$0, $$1, $$2x);
         });
         return true;
      } else if (this.b($$0)) {
         dcb $$3 = this.b.s.a_($$0);
         if ($$3.i()) {
            this.i = false;
            return false;
         } else {
            this.f = this.f + $$3.a(this.b.t, this.b.t.dI(), $$0);
            if (this.g % 4.0F == 0.0F) {
               cxa $$4 = $$3.w();
               this.b.ah().a(new fxt($$4.f(), ami.e, ($$4.a() + 1.0F) / 8.0F, $$4.b() * 0.5F, fxy.t(), $$0));
            }

            this.g++;
            this.b.aA().a(this.b.s, $$0, $$3, apa.a(this.f, 0.0F, 1.0F));
            if (this.f >= 1.0F) {
               this.i = false;
               this.a(this.b.s, $$2 -> {
                  this.a($$0);
                  return new aad(aad.a.c, $$0, $$1, $$2);
               });
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 5;
            }

            this.b.s.a(this.b.t.af(), this.d, this.n());
            return true;
         }
      } else {
         return this.a($$0, $$1);
      }
   }

   private void a(few $$0, ffw $$1) {
      try (ffv $$2 = $$0.a().a()) {
         int $$3 = $$2.b();
         uo<zb> $$4 = $$1.predict($$3);
         this.c.a($$4);
      }
   }

   public float c() {
      return this.j.g() ? 5.0F : 4.5F;
   }

   public void d() {
      this.o();
      if (this.c.g().h()) {
         this.c.g().a();
      } else {
         this.c.g().m();
      }
   }

   private boolean b(gu $$0) {
      cfz $$1 = this.b.t.eO();
      return $$0.equals(this.d) && cfz.c($$1, this.e);
   }

   private void o() {
      int $$0 = this.b.t.fN().l;
      if ($$0 != this.l) {
         this.l = $$0;
         this.c.a(new aao(this.l));
      }
   }

   public bdx a(fiy $$0, bdw $$1, eee $$2) {
      this.o();
      if (!this.b.s.w_().a($$2.a())) {
         return bdx.e;
      } else {
         MutableObject<bdx> $$3 = new MutableObject();
         this.a(this.b.s, $$4 -> {
            $$3.setValue(this.b($$0, $$1, $$2));
            return new aax($$1, $$2, $$4);
         });
         return (bdx)$$3.getValue();
      }
   }

   private bdx b(fiy $$0, bdw $$1, eee $$2) {
      gu $$3 = $$2.a();
      cfz $$4 = $$0.b($$1);
      if (this.j == cmj.d) {
         return bdx.a;
      } else {
         boolean $$5 = !$$0.eO().b() || !$$0.eP().b();
         boolean $$6 = $$0.fD() && $$5;
         if (!$$6) {
            dcb $$7 = this.b.s.a_($$3);
            if (!this.c.a($$7.b().m())) {
               return bdx.e;
            }

            bdx $$8 = $$7.a(this.b.s, $$0, $$1, $$2);
            if ($$8.a()) {
               return $$8;
            }
         }

         if (!$$4.b() && !$$0.gi().a($$4.d())) {
            cij $$9 = new cij($$0, $$1, $$2);
            bdx $$11;
            if (this.j.g()) {
               int $$10 = $$4.L();
               $$11 = $$4.a($$9);
               $$4.f($$10);
            } else {
               $$11 = $$4.a($$9);
            }

            return $$11;
         } else {
            return bdx.d;
         }
      }
   }

   public bdx a(byo $$0, bdw $$1) {
      if (this.j == cmj.d) {
         return bdx.d;
      } else {
         this.o();
         this.c.a(new zx.b($$0.dn(), $$0.dp(), $$0.dt(), $$0.dy(), $$0.dA(), $$0.ay()));
         MutableObject<bdx> $$2 = new MutableObject();
         this.a(this.b.s, $$3 -> {
            aay $$4 = new aay($$1, $$3);
            cfz $$5 = $$0.b($$1);
            if ($$0.gi().a($$5.d())) {
               $$2.setValue(bdx.d);
               return $$4;
            } else {
               bdy<cfz> $$6 = $$5.a(this.b.s, $$0, $$1);
               cfz $$7 = $$6.b();
               if ($$7 != $$5) {
                  $$0.a($$1, $$7);
               }

               $$2.setValue($$6.a());
               return $$4;
            }
         });
         return (bdx)$$2.getValue();
      }
   }

   public fiy a(few $$0, ams $$1, enb $$2) {
      return this.a($$0, $$1, $$2, false, false);
   }

   public fiy a(few $$0, ams $$1, enb $$2, boolean $$3, boolean $$4) {
      return new fiy(this.b, $$0, this.c, $$1, $$2, $$3, $$4);
   }

   public void a(byo $$0, bfj $$1) {
      this.o();
      this.c.a(zt.a($$1, $$0.bP()));
      if (this.j != cmj.d) {
         $$0.d($$1);
         $$0.gh();
      }
   }

   public bdx a(byo $$0, bfj $$1, bdw $$2) {
      this.o();
      this.c.a(zt.a($$1, $$0.bP(), $$2));
      return this.j == cmj.d ? bdx.d : $$0.a($$1, $$2);
   }

   public bdx a(byo $$0, bfj $$1, eef $$2, bdw $$3) {
      this.o();
      eei $$4 = $$2.e().a($$1.dn(), $$1.dp(), $$1.dt());
      this.c.a(zt.a($$1, $$0.bP(), $$3, $$4));
      return this.j == cmj.d ? bdx.d : $$1.a($$0, $$4, $$3);
   }

   public void a(int $$0, int $$1, int $$2, cbo $$3, byo $$4) {
      cbf $$5 = $$4.bR;
      if ($$0 != $$5.j) {
         a.warn("Ignoring click in mismatching container. Click in {}, player has {}.", $$0, $$5.j);
      } else {
         hn<ccx> $$6 = $$5.i;
         int $$7 = $$6.size();
         List<cfz> $$8 = Lists.newArrayListWithCapacity($$7);

         for (ccx $$9 : $$6) {
            $$8.add($$9.e().p());
         }

         $$5.a($$1, $$2, $$3, $$4);
         Int2ObjectMap<cfz> $$10 = new Int2ObjectOpenHashMap();

         for (int $$11 = 0; $$11 < $$7; $$11++) {
            cfz $$12 = $$8.get($$11);
            cfz $$13 = $$6.get($$11).e();
            if (!cfz.a($$12, $$13)) {
               $$10.put($$11, $$13.p());
            }
         }

         this.c.a(new zo($$0, $$5.j(), $$1, $$2, $$3, $$5.g().p(), $$10));
      }
   }

   public void a(int $$0, cjc<?> $$1, boolean $$2) {
      this.c.a(new aab($$0, $$1, $$2));
   }

   public void a(int $$0, int $$1) {
      this.c.a(new zn($$0, $$1));
   }

   public void a(cfz $$0, int $$1) {
      if (this.j.g() && this.c.a($$0.d().m())) {
         this.c.a(new aar($$1, $$0));
      }
   }

   public void a(cfz $$0) {
      if (this.j.g() && !$$0.b() && this.c.a($$0.d().m())) {
         this.c.a(new aar(-1, $$0));
      }
   }

   public void b(byo $$0) {
      this.o();
      this.c.a(new aad(aad.a.f, gu.b, ha.a));
      $$0.fn();
   }

   public boolean e() {
      return this.j.h();
   }

   public boolean f() {
      return !this.j.g();
   }

   public boolean g() {
      return this.j.g();
   }

   public boolean h() {
      return this.j.g();
   }

   public boolean i() {
      return this.b.t.bM() && this.b.t.cW() instanceof bfs;
   }

   public boolean j() {
      return this.j == cmj.d;
   }

   @Nullable
   public cmj k() {
      return this.k;
   }

   public cmj l() {
      return this.j;
   }

   public boolean m() {
      return this.i;
   }

   public int n() {
      return this.f > 0.0F ? (int)(this.f * 10.0F) : -1;
   }

   public void a(int $$0) {
      this.c.a(new aaa($$0));
   }
}
