import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class csu extends cso implements cst {
   public static final MapCodec<csu> a = b(csu::new);

   @Override
   public MapCodec<csu> a() {
      return a;
   }

   public csu(dfc.d $$0) {
      super($$0);
   }

   @Override
   public chz b() {
      return chz.a;
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new dcu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return a($$2, ddb.o, dcu::a);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else {
         dcz $$6 = $$1.c_($$2);
         if ($$6 instanceof dcu) {
            $$3.a((dcu)$$6);
            $$3.a(apq.ab);
         }

         return bhe.b;
      }
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, bjm $$3, cjl $$4) {
      if ($$4.A()) {
         dcz $$5 = $$0.c_($$1);
         if ($$5 instanceof dcu) {
            ((dcu)$$5).a($$4.y());
         }
      }
   }
}
