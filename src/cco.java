import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cco extends cbh {
   private static final String b = "Johnny";
   static final Predicate<bji> e = $$0 -> $$0 == bji.c || $$0 == bji.d;
   boolean bT;

   public cco(blj<? extends cco> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsl(this));
      this.bO.a(1, new cco.a(this));
      this.bO.a(2, new cbh.b(this));
      this.bO.a(3, new cga.a(this, 10.0F));
      this.bO.a(4, new btb(this, 1.0, false));
      this.bP.a(1, new buj(this, cga.class).a());
      this.bP.a(2, new buk<>(this, cer.class, true));
      this.bP.a(3, new buk<>(this, cdz.class, true));
      this.bP.a(3, new buk<>(this, bxu.class, true));
      this.bP.a(4, new cco.b(this));
      this.bO.a(8, new bto(this, 0.6));
      this.bO.a(9, new bsz(this, cer.class, 3.0F, 1.0F));
      this.bO.a(10, new bsz(this, blx.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.fU() && bwo.a(this)) {
         boolean $$0 = ((amp)this.dM()).d(this.dm());
         ((bve)this.N()).b($$0);
      }

      super.Z();
   }

   public static bna.a w() {
      return cbz.gk().a(bnb.m, 0.35F).a(bnb.g, 12.0).a(bnb.l, 24.0).a(bnb.c, 5.0);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cbh.a u() {
      if (this.fW()) {
         return cbh.a.b;
      } else {
         return this.gv() ? cbh.a.g : cbh.a.a;
      }
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public arb af_() {
      return arc.Ac;
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      bmo $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bve)this.N()).b(true);
      auf $$6 = $$0.F_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(auf $$0, bjj $$1) {
      if (this.gs() == null) {
         this.a(blk.a, new cmh(cmk.pa));
      }
   }

   @Override
   public boolean s(blf $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof blv && ((blv)$$0).eS() == bma.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   public void b(@Nullable vb $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected arb y() {
      return arc.Ab;
   }

   @Override
   protected arb n_() {
      return arc.Ad;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.Ae;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cmh $$2 = new cmh(cmk.pa);
      cfz $$3 = this.gs();
      int $$4 = 1;
      if ($$0 > $$3.a(bji.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<cqs, Integer> $$6 = Maps.newHashMap();
         $$6.put(cqw.n, $$4);
         cqu.a($$6, $$2);
      }

      this.a(blk.a, $$2);
   }

   static class a extends bsb {
      public a(blx $$0) {
         super($$0, 6, cco.e);
         this.a(EnumSet.of(bsr.a.a));
      }

      @Override
      public boolean b() {
         cco $$0 = (cco)this.d;
         return $$0.gt() && super.b();
      }

      @Override
      public boolean a() {
         cco $$0 = (cco)this.d;
         return $$0.gt() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends buk<blv> {
      public b(cco $$0) {
         super($$0, blv.class, 0, true, true, blv::fz);
      }

      @Override
      public boolean a() {
         return ((cco)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
