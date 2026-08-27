import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dlb extends dhy {
   public static final Codec<dlb> c = RecordCodecBuilder.create($$0 -> $$0.group(afu.d(cse.b)).apply($$0, $$0.stable(dlb::new)));
   private static final int h = 2;
   private static final List<dgb> i = StreamSupport.stream(jy.f.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = asy.f(asy.c((float)i.size()));
   private static final int k = asy.f((float)i.size() / (float)j);
   protected static final dgb d = cuc.a.o();
   protected static final dgb e = cuc.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dlb(ib.c<crx> $$0) {
      super(new csi($$0));
   }

   @Override
   protected Codec<? extends dhy> a() {
      return c;
   }

   @Override
   public void a(alx $$0, crr $$1, dly $$2, dhx $$3) {
   }

   @Override
   public void a(crt $$0, dhx $$1, crr $$2) {
      ht.a $$3 = new ht.a();
      cqg $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = iu.a($$5, $$7);
            int $$10 = iu.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dgb $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dhx> a(Executor $$0, dmm $$1, dly $$2, crr $$3, dhx $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dlk.a $$2, crb $$3, dly $$4) {
      return 0;
   }

   @Override
   public crl a(int $$0, int $$1, crb $$2, dly $$3) {
      return new crl(0, new dgb[0]);
   }

   @Override
   public void a(List<String> $$0, dly $$1, ht $$2) {
   }

   public static dgb a(int $$0, int $$1) {
      dgb $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = asy.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(alx $$0, long $$1, dly $$2, crz $$3, crr $$4, dhx $$5, dlg.a $$6) {
   }

   @Override
   public void a(alx $$0) {
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
