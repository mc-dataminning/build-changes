import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dmb extends dot implements dkx {
   public static final MapCodec<dmb> a = b(dmb::new);
   public static final int b = 2;
   public static final dzm c = dzc.au;
   private static final List<Map<jo, fdo>> d = IntStream.rangeClosed(0, 2)
      .mapToObj($$0 -> fdl.c(dku.b((double)(4 + $$0 * 2), (double)(7 - $$0 * 2), 12.0).a(0.0, 0.0, (double)($$0 - 5) / 16.0).d()))
      .toList();

   @Override
   public MapCodec<dmb> a() {
      return a;
   }

   public dmb(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, jo.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(dym $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      dym $$3 = $$1.a_($$2.a($$0.c(e)));
      return $$3.a(awz.B);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return d.get($$0.c(c)).get($$0.c(e));
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = this.m();
      dhs $$2 = $$0.q();
      jj $$3 = $$0.a();

      for (jo $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.b(e, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4 == $$0.c(e) && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
