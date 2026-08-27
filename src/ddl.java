import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddl extends cwj implements ddj {
   public static final MapCodec<ddl> a = b(ddl::new);
   public static final djy<dki> b = djq.bh;
   public static final djr c = djq.C;
   protected static final emf d = cwj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final emf e = cwj.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends ddl> a() {
      return a;
   }

   public ddl(diz.d $$0) {
      super($$0);
      this.k(this.o().a(b, dki.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dja $$0) {
      return $$0.c(b) != dki.c;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      dki $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return emc.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      hx $$1 = $$0.a();
      dja $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dki.c).a(c, Boolean.valueOf(false));
      } else {
         eek $$3 = $$0.q().b_($$1);
         dja $$4 = this.o().a(b, dki.b).a(c, Boolean.valueOf($$3.a() == eel.c));
         ic $$5 = $$0.k();
         return $$5 != ic.a && ($$5 == ic.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dki.a);
      }
   }

   @Override
   public boolean a(dja $$0, cpa $$1) {
      cmr $$2 = $$1.n();
      dki $$3 = $$0.c(b);
      if ($$3 == dki.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ic $$5 = $$1.k();
         return $$3 == dki.b ? $$5 == ic.b || $$4 && $$5.o().d() : $$5 == ic.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(c) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(ctj $$0, hx $$1, dja $$2, eek $$3) {
      return $$2.c(b) != dki.c ? ddj.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cfb $$0, cso $$1, hx $$2, dja $$3, eej $$4) {
      return $$3.c(b) != dki.c ? ddj.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(asg.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
