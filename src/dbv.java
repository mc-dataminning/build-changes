import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbv extends cua {
   public static final MapCodec<dbv> a = b(dbv::new);
   private static final ui d = ui.c("container.stonecutter");
   public static final dgv b = cxu.aE;
   protected static final eiy c = cua.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dbv> a() {
      return a;
   }

   public dbv(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c));
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(b, $$0.g().g());
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if ($$1.B) {
         return bib.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aqn.ay);
         return bib.b;
      }
   }

   @Nullable
   @Override
   public bie b(dgb $$0, cqz $$1, ht $$2) {
      return new bij(($$2x, $$3, $$4) -> new chl($$2x, $$3, cga.a($$1, $$2)), d);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return c;
   }

   @Override
   public boolean g_(dgb $$0) {
      return true;
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
