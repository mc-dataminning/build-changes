import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dkj extends dhg {
   public static final Codec<dkj> c = RecordCodecBuilder.create($$0 -> $$0.group(aeu.d(cra.b)).apply($$0, $$0.stable(dkj::new)));
   private static final int h = 2;
   private static final List<dfj> i = StreamSupport.stream(jb.f.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = arw.f(arw.c((float)i.size()));
   private static final int k = arw.f((float)i.size() / (float)j);
   protected static final dfj d = csw.a.n();
   protected static final dfj e = csw.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public dkj(he.c<cqt> $$0) {
      super(new cre($$0));
   }

   @Override
   protected Codec<? extends dhg> a() {
      return c;
   }

   @Override
   public void a(akx $$0, cqn $$1, dlg $$2, dhf $$3) {
   }

   @Override
   public void a(cqp $$0, dhf $$1, cqn $$2) {
      gw.a $$3 = new gw.a();
      cpc $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = hw.a($$5, $$7);
            int $$10 = hw.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dfj $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dhf> a(Executor $$0, dlu $$1, dlg $$2, cqn $$3, dhf $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dks.a $$2, cpx $$3, dlg $$4) {
      return 0;
   }

   @Override
   public cqh a(int $$0, int $$1, cpx $$2, dlg $$3) {
      return new cqh(0, new dfj[0]);
   }

   @Override
   public void a(List<String> $$0, dlg $$1, gw $$2) {
   }

   public static dfj a(int $$0, int $$1) {
      dfj $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = arw.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(akx $$0, long $$1, dlg $$2, cqv $$3, cqn $$4, dhf $$5, dko.a $$6) {
   }

   @Override
   public void a(akx $$0) {
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
