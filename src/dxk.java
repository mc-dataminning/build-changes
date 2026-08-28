import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dxk extends dty {
   public static final MapCodec<dxk> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alc.d(ddd.b)).apply($$0, $$0.stable(dxk::new)));
   private static final int h = 2;
   private static final List<dsb> i = StreamSupport.stream(lp.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = ayy.f(ayy.c((float)i.size()));
   private static final int k = ayy.f((float)i.size() / (float)j);
   protected static final dsb d = dfa.a.o();
   protected static final dsb e = dfa.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dxk(ji.c<dcw> $$0) {
      super(new ddh($$0));
   }

   @Override
   protected MapCodec<? extends dty> b() {
      return c;
   }

   @Override
   public void a(arl $$0, dcq $$1, dyh $$2, dtx $$3) {
   }

   @Override
   public void a(dcs $$0, dtx $$1, dcq $$2) {
      iz.a $$3 = new iz.a();
      dbe $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kb.a($$5, $$7);
            int $$10 = kb.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dsb $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dtx> a(Executor $$0, dyv $$1, dyh $$2, dcq $$3, dtx $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dxt.a $$2, dbz $$3, dyh $$4) {
      return 0;
   }

   @Override
   public dcj a(int $$0, int $$1, dbz $$2, dyh $$3) {
      return new dcj(0, new dsb[0]);
   }

   @Override
   public void a(List<String> $$0, dyh $$1, iz $$2) {
   }

   public static dsb a(int $$0, int $$1) {
      dsb $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = ayy.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(arl $$0, long $$1, dyh $$2, dcy $$3, dcq $$4, dtx $$5, dxp.a $$6) {
   }

   @Override
   public void a(arl $$0) {
   }

   @Override
   public int g() {
      return 0;
   }

   @Override
   public int e() {
      return 384;
   }

   @Override
   public int f() {
      return 63;
   }
}
