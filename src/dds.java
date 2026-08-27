import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dds extends cwq implements ddq {
   public static final MapCodec<dds> a = b(dds::new);
   public static final dkf<dkp> b = djx.bh;
   public static final djy c = djx.C;
   protected static final emm d = cwq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final emm e = cwq.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dds> a() {
      return a;
   }

   public dds(djg.d $$0) {
      super($$0);
      this.k(this.o().a(b, dkp.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(djh $$0) {
      return $$0.c(b) != dkp.c;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      dkp $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return emj.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      hx $$1 = $$0.a();
      djh $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dkp.c).a(c, Boolean.valueOf(false));
      } else {
         eer $$3 = $$0.q().b_($$1);
         djh $$4 = this.o().a(b, dkp.b).a(c, Boolean.valueOf($$3.a() == ees.c));
         ic $$5 = $$0.k();
         return $$5 != ic.a && ($$5 == ic.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dkp.a);
      }
   }

   @Override
   public boolean a(djh $$0, cph $$1) {
      cmy $$2 = $$1.n();
      dkp $$3 = $$0.c(b);
      if ($$3 == dkp.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ic $$5 = $$1.k();
         return $$3 == dkp.b ? $$5 == ic.b || $$4 && $$5.o().d() : $$5 == ic.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(c) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(ctq $$0, hx $$1, djh $$2, eer $$3) {
      return $$2.c(b) != dkp.c ? ddq.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cfi $$0, csv $$1, hx $$2, djh $$3, eeq $$4) {
      return $$3.c(b) != dkp.c ? ddq.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(asm.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
