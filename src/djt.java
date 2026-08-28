import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djt extends dex implements dly {
   public static final MapCodec<djt> a = b(djt::new);
   public static final dsr b = dsq.C;

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   protected djt(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dsa $$0, dsa $$1, je $$2) {
      return $$1.a(dez.ac) && $$2.o() == je.a.b;
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enu.c;
      return super.a($$0).a(b, Boolean.valueOf($$2));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(b) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }
}
