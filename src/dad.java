import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dad extends ctc implements dab {
   public static final MapCodec<dad> a = b(dad::new);
   public static final dgb<dgl> b = dft.bh;
   public static final dfu c = dft.C;
   protected static final eia d = ctc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final eia e = ctc.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dad> a() {
      return a;
   }

   public dad(dfc.d $$0) {
      super($$0);
      this.k(this.o().a(b, dgl.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfd $$0) {
      return $$0.c(b) != dgl.c;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      dgl $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ehx.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      gw $$1 = $$0.a();
      dfd $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dgl.c).a(c, Boolean.valueOf(false));
      } else {
         eag $$3 = $$0.q().b_($$1);
         dfd $$4 = this.o().a(b, dgl.b).a(c, Boolean.valueOf($$3.a() == eah.c));
         ha $$5 = $$0.k();
         return $$5 != ha.a && ($$5 == ha.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dgl.a);
      }
   }

   @Override
   public boolean a(dfd $$0, clt $$1) {
      cjl $$2 = $$1.n();
      dgl $$3 = $$0.c(b);
      if ($$3 == dgl.c || !$$2.a(this.k())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ha $$5 = $$1.k();
         return $$3 == dgl.b ? $$5 == ha.b || $$4 && $$5.o().d() : $$5 == ha.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(c) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cqc $$0, gw $$1, dfd $$2, eag $$3) {
      return $$2.c(b) != dgl.c ? dab.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cca $$0, cph $$1, gw $$2, dfd $$3, eaf $$4) {
      return $$3.c(b) != dgl.c ? dab.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(aqa.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
