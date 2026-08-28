import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dee extends dek {
   public static final MapCodec<dee> a = b(dee::new);
   public static final dsv b = dsr.P;
   public static final dss c = dsr.u;

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   public dee(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         dpg $$5 = $$1.c_($$2);
         if ($$5 instanceof doz) {
            $$3.a((doz)$$5);
            $$3.a(awj.ar);
            cln.a($$3, true);
         }

         return bqt.c;
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      bqp.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      dpg $$4 = $$1.c_($$2);
      if ($$4 instanceof doz) {
         ((doz)$$4).l();
      }
   }

   @Nullable
   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new doz($$0, $$1);
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      return cpt.a($$1.c_($$2));
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(b, $$0.d().g());
   }
}
