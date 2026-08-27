import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwh extends cwb implements cwg {
   public static final MapCodec<cwh> a = b(cwh::new);

   @Override
   public MapCodec<cwh> a() {
      return a;
   }

   public cwh(djf.d $$0) {
      super($$0);
   }

   @Override
   public cll b() {
      return cll.a;
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dgp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return a($$2, dgw.o, dgp::a);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         dgu $$6 = $$1.c_($$2);
         if ($$6 instanceof dgp) {
            $$3.a((dgp)$$6);
            $$3.a(asb.ab);
         }

         return bka.b;
      }
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.c;
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, bmk $$3, cmx $$4) {
      if ($$4.A()) {
         dgu $$5 = $$0.c_($$1);
         if ($$5 instanceof dgp) {
            ((dgp)$$5).a($$4.y());
         }
      }
   }
}
