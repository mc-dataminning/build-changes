import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class efe extends ebm {
   public static final MapCodec<efe> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alc.d(djz.b)).apply($$0, $$0.stable(efe::new)));
   private static final int h = 2;
   private static final List<dzo> i = StreamSupport.stream(mf.e.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = azk.f(azk.c((float)i.size()));
   private static final int k = azk.f((float)i.size() / (float)j);
   protected static final dzo d = dlw.a.m();
   protected static final dzo e = dlw.iu.m();
   public static final int f = 70;
   public static final int g = 60;

   public efe(je.c<djs> $$0) {
      super(new dkd($$0));
   }

   @Override
   protected MapCodec<? extends ebm> b() {
      return c;
   }

   @Override
   public void a(arw $$0, djl $$1, egb $$2, ebl $$3) {
   }

   @Override
   public void a(djo $$0, ebl $$1, djl $$2) {
      iu.a $$3 = new iu.a();
      dhw $$4 = $$1.f();
      int $$5 = $$4.h;
      int $$6 = $$4.i;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = jx.a($$5, $$7);
            int $$10 = jx.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dzo $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<ebl> a(egp $$0, egb $$1, djl $$2, ebl $$3) {
      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, efn.a $$2, dir $$3, egb $$4) {
      return 0;
   }

   @Override
   public djb a(int $$0, int $$1, dir $$2, egb $$3) {
      return new djb(0, new dzo[0]);
   }

   @Override
   public void a(List<String> $$0, egb $$1, iu $$2) {
   }

   public static dzo a(int $$0, int $$1) {
      dzo $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = azk.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(arw $$0, long $$1, egb $$2, dju $$3, djl $$4, ebl $$5) {
   }

   @Override
   public void a(arw $$0) {
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
