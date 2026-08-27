import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dka extends dgx {
   public static final Codec<dka> c = RecordCodecBuilder.create($$0 -> $$0.group(aep.d(cqr.b)).apply($$0, $$0.stable(dka::new)));
   private static final int h = 2;
   private static final List<dfa> i = StreamSupport.stream(jb.f.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = arp.f(arp.c((float)i.size()));
   private static final int k = arp.f((float)i.size() / (float)j);
   protected static final dfa d = csn.a.n();
   protected static final dfa e = csn.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public dka(he.c<cqk> $$0) {
      super(new cqv($$0));
   }

   @Override
   protected Codec<? extends dgx> a() {
      return c;
   }

   @Override
   public void a(akr $$0, cqe $$1, dkx $$2, dgw $$3) {
   }

   @Override
   public void a(cqg $$0, dgw $$1, cqe $$2) {
      gu.a $$3 = new gu.a();
      cot $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = hx.a($$5, $$7);
            int $$10 = hx.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dfa $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dgw> a(Executor $$0, dll $$1, dkx $$2, cqe $$3, dgw $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dkj.a $$2, cpo $$3, dkx $$4) {
      return 0;
   }

   @Override
   public cpy a(int $$0, int $$1, cpo $$2, dkx $$3) {
      return new cpy(0, new dfa[0]);
   }

   @Override
   public void a(List<String> $$0, dkx $$1, gu $$2) {
   }

   public static dfa a(int $$0, int $$1) {
      dfa $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = arp.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(akr $$0, long $$1, dkx $$2, cqm $$3, cqe $$4, dgw $$5, dkf.a $$6) {
   }

   @Override
   public void a(akr $$0) {
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
