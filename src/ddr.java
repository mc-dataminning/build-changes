import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddr extends cwp implements ddp {
   public static final MapCodec<ddr> a = b(ddr::new);
   public static final dke<dko> b = djw.bh;
   public static final djx c = djw.C;
   protected static final eml d = cwp.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final eml e = cwp.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends ddr> a() {
      return a;
   }

   public ddr(djf.d $$0) {
      super($$0);
      this.k(this.o().a(b, dko.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(djg $$0) {
      return $$0.c(b) != dko.c;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      dko $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return emi.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      hx $$1 = $$0.a();
      djg $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dko.c).a(c, Boolean.valueOf(false));
      } else {
         eeq $$3 = $$0.q().b_($$1);
         djg $$4 = this.o().a(b, dko.b).a(c, Boolean.valueOf($$3.a() == eer.c));
         ic $$5 = $$0.k();
         return $$5 != ic.a && ($$5 == ic.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dko.a);
      }
   }

   @Override
   public boolean a(djg $$0, cpg $$1) {
      cmx $$2 = $$1.n();
      dko $$3 = $$0.c(b);
      if ($$3 == dko.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ic $$5 = $$1.k();
         return $$3 == dko.b ? $$5 == ic.b || $$4 && $$5.o().d() : $$5 == ic.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(c) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(ctp $$0, hx $$1, djg $$2, eeq $$3) {
      return $$2.c(b) != dko.c ? ddp.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cfh $$0, csu $$1, hx $$2, djg $$3, eep $$4) {
      return $$3.c(b) != dko.c ? ddp.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(asl.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
