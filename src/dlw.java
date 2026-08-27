import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dlw extends dit {
   public static final Codec<dlw> c = RecordCodecBuilder.create($$0 -> $$0.group(age.d(csx.b)).apply($$0, $$0.stable(dlw::new)));
   private static final int h = 2;
   private static final List<dgw> i = StreamSupport.stream(jy.f.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = ati.f(ati.c((float)i.size()));
   private static final int k = ati.f((float)i.size() / (float)j);
   protected static final dgw d = cuv.a.o();
   protected static final dgw e = cuv.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dlw(ib.c<csq> $$0) {
      super(new ctb($$0));
   }

   @Override
   protected Codec<? extends dit> a() {
      return c;
   }

   @Override
   public void a(amh $$0, csk $$1, dmt $$2, dis $$3) {
   }

   @Override
   public void a(csm $$0, dis $$1, csk $$2) {
      ht.a $$3 = new ht.a();
      cqz $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = iu.a($$5, $$7);
            int $$10 = iu.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dgw $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dis> a(Executor $$0, dnh $$1, dmt $$2, csk $$3, dis $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dmf.a $$2, cru $$3, dmt $$4) {
      return 0;
   }

   @Override
   public cse a(int $$0, int $$1, cru $$2, dmt $$3) {
      return new cse(0, new dgw[0]);
   }

   @Override
   public void a(List<String> $$0, dmt $$1, ht $$2) {
   }

   public static dgw a(int $$0, int $$1) {
      dgw $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = ati.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(amh $$0, long $$1, dmt $$2, css $$3, csk $$4, dis $$5, dmb.a $$6) {
   }

   @Override
   public void a(amh $$0) {
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
