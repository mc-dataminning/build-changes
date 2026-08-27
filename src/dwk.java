import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dwk extends dsy {
   public static final MapCodec<dwk> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akk.d(dcd.b)).apply($$0, $$0.stable(dwk::new)));
   private static final int h = 2;
   private static final List<drb> i = StreamSupport.stream(le.e.spliterator(), false).flatMap($$0 -> $$0.m().a().stream()).collect(Collectors.toList());
   private static final int j = ayd.f(ayd.c((float)i.size()));
   private static final int k = ayd.f((float)i.size() / (float)j);
   protected static final drb d = dea.a.n();
   protected static final drb e = dea.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public dwk(ix.c<dbw> $$0) {
      super(new dch($$0));
   }

   @Override
   protected MapCodec<? extends dsy> a() {
      return c;
   }

   @Override
   public void a(aqt $$0, dbq $$1, dxh $$2, dsx $$3) {
   }

   @Override
   public void a(dbs $$0, dsx $$1, dbq $$2) {
      io.a $$3 = new io.a();
      dae $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jq.a($$5, $$7);
            int $$10 = jq.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            drb $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dsx> a(Executor $$0, dxv $$1, dxh $$2, dbq $$3, dsx $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dwt.a $$2, daz $$3, dxh $$4) {
      return 0;
   }

   @Override
   public dbj a(int $$0, int $$1, daz $$2, dxh $$3) {
      return new dbj(0, new drb[0]);
   }

   @Override
   public void a(List<String> $$0, dxh $$1, io $$2) {
   }

   public static drb a(int $$0, int $$1) {
      drb $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = ayd.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(aqt $$0, long $$1, dxh $$2, dby $$3, dbq $$4, dsx $$5, dwp.a $$6) {
   }

   @Override
   public void a(aqt $$0) {
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
