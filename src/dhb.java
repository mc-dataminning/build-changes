import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dhb extends ddy {
   public static final Codec<dhb> c = RecordCodecBuilder.create($$0 -> $$0.group(aco.d(cnr.b)).apply($$0, $$0.stable(dhb::new)));
   private static final int h = 2;
   private static final List<dcb> i = StreamSupport.stream(jb.f.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = apa.f(apa.c((float)i.size()));
   private static final int k = apa.f((float)i.size() / (float)j);
   protected static final dcb d = cpo.a.n();
   protected static final dcb e = cpo.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public dhb(he.c<cnk> $$0) {
      super(new cnv($$0));
   }

   @Override
   protected Codec<? extends ddy> a() {
      return c;
   }

   @Override
   public void a(aim $$0, cne $$1, dhy $$2, ddx $$3) {
   }

   @Override
   public void a(cng $$0, ddx $$1, cne $$2) {
      gu.a $$3 = new gu.a();
      clt $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = hx.a($$5, $$7);
            int $$10 = hx.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dcb $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<ddx> a(Executor $$0, dim $$1, dhy $$2, cne $$3, ddx $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dhk.a $$2, cmo $$3, dhy $$4) {
      return 0;
   }

   @Override
   public cmy a(int $$0, int $$1, cmo $$2, dhy $$3) {
      return new cmy(0, new dcb[0]);
   }

   @Override
   public void a(List<String> $$0, dhy $$1, gu $$2) {
   }

   public static dcb a(int $$0, int $$1) {
      dcb $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = apa.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(aim $$0, long $$1, dhy $$2, cnm $$3, cne $$4, ddx $$5, dhg.a $$6) {
   }

   @Override
   public void a(aim $$0) {
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
