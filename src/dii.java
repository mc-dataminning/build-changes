import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dii extends djy implements dfb, dlz {
   public static final MapCodec<dii> a = b(dii::new);
   private static final dss c = dsr.C;
   private final djz d = new djz(this);

   @Override
   public MapCodec<dii> a() {
      return a;
   }

   public dii(dsa.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dsb> b(int $$0) {
      return $$1 -> djy.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsb $$0, cxz $$1) {
      return !$$1.n().a(cur.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return je.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(c) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dsb $$0, dbd $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   public djz c() {
      return this.d;
   }
}
