import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class djv extends dgv {
   public static final MapCodec<djv> a = b(djv::new);
   protected static final ezm b = dhj.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<je> c = je.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(je::j).toList();

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   protected djv(dun.d $$0) {
      super($$0);
   }

   public static boolean a(deg $$0, je $$1, je $$2) {
      return $$0.a_($$1.a((ki)$$2)).a(awt.cw) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(awt.cx);
   }

   @Override
   protected boolean g_(duo $$0) {
      return true;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (je $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               ln.s,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dsn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return $$0.B ? a($$2, dru.m, dsn::a) : null;
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
      }

      return brp.a;
   }

   @Nullable
   @Override
   protected brr b(duo $$0, deg $$1, je $$2) {
      drs $$3 = $$1.c_($$2);
      if ($$3 instanceof dsn) {
         xd $$4 = ((brs)$$3).Q_();
         return new brx(($$2x, $$3x, $$4x) -> new crs($$2x, $$3x, crj.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
