import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dxg extends dtu {
   public static final MapCodec<dxg> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akz.d(dcz.b)).apply($$0, $$0.stable(dxg::new)));
   private static final int h = 2;
   private static final List<drx> i = StreamSupport.stream(lp.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = ayu.f(ayu.c((float)i.size()));
   private static final int k = ayu.f((float)i.size() / (float)j);
   protected static final drx d = dew.a.n();
   protected static final drx e = dew.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public dxg(ji.c<dcs> $$0) {
      super(new ddd($$0));
   }

   @Override
   protected MapCodec<? extends dtu> a() {
      return c;
   }

   @Override
   public void a(ari $$0, dcm $$1, dyd $$2, dtt $$3) {
   }

   @Override
   public void a(dco $$0, dtt $$1, dcm $$2) {
      iz.a $$3 = new iz.a();
      dba $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = kb.a($$5, $$7);
            int $$10 = kb.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            drx $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dtt> a(Executor $$0, dyr $$1, dyd $$2, dcm $$3, dtt $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dxp.a $$2, dbv $$3, dyd $$4) {
      return 0;
   }

   @Override
   public dcf a(int $$0, int $$1, dbv $$2, dyd $$3) {
      return new dcf(0, new drx[0]);
   }

   @Override
   public void a(List<String> $$0, dyd $$1, iz $$2) {
   }

   public static drx a(int $$0, int $$1) {
      drx $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = ayu.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(ari $$0, long $$1, dyd $$2, dcu $$3, dcm $$4, dtt $$5, dxl.a $$6) {
   }

   @Override
   public void a(ari $$0) {
   }

   @Override
   public int f() {
      return 0;
   }

   @Override
   public int d() {
      return 384;
   }

   @Override
   public int e() {
      return 63;
   }
}
