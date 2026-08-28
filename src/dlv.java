import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dlv extends drl implements dsb {
   public static final MapCodec<dlv> a = b(dlv::new);
   public static final dzd b = dzc.I;
   private static final Map<jo.a, fdo> e = fdl.b(dku.a(3.0, 3.0, 16.0));

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   public dlv(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(d, jo.a.b));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return e.get($$0.c(d));
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == euu.c;
      return super.a($$0).b(b, Boolean.valueOf($$2));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b).a(d);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(b) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
