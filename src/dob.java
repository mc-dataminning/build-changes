import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dob extends dnj implements dly {
   public static final MapCodec<dob> a = b(dob::new);
   public static final dsr c = dsq.C;

   @Override
   protected MapCodec<? extends dob> a() {
      return a;
   }

   protected dob(drz.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      return super.a($$0).a(c, Boolean.valueOf($$1.b(enu.c)));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(c) ? enu.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c);
   }
}
