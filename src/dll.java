import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dll extends dod implements dkh {
   public static final MapCodec<dll> a = b(dll::new);
   public static final int b = 2;
   public static final dyq c = dyg.au;
   private static final List<Map<jn, fcr>> d = IntStream.rangeClosed(0, 2)
      .mapToObj($$0 -> fco.c(dke.b((double)(4 + $$0 * 2), (double)(7 - $$0 * 2), 12.0).a(0.0, 0.0, (double)($$0 - 5) / 16.0).d()))
      .toList();

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   public dll(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, jn.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(dxq $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      dxq $$3 = $$1.a_($$2.a($$0.c(e)));
      return $$3.a(awp.B);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return d.get($$0.c(c)).get($$0.c(e));
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dxq $$1 = this.m();
      dhc $$2 = $$0.q();
      ji $$3 = $$0.a();

      for (jn $$4 : $$0.f()) {
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
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4 == $$0.c(e) && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
